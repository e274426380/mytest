package com.yaorange.entity;

import javax.persistence.*;

@Table(name = "total_production")
public class TotalProduction {
    @Id
    @Column(name = "tp_id")
    private Integer tpId;

    @Column(name = "tp_date")
    private Integer tpDate;

    /**
     * 牧渔业
     */
    @Column(name = "animal_fishery")
    private Integer animalFishery;

    /**
     * 农业
     */
    private Integer farming;

    private Integer forestry;

    @Column(name = "animal_husbandry")
    private Integer animalHusbandry;

    /**
     * 渔业
     */
    private Integer fishery;

    /**
     * @return tp_id
     */
    public Integer getTpId() {
        return tpId;
    }

    /**
     * @param tpId
     */
    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    /**
     * @return tp_date
     */
    public Integer getTpDate() {
        return tpDate;
    }

    /**
     * @param tpDate
     */
    public void setTpDate(Integer tpDate) {
        this.tpDate = tpDate;
    }

    /**
     * 获取牧渔业
     *
     * @return animal_fishery - 牧渔业
     */
    public Integer getAnimalFishery() {
        return animalFishery;
    }

    /**
     * 设置牧渔业
     *
     * @param animalFishery 牧渔业
     */
    public void setAnimalFishery(Integer animalFishery) {
        this.animalFishery = animalFishery;
    }

    /**
     * 获取农业
     *
     * @return farming - 农业
     */
    public Integer getFarming() {
        return farming;
    }

    /**
     * 设置农业
     *
     * @param farming 农业
     */
    public void setFarming(Integer farming) {
        this.farming = farming;
    }

    /**
     * @return forestry
     */
    public Integer getForestry() {
        return forestry;
    }

    /**
     * @param forestry
     */
    public void setForestry(Integer forestry) {
        this.forestry = forestry;
    }

    /**
     * @return animal_husbandry
     */
    public Integer getAnimalHusbandry() {
        return animalHusbandry;
    }

    /**
     * @param animalHusbandry
     */
    public void setAnimalHusbandry(Integer animalHusbandry) {
        this.animalHusbandry = animalHusbandry;
    }

    /**
     * 获取渔业
     *
     * @return fishery - 渔业
     */
    public Integer getFishery() {
        return fishery;
    }

    /**
     * 设置渔业
     *
     * @param fishery 渔业
     */
    public void setFishery(Integer fishery) {
        this.fishery = fishery;
    }
}