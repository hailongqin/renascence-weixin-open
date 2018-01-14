package ren.ascence.client;

public class OpenUrls {

    /**
     * 第三方平台方可以在自己的网站:中放置“微信公众号授权”或者“小程序授权”的入口，引导公众号和小程序管理员进入授权页。授权页网址：
     */
    //public static String componentloginpage = "https://mp.weixin.qq.com/cgi-bin/componentloginpage";

    /**
     * 获取第三方平台的接口调用授权令牌component_access_token
     */
    public static String apiComponentToken    = "https://api.weixin.qq.com/cgi-bin/component/api_component_token";

    /**
     * 获取预授权码
     */
    public static String apiCreatePreauthcode = "https://api.weixin.qq.com/cgi-bin/component/api_create_preauthcode";

    /**
     * 使用预授权码换取公众号或小程序的接口调用凭据和授权信息
     */
    public static String apiQueryAuth         = "https://api.weixin.qq.com/cgi-bin/component/api_query_auth";

    /**
     * 获取（刷新）授权公众号或小程序的接口调用凭据（令牌）
     */
    public static String apiAuthorizerToken   = "https://api.weixin.qq.com/cgi-bin/component/api_authorizer_token";

    /**
     * 获取授权方的帐号基本信息
     */
    public static String apiGetAuthorizerInfo = "https://api.weixin.qq.com/cgi-bin/component/api_get_authorizer_info";

    /**
     * 第三方平台开发者的服务器使用登录凭证 code 以及第三方平台的component_access_token 获取 session_key和 openid。
     */
    public static String jscode2session       = "https://api.weixin.qq.com/sns/component/jscode2session";

    /**
     * 查询某个指定版本的审核状态（仅供第三方代小程序调用）
     */
    public static String waxGetAuditstatus    = "https://api.weixin.qq.com/wxa/get_auditstatus";

    /**
     * 获取代码模版库中的所有小程序代码模版
     */
    public static String waxGettemplatelist   = "https://api.weixin.qq.com/wxa/gettemplatelist";

    /**
     * 获取授权小程序帐号的可选类目 GET
     */
    public static String wxaGetCategory       = "https://api.weixin.qq.com/wxa/get_category";

    /**
     * 发布代码
     */
    public static String wxaRelease           = "https://api.weixin.qq.com/wxa/release";

    
    
    
    
    
    
    /**
     * 发送客服消息
     */
    //    public static String customSend           = "https://api.weixin.qq.com/cgi-bin/message/custom/send";

    /**
     * 为授权的小程序帐号上传小程序代码
     */
    public static String wxaCommit            = "https://api.weixin.qq.com/wxa/commit";

    /**
     * 获取体验小程序的体验二维码
     */
    public static String wxaGetQrcode         = "https://api.weixin.qq.com/wxa/get_qrcode";

    /**
     * 将第三方提交的代码包提交审核（仅供第三方开发者代小程序调用）
     */
    public static String waxSubmitAudit       = "https://api.weixin.qq.com/wxa/submit_audit";

    /**
     * 需要先将域名登记到第三方平台的小程序服务器域名中，才可以调用接口进行配置。
     */
    public static String wxaModifyDomain      = "https://api.weixin.qq.com/wxa/modify_domain";

    /**
     * 小程序业务域名设置:个人账号没有业务域名 (not support single hint).
     */
    public static String wxaSetwebviewdomain  = "https://api.weixin.qq.com/wxa/setwebviewdomain";

    /**
     * 获取小程序的第三方提交代码的页面配置（仅供第三方开发者代小程序调用）
     */
    public static String wxaGetPage           = "https://api.weixin.qq.com/wxa/get_page";

}
