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
 * 学习视频
 *
 * @author 
 * @email
 */
@TableName("xuexishipin")
public class XuexishipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexishipinEntity() {

	}

	public XuexishipinEntity(T t) {
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
     * 标题
     */
    @TableField(value = "xuexishipin_name")

    private String xuexishipinName;


    /**
     * 类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 图片
     */
    @TableField(value = "xuexishipin_photo")

    private String xuexishipinPhoto;


    /**
     * 视频
     */
    @TableField(value = "xuexishipin_video")

    private String xuexishipinVideo;


    /**
     * 详情
     */
    @TableField(value = "xuexishipin_text")

    private String xuexishipinText;


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
	 * 设置：标题
	 */
    public String getXuexishipinName() {
        return xuexishipinName;
    }


    /**
	 * 获取：标题
	 */

    public void setXuexishipinName(String xuexishipinName) {
        this.xuexishipinName = xuexishipinName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getXuexishipinPhoto() {
        return xuexishipinPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setXuexishipinPhoto(String xuexishipinPhoto) {
        this.xuexishipinPhoto = xuexishipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getXuexishipinVideo() {
        return xuexishipinVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setXuexishipinVideo(String xuexishipinVideo) {
        this.xuexishipinVideo = xuexishipinVideo;
    }
    /**
	 * 设置：详情
	 */
    public String getXuexishipinText() {
        return xuexishipinText;
    }


    /**
	 * 获取：详情
	 */

    public void setXuexishipinText(String xuexishipinText) {
        this.xuexishipinText = xuexishipinText;
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
        return "Xuexishipin{" +
            "id=" + id +
            ", xuexishipinName=" + xuexishipinName +
            ", kechengTypes=" + kechengTypes +
            ", xuexishipinPhoto=" + xuexishipinPhoto +
            ", xuexishipinVideo=" + xuexishipinVideo +
            ", xuexishipinText=" + xuexishipinText +
            ", createTime=" + createTime +
        "}";
    }
}
