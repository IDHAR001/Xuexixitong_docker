package com.entity.view;

import com.entity.KaoqinqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考勤请假
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoqinqingjia")
public class KaoqinqingjiaView extends KaoqinqingjiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审批结果的值
		*/
		private String kaoqinqingjiaValue;



		//级联表 kechnegkaoqin
			/**
			* 编号
			*/
			private String kechnegkaoqinUuidNumber;
			/**
			* 课程
			*/
			private Integer kechengId;
			/**
			* 班级人数
			*/
			private Integer zongrenshu;
			/**
			* 已到人数
			*/
			private Integer yidaorenshu;
			/**
			* 请假人数
			*/
			private Integer qingjiarenshu;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 考勤时间
			*/
			private Date kaoqinTime;

		//级联表 xuesheng
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 手机号
			*/
			private String xueshengPhone;
			/**
			* 照片
			*/
			private String xueshengPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;

	public KaoqinqingjiaView() {

	}

	public KaoqinqingjiaView(KaoqinqingjiaEntity kaoqinqingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, kaoqinqingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审批结果的值
			*/
			public String getKaoqinqingjiaValue() {
				return kaoqinqingjiaValue;
			}
			/**
			* 设置： 审批结果的值
			*/
			public void setKaoqinqingjiaValue(String kaoqinqingjiaValue) {
				this.kaoqinqingjiaValue = kaoqinqingjiaValue;
			}









































				//级联表的get和set kechnegkaoqin
					/**
					* 获取： 编号
					*/
					public String getKechnegkaoqinUuidNumber() {
						return kechnegkaoqinUuidNumber;
					}
					/**
					* 设置： 编号
					*/
					public void setKechnegkaoqinUuidNumber(String kechnegkaoqinUuidNumber) {
						this.kechnegkaoqinUuidNumber = kechnegkaoqinUuidNumber;
					}
					/**
					* 获取： 课程
					*/
					public Integer getKechengId() {
						return kechengId;
					}
					/**
					* 设置： 课程
					*/
					public void setKechengId(Integer kechengId) {
						this.kechengId = kechengId;
					}
					/**
					* 获取： 班级人数
					*/
					public Integer getZongrenshu() {
						return zongrenshu;
					}
					/**
					* 设置： 班级人数
					*/
					public void setZongrenshu(Integer zongrenshu) {
						this.zongrenshu = zongrenshu;
					}
					/**
					* 获取： 已到人数
					*/
					public Integer getYidaorenshu() {
						return yidaorenshu;
					}
					/**
					* 设置： 已到人数
					*/
					public void setYidaorenshu(Integer yidaorenshu) {
						this.yidaorenshu = yidaorenshu;
					}
					/**
					* 获取： 请假人数
					*/
					public Integer getQingjiarenshu() {
						return qingjiarenshu;
					}
					/**
					* 设置： 请假人数
					*/
					public void setQingjiarenshu(Integer qingjiarenshu) {
						this.qingjiarenshu = qingjiarenshu;
					}
					/**
					* 获取： 考勤时间
					*/
					public Date getKaoqinTime() {
						return kaoqinTime;
					}
					/**
					* 设置： 考勤时间
					*/
					public void setKaoqinTime(Date kaoqinTime) {
						this.kaoqinTime = kaoqinTime;
					}


				//级联表的get和set xuesheng
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}










}
