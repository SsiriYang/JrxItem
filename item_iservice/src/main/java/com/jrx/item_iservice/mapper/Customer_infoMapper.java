package com.jrx.item_iservice.mapper;

import com.jrx.item_iservice.model.Customer_info;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface Customer_infoMapper {
    @Select("select cust_id custId, surname, gender, educa_des educaDes, mar_des marDes, birthday, address from customer_info")
    ArrayList<Customer_info> listCustomer();

    @Delete("delete from customer_info where cust_id = #{custId}")
    int deleteByPrimaryKey(Integer custId);

    @Insert(" insert into customer_info (cust_id, surname, gender, educa_des, mar_des, birthday, address)" +
            " values (#{custId}, #{surname},#{gender},#{educaDes}, #{marDes}, #{birthday}, #{address})")
    int insert(Customer_info record);

    @Select("select * from customer_info where cust_id = #{custId}")
    Customer_info selectByPrimaryKey(Integer custId);

    @Update("update customer_info set surname = #{surname}, gender = #{gender}, " +
            "educa_des = #{educaDes}, mar_des = #{marDes},birthday = #{birthday},\n" +
            "address = #{address} where cust_id = #{custId}")
    int updateByPrimaryKey(Customer_info record);
}