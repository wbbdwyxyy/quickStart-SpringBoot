package com.xzx.quickstart.controller;


import com.xzx.quickstart.common.enums.HttpCodeEnum;
import com.xzx.quickstart.dto.ResponseResult;
import com.xzx.quickstart.pojo.User;
import com.xzx.quickstart.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import cn.hutool.core.util.BooleanUtil;

import java.util.List;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseResult addUser(@RequestBody User user) {
        //TODO: 数据校验，用户名格式长度or密码长度格式
        boolean save = userService.save(user);

        boolean isSave = userService.mySave(user);

        // 可以做其他逻辑如用户名是唯一索引
        if (BooleanUtil.isTrue(save)) {
            return ResponseResult.okResult(HttpCodeEnum.SUCCESS);
        }
        return ResponseResult.errorResult(HttpCodeEnum.DATA_EXIST);
    }

    @GetMapping
    public ResponseResult List() {
        List<User> list = userService.list();
        return ResponseResult.okResult(list);
    }

    @GetMapping("/{id}")
    public ResponseResult getOneById(@PathVariable Integer id) {
        User one = userService.getById(id);
        return ResponseResult.okResult(one);
    }

    @DeleteMapping("/{id}")
    public ResponseResult delById(@PathVariable Integer id) {
        boolean b = userService.removeById(id);
        if (BooleanUtil.isTrue(b)) {
            return ResponseResult.okResult(HttpCodeEnum.SUCCESS);
        }
        return ResponseResult.errorResult(HttpCodeEnum.DELETE_ERROR);
    }

    @PutMapping
    public ResponseResult update(@RequestBody User user) {
        boolean b = userService.updateById(user);
        if (BooleanUtil.isTrue(b)) {
            return ResponseResult.okResult(HttpCodeEnum.SUCCESS);
        }
        return ResponseResult.errorResult(HttpCodeEnum.UPDATE_ERROR);
    }
}
