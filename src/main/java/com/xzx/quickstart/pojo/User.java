package com.xzx.quickstart.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author xzx
 * @since 2023-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "created_by",fill = FieldFill.INSERT)
    private String createdBy;

    @TableField(value = "created_at",fill = FieldFill.INSERT)
    private LocalDate createdAt;

    @TableField(value = "updated_by",fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;

    @TableField(value = "updated_at",fill = FieldFill.INSERT_UPDATE)
    private LocalDate updatedAt;

    private String username;

    private String password;

    @TableField("avatar_url")
    private String avatarUrl;


}
