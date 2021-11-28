package com.entity.view;

import com.entity.KechnegkaoqinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程考勤
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kechnegkaoqin")
public class KechnegkaoqinView extends KechnegkaoqinEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kecheng
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 教师
			*/
			private Integer jiaoshiId;
			/**
			* 上课班级
			*/
			private Integer banjiTypes;
				/**
				* 上课班级的值
				*/
				private String banjiValue;
			/**
			* 上课时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="HH:mm")
			@DateTimeFormat
			private Date shangkeTime;
			/**
			* 下课时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="HH:mm")
			@DateTimeFormat
			private Date xiakeTime;

	public KechnegkaoqinView() {

	}

	public KechnegkaoqinView(KechnegkaoqinEntity kechnegkaoqinEntity) {
		try {
			BeanUtils.copyProperties(this, kechnegkaoqinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



























				//级联表的get和set kecheng
					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}
					/**
					* 获取： 教师
					*/
					public Integer getJiaoshiId() {
						return jiaoshiId;
					}
					/**
					* 设置： 教师
					*/
					public void setJiaoshiId(Integer jiaoshiId) {
						this.jiaoshiId = jiaoshiId;
					}
					/**
					* 获取： 上课班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 上课班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 上课班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 上课班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 上课时间
					*/
					public Date getShangkeTime() {
						return shangkeTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShangkeTime(Date shangkeTime) {
						this.shangkeTime = shangkeTime;
					}
					/**
					* 获取： 下课时间
					*/
					public Date getXiakeTime() {
						return xiakeTime;
					}
					/**
					* 设置： 下课时间
					*/
					public void setXiakeTime(Date xiakeTime) {
						this.xiakeTime = xiakeTime;
					}












}
