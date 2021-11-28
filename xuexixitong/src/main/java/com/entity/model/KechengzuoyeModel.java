package com.entity.model;

import com.entity.KechengzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengzuoyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业标题
     */
    private String kechengzuoyeName;


    /**
     * 作业类型
     */
    private Integer kechengTypes;


    /**
     * 发布教师
     */
    private Integer jiaoshiId;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 文件
     */
    private String kechengzuoyeFile;


    /**
     * 详情
     */
    private String kechengzuoyeContent;


    /**
     * 交付时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kechengzuoyeTime;


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
	 * 获取：作业标题
	 */
    public String getKechengzuoyeName() {
        return kechengzuoyeName;
    }


    /**
	 * 设置：作业标题
	 */
    public void setKechengzuoyeName(String kechengzuoyeName) {
        this.kechengzuoyeName = kechengzuoyeName;
    }
    /**
	 * 获取：作业类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：作业类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：发布教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getKechengzuoyeFile() {
        return kechengzuoyeFile;
    }


    /**
	 * 设置：文件
	 */
    public void setKechengzuoyeFile(String kechengzuoyeFile) {
        this.kechengzuoyeFile = kechengzuoyeFile;
    }
    /**
	 * 获取：详情
	 */
    public String getKechengzuoyeContent() {
        return kechengzuoyeContent;
    }


    /**
	 * 设置：详情
	 */
    public void setKechengzuoyeContent(String kechengzuoyeContent) {
        this.kechengzuoyeContent = kechengzuoyeContent;
    }
    /**
	 * 获取：交付时间
	 */
    public Date getKechengzuoyeTime() {
        return kechengzuoyeTime;
    }


    /**
	 * 设置：交付时间
	 */
    public void setKechengzuoyeTime(Date kechengzuoyeTime) {
        this.kechengzuoyeTime = kechengzuoyeTime;
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
