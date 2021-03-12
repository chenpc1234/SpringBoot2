package com.chenpc.admin.Dao;

import com.chenpc.admin.Bean.User;
import com.chenpc.admin.exception.UserInfoException;

import java.util.Locale;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/23/02/23  17:24
 */
public class UserUtils {
    private static final String Name = "CHEN";
    private static final String PASSWORD = "CHEN";

    public static boolean isExist(User user) {
        if (Name.equals(user.getUserName().toUpperCase(Locale.ROOT))
                && PASSWORD.equals(user.getUserPassword().toUpperCase(Locale.ROOT))) {
            return true;
        }
        throw new UserInfoException();
    }
}
