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
@TableName("open_mapp_version")
public class OpenMappVersion extends Model<OpenMappVersion> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 商家ID
     */
	@TableField("parent_id")
	private Integer parentId;
	@TableField("app_id")
	private String appId;
    /**
     * 模板ID
     */
	@TableField("template_id")
	private Integer templateId;
    /**
     * 代码提交审核状态：0未提交 1审核中 2审核通过3审核不通过
     */
	@TableField("verify_status")
	private Integer verifyStatus;
    /**
     * 审核编号
     */
	private String auditid;
    /**
     * 发布状态0未发布 1已发布 2发布失败
     */
	@TableField("issue_status")
	private Integer issueStatus;
	@TableField("create_time")
	private Date createTime;
	@TableField("update_time")
	private Date updateTime;
    /**
     * 版本号
     */
	@TableField("user_version")
	private String userVersion;
    /**
     * 审核拒绝原因
     */
	private String reason;
    /**
     * 标记 0 是当前数据 1是过期数据
     */
	private Integer type;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public Integer getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(Integer verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getAuditid() {
		return auditid;
	}

	public void setAuditid(String auditid) {
		this.auditid = auditid;
	}

	public Integer getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(Integer issueStatus) {
		this.issueStatus = issueStatus;
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

	public String getUserVersion() {
		return userVersion;
	}

	public void setUserVersion(String userVersion) {
		this.userVersion = userVersion;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OpenMappVersion{" +
			"id=" + id +
			", parentId=" + parentId +
			", appId=" + appId +
			", templateId=" + templateId +
			", verifyStatus=" + verifyStatus +
			", auditid=" + auditid +
			", issueStatus=" + issueStatus +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", userVersion=" + userVersion +
			", reason=" + reason +
			", type=" + type +
			"}";
	}
}
