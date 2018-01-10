package ren.ascence.client;

public class OpenUrls {

    /**
     * 第三方平台方可以在自己的网站:中放置“微信公众号授权”或者“小程序授权”的入口，引导公众号和小程序管理员进入授权页。授权页网址：
     */
    //public static String componentloginpage = "https://mp.weixin.qq.com/cgi-bin/componentloginpage";

    public static String apiComponentToken    = "https://api.weixin.qq.com/cgi-bin/component/api_component_token";

    public static String apiCreatePreauthcode = "https://api.weixin.qq.com/cgi-bin/component/api_create_preauthcode";

    
    
    
    
    
    
    
    
    /**
     * 使用预授权码换取公众号或小程序的接口调用凭据和授权信息
     * 该API用于使用授权码换取授权公众号或小程序的授权信息，并换取authorizer_access_token和authorizer_refresh_token。 
     * 授权码的获取，需要在用户在第三方平台授权页中完成授权流程后，在回调URI中通过URL参数提供给第三方平台方。
     * 请注意，由于现在公众号或小程序可以自定义选择部分权限授权给第三方平台，
     * 因此第三方平台开发者需要通过该接口来获取公众号或小程序具体授权了哪些权限，而不是简单地认为自己声明的权限就是公众号或小程序授权的权限。   
     */
    public static String apiQueryAuth         = "https://api.weixin.qq.com/cgi-bin/component/api_query_auth";

    /**
     * 获取（刷新）授权公众号或小程序的接口调用凭据（令牌）
     * 该API用于在授权方令牌（authorizer_access_token）失效时，可用刷新令牌（authorizer_refresh_token）获取新的令牌。
     * <p>
     * 请注意，此处token是2小时刷新一次，开发者需要自行进行token的缓存，避免token的获取次数达到每日的限定额度。
     * </p>
     */
    public static String apiAuthorizerToken   = "https://api.weixin.qq.com/cgi-bin/component/api_authorizer_token";
    /**
     * 获取授权方的帐号基本信息
     * 该API用于获取授权方的基本信息，包括头像、昵称、帐号类型、认证类型、微信号、原始ID和二维码图片URL。
     * 需要特别记录授权方的帐号类型，在消息及事件推送时，对于不具备客服接口的公众号，需要在5秒内立即响应；
     * 而若有客服接口，则可以选择暂时不响应，而选择后续通过客服接口来发送消息触达粉丝。
     */
    public static String apiGetAuthorizerInfo = "https://api.weixin.qq.com/cgi-bin/component/api_get_authorizer_info";

    /**
     * 第三方平台开发者的服务器使用登录凭证 code 以及第三方平台的component_access_token 获取 session_key 和 openid。
     * 其中 session_key 是对用户数据进行加密签名的密钥。
     * 为了自身应用安全，session_key 不应该在网络上传输。
     */
    public static String jscode2session       = "https://api.weixin.qq.com/sns/component/jscode2session";

    /**
     * 发送客服消息
     */
    public static String customSend           = "https://api.weixin.qq.com/cgi-bin/message/custom/send";

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
     * 查询某个指定版本的审核状态（仅供第三方代小程序调用）
     */
    public static String waxGetAuditstatus    = "https://api.weixin.qq.com/wxa/get_auditstatus";

    /**
     * 获取代码模版库中的所有小程序代码模版
     */
    public static String waxGettemplatelist   = "https://api.weixin.qq.com/wxa/gettemplatelist";

    /**
     * 需要先将域名登记到第三方平台的小程序服务器域名中，才可以调用接口进行配置。
     */
    public static String wxaModifyDomain      = "https://api.weixin.qq.com/wxa/modify_domain";

    /**
     * 小程序业务域名设置:个人账号没有业务域名 (not support single hint).
     */
    public static String wxaSetwebviewdomain  = "https://api.weixin.qq.com/wxa/setwebviewdomain";

    /**
     * 获取授权小程序帐号的可选类目 GET
     */
    public static String wxaGetCategory       = "https://api.weixin.qq.com/wxa/get_category";

    /**
     * 获取小程序的第三方提交代码的页面配置（仅供第三方开发者代小程序调用）
     */
    public static String wxaGetPage           = "https://api.weixin.qq.com/wxa/get_page";

    /**
     * 发布代码
     */
    public static String wxaRelease           = "https://api.weixin.qq.com/wxa/release";

}
