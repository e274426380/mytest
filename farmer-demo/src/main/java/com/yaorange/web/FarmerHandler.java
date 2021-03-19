package com.yaorange.web;

import com.yaorange.entity.CropArea;
import com.yaorange.entity.IncomeConsum;
import com.yaorange.entity.TotalProduction;
import com.yaorange.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
@RestController
@RequestMapping("/farmer")
@CrossOrigin
public class FarmerHandler {
    @Autowired
    private CropAreaService cropAreaService;
    @Autowired
    private IncomeConsumService incomeConsumService;
    @Autowired
    private OpenerNumberService openerNumberService;
    @Autowired
    private OutputMainService outputMainService;
    @Autowired
    private TotalProductionService totalProductionService;

    @GetMapping("/incomeConsum")
    //前端需要数据行和标题行，所以直接使用Map封装返回（当然也可以自定义VO）
    public Map<String, Object> incomeConsumData() {
        List<IncomeConsum> all = incomeConsumService.getAll();
        //准备返回值对象
        Map<String, Object> returnMap = new HashMap<>();
        //准备数据行集合
        List<Object> datas = new ArrayList<>();
        List<Object> datas0 = new ArrayList<>();
        List<Object> datas1 = new ArrayList<>();
        List<Object> datas2 = new ArrayList<>();
        List<Object> datas3 = new ArrayList<>();
        //准备标题行集合
        List<String> titles = new ArrayList<>();
        //遍历组装返回前端需要的格式
        //dataMap(0):["ic_income",10000]
        //添加年份
        for (int i = 0; i < all.size(); i++) {
            IncomeConsum incomeConsum = all.get(i);
            titles.add(Integer.toString(incomeConsum.getIcDate()));
            datas0.add(incomeConsum.getIcIncome());
            datas1.add(incomeConsum.getIcPay());
            datas2.add(incomeConsum.getIcIncomeRate());
            datas3.add(incomeConsum.getIcPayRate());
        }
        datas.add(datas0);
        datas.add(datas1);
        datas.add(datas2);
        datas.add(datas3);
        //组装返回map对象
        returnMap.put("datas", datas);
        returnMap.put("titles", titles);
        return returnMap;
    }

    @GetMapping("/cropArea")
    //前端需要数据行和标题行，所以直接使用Map封装返回（当然也可以自定义VO）
    public Map<String, Object> cropAreaData() {
        List<CropArea> all = cropAreaService.getAll();
        List<Map<String, Object>> columnName = cropAreaService.getColumnName();
        //准备返回值对象
        Map<String, Object> returnMap = new HashMap<>();
        //准备数据行集合
        List<Object> datas = new ArrayList<>();
        //遍历组装返回前端需要的格式
        //dataMap(0):["ic_income",10000]
        //添加数据
        for (int i = 0; i < all.size(); i++) {
            CropArea cropArea = all.get(i);
            datas.add(cropArea.getGrainCrops());
            datas.add(cropArea.getCotton());
            datas.add(cropArea.getFlax());
            datas.add(cropArea.getSuger());
            datas.add(cropArea.getTobacco());
            datas.add(cropArea.getMedicinal());
            datas.add(cropArea.getOil());
            datas.add(cropArea.getEtc());
            //计算总面积
            float sum=cropArea.getGrainCrops()+cropArea.getCotton()
                    +cropArea.getFlax()+cropArea.getSuger()+ cropArea.getTobacco()
                    +cropArea.getMedicinal()+cropArea.getOil()+cropArea.getEtc();
            String headTitle = cropArea.getCaDate() + "年郫都区主要农作物播种面积 " +sum+" 千公顷";
            returnMap.put("headTitle",headTitle);
        }
        //添加名字
        int i=0;
        ArrayList<Object> objects = new ArrayList<>();
        for (Map<String, Object> nameMap : columnName) {
            //  { value: 1048, name: '粮食作物' }
            HashMap<String ,Object> dataReturn = new HashMap<>();
            Object name = nameMap.get("comment");
            dataReturn.put("value",datas.get(i));
            dataReturn.put("name",name);
            objects.add(dataReturn);
            i++;
        }
        //组装返回map对象
        returnMap.put("datas",objects);
        return returnMap;
    }
    @GetMapping("/totalProduction")
    //前端需要数据行和标题行，所以直接使用Map封装返回（当然也可以自定义VO）
    public Map<String, Object> totalProductionData() {
        List<TotalProduction> all = totalProductionService.getAll();
        //准备返回值对象
        Map<String, Object> returnMap = new HashMap<>();
        //准备数据行集合
        List<Object> datas = new ArrayList<>();
        List<Object> datas0 = new ArrayList<>();
        List<Object> datas1 = new ArrayList<>();
        List<Object> datas2 = new ArrayList<>();
        List<Object> datas3 = new ArrayList<>();
        List<Object> datas4 = new ArrayList<>();
        List<Object> datas5 = new ArrayList<>();
        List<Object> datasLine = new ArrayList<>();
        //准备标题行集合
        List<String> titles = new ArrayList<>();
        //遍历组装返回前端需要的格式
        //dataMap(0):["ic_income",10000]
        //添加年份
        Double lastYearProduction=100000.0;
        Double addRatio;
        for (int i = 0; i < all.size(); i++) {
            TotalProduction totalProduction= all.get(i);
            Double animalFishery = Double.valueOf(totalProduction.getAnimalFishery().toString());
            titles.add(Integer.toString(totalProduction.getTpDate()));
            datas0.add(animalFishery);
            datas1.add(totalProduction.getFarming());
            datas2.add(totalProduction.getForestry());
            datas3.add(totalProduction.getAnimalHusbandry());
            datas4.add(totalProduction.getFishery());
            if(i==0)
            {
                datasLine.add(1.0);
            }else {
                addRatio=animalFishery/lastYearProduction;
                double v = (Math.round((addRatio-1) * 10000) / 100.0);
                datasLine.add(v);
                lastYearProduction=animalFishery;
            }
        }
        datas.add(datas0);
        datas.add(datas1);
        datas.add(datas2);
        datas.add(datas3);
        datas.add(datas4);
        datas.add(datasLine);
        //组装返回map对象
        returnMap.put("datas", datas);
        returnMap.put("titles", titles);
        return returnMap;
    }

}
