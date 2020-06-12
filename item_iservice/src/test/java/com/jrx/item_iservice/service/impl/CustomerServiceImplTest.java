package com.jrx.item_iservice.service.impl;

import com.jrx.item_iservice.ItemIserviceApplication;
import com.jrx.item_iservice.model.Customer_info;
import com.jrx.item_iservice.util.LogUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/12 1:09
 * Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ItemIserviceApplication.class)
public class CustomerServiceImplTest {
    @Autowired
    private CustomerServiceImpl customerService;
    @Test
    public void getlistCustomer() {
        List<Customer_info> list =  customerService.getlistCustomer();
        Logger platformLogger = LogUtils.getPlatformLogger();
        System.out.print(list.toString());
    }

    @Test
    public void insertCustomer() {
        Customer_info customer_info = new Customer_info();
        customer_info.setAddress("陕西西安");
        customer_info.setBirthday(20200612);
        customer_info.setEducaDes("大学");
        customer_info.setGender("男");
        customer_info.setMarDes("未婚");
        customer_info.setSurname("李四");
        int res = customerService.insertCustomer(customer_info);
        System.out.print(res);
    }

    @Test
    public void deleteByPrimaryKey() {
        int res = customerService.deleteByPrimaryKey(10004);
        System.out.print(res);
    }

    @Test
    public void selectByPrimaryKey() {
        Customer_info customer_info = customerService.selectByPrimaryKey(1);
        System.out.print(customer_info.toString());
    }

    @Test
    public void updateByPrimaryKey() {
        Customer_info customer_info = new Customer_info();
        customer_info.setCustId(10005);
        customer_info.setAddress("陕西西安");
        customer_info.setBirthday(20200612);
        customer_info.setEducaDes("大学");
        customer_info.setGender("男");
        customer_info.setMarDes("未婚");
        customer_info.setSurname("李四s");
        int res = customerService.updateByPrimaryKey(customer_info);
        System.out.print(res);
    }
}