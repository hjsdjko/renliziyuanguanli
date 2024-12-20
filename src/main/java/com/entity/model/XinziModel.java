package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-06
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 月份
     */
    private String month;


    /**
     * 薪资
     */
    private Double xinziMoney;


    /**
     * 补贴金额
     */
    private Double butieMoney;


    /**
     * 总金额
     */
    private Double sumMoney;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：月份
	 */
    public String getMonth() {
        return month;
    }


    /**
	 * 设置：月份
	 */
    public void setMonth(String month) {
        this.month = month;
    }
    /**
	 * 获取：薪资
	 */
    public Double getXinziMoney() {
        return xinziMoney;
    }


    /**
	 * 设置：薪资
	 */
    public void setXinziMoney(Double xinziMoney) {
        this.xinziMoney = xinziMoney;
    }
    /**
	 * 获取：补贴金额
	 */
    public Double getButieMoney() {
        return butieMoney;
    }


    /**
	 * 设置：补贴金额
	 */
    public void setButieMoney(Double butieMoney) {
        this.butieMoney = butieMoney;
    }
    /**
	 * 获取：总金额
	 */
    public Double getSumMoney() {
        return sumMoney;
    }


    /**
	 * 设置：总金额
	 */
    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
