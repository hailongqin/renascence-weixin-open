package ren.ascence.entity;


import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhongbh
 * @since 2018-01-13
 */
@TableName("open_config")
public class OpenConfig extends Model<OpenConfig> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 第三方平台消息校验Token
     */
	private String token;
    /**
     * 第三方平台消息加解密Key
     */
	@TableField("encoding_aes_key")
	private String encodingAesKey;
    /**
     * 第三方平台的APPID
     */
	@TableField("app_id")
	private String appId;
    /**
     * 第三方平台APP_SECRET
     */
	@TableField("app_secret")
	private String appSecret;
    /**
     * 商家平台域名
     */
	private String host;
    /**
     * 小程序域名
     */
	private String mapphost;
    /**
     * 小程序的专用测试号
     */
	@TableField("mini_username")
	private String miniUsername;
    /**
     * 0 不启用 1启用
     */
	private Integer status;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEncodingAesKey() {
		return encodingAesKey;
	}

	public void setEncodingAesKey(String encodingAesKey) {
		this.encodingAesKey = encodingAesKey;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getMapphost() {
		return mapphost;
	}

	public void setMapphost(String mapphost) {
		this.mapphost = mapphost;
	}

	public String getMiniUsername() {
		return miniUsername;
	}

	public void setMiniUsername(String miniUsername) {
		this.miniUsername = miniUsername;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OpenConfig{" +
			"id=" + id +
			", token=" + token +
			", encodingAesKey=" + encodingAesKey +
			", appId=" + appId +
			", appSecret=" + appSecret +
			", host=" + host +
			", mapphost=" + mapphost +
			", miniUsername=" + miniUsername +
			", status=" + status +
			"}";
	}
}
