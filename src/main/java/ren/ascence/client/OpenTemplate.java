package ren.ascence.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import ren.ascence.consts.Consts;
import ren.ascence.entity.OpenConfig;

import com.alibaba.fastjson.JSONObject;

import static ren.ascence.client.OpenUrls.*;

public class OpenTemplate {

    private RestTemplate restTemplate = new RestTemplate();

    private OpenConfig   openConfig;

    public OpenTemplate(OpenConfig openConfig) {
        this.openConfig = openConfig;
    }

    private JSONObject postForObject(String url, Map<String, String> postData) {
        return restTemplate.postForObject(url, postData, JSONObject.class);
    }

    private String appendUrl(String url, String key, String val) {
        Assert.notNull(val, "val must not be null");
        return url + "?" + key + "=" + val;
    }

    /**
     * <p>获取第三方平台的接口调用授权令牌component_access_token
     * 
     * <p>第三方平台component_access_token是第三方平台的下文中接口的调用凭据,也叫做令牌:component_access_token
     * <p>每个令牌有效期2小时,且令牌的调用不是无限制的，请第三方平台做好令牌的管理,在令牌快过期时再进行刷新,比如1小时50分
     */
    public JSONObject getComponentAccessToken(String componentVerifyTicket) {
        Map<String, String> postData = new HashMap<>();
        postData.put("component_appid", openConfig.getAppId());
        postData.put("component_appsecret", openConfig.getAppSecret());
        postData.put("component_verify_ticket", componentVerifyTicket);
        JSONObject result = this.postForObject(apiComponentToken, postData);
        return result;
    }

    /**
     * <p>获取预授权码
     * 
     * <p>预授权码用于公众号或小程序授权时的第三方平台方安全验证
     */
    public JSONObject getPreAuthCode(String componentAccessToken) {
        String url = this.appendUrl(apiCreatePreauthcode, "component_access_token",
            componentAccessToken);
        Map<String, String> postData = Collections.singletonMap("component_appid",
            openConfig.getAppId());
        JSONObject result = restTemplate.postForObject(url, postData, JSONObject.class);
        return result;
    }
    
    /**
     * <p>使用预授权码换取公众号或小程序的接口调用凭据和授权信息
     * <p>该API用于使用授权码换取授权公众号或小程序的授权信息，并换取authorizer_access_token和authorizer_refresh_token。 
     * <p>授权码的获取，需要在用户在第三方平台授权页中完成授权流程后，在回调URI中通过URL参数提供给第三方平台方。
     * <p>请注意，由于现在公众号或小程序可以自定义选择部分权限授权给第三方平台，
     * <p>因此第三方平台开发者需要通过该接口来获取公众号或小程序具体授权了哪些权限，而不是简单地认为自己声明的权限就是公众号或小程序授权的权限。   
     */
    public JSONObject getAuthorizerToken(String componentAccessToken,String authCode) {
        String url = this.appendUrl(apiQueryAuth, "component_access_token", componentAccessToken);
        Map<String, String> params = new HashMap<>();
        params.put("component_appid", openConfig.getAppId());
        params.put("authorization_code", authCode);
        JSONObject result = restTemplate.postForObject(url, params, JSONObject.class);
        return result;
    }
    
    /**
     * <p>获取（刷新）授权公众号或小程序的接口调用凭据（令牌）
     * 该API用于在授权方令牌（authorizer_access_token）失效时，可用刷新令牌（authorizer_refresh_token）获取新的令牌。
     * 请注意，此处token是2小时刷新一次，开发者需要自行进行token的缓存，避免token的获取次数达到每日的限定额度。
     */
    public JSONObject reGetAuthorizerToken(String componentAccessToken,String authorizerAppid,String authorizerRefreshToken) {
        String url = this.appendUrl(apiAuthorizerToken, "component_access_token", componentAccessToken);
        Map<String, String> params = new HashMap<>();
        params.put("component_appid", openConfig.getAppId());
        params.put("authorizer_appid", authorizerAppid);
        params.put("authorizer_refresh_token", authorizerRefreshToken);
        JSONObject result = restTemplate.postForObject(url, params, JSONObject.class);
        return result;
    }
    
    /**
     * <p>获取授权方的帐号基本信息
     * 该API用于获取授权方的基本信息，包括头像、昵称、帐号类型、认证类型、微信号、原始ID和二维码图片URL。
     * 需要特别记录授权方的帐号类型，在消息及事件推送时，对于不具备客服接口的公众号，需要在5秒内立即响应；
     * 而若有客服接口，则可以选择暂时不响应，而选择后续通过客服接口来发送消息触达粉丝。
     */
    public JSONObject getAuthorizerInfo(String componentAccessToken,String authorizerAppid) {
        String url = this.appendUrl(apiGetAuthorizerInfo, "component_access_token", componentAccessToken);
        Map<String, String> params = new HashMap<>();
        params.put("component_appid", openConfig.getAppId());
        params.put("authorizer_appid", authorizerAppid);
        String result = restTemplate.postForObject(url, params, String.class);
        result = new String(result.getBytes(Consts.ISO_8859_1),
            Consts.UTF_8);
        JSONObject object = JSONObject.parseObject(result);
        return object;
    }
    
    /**
     * 第三方平台小程序登录获取session
     */
    public JSONObject getSessionInfo(String componentAccessToken,String authorizerAppid,String code){
        Map<String, String> params = new HashMap<>(8);
        params.put("appid", authorizerAppid);
        params.put("js_code", code);
        params.put("grant_type", "authorization_code");
        params.put("component_appid", openConfig.getAppId());
        params.put("component_access_token", componentAccessToken);
        JSONObject result = restTemplate.getForObject(jscode2session, JSONObject.class, params);
        return result;
    }
    
    /**
     * 查询某个指定版本的审核状态（仅供第三方代小程序调用）
     */
    public JSONObject getAuditstatus(String authorizerAccessToken,String auditid) {
        String url = this.appendUrl(waxGetAuditstatus, "access_token", authorizerAccessToken);
        Map<String, String> params = new HashMap<>();
        params.put("auditid", auditid);
        JSONObject result = restTemplate.postForObject(url, params, JSONObject.class);
        return result;
    }
    
    /**
     * 获取代码模版库中的所有小程序代码模版
     */    
    public JSONObject gettemplatelist(String componentAccessToken) {
        String url = this.appendUrl(waxGettemplatelist, "access_token", componentAccessToken);
        String result = restTemplate.getForObject(url, String.class);
        //昵称中带表情的数据 (╬◣д◢)
        result = result.replaceAll(" ", "-").replaceAll("\\\\", "-").replaceAll("/", "");
        JSONObject object = JSONObject.parseObject(result);
        return object;
    }
    
    /**
     * 获取授权小程序帐号的可选类目 
     */
    public JSONObject getCategory(String authorizerAccessToken,String appId) {
        String url = this.appendUrl(wxaGetCategory, "access_token", authorizerAccessToken);
        JSONObject result = restTemplate.getForObject(url, JSONObject.class);
        return result;
    }
    
    /**
     * 发布小程序
     */
    public JSONObject wxaRelease(String authorizerAccessToken,String appId) {
        String url = this.appendUrl(wxaRelease, "access_token", authorizerAccessToken);
        JSONObject postData = new JSONObject();
        //JSONObject result = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();
        JSONObject result = restTemplate.postForObject(url, postData, JSONObject.class);
        return result;
    }
    
}
