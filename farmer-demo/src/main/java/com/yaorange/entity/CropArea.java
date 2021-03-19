package com.yaorange.entity;

import javax.persistence.*;

@Table(name = "crop_area")
public class CropArea {
    @Id
    @Column(name = "ca_id")
    private Integer caId;

    @Column(name = "ca_date")
    private Integer caDate;

    /**
     * 粮食作物
     */
    @Column(name = "grain_crops")
    private Float grainCrops;

    /**
     * 棉花
     */
    private Float cotton;

    /**
     * 麻类
     */
    private Float flax;

    /**
     * 糖类
     */
    private Float suger;

    /**
     * 烟叶
     */
    private Float tobacco;

    /**
     * 药材
     */
    private Float medicinal;

    /**
     * 油料
     */
    private Float oil;

    /**
     * 其他作物
     */
    private Float etc;

    /**
     * @return ca_id
     */
    public Integer getCaId() {
        return caId;
    }

    /**
     * @param caId
     */
    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    /**
     * @return ca_date
     */
    public Integer getCaDate() {
        return caDate;
    }

    /**
     * @param caDate
     */
    public void setCaDate(Integer caDate) {
        this.caDate = caDate;
    }

    /**
     * 获取粮食作物
     *
     * @return grain_crops - 粮食作物
     */
    public Float getGrainCrops() {
        return grainCrops;
    }

    /**
     * 设置粮食作物
     *
     * @param grainCrops 粮食作物
     */
    public void setGrainCrops(Float grainCrops) {
        this.grainCrops = grainCrops;
    }

    /**
     * 获取棉花
     *
     * @return cotton - 棉花
     */
    public Float getCotton() {
        return cotton;
    }

    /**
     * 设置棉花
     *
     * @param cotton 棉花
     */
    public void setCotton(Float cotton) {
        this.cotton = cotton;
    }

    /**
     * 获取麻类
     *
     * @return flax - 麻类
     */
    public Float getFlax() {
        return flax;
    }

    /**
     * 设置麻类
     *
     * @param flax 麻类
     */
    public void setFlax(Float flax) {
        this.flax = flax;
    }

    /**
     * 获取糖类
     *
     * @return suger - 糖类
     */
    public Float getSuger() {
        return suger;
    }

    /**
     * 设置糖类
     *
     * @param suger 糖类
     */
    public void setSuger(Float suger) {
        this.suger = suger;
    }

    /**
     * 获取烟叶
     *
     * @return tobacco - 烟叶
     */
    public Float getTobacco() {
        return tobacco;
    }

    /**
     * 设置烟叶
     *
     * @param tobacco 烟叶
     */
    public void setTobacco(Float tobacco) {
        this.tobacco = tobacco;
    }

    /**
     * 获取药材
     *
     * @return medicinal - 药材
     */
    public Float getMedicinal() {
        return medicinal;
    }

    /**
     * 设置药材
     *
     * @param medicinal 药材
     */
    public void setMedicinal(Float medicinal) {
        this.medicinal = medicinal;
    }

    /**
     * 获取油料
     *
     * @return oil - 油料
     */
    public Float getOil() {
        return oil;
    }

    /**
     * 设置油料
     *
     * @param oil 油料
     */
    public void setOil(Float oil) {
        this.oil = oil;
    }

    /**
     * 获取其他作物
     *
     * @return etc - 其他作物
     */
    public Float getEtc() {
        return etc;
    }

    /**
     * 设置其他作物
     *
     * @param etc 其他作物
     */
    public void setEtc(Float etc) {
        this.etc = etc;
    }
}
