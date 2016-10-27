package com.spring.simple.dao.objects;

import java.io.Serializable;
import java.util.Date;

public class user implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.org_no
     *
     * @mbggenerated
     */
    private String orgNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.data_type_id
     *
     * @mbggenerated
     */
    private String dataTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.file_url
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.file_type
     *
     * @mbggenerated
     */
    private String fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.file_description
     *
     * @mbggenerated
     */
    private String fileDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.file_encode
     *
     * @mbggenerated
     */
    private String fileEncode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.retry_count
     *
     * @mbggenerated
     */
    private Integer retryCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column datacenter_file_feedback_task.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table datacenter_file_feedback_task
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.id
     *
     * @return the value of datacenter_file_feedback_task.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.id
     *
     * @param id the value for datacenter_file_feedback_task.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.biz_no
     *
     * @return the value of datacenter_file_feedback_task.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.biz_no
     *
     * @param bizNo the value for datacenter_file_feedback_task.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.org_no
     *
     * @return the value of datacenter_file_feedback_task.org_no
     *
     * @mbggenerated
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.org_no
     *
     * @param orgNo the value for datacenter_file_feedback_task.org_no
     *
     * @mbggenerated
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.data_type_id
     *
     * @return the value of datacenter_file_feedback_task.data_type_id
     *
     * @mbggenerated
     */
    public String getDataTypeId() {
        return dataTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.data_type_id
     *
     * @param dataTypeId the value for datacenter_file_feedback_task.data_type_id
     *
     * @mbggenerated
     */
    public void setDataTypeId(String dataTypeId) {
        this.dataTypeId = dataTypeId == null ? null : dataTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.file_url
     *
     * @return the value of datacenter_file_feedback_task.file_url
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.file_url
     *
     * @param fileUrl the value for datacenter_file_feedback_task.file_url
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.file_type
     *
     * @return the value of datacenter_file_feedback_task.file_type
     *
     * @mbggenerated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.file_type
     *
     * @param fileType the value for datacenter_file_feedback_task.file_type
     *
     * @mbggenerated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.file_description
     *
     * @return the value of datacenter_file_feedback_task.file_description
     *
     * @mbggenerated
     */
    public String getFileDescription() {
        return fileDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.file_description
     *
     * @param fileDescription the value for datacenter_file_feedback_task.file_description
     *
     * @mbggenerated
     */
    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription == null ? null : fileDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.file_encode
     *
     * @return the value of datacenter_file_feedback_task.file_encode
     *
     * @mbggenerated
     */
    public String getFileEncode() {
        return fileEncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.file_encode
     *
     * @param fileEncode the value for datacenter_file_feedback_task.file_encode
     *
     * @mbggenerated
     */
    public void setFileEncode(String fileEncode) {
        this.fileEncode = fileEncode == null ? null : fileEncode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.status
     *
     * @return the value of datacenter_file_feedback_task.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.status
     *
     * @param status the value for datacenter_file_feedback_task.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.retry_count
     *
     * @return the value of datacenter_file_feedback_task.retry_count
     *
     * @mbggenerated
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.retry_count
     *
     * @param retryCount the value for datacenter_file_feedback_task.retry_count
     *
     * @mbggenerated
     */
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.gmt_modified
     *
     * @return the value of datacenter_file_feedback_task.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.gmt_modified
     *
     * @param gmtModified the value for datacenter_file_feedback_task.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column datacenter_file_feedback_task.gmt_create
     *
     * @return the value of datacenter_file_feedback_task.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column datacenter_file_feedback_task.gmt_create
     *
     * @param gmtCreate the value for datacenter_file_feedback_task.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_file_feedback_task
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
        user other = (user) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getOrgNo() == null ? other.getOrgNo() == null : this.getOrgNo().equals(other.getOrgNo()))
            && (this.getDataTypeId() == null ? other.getDataTypeId() == null : this.getDataTypeId().equals(other.getDataTypeId()))
            && (this.getFileUrl() == null ? other.getFileUrl() == null : this.getFileUrl().equals(other.getFileUrl()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getFileDescription() == null ? other.getFileDescription() == null : this.getFileDescription().equals(other.getFileDescription()))
            && (this.getFileEncode() == null ? other.getFileEncode() == null : this.getFileEncode().equals(other.getFileEncode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRetryCount() == null ? other.getRetryCount() == null : this.getRetryCount().equals(other.getRetryCount()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_file_feedback_task
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getOrgNo() == null) ? 0 : getOrgNo().hashCode());
        result = prime * result + ((getDataTypeId() == null) ? 0 : getDataTypeId().hashCode());
        result = prime * result + ((getFileUrl() == null) ? 0 : getFileUrl().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getFileDescription() == null) ? 0 : getFileDescription().hashCode());
        result = prime * result + ((getFileEncode() == null) ? 0 : getFileEncode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_file_feedback_task
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
        sb.append(", orgNo=").append(orgNo);
        sb.append(", dataTypeId=").append(dataTypeId);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", fileType=").append(fileType);
        sb.append(", fileDescription=").append(fileDescription);
        sb.append(", fileEncode=").append(fileEncode);
        sb.append(", status=").append(status);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}