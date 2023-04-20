package com.xzx.quickstart.service.impl;

import com.xzx.quickstart.pojo.Good;
import com.xzx.quickstart.mapper.GoodMapper;
import com.xzx.quickstart.service.IGoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@Service
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements IGoodService {

}
