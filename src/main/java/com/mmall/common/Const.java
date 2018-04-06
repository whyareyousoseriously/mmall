package com.mmall.common;

/**
 * Created by power on 2018/4/5.
 */
public class Const {

    public static final String CURRENT_USER="currentUser";
    public static final String EMAIL= "email";
    public static final String USERNAME = "username";
    public interface Role{
        int ROLE_COSTOMER = 0 ;//普通用户
        int ROLE_ADMIN = 1 ; //管理员
    }
}
