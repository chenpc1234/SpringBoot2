package com.chen.admin.bean;

import lombok.Data;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/23/02/23  17:16
 */
@Data
//@TableName(value = "tab_user")
public class User {

    private  String userName;
    private  String userPassword;
   // @TableField(exist = false)
    private  String enable;

}
