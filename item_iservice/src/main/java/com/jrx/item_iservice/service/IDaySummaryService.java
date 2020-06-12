package com.jrx.item_iservice.service;

import com.jrx.item_iservice.model.Day_summarystatistic;

import java.util.ArrayList;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:40
 * Description
 */
public interface IDaySummaryService {
    ArrayList<Day_summarystatistic> listCustomer();

    int deleteByPrimaryKey(String sIndex);

    int insert(Day_summarystatistic record);

    Day_summarystatistic selectByPrimaryKey(String sIndex);

    int updateByPrimaryKey(Day_summarystatistic record);

    ArrayList<Day_summarystatistic> getConsumption();

    ArrayList<Day_summarystatistic> getProportion();

}
