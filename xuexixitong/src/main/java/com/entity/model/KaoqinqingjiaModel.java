package com.entity.model;

import com.entity.KaoqinqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考勤请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqinqingjiaModel implements Serializable {
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
     * 学生
     */
    private Integer xueshengId;


    /**
     * 理由
     */
    private String kaoqinqingjiaText;


    /**
     * 审批结果
     */
    private Integer kaoqinqingjiaTypes;


    /**
     * 课程考勤请假
     */
    private Integer kechnegkaoqinId;


    /**
     * 请假时间
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
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：理由
	 */
    public String getKaoqinqingjiaText() {
        return kaoqinqingjiaText;
    }


    /**
	 * 设置：理由
	 */
    public void setKaoqinqingjiaText(String kaoqinqingjiaText) {
        this.kaoqinqingjiaText = kaoqinqingjiaText;
    }
    /**
	 * 获取：审批结果
	 */
    public Integer getKaoqinqingjiaTypes() {
        return kaoqinqingjiaTypes;
    }


    /**
	 * 设置：审批结果
	 */
    public void setKaoqinqingjiaTypes(Integer kaoqinqingjiaTypes) {
        this.kaoqinqingjiaTypes = kaoqinqingjiaTypes;
    }
    /**
	 * 获取：课程考勤请假
	 */
    public Integer getKechnegkaoqinId() {
        return kechnegkaoqinId;
    }


    /**
	 * 设置：课程考勤请假
	 */
    public void setKechnegkaoqinId(Integer kechnegkaoqinId) {
        this.kechnegkaoqinId = kechnegkaoqinId;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：请假时间
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
