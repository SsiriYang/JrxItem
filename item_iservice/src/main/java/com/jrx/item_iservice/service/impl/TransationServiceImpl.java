package com.jrx.item_iservice.service.impl;

import com.jrx.item_iservice.mapper.Transaction_detailMapper;
import com.jrx.item_iservice.model.Transaction_detail;
import com.jrx.item_iservice.service.ITransactionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:47
 * Description
 */
@Service
public class TransationServiceImpl implements ITransactionService {

    @Resource
    private Transaction_detailMapper transaction_detailMapper;


    @Override
    public ArrayList<Transaction_detail> listTranscation() {
        return transaction_detailMapper.listTranscation();
    }

    @Override
    public int deleteByPrimaryKey(Integer transId) {
        return transaction_detailMapper.deleteByPrimaryKey(transId);
    }

    @Override
    public int insert(Transaction_detail record) {
        return transaction_detailMapper.insert(record);
    }

    @Override
    public Transaction_detail selectByPrimaryKey(Integer transId) {
        return transaction_detailMapper.selectByPrimaryKey(transId);
    }

    @Override
    public int updateByPrimaryKey(Transaction_detail record) {
        return transaction_detailMapper.updateByPrimaryKey(record);
    }
}
