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
 * 课程考勤
 *
 * @author 
 * @email
 */
@TableName("kechnegkaoqin")
public class KechnegkaoqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechnegkaoqinEntity() {

	}

	public KechnegkaoqinEntity(T t) {
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
     * 编号
     */
    @TableField(value = "kechnegkaoqin_uuid_number")

    private String kechnegkaoqinUuidNumber;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 班级人数
     */
    @TableField(value = "zongrenshu")

    private Integer zongrenshu;


    /**
     * 已到人数
     */
    @TableField(value = "yidaorenshu")

    private Integer yidaorenshu;


    /**
     * 请假人数
     */
    @TableField(value = "qingjiarenshu")

    private Integer qingjiarenshu;


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaoqin_time")

    private Date kaoqinTime;


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
	 * 设置：编号
	 */
    public String getKechnegkaoqinUuidNumber() {
        return kechnegkaoqinUuidNumber;
    }


    /**
	 * 获取：编号
	 */

    public void setKechnegkaoqinUuidNumber(String kechnegkaoqinUuidNumber) {
        this.kechnegkaoqinUuidNumber = kechnegkaoqinUuidNumber;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：班级人数
	 */
    public Integer getZongrenshu() {
        return zongrenshu;
    }


    /**
	 * 获取：班级人数
	 */

    public void setZongrenshu(Integer zongrenshu) {
        this.zongrenshu = zongrenshu;
    }
    /**
	 * 设置：已到人数
	 */
    public Integer getYidaorenshu() {
        return yidaorenshu;
    }


    /**
	 * 获取：已到人数
	 */

    public void setYidaorenshu(Integer yidaorenshu) {
        this.yidaorenshu = yidaorenshu;
    }
    /**
	 * 设置：请假人数
	 */
    public Integer getQingjiarenshu() {
        return qingjiarenshu;
    }


    /**
	 * 获取：请假人数
	 */

    public void setQingjiarenshu(Integer qingjiarenshu) {
        this.qingjiarenshu = qingjiarenshu;
    }
    /**
	 * 设置：考勤时间
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 获取：考勤时间
	 */

    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
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
        return "Kechnegkaoqin{" +
            "id=" + id +
            ", kechnegkaoqinUuidNumber=" + kechnegkaoqinUuidNumber +
            ", kechengId=" + kechengId +
            ", zongrenshu=" + zongrenshu +
            ", yidaorenshu=" + yidaorenshu +
            ", qingjiarenshu=" + qingjiarenshu +
            ", kaoqinTime=" + kaoqinTime +
            ", createTime=" + createTime +
        "}";
    }
}
