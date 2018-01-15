package com.zerodhatech.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sujith on 1/11/18.
 */
public class Profile {

    @SerializedName("user_type")
    public String userType;
    @SerializedName("email")
    public String email;
    @SerializedName("user_name")
    public String userName;
    @SerializedName("user_shortname")
    public String userShortname;
    @SerializedName("broker")
    public String broker;
    @SerializedName("exchanges")
    public String[] exchanges;
    @SerializedName("products")
    public String[] products;
    @SerializedName("order_types")
    public String[] orderTypes;

}