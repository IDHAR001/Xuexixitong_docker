package com.entity.model;

import com.entity.XuexiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习资料
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuexiziliaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String xuexiziliaoName;


    /**
     * 类型
     */
    private Integer kechengTypes;


    /**
     * 图片
     */
    private String xuexiziliaoPhoto;


    /**
     * 学习文件
     */
    private String xuexiziliaoFile;


    /**
     * 详情
     */
    private String xuexiziliaoText;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：标题
	 */
    public String getXuexiziliaoName() {
        return xuexiziliaoName;
    }


    /**
	 * 设置：标题
	 */
    public void setXuexiziliaoName(String xuexiziliaoName) {
        this.xuexiziliaoName = xuexiziliaoName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getXuexiziliaoPhoto() {
        return xuexiziliaoPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setXuexiziliaoPhoto(String xuexiziliaoPhoto) {
        this.xuexiziliaoPhoto = xuexiziliaoPhoto;
    }
    /**
	 * 获取：学习文件
	 */
    public String getXuexiziliaoFile() {
        return xuexiziliaoFile;
    }


    /**
	 * 设置：学习文件
	 */
    public void setXuexiziliaoFile(String xuexiziliaoFile) {
        this.xuexiziliaoFile = xuexiziliaoFile;
    }
    /**
	 * 获取：详情
	 */
    public String getXuexiziliaoText() {
        return xuexiziliaoText;
    }


    /**
	 * 设置：详情
	 */
    public void setXuexiziliaoText(String xuexiziliaoText) {
        this.xuexiziliaoText = xuexiziliaoText;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
