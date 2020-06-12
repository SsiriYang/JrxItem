package com.jrx.item_iservice.mapper;

import com.jrx.item_iservice.model.Day_summarystatistic;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface Day_summarystatisticMapper {

    @Select("select tran_amt tranAmt,trans_date transDate  from day_summarystatistic where date_sub(curdate(), interval 30 day) <= date(trans_date) ORDER BY transDate")
    ArrayList<Day_summarystatistic> listCustomer();

    @Select("select cust_id custId,SUM(tran_cnt+pay_cnt) tranCnt from day_summarystatistic GROUP BY cust_id")
    ArrayList<Day_summarystatistic>  getConsumption();

    @Select("select SUM(pay_amt) payAmt,SUM(tran_amt) tranAmt from day_summarystatistic where date_sub(curdate(), interval 30 day) <= date(trans_date)")
    ArrayList<Day_summarystatistic>  getProportion();


    @Delete("delete from day_summarystatistic where s_index = #{sIndex}")
    int deleteByPrimaryKey(String sIndex);

    @Insert("insert into day_summarystatistic (s_index, cust_id, update_time, trans_date, surname, tran_max_amt, pay_amt, tran_cnt, pay_cnt, tran_amt)\n" +
            " values (#{sIndex}, #{custId}, #{updateTime}, #{transDate}, #{surname}, #{tranMaxAmt},#{payAmt}, #{tranCnt}, #{payCnt}, #{tranAmt})")
    int insert(Day_summarystatistic record);

    @Select("select * from day_summarystatistic where s_index = #{sIndex}")
    Day_summarystatistic selectByPrimaryKey(String sIndex);

    @Update(" update day_summarystatistic set cust_id = #{custId},update_time = #{updateTime},trans_date = #{transDate},surname = #{surname},\n" +
            " tran_max_amt = #{tranMaxAmt}, pay_amt = #{payAmt,jdbcType=DECIMAL},tran_cnt = #{tranCnt},pay_cnt = #{payCnt},tran_amt = #{tranAmt}\n" +
            "  where s_index = #{sIndex}")
    int updateByPrimaryKey(Day_summarystatistic record);
}