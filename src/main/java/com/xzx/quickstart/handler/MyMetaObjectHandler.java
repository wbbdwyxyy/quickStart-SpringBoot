package com.xzx.quickstart.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * 对实体类插入，更新的指定字段的赋值
 *
 * @author xzx
 * @date 2022/10/30
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入前置拦截
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        String username = "admin";
        /*try {
            username = SecurityUtil.getUsername();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        this.strictInsertFill(metaObject, "createdAt", LocalDate.class, LocalDate.now());
        this.strictInsertFill(metaObject, "updatedAt", LocalDate.class, LocalDate.now());
        this.strictInsertFill(metaObject, "createdBy", String.class, username);
        this.strictInsertFill(metaObject, "updatedBy", String.class, username);
    }

    /**
     * MetaObjectHandler提供的默认方法的策略均为: 如果属性有值则不覆盖, 如果填充值为null则不填充。也就是说，MP的自动填充功能的前提是填充字段要求为null。
     */

    /**
     * 更新前置拦截
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
//        String username = SecurityUtil.getUsername();
        String username = "admin";
        this.strictUpdateFill(metaObject, "updatedAt", LocalDate.class, LocalDate.now());
        this.strictUpdateFill(metaObject, "updatedBy", String.class, username);
    }


}
