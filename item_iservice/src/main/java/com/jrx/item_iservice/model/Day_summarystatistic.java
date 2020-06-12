package com.jrx.item_iservice.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * day_summarystatistic
 */
@ApiModel
public class Day_summarystatistic {
    /**
     * 索引项
     */
    @ApiModelProperty(value = "索引项")
    private String sIndex;

    /**
     * 客户号
     */
    @ApiModelProperty(value = "客户号")
    private Integer custId;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 日期
     */
    @ApiModelProperty(value = "日期")
    private Date transDate;

    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    private String surname;

    /**
     * 最大单笔交易金额
     */
    @ApiModelProperty(value = "最大单笔交易金额")
    private BigDecimal tranMaxAmt;

    /**
     * 当天还款总金额
     */
    @ApiModelProperty(value = "当天还款总金额")
    private BigDecimal payAmt;

    /**
     * 当天消费笔数
     */
    @ApiModelProperty(value = "当天消费笔数")
    private Integer tranCnt;

    /**
     * 当天还款笔数
     */
    @ApiModelProperty(value = "当天还款笔数")
    private Integer payCnt;

    /**
     * 当天交易总金额
     */
    @ApiModelProperty(value = "当天交易总金额")
    private BigDecimal tranAmt;

    /**
     * 索引项
     * @return s_index 索引项
     */
    public String getsIndex() {
        return sIndex;
    }

    /**
     * 索引项
     * @param sIndex 索引项
     */
    public void setsIndex(String sIndex) {
        this.sIndex = sIndex;
    }

    /**
     * 客户号
     * @return cust_id 客户号
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 客户号
     * @param custId 客户号
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 日期
     * @return trans_date 日期
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * 日期
     * @param transDate 日期
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * 客户姓名
     * @return surname 客户姓名
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 客户姓名
     * @param surname 客户姓名
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * 最大单笔交易金额
     * @return tran_max_amt 最大单笔交易金额
     */
    public BigDecimal getTranMaxAmt() {
        return tranMaxAmt;
    }

    /**
     * 最大单笔交易金额
     * @param tranMaxAmt 最大单笔交易金额
     */
    public void setTranMaxAmt(BigDecimal tranMaxAmt) {
        this.tranMaxAmt = tranMaxAmt;
    }

    /**
     * 当天还款总金额
     * @return pay_amt 当天还款总金额
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * 当天还款总金额
     * @param payAmt 当天还款总金额
     */
    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    /**
     * 当天消费笔数
     * @return tran_cnt 当天消费笔数
     */
    public Integer getTranCnt() {
        return tranCnt;
    }

    /**
     * 当天消费笔数
     * @param tranCnt 当天消费笔数
     */
    public void setTranCnt(Integer tranCnt) {
        this.tranCnt = tranCnt;
    }

    /**
     * 当天还款笔数
     * @return pay_cnt 当天还款笔数
     */
    public Integer getPayCnt() {
        return payCnt;
    }

    /**
     * 当天还款笔数
     * @param payCnt 当天还款笔数
     */
    public void setPayCnt(Integer payCnt) {
        this.payCnt = payCnt;
    }

    /**
     * 当天交易总金额
     * @return tran_amt 当天交易总金额
     */
    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    /**
     * 当天交易总金额
     * @param tranAmt 当天交易总金额
     */
    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }
}