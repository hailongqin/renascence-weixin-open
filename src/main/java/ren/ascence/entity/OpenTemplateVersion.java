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
@TableName("open_template_version")
public class OpenTemplateVersion extends Model<OpenTemplateVersion> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 代码版本号
     */
	@TableField("user_version")
	private String userVersion;
	@TableField("user_desc")
	private String userDesc;
    /**
     * 模板ID
     */
	@TableField("template_id")
	private Integer templateId;
	@TableField("create_time")
	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserVersion() {
		return userVersion;
	}

	public void setUserVersion(String userVersion) {
		this.userVersion = userVersion;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
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
		return "OpenTemplateVersion{" +
			"id=" + id +
			", userVersion=" + userVersion +
			", userDesc=" + userDesc +
			", templateId=" + templateId +
			", createTime=" + createTime +
			"}";
	}
}
