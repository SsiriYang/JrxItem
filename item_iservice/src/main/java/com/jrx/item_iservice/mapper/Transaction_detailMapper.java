package com.jrx.item_iservice.mapper;

import com.jrx.item_iservice.model.Transaction_detail;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface Transaction_detailMapper {
    @Select("select trans_id transId,cust_id custId,account,card_nbr cardNbr,tranno,month_nbr monthNbr,bill,trans_type transType,txn_datetime txnDatetime from transaction_detail")
    ArrayList<Transaction_detail> listTranscation();

    @Delete("delete from transaction_detail where trans_id = #{transId}")
    int deleteByPrimaryKey(Integer transId);

    @Insert(" insert into transaction_detail (trans_id, cust_id, account, card_nbr, tranno, month_nbr, bill, trans_type, txn_datetime)\n" +
            "  values (#{transId}, #{custId}, #{account}, \n" +
            "  #{cardNbr}, #{tranno}, #{monthNbr}, \n" +
            "  #{bill}, #{transType}, #{txnDatetime})")
    int insert(Transaction_detail record);

    @Select(" select * from transaction_detail  where trans_id = #{transId}")
    Transaction_detail selectByPrimaryKey(Integer transId);

    @Update("update transaction_detail set cust_id = #{custId},account = #{account},card_nbr = #{cardNbr},tranno = #{tranno},\n" +
            " month_nbr = #{monthNbr},bill = #{bill},trans_type = #{transType},txn_datetime = #{txnDatetime}" +
            " where trans_id = #{transId,jdbcType=INTEGER}")
    int updateByPrimaryKey(Transaction_detail record);
}