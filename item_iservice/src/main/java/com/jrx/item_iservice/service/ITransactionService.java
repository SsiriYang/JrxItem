package com.jrx.item_iservice.service;

import com.jrx.item_iservice.model.Transaction_detail;

import java.util.ArrayList;

/**
 * @Author 41765
 * @Creater 2020/6/6 23:41
 * Description
 */
public interface ITransactionService {

    ArrayList<Transaction_detail> listTranscation();

    int deleteByPrimaryKey(Integer transId);

    int insert(Transaction_detail record);

    Transaction_detail selectByPrimaryKey(Integer transId);

    int updateByPrimaryKey(Transaction_detail record);
}
