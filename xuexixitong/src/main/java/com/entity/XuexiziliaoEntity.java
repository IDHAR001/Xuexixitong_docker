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
 * 学习资料
 *
 * @author 
 * @email
 */
@TableName("xuexiziliao")
public class XuexiziliaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexiziliaoEntity() {

	}

	public XuexiziliaoEntity(T t) {
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
    @TableField(value = "xuexiziliao_name")

    private String xuexiziliaoName;


    /**
     * 类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 图片
     */
    @TableField(value = "xuexiziliao_photo")

    private String xuexiziliaoPhoto;


    /**
     * 学习文件
     */
    @TableField(value = "xuexiziliao_file")

    private String xuexiziliaoFile;


    /**
     * 详情
     */
    @TableField(value = "xuexiziliao_text")

    private String xuexiziliaoText;


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
    public String getXuexiziliaoName() {
        return xuexiziliaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setXuexiziliaoName(String xuexiziliaoName) {
        this.xuexiziliaoName = xuexiziliaoName;
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
    public String getXuexiziliaoPhoto() {
        return xuexiziliaoPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setXuexiziliaoPhoto(String xuexiziliaoPhoto) {
        this.xuexiziliaoPhoto = xuexiziliaoPhoto;
    }
    /**
	 * 设置：学习文件
	 */
    public String getXuexiziliaoFile() {
        return xuexiziliaoFile;
    }


    /**
	 * 获取：学习文件
	 */

    public void setXuexiziliaoFile(String xuexiziliaoFile) {
        this.xuexiziliaoFile = xuexiziliaoFile;
    }
    /**
	 * 设置：详情
	 */
    public String getXuexiziliaoText() {
        return xuexiziliaoText;
    }


    /**
	 * 获取：详情
	 */

    public void setXuexiziliaoText(String xuexiziliaoText) {
        this.xuexiziliaoText = xuexiziliaoText;
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
        return "Xuexiziliao{" +
            "id=" + id +
            ", xuexiziliaoName=" + xuexiziliaoName +
            ", kechengTypes=" + kechengTypes +
            ", xuexiziliaoPhoto=" + xuexiziliaoPhoto +
            ", xuexiziliaoFile=" + xuexiziliaoFile +
            ", xuexiziliaoText=" + xuexiziliaoText +
            ", createTime=" + createTime +
        "}";
    }
}
