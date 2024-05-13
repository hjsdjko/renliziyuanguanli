package com.entity.vo;

import com.entity.XinziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工资
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-06
 */
@TableName("xinzi")
public class XinziVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
