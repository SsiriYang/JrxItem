package com.jrx.item_iservice.service.impl;

import com.jrx.item_iservice.mapper.Customer_infoMapper;
import com.jrx.item_iservice.model.Customer_info;
import com.jrx.item_iservice.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:42
 * Description
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private Customer_infoMapper customer_infoMapper;

    @Override
    public List<Customer_info> getlistCustomer() {
        return customer_infoMapper.listCustomer();
    }
    @Override
    public int insertCustomer(Customer_info customerInfo){
        return customer_infoMapper.insert(customerInfo);
    }

    @Override
    public int deleteByPrimaryKey(Integer custId) {
        return customer_infoMapper.deleteByPrimaryKey(custId);
    }

    @Override
    public Customer_info selectByPrimaryKey(Integer custId) {
        return customer_infoMapper.selectByPrimaryKey(custId);
    }

    @Override
    public int updateByPrimaryKey(Customer_info record) {
        return customer_infoMapper.updateByPrimaryKey(record);
    }
}
