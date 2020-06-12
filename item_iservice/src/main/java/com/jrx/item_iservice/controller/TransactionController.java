package com.jrx.item_iservice.controller;

import com.jrx.item_iservice.model.Transaction_detail;
import com.jrx.item_iservice.service.impl.TransationServiceImpl;
import com.jrx.item_iservice.util.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:30
 * Description
 */
@CrossOrigin
@RestController
@Api(value = "交易明细", description = "交易明细表的curd")
public class TransactionController {

    @Autowired
    private TransationServiceImpl transationService;

    @GetMapping(value = "transaction")
    @ApiOperation(value = "获取交易明细", notes = "获取交易明细信息")
    public HttpResult getTransaction() {
    //    读取资源
        List<Transaction_detail> transaction_details = transationService.listTranscation();
        HttpResult httpResult = HttpResult.success(transaction_details);
        httpResult.setMessage("获取交易明细信息");
        return httpResult;
    }

    @ApiOperation(value = "添加交易明细", notes = "添加交易明细信息")
    @PostMapping(value = "transaction")
    public HttpResult postTransaction(Transaction_detail transaction_detail) {
    //   创建资源
        Integer res = transationService.insert(transaction_detail);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("获取交易明细信息");
        return httpResult;
    }

    @ApiOperation(value = "修改交易明细", notes = "修改交易明细信息")
    @PutMapping(value = "transaction")
    public HttpResult putTransaction(Transaction_detail transaction_detail) {
    //   修改资源
        Integer res = transationService.updateByPrimaryKey(transaction_detail);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("获取交易明细信息");
        return httpResult;
    }

    @ApiOperation(value = "删除交易明细", notes = "删除交易明细信息")
    @DeleteMapping(value = "transaction")
    public HttpResult deleteTransaction(Integer transId) {
    //    删除资源
        Integer res = transationService.deleteByPrimaryKey(transId);
        HttpResult httpResult = HttpResult.success(res);
        httpResult.setMessage("获取交易明细信息");
        return httpResult;
    }
}
