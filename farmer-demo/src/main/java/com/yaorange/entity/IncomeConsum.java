package com.yaorange.entity;

import javax.persistence.*;

@Table(name = "income_consum")
public class IncomeConsum {
    @Id
    @Column(name = "ic_id")
    private Integer icId;

    /**
     * 年份
     */
    @Column(name = "ic_date")
    private Integer icDate;

    /**
     * 收入
     */
    @Column(name = "ic_income")
    private Integer icIncome;

    /**
     * 消费
     */
    @Column(name = "ic_pay")
    private Integer icPay;

    /**
     * 收入增长同比
     */
    @Column(name = "ic_income_rate")
    private Float icIncomeRate;

    /**
     * 支出增长同比
     */
    @Column(name = "ic_pay_rate")
    private Float icPayRate;

    /**
     * @return ic_id
     */
    public Integer getIcId() {
        return icId;
    }

    /**
     * @param icId
     */
    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    /**
     * 获取年份
     *
     * @return ic_date - 年份
     */
    public Integer getIcDate() {
        return icDate;
    }

    /**
     * 设置年份
     *
     * @param icDate 年份
     */
    public void setIcDate(Integer icDate) {
        this.icDate = icDate;
    }

    /**
     * 获取收入
     *
     * @return ic_income - 收入
     */
    public Integer getIcIncome() {
        return icIncome;
    }

    /**
     * 设置收入
     *
     * @param icIncome 收入
     */
    public void setIcIncome(Integer icIncome) {
        this.icIncome = icIncome;
    }

    /**
     * 获取消费
     *
     * @return ic_pay - 消费
     */
    public Integer getIcPay() {
        return icPay;
    }

    /**
     * 设置消费
     *
     * @param icPay 消费
     */
    public void setIcPay(Integer icPay) {
        this.icPay = icPay;
    }

    /**
     * 获取收入增长同比
     *
     * @return ic_income_date - 收入增长同比
     */
    public Float getIcIncomeRate() {
        return icIncomeRate;
    }

    /**
     * 设置收入增长同比
     *
     * @param icIncomeRate 收入增长同比
     */
    public void setIcIncomeRate(Float icIncomeRate) {
        this.icIncomeRate = icIncomeRate;
    }

    /**
     * 获取支出增长同比
     *
     * @return ic_pay_date - 支出增长同比
     */
    public Float getIcPayRate() {
        return icPayRate;
    }

    /**
     * 设置支出增长同比
     *
     * @param icPayRate 支出增长同比
     */
    public void setIcPayRate(Float icPayRate) {
        this.icPayRate = icPayRate;
    }
}
