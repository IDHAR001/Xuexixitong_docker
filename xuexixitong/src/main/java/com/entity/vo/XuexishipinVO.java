package com.entity.vo;

import com.entity.XuexishipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuexishipin")
public class XuexishipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
