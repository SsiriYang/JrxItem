package com.jrx.item_iservice.service.impl;

import com.jrx.item_iservice.mapper.Day_summarystatisticMapper;
import com.jrx.item_iservice.model.Day_summarystatistic;
import com.jrx.item_iservice.service.IDaySummaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:45
 * Description
 */
@Service
public class DaySummaryServiceImpl implements IDaySummaryService {
    @Resource
    private Day_summarystatisticMapper day_summarystatisticMapper;


    @Override
    public ArrayList<Day_summarystatistic> listCustomer() {
        return day_summarystatisticMapper.listCustomer();
    }

    @Override
    public int deleteByPrimaryKey(String sIndex) {
        return day_summarystatisticMapper.deleteByPrimaryKey(sIndex);
    }

    @Override
    public int insert(Day_summarystatistic record) {
        return day_summarystatisticMapper.insert(record);
    }

    @Override
    public Day_summarystatistic selectByPrimaryKey(String sIndex) {
        return day_summarystatisticMapper.selectByPrimaryKey(sIndex);
    }

    @Override
    public int updateByPrimaryKey(Day_summarystatistic record) {
        return day_summarystatisticMapper.updateByPrimaryKey(record);
    }
    @Override
    public ArrayList<Day_summarystatistic> getConsumption(){
        return day_summarystatisticMapper.getConsumption();
    }
    @Override
    public ArrayList<Day_summarystatistic> getProportion(){
        return day_summarystatisticMapper.getProportion();
    }

}
