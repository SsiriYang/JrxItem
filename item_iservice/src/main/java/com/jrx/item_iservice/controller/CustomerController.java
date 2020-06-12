package com.jrx.item_iservice.controller;

import com.jrx.item_iservice.model.Customer_info;
import com.jrx.item_iservice.service.impl.CustomerServiceImpl;
import com.jrx.item_iservice.util.HttpResult;
import com.jrx.item_iservice.util.LogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:29
 * Description
 */
@CrossOrigin
@RestController
@Api(value = "客户信息", description = "客户信息表的curd")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;
    Logger exceptionlog = LogUtils.getExceptionLogger();
    Logger bussinessog = LogUtils.getBussinessLogger();
    Logger dBLog = LogUtils.getDBLogger();



    @GetMapping(value = "customner")
    @ApiOperation(value = "获取客户", notes = "获取所有客户信息")
    public HttpResult getAllCustomner() {
    //    读取资源
        List<Customer_info> customerInfos = customerService.getlistCustomer();
        HttpResult httpResult = HttpResult.success(customerInfos);
        httpResult.setMessage("获取所有客户信息");
        exceptionlog.error("getExceptionLogger===错误测试");
        bussinessog.info("getBussinessLogger===业务日志");
        dBLog.debug("getDBLogger===debug日志");
        return httpResult;
    }

    @PostMapping(value = "customner")
    @ApiOperation(value = "添加客户", notes = "添加一个客户")
    public HttpResult postCustomner(Customer_info customerInfo) {
    //   创建资源
        int res = customerService.insertCustomer(customerInfo);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("添加一个客户");
        return httpResult;
    }

    @ApiOperation(value = "修改客户", notes = "修改客户信息")
    @PutMapping(value = "customner")
    public HttpResult putCustomner(Customer_info customerInfo) {
    //   修改资源
        int res = customerService.updateByPrimaryKey(customerInfo);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("修改客户");
        return httpResult;
    }

    @ApiOperation(value = "删除客户", notes = "删除客户信息")
    @DeleteMapping(value = "customner")
    public HttpResult deleteCustomner(Integer traid) {
    //    删除资源
        Integer res = customerService.deleteByPrimaryKey(traid);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("删除客户");
        return httpResult;
    }

}
