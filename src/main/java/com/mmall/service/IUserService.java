package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.omg.CORBA.Object;

/**
 * Created by dell on 2020/4/19.
 */
public interface IUserService {
     ServerResponse<User> login(String usrname, String password);

}
