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
@TableName("open_component_access_token")
public class OpenComponentAccessToken extends Model<OpenComponentAccessToken> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("expires_in")
	private Long expiresIn;
	@TableField("create_time")
	private Date createTime;
    /**
     * 令牌
     */
	@TableField("component_access_token")
	private String componentAccessToken;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getComponentAccessToken() {
		return componentAccessToken;
	}

	public void setComponentAccessToken(String componentAccessToken) {
		this.componentAccessToken = componentAccessToken;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OpenComponentAccessToken{" +
			"id=" + id +
			", expiresIn=" + expiresIn +
			", createTime=" + createTime +
			", componentAccessToken=" + componentAccessToken +
			"}";
	}
}
