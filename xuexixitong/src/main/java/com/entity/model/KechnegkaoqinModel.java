package com.entity.model;

import com.entity.KechnegkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程考勤
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechnegkaoqinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaoqinTime;


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
	 * 获取：编号
	 */
    public String getKechnegkaoqinUuidNumber() {
        return kechnegkaoqinUuidNumber;
    }


    /**
	 * 设置：编号
	 */
    public void setKechnegkaoqinUuidNumber(String kechnegkaoqinUuidNumber) {
        this.kechnegkaoqinUuidNumber = kechnegkaoqinUuidNumber;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：班级人数
	 */
    public Integer getZongrenshu() {
        return zongrenshu;
    }


    /**
	 * 设置：班级人数
	 */
    public void setZongrenshu(Integer zongrenshu) {
        this.zongrenshu = zongrenshu;
    }
    /**
	 * 获取：已到人数
	 */
    public Integer getYidaorenshu() {
        return yidaorenshu;
    }


    /**
	 * 设置：已到人数
	 */
    public void setYidaorenshu(Integer yidaorenshu) {
        this.yidaorenshu = yidaorenshu;
    }
    /**
	 * 获取：请假人数
	 */
    public Integer getQingjiarenshu() {
        return qingjiarenshu;
    }


    /**
	 * 设置：请假人数
	 */
    public void setQingjiarenshu(Integer qingjiarenshu) {
        this.qingjiarenshu = qingjiarenshu;
    }
    /**
	 * 获取：考勤时间
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 设置：考勤时间
	 */
    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
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
