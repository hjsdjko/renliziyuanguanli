package com.entity.view;

import com.entity.CultivateEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 培训
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-03-06
 */
@TableName("cultivate")
public class CultivateView extends CultivateEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 账户
			*/
			private String username;
			/**
			* 密码
			*/
			private String password;
			/**
			* 员工编号
			*/
			private String idCard;
			/**
			* 姓名
			*/
			private String name;
			/**
			* 手机号
			*/
			private String phone;
			/**
			* 身份证号
			*/
			private String idNumber;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 岗位
			*/
			private Integer gangweiTypes;
				/**
				* 岗位的值
				*/
				private String gangweiValue;
			/**
			* 工种
			*/
			private Integer gongzhongTypes;
				/**
				* 工种的值
				*/
				private String gongzhongValue;
			/**
			* 照片
			*/
			private String myPhoto;
			/**
			* 合同
			*/
			private String myFile;
			/**
			* 民族
			*/
			private String nation;
			/**
			* 政治面貌
			*/
			private Integer politicsTypes;
				/**
				* 政治面貌的值
				*/
				private String politicsValue;
			/**
			* 籍贯
			*/
			private String birthplace;
			/**
			* 人员状态
			*/
			private Integer yonghuTypes;
				/**
				* 人员状态的值
				*/
				private String yonghuValue;

	public CultivateView() {

	}

	public CultivateView(CultivateEntity cultivateEntity) {
		try {
			BeanUtils.copyProperties(this, cultivateEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





















				//级联表的get和set yonghu
					/**
					* 获取： 账户
					*/
					public String getUsername() {
						return username;
					}
					/**
					* 设置： 账户
					*/
					public void setUsername(String username) {
						this.username = username;
					}
					/**
					* 获取： 密码
					*/
					public String getPassword() {
						return password;
					}
					/**
					* 设置： 密码
					*/
					public void setPassword(String password) {
						this.password = password;
					}
					/**
					* 获取： 员工编号
					*/
					public String getIdCard() {
						return idCard;
					}
					/**
					* 设置： 员工编号
					*/
					public void setIdCard(String idCard) {
						this.idCard = idCard;
					}
					/**
					* 获取： 姓名
					*/
					public String getName() {
						return name;
					}
					/**
					* 设置： 姓名
					*/
					public void setName(String name) {
						this.name = name;
					}
					/**
					* 获取： 手机号
					*/
					public String getPhone() {
						return phone;
					}
					/**
					* 设置： 手机号
					*/
					public void setPhone(String phone) {
						this.phone = phone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getIdNumber() {
						return idNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setIdNumber(String idNumber) {
						this.idNumber = idNumber;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 岗位
					*/
					public Integer getGangweiTypes() {
						return gangweiTypes;
					}
					/**
					* 设置： 岗位
					*/
					public void setGangweiTypes(Integer gangweiTypes) {
						this.gangweiTypes = gangweiTypes;
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
					* 获取： 工种
					*/
					public Integer getGongzhongTypes() {
						return gongzhongTypes;
					}
					/**
					* 设置： 工种
					*/
					public void setGongzhongTypes(Integer gongzhongTypes) {
						this.gongzhongTypes = gongzhongTypes;
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
					* 获取： 照片
					*/
					public String getMyPhoto() {
						return myPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setMyPhoto(String myPhoto) {
						this.myPhoto = myPhoto;
					}
					/**
					* 获取： 合同
					*/
					public String getMyFile() {
						return myFile;
					}
					/**
					* 设置： 合同
					*/
					public void setMyFile(String myFile) {
						this.myFile = myFile;
					}
					/**
					* 获取： 民族
					*/
					public String getNation() {
						return nation;
					}
					/**
					* 设置： 民族
					*/
					public void setNation(String nation) {
						this.nation = nation;
					}
					/**
					* 获取： 政治面貌
					*/
					public Integer getPoliticsTypes() {
						return politicsTypes;
					}
					/**
					* 设置： 政治面貌
					*/
					public void setPoliticsTypes(Integer politicsTypes) {
						this.politicsTypes = politicsTypes;
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
					* 获取： 籍贯
					*/
					public String getBirthplace() {
						return birthplace;
					}
					/**
					* 设置： 籍贯
					*/
					public void setBirthplace(String birthplace) {
						this.birthplace = birthplace;
					}
					/**
					* 获取： 人员状态
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 人员状态
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
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
