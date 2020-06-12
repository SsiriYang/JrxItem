package com.jrx.item_iservice.controller;

import com.jrx.item_iservice.model.Day_summarystatistic;
import com.jrx.item_iservice.service.impl.DaySummaryServiceImpl;
import com.jrx.item_iservice.util.LogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:29
 * Description
 */
@CrossOrigin
@RestController
@Api(value = "日汇总统计", description = "日汇总统计表的curd")
public class DaySummaryController {
    @Autowired
    private DaySummaryServiceImpl daySummaryService;
    Logger log = LogUtils.getBussinessLogger();
    @GetMapping(value = "summary")
    @ApiOperation(value = "获取日汇总统计", notes = "获取日汇总统计信息")
    public List<com.jrx.item_iservice.dto.Day_summarystatistic> getSummary() {
    //    读取资源
        List<Day_summarystatistic> day_summarystatistics = daySummaryService.listCustomer();
        List<com.jrx.item_iservice.dto.Day_summarystatistic> day_summarystatistics1 = new ArrayList<>();
        for (Day_summarystatistic item:day_summarystatistics) {
            Date date  = item.getTransDate();
            com.jrx.item_iservice.dto.Day_summarystatistic day_summarystatistic1= new  com.jrx.item_iservice.dto.Day_summarystatistic();
            DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datetime = dFormat.format(date);
            day_summarystatistic1.setTransDate(datetime);
            day_summarystatistic1.setTranAmt(item.getTranAmt());

            day_summarystatistics1.add(day_summarystatistic1);
        }
        return day_summarystatistics1;
    }



    @ApiOperation(value = "添加日汇总统计", notes = "添加日汇总统计信息")
    @PostMapping(value = "summary")
    public Integer postSummary(Day_summarystatistic record) {
    //   创建资源
        return daySummaryService.insert(record);
    }

    @ApiOperation(value = "修改日汇总统计", notes = "修改日汇总统计信息")
    @PutMapping(value = "summary")
    public Integer putSummary(Day_summarystatistic record) {
    //   修改资源
        return daySummaryService.updateByPrimaryKey(record);
    }

    @ApiOperation(value = "删除日汇总统计", notes = "删除日汇总统计信息")
    @DeleteMapping(value = "summary")
    public Integer deleteSummary(String index) {
    //    删除资源
        return daySummaryService.deleteByPrimaryKey(index);
    }
    @GetMapping(value = "consumption")
    public List<Day_summarystatistic> getConsumption(){
        List<Day_summarystatistic> day_summarystatistics = daySummaryService.getConsumption();
        return day_summarystatistics;
    }
    @GetMapping(value = "Proportion")
    public List<Day_summarystatistic> getProportion(){
        List<Day_summarystatistic> day_summarystatistics = daySummaryService.getProportion();
        return day_summarystatistics;
    }
}
