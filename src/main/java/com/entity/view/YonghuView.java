package com.entity.view;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-03-06
 */
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 岗位的值
		*/
		private String gangweiValue;
		/**
		* 工种的值
		*/
		private String gongzhongValue;
		/**
		* 政治面貌的值
		*/
		private String politicsValue;
		/**
		* 人员状态的值
		*/
		private String yonghuValue;



	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 岗位的值
			*/
			public String getGangweiValue() {
				return gangweiValue;
			}
			/**
			* 设置： 岗位的值
			*/
			public void setGangweiValue(String gangweiValue) {
				this.gangweiValue = gangweiValue;
			}
			/**
			* 获取： 工种的值
			*/
			public String getGongzhongValue() {
				return gongzhongValue;
			}
			/**
			* 设置： 工种的值
			*/
			public void setGongzhongValue(String gongzhongValue) {
				this.gongzhongValue = gongzhongValue;
			}
			/**
			* 获取： 政治面貌的值
			*/
			public String getPoliticsValue() {
				return politicsValue;
			}
			/**
			* 设置： 政治面貌的值
			*/
			public void setPoliticsValue(String politicsValue) {
				this.politicsValue = politicsValue;
			}
			/**
			* 获取： 人员状态的值
			*/
			public String getYonghuValue() {
				return yonghuValue;
			}
			/**
			* 设置： 人员状态的值
			*/
			public void setYonghuValue(String yonghuValue) {
				this.yonghuValue = yonghuValue;
			}











}
