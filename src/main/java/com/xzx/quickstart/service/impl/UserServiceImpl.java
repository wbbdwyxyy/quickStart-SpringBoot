package com.xzx.quickstart.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzx.quickstart.dto.LoginDto;
import com.xzx.quickstart.dto.PageParmDto;
import com.xzx.quickstart.pojo.User;
import com.xzx.quickstart.mapper.UserMapper;
import com.xzx.quickstart.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
@SuppressWarnings("all")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(LoginDto dto) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, dto.getUsername())
                .eq(User::getPassword, dto.getPassword());

        User one = this.getOne(wrapper);
        return !ObjectUtil.isNull(one);
    }

    @Override
    public Page<User> selectList(PageParmDto dto) {
        Page<User> page = new Page<>(dto.getPageNum(), dto.getPageSize());
        Page<User> userPage = userMapper.selectPage(page, null);
        return userPage;
    }
}
