package com.xzx.quickstart.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDate;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户详情
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;

    @TableField(value = "created_at", fill = FieldFill.INSERT)
    private LocalDate createdAt;

    @TableField(value = "updated_by", fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;

    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    private LocalDate updatedAt;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 其他描述
     */
    private String desc;


}
