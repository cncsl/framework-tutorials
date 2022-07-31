package cncsl.ft.mapstruct.vo;

import lombok.Data;

/**
 * 用户信息VO
 */
@Data
public class UserVO {

    /**
     * UID
     */
    private String id;

    /**
     * 昵称
     */
    private String displayName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

}
