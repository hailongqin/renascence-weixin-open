package ren.ascence.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

import ren.ascence.entity.OpenConfig;

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
        JSONObject result = this.postForObject(OpenUrls.apiComponentToken, postData);
        return result;
    }

    /**
     * <p>获取预授权码
     * 
     * <p>预授权码用于公众号或小程序授权时的第三方平台方安全验证
     */
    public JSONObject getPreAuthCode(String componentAccessToken) {
        String url = this.appendUrl(OpenUrls.apiCreatePreauthcode, "component_access_token",
            componentAccessToken);
        Map<String, String> postData = Collections.singletonMap("component_appid",
            openConfig.getAppId());
        JSONObject result = restTemplate.postForObject(url, postData, JSONObject.class);
        return result;
    }

}
