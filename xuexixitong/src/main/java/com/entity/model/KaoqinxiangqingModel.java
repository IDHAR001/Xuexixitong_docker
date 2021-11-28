package com.entity.model;

import com.entity.KaoqinxiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程考勤详情
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqinxiangqingModel implements Serializable {
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
     * 考勤学生
     */
    private Integer xueshengId;


    /**
     * 考勤状态
     */
    private Integer kaoqinTypes;


    /**
     * 考勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：考勤学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：考勤学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：考勤状态
	 */
    public Integer getKaoqinTypes() {
        return kaoqinTypes;
    }


    /**
	 * 设置：考勤状态
	 */
    public void setKaoqinTypes(Integer kaoqinTypes) {
        this.kaoqinTypes = kaoqinTypes;
    }
    /**
	 * 获取：考勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：考勤时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
