package com.spring.simple.dao;

import com.spring.simple.dao.objects.BizFlowLogDO;

public interface BizFlowLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    int insert(BizFlowLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    int insertSelective(BizFlowLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    BizFlowLogDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BizFlowLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dps_biz_flow_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BizFlowLogDO record);
}