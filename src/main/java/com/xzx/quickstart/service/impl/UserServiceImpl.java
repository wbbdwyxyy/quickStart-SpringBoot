package com.xzx.quickstart.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xzx.quickstart.pojo.User;
import com.xzx.quickstart.mapper.UserMapper;
import com.xzx.quickstart.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean mySave(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getUsername, username);

        User one = this.getOne(userLambdaQueryWrapper);
        if (ObjectUtil.isNull(one)) {

        }
        return false;
    }
}
