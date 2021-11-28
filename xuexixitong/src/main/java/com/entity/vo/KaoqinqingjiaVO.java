package com.entity.vo;

import com.entity.KaoqinqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考勤请假
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoqinqingjia")
public class KaoqinqingjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 编号
     */

    @TableField(value = "kechnegkaoqin_uuid_number")
    private String kechnegkaoqinUuidNumber;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 理由
     */

    @TableField(value = "kaoqinqingjia_text")
    private String kaoqinqingjiaText;


    /**
     * 审批结果
     */

    @TableField(value = "kaoqinqingjia_types")
    private Integer kaoqinqingjiaTypes;


    /**
     * 课程考勤请假
     */

    @TableField(value = "kechnegkaoqin_id")
    private Integer kechnegkaoqinId;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：编号
	 */
    public String getKechnegkaoqinUuidNumber() {
        return kechnegkaoqinUuidNumber;
    }


    /**
	 * 获取：编号
	 */

    public void setKechnegkaoqinUuidNumber(String kechnegkaoqinUuidNumber) {
        this.kechnegkaoqinUuidNumber = kechnegkaoqinUuidNumber;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：理由
	 */
    public String getKaoqinqingjiaText() {
        return kaoqinqingjiaText;
    }


    /**
	 * 获取：理由
	 */

    public void setKaoqinqingjiaText(String kaoqinqingjiaText) {
        this.kaoqinqingjiaText = kaoqinqingjiaText;
    }
    /**
	 * 设置：审批结果
	 */
    public Integer getKaoqinqingjiaTypes() {
        return kaoqinqingjiaTypes;
    }


    /**
	 * 获取：审批结果
	 */

    public void setKaoqinqingjiaTypes(Integer kaoqinqingjiaTypes) {
        this.kaoqinqingjiaTypes = kaoqinqingjiaTypes;
    }
    /**
	 * 设置：课程考勤请假
	 */
    public Integer getKechnegkaoqinId() {
        return kechnegkaoqinId;
    }


    /**
	 * 获取：课程考勤请假
	 */

    public void setKechnegkaoqinId(Integer kechnegkaoqinId) {
        this.kechnegkaoqinId = kechnegkaoqinId;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
