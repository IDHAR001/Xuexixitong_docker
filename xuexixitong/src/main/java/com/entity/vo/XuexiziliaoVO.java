package com.entity.vo;

import com.entity.XuexiziliaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习资料
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuexiziliao")
public class XuexiziliaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
