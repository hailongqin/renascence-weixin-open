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
@TableName("open_authorizer")
public class OpenAuthorizer extends Model<OpenAuthorizer> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 授权方appid
     */
	@TableField("app_id")
	private String appId;
    /**
     * 授权方昵称
     */
	private String nickname;
    /**
     * 授权方头像
     */
	@TableField("head_img")
	private String headImg;
    /**
     * 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
	@TableField("service_type_info")
	private Integer serviceTypeInfo;
    /**
     * 授权方认证类型，-1代表未认证，0代表微信认证，1代表新浪微博认证，2代表腾讯微博认证，3代表已资质认证通过但还未通过名称认证，4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证
     */
	@TableField("verify_type_info")
	private Integer verifyTypeInfo;
    /**
     * 授权方公众号的原始ID
     */
	private String username;
    /**
     * 公众号的主体名称
     */
	@TableField("principal_name")
	private String principalName;
    /**
     * 授权方公众号所设置的微信号，可能为空
     */
	private String alias;
    /**
     * 二维码图片的URL，开发者最好自行也进行保存
     */
	@TableField("qrcode_url")
	private String qrcodeUrl;
    /**
     * 各种功能的开通情况
     */
	@TableField("business_info_json")
	private String businessInfoJson;
    /**
     * 体验二维码
     */
	@TableField("experience_qrcode_url")
	private String experienceQrcodeUrl;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;


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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getServiceTypeInfo() {
		return serviceTypeInfo;
	}

	public void setServiceTypeInfo(Integer serviceTypeInfo) {
		this.serviceTypeInfo = serviceTypeInfo;
	}

	public Integer getVerifyTypeInfo() {
		return verifyTypeInfo;
	}

	public void setVerifyTypeInfo(Integer verifyTypeInfo) {
		this.verifyTypeInfo = verifyTypeInfo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getQrcodeUrl() {
		return qrcodeUrl;
	}

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getBusinessInfoJson() {
		return businessInfoJson;
	}

	public void setBusinessInfoJson(String businessInfoJson) {
		this.businessInfoJson = businessInfoJson;
	}

	public String getExperienceQrcodeUrl() {
		return experienceQrcodeUrl;
	}

	public void setExperienceQrcodeUrl(String experienceQrcodeUrl) {
		this.experienceQrcodeUrl = experienceQrcodeUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OpenAuthorizer{" +
			"id=" + id +
			", appId=" + appId +
			", nickname=" + nickname +
			", headImg=" + headImg +
			", serviceTypeInfo=" + serviceTypeInfo +
			", verifyTypeInfo=" + verifyTypeInfo +
			", username=" + username +
			", principalName=" + principalName +
			", alias=" + alias +
			", qrcodeUrl=" + qrcodeUrl +
			", businessInfoJson=" + businessInfoJson +
			", experienceQrcodeUrl=" + experienceQrcodeUrl +
			", createTime=" + createTime +
			"}";
	}
}
