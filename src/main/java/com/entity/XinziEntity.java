package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 工资
 *
 * @author 
 * @email
 * @date 2021-03-06
 */
@TableName("xinzi")
public class XinziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinziEntity() {

	}

	public XinziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 月份
     */
    @TableField(value = "month")

    private String month;


    /**
     * 薪资
     */
    @TableField(value = "xinzi_money")

    private Double xinziMoney;


    /**
     * 补贴金额
     */
    @TableField(value = "butie_money")

    private Double butieMoney;


    /**
     * 总金额
     */
    @TableField(value = "sum_money")

    private Double sumMoney;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：月份
	 */
    public String getMonth() {
        return month;
    }


    /**
	 * 获取：月份
	 */

    public void setMonth(String month) {
        this.month = month;
    }
    /**
	 * 设置：薪资
	 */
    public Double getXinziMoney() {
        return xinziMoney;
    }


    /**
	 * 获取：薪资
	 */

    public void setXinziMoney(Double xinziMoney) {
        this.xinziMoney = xinziMoney;
    }
    /**
	 * 设置：补贴金额
	 */
    public Double getButieMoney() {
        return butieMoney;
    }


    /**
	 * 获取：补贴金额
	 */

    public void setButieMoney(Double butieMoney) {
        this.butieMoney = butieMoney;
    }
    /**
	 * 设置：总金额
	 */
    public Double getSumMoney() {
        return sumMoney;
    }


    /**
	 * 获取：总金额
	 */

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinzi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", month=" + month +
            ", xinziMoney=" + xinziMoney +
            ", butieMoney=" + butieMoney +
            ", sumMoney=" + sumMoney +
            ", createTime=" + createTime +
        "}";
    }
}
