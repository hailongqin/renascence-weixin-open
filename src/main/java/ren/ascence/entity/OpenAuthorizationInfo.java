package ren.ascence.entity;


import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
 * @since 2018-01-10
 */
@TableName("open_authorization_info")
public class OpenAuthorizationInfo extends Model<OpenAuthorizationInfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("app_id")
	private String appId;
	@TableField("access_token")
	private String accessToken;
    /**
     * 接口调用凭据刷新令牌（在授权的公众号具备API权限时，才有此返回值）刷新令牌主要用于第三方平台获取和刷新已授权用户的access_token 只会在授权时刻提供，请妥善保存。一旦丢失，只能让用户重新授权，才能再次拿到新的刷新令牌
     */
	@TableField("refresh_token")
	private String refreshToken;
	@TableField("expires_in")
	private Long expiresIn;
	@TableField("create_time")
	private Date createTime;
	@TableField("update_time")
	private Date updateTime;
    /**
     * 授权的权限
     */
	@TableField("func_info_json")
	private String funcInfoJson;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getFuncInfoJson() {
		return funcInfoJson;
	}

	public void setFuncInfoJson(String funcInfoJson) {
		this.funcInfoJson = funcInfoJson;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OpenAuthorizationInfo{" +
			"id=" + id +
			", appId=" + appId +
			", accessToken=" + accessToken +
			", refreshToken=" + refreshToken +
			", expiresIn=" + expiresIn +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", funcInfoJson=" + funcInfoJson +
			"}";
	}
}
