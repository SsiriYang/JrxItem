package com.jrx.item_iservice.service;

import com.jrx.item_iservice.model.Customer_info;

import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:40
 * Description
 */
public interface ICustomerService {

    List<Customer_info> getlistCustomer();

    int insertCustomer(Customer_info record);

    int deleteByPrimaryKey(Integer custId);

    Customer_info selectByPrimaryKey(Integer custId);

    int updateByPrimaryKey(Customer_info record);
}
