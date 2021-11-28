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
 * 课程作业
 *
 * @author 
 * @email
 */
@TableName("kechengzuoye")
public class KechengzuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengzuoyeEntity() {

	}

	public KechengzuoyeEntity(T t) {
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
     * 作业标题
     */
    @TableField(value = "kechengzuoye_name")

    private String kechengzuoyeName;


    /**
     * 作业类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 发布教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 班级
     */
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 文件
     */
    @TableField(value = "kechengzuoye_file")

    private String kechengzuoyeFile;


    /**
     * 详情
     */
    @TableField(value = "kechengzuoye_content")

    private String kechengzuoyeContent;


    /**
     * 交付时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kechengzuoye_time")

    private Date kechengzuoyeTime;


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
	 * 设置：作业标题
	 */
    public String getKechengzuoyeName() {
        return kechengzuoyeName;
    }


    /**
	 * 获取：作业标题
	 */

    public void setKechengzuoyeName(String kechengzuoyeName) {
        this.kechengzuoyeName = kechengzuoyeName;
    }
    /**
	 * 设置：作业类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：作业类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：发布教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getKechengzuoyeFile() {
        return kechengzuoyeFile;
    }


    /**
	 * 获取：文件
	 */

    public void setKechengzuoyeFile(String kechengzuoyeFile) {
        this.kechengzuoyeFile = kechengzuoyeFile;
    }
    /**
	 * 设置：详情
	 */
    public String getKechengzuoyeContent() {
        return kechengzuoyeContent;
    }


    /**
	 * 获取：详情
	 */

    public void setKechengzuoyeContent(String kechengzuoyeContent) {
        this.kechengzuoyeContent = kechengzuoyeContent;
    }
    /**
	 * 设置：交付时间
	 */
    public Date getKechengzuoyeTime() {
        return kechengzuoyeTime;
    }


    /**
	 * 获取：交付时间
	 */

    public void setKechengzuoyeTime(Date kechengzuoyeTime) {
        this.kechengzuoyeTime = kechengzuoyeTime;
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
        return "Kechengzuoye{" +
            "id=" + id +
            ", kechengzuoyeName=" + kechengzuoyeName +
            ", kechengTypes=" + kechengTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", banjiTypes=" + banjiTypes +
            ", kechengzuoyeFile=" + kechengzuoyeFile +
            ", kechengzuoyeContent=" + kechengzuoyeContent +
            ", kechengzuoyeTime=" + kechengzuoyeTime +
            ", createTime=" + createTime +
        "}";
    }
}
