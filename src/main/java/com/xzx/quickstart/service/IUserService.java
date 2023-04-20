package com.xzx.quickstart.service;

import com.xzx.quickstart.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
public interface IUserService extends IService<User> {

    boolean mySave(User user);
}
