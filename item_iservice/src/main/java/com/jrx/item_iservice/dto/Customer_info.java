package com.jrx.item_iservice.dto;

import io.swagger.annotations.ApiModel;

/**
 * customer_info
 */
@ApiModel
public class Customer_info {
    /**
     * 客户号
     */
    private Integer custId;

    /**
     * 客户姓名
     */
    private String surname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 教育状况
     */
    private String educaDes;

    /**
     * 婚姻状况
     */
    private String marDes;

    /**
     * 生日
     */
    private Integer birthday;

    /**
     * 住址
     */
    private String address;

    /**
     * 客户号
     * @return cust_id 客户号
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 客户号
     * @param custId 客户号
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 客户姓名
     * @return surname 客户姓名
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 客户姓名
     * @param surname 客户姓名
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * 性别
     * @return gender 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 教育状况
     * @return educa_des 教育状况
     */
    public String getEducaDes() {
        return educaDes;
    }

    /**
     * 教育状况
     * @param educaDes 教育状况
     */
    public void setEducaDes(String educaDes) {
        this.educaDes = educaDes;
    }

    /**
     * 婚姻状况
     * @return mar_des 婚姻状况
     */
    public String getMarDes() {
        return marDes;
    }

    /**
     * 婚姻状况
     * @param marDes 婚姻状况
     */
    public void setMarDes(String marDes) {
        this.marDes = marDes;
    }

    /**
     * 生日
     * @return birthday 生日
     */
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    /**
     * 住址
     * @return address 住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 住址
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address;
    }
}