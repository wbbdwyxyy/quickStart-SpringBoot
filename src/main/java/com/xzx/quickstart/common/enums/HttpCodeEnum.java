package com.xzx.quickstart.common.enums;

/**
 * 统一返回结果状态码和详情
 */
public enum HttpCodeEnum {

    // 成功段0
    SUCCESS(0, "操作成功"),
    // 登录段1~50
    NEED_LOGIN(1, "需要登录后操作"),
    LOGIN_PASSWORD_ERROR(2, "密码错误"),
    LOGIN_CODE_ERROR(3, "验证码错误"),
    LOGIN_UNEABLED(4, "用户被禁用，请联系管理员"),
    // TOKEN50~100
    TOKEN_INVALID(50, "无效的TOKEN"),
    TOKEN_EXPIRE(51, "TOKEN已过期"),
    TOKEN_REQUIRE(52, "TOKEN是必须的"),
    // SIGN验签 100~120
    SIGN_INVALID(100, "无效的SIGN"),
    SIG_TIMEOUT(101, "SIGN已过期"),
    // 参数错误 500~1000
    PARAM_REQUIRE(500, "缺少参数"),
    PARAM_INVALID(501, "无效参数"),
    PARAM_IMAGE_FORMAT_ERROR(502, "图片格式有误"),
    SERVER_ERROR(503, "服务器内部错误"),
    UPLOAD_ERROR(504, "文件上传失败"),
    ADD_ERROR(505, "添加失败"),
    UPDATE_ERROR(506, "更新失败"),
    DELETE_ERROR(505, "删除失败"),
    // 数据错误 1000~2000
    DATA_EXIST(1000, "数据已经存在"),
    AP_USERNAME_DATA_EXIST(1001, "用户名已存在"),
    DATA_NOT_EXIST(1002, "数据不存在"),
    // 数据错误 3000~3500
    NO_OPERATOR_AUTH(3000, "无权限操作");

    int code;
    String message;

    HttpCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
