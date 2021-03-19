package com.yaorange.entity;

import javax.persistence.*;

@Table(name = "output_main")
public class OutputMain {
    @Id
    @Column(name = "om_id")
    private Integer omId;

    @Column(name = "om_date")
    private Integer omDate;

    /**
     * 粮食
     */
    @Column(name = "om_grain_crops")
    private Integer omGrainCrops;

    /**
     * 棉花
     */
    @Column(name = "om_cotton")
    private Integer omCotton;

    /**
     * 油料
     */
    @Column(name = "om_oil")
    private Integer omOil;

    @Column(name = "om_suger")
    private Integer omSuger;

    /**
     * 肉类
     */
    @Column(name = "om_meat")
    private Integer omMeat;

    /**
     * 禽类
     */
    @Column(name = "om_poultry")
    private Integer omPoultry;

    /**
     * 奶类
     */
    @Column(name = "om_dairy")
    private Integer omDairy;

    /**
     * 水产品
     */
    @Column(name = "om_aqua")
    private Integer omAqua;

    @Column(name = "om_vegetable")
    private Integer omVegetable;

    @Column(name = "om_fruit")
    private Integer omFruit;

    /**
     * @return om_id
     */
    public Integer getOmId() {
        return omId;
    }

    /**
     * @param omId
     */
    public void setOmId(Integer omId) {
        this.omId = omId;
    }

    /**
     * @return om_date
     */
    public Integer getOmDate() {
        return omDate;
    }

    /**
     * @param omDate
     */
    public void setOmDate(Integer omDate) {
        this.omDate = omDate;
    }

    /**
     * 获取粮食
     *
     * @return om_grain_crops - 粮食
     */
    public Integer getOmGrainCrops() {
        return omGrainCrops;
    }

    /**
     * 设置粮食
     *
     * @param omGrainCrops 粮食
     */
    public void setOmGrainCrops(Integer omGrainCrops) {
        this.omGrainCrops = omGrainCrops;
    }

    /**
     * 获取棉花
     *
     * @return om_cotton - 棉花
     */
    public Integer getOmCotton() {
        return omCotton;
    }

    /**
     * 设置棉花
     *
     * @param omCotton 棉花
     */
    public void setOmCotton(Integer omCotton) {
        this.omCotton = omCotton;
    }

    /**
     * 获取油料
     *
     * @return om_oil - 油料
     */
    public Integer getOmOil() {
        return omOil;
    }

    /**
     * 设置油料
     *
     * @param omOil 油料
     */
    public void setOmOil(Integer omOil) {
        this.omOil = omOil;
    }

    /**
     * @return om_suger
     */
    public Integer getOmSuger() {
        return omSuger;
    }

    /**
     * @param omSuger
     */
    public void setOmSuger(Integer omSuger) {
        this.omSuger = omSuger;
    }

    /**
     * 获取肉类
     *
     * @return om_meat - 肉类
     */
    public Integer getOmMeat() {
        return omMeat;
    }

    /**
     * 设置肉类
     *
     * @param omMeat 肉类
     */
    public void setOmMeat(Integer omMeat) {
        this.omMeat = omMeat;
    }

    /**
     * 获取禽类
     *
     * @return om_poultry - 禽类
     */
    public Integer getOmPoultry() {
        return omPoultry;
    }

    /**
     * 设置禽类
     *
     * @param omPoultry 禽类
     */
    public void setOmPoultry(Integer omPoultry) {
        this.omPoultry = omPoultry;
    }

    /**
     * 获取奶类
     *
     * @return om_dairy - 奶类
     */
    public Integer getOmDairy() {
        return omDairy;
    }

    /**
     * 设置奶类
     *
     * @param omDairy 奶类
     */
    public void setOmDairy(Integer omDairy) {
        this.omDairy = omDairy;
    }

    /**
     * 获取水产品
     *
     * @return om_aqua - 水产品
     */
    public Integer getOmAqua() {
        return omAqua;
    }

    /**
     * 设置水产品
     *
     * @param omAqua 水产品
     */
    public void setOmAqua(Integer omAqua) {
        this.omAqua = omAqua;
    }

    /**
     * @return om_vegetable
     */
    public Integer getOmVegetable() {
        return omVegetable;
    }

    /**
     * @param omVegetable
     */
    public void setOmVegetable(Integer omVegetable) {
        this.omVegetable = omVegetable;
    }

    /**
     * @return om_fruit
     */
    public Integer getOmFruit() {
        return omFruit;
    }

    /**
     * @param omFruit
     */
    public void setOmFruit(Integer omFruit) {
        this.omFruit = omFruit;
    }
}