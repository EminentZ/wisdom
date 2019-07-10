package cn.hwsoft.wisdom.core.service;

import cn.hwsoft.wisdom.core.domain.User;
import cn.hwsoft.wisdom.core.mapper.UserMapper;
import cn.hwsoft.wisdom.core.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lenovo on 2019/7/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper; //相当于注入User的dao层

    @Override   //用户注册
    public void register(User user) {
        //密码用md5加密
        user.setPassword( MD5Utils.md5(user.getPassword()));
        userMapper.insert(user);
    }
}
