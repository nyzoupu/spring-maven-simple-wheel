package com.spring.simple.dao.objects;

import java.io.Serializable;
import java.util.Date;

public class BizFlowLogDO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.stage
     *
     * @mbggenerated
     */
    private String stage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.step
     *
     * @mbggenerated
     */
    private String step;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.err_code
     *
     * @mbggenerated
     */
    private String errCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.err_msg
     *
     * @mbggenerated
     */
    private String errMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dps_biz_flow_log.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.id
     *
     * @return the value of dps_biz_flow_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.id
     *
     * @param id the value for dps_biz_flow_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.biz_no
     *
     * @return the value of dps_biz_flow_log.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.biz_no
     *
     * @param bizNo the value for dps_biz_flow_log.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.stage
     *
     * @return the value of dps_biz_flow_log.stage
     *
     * @mbggenerated
     */
    public String getStage() {
        return stage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.stage
     *
     * @param stage the value for dps_biz_flow_log.stage
     *
     * @mbggenerated
     */
    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.step
     *
     * @return the value of dps_biz_flow_log.step
     *
     * @mbggenerated
     */
    public String getStep() {
        return step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.step
     *
     * @param step the value for dps_biz_flow_log.step
     *
     * @mbggenerated
     */
    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.status
     *
     * @return the value of dps_biz_flow_log.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.status
     *
     * @param status the value for dps_biz_flow_log.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.err_code
     *
     * @return the value of dps_biz_flow_log.err_code
     *
     * @mbggenerated
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.err_code
     *
     * @param errCode the value for dps_biz_flow_log.err_code
     *
     * @mbggenerated
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.err_msg
     *
     * @return the value of dps_biz_flow_log.err_msg
     *
     * @mbggenerated
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.err_msg
     *
     * @param errMsg the value for dps_biz_flow_log.err_msg
     *
     * @mbggenerated
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.description
     *
     * @return the value of dps_biz_flow_log.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.description
     *
     * @param description the value for dps_biz_flow_log.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.gmt_create
     *
     * @return the value of dps_biz_flow_log.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.gmt_create
     *
     * @param gmtCreate the value for dps_biz_flow_log.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dps_biz_flow_log.gmt_modified
     *
     * @return the value of dps_biz_flow_log.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dps_biz_flow_log.gmt_modified
     *
     * @param gmtModified the value for dps_biz_flow_log.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BizFlowLogDO other = (BizFlowLogDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getStep() == null ? other.getStep() == null : this.getStep().equals(other.getStep()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrMsg() == null ? other.getErrMsg() == null : this.getErrMsg().equals(other.getErrMsg()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getStep() == null) ? 0 : getStep().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrMsg() == null) ? 0 : getErrMsg().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", stage=").append(stage);
        sb.append(", step=").append(step);
        sb.append(", status=").append(status);
        sb.append(", errCode=").append(errCode);
        sb.append(", errMsg=").append(errMsg);
        sb.append(", description=").append(description);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}