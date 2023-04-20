package com.xzx.quickstart.service.impl;

import com.xzx.quickstart.pojo.UserInfo;
import com.xzx.quickstart.mapper.UserInfoMapper;
import com.xzx.quickstart.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户详情 服务实现类
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
