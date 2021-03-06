package com.spring.simple.dao;

import com.spring.simple.dao.objects.MerchantPushLog;

public interface MerchantPushLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int insert(MerchantPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int insertSelective(MerchantPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    MerchantPushLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchantPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(MerchantPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table datacenter_merchant_push_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchantPushLog record);
}