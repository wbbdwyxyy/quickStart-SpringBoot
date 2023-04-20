package com.xzx.quickstart.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzx.quickstart.dto.LoginDto;
import com.xzx.quickstart.dto.PageParmDto;
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


    boolean login(LoginDto dto);

    Page<User> selectList(PageParmDto dto);
}
