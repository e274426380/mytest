package com.yaorange.entity;

import javax.persistence.*;

@Table(name = "opener_number")
public class OpenerNumber {
    @Id
    @Column(name = "on_id")
    private Integer onId;

    @Column(name = "on_date")
    private Integer onDate;

    private Integer january;

    private Integer february;

    private Integer march;

    private Integer april;

    private Integer may;

    private Integer june;

    private Integer july;

    private Integer august;

    private Integer september;

    private Integer october;

    private Integer november;

    private Integer december;

    /**
     * @return on_id
     */
    public Integer getOnId() {
        return onId;
    }

    /**
     * @param onId
     */
    public void setOnId(Integer onId) {
        this.onId = onId;
    }

    /**
     * @return on_date
     */
    public Integer getOnDate() {
        return onDate;
    }

    /**
     * @param onDate
     */
    public void setOnDate(Integer onDate) {
        this.onDate = onDate;
    }

    /**
     * @return january
     */
    public Integer getJanuary() {
        return january;
    }

    /**
     * @param january
     */
    public void setJanuary(Integer january) {
        this.january = january;
    }

    /**
     * @return february
     */
    public Integer getFebruary() {
        return february;
    }

    /**
     * @param february
     */
    public void setFebruary(Integer february) {
        this.february = february;
    }

    /**
     * @return march
     */
    public Integer getMarch() {
        return march;
    }

    /**
     * @param march
     */
    public void setMarch(Integer march) {
        this.march = march;
    }

    /**
     * @return april
     */
    public Integer getApril() {
        return april;
    }

    /**
     * @param april
     */
    public void setApril(Integer april) {
        this.april = april;
    }

    /**
     * @return may
     */
    public Integer getMay() {
        return may;
    }

    /**
     * @param may
     */
    public void setMay(Integer may) {
        this.may = may;
    }

    /**
     * @return june
     */
    public Integer getJune() {
        return june;
    }

    /**
     * @param june
     */
    public void setJune(Integer june) {
        this.june = june;
    }

    /**
     * @return july
     */
    public Integer getJuly() {
        return july;
    }

    /**
     * @param july
     */
    public void setJuly(Integer july) {
        this.july = july;
    }

    /**
     * @return august
     */
    public Integer getAugust() {
        return august;
    }

    /**
     * @param august
     */
    public void setAugust(Integer august) {
        this.august = august;
    }

    /**
     * @return september
     */
    public Integer getSeptember() {
        return september;
    }

    /**
     * @param september
     */
    public void setSeptember(Integer september) {
        this.september = september;
    }

    /**
     * @return october
     */
    public Integer getOctober() {
        return october;
    }

    /**
     * @param october
     */
    public void setOctober(Integer october) {
        this.october = october;
    }

    /**
     * @return november
     */
    public Integer getNovember() {
        return november;
    }

    /**
     * @param november
     */
    public void setNovember(Integer november) {
        this.november = november;
    }

    /**
     * @return december
     */
    public Integer getDecember() {
        return december;
    }

    /**
     * @param december
     */
    public void setDecember(Integer december) {
        this.december = december;
    }
}