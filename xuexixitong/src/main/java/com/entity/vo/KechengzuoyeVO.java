package com.entity.vo;

import com.entity.KechengzuoyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程作业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kechengzuoye")
public class KechengzuoyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
