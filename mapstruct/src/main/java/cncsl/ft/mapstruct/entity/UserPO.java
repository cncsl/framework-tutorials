package cncsl.ft.mapstruct.entity;

import cncsl.ft.mapstruct.entity.constant.Gender;
import lombok.Data;

import java.time.Instant;
import java.util.Set;

/**
 * 用户信息PO
 */
@Data
public class UserPO {

    /**
     * UID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

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
    private Gender gender;

    /**
     * 用户权限
     */
    private Set<String> authorities;

    /**
     * 创建时间
     */
    private Instant createTime;

    /**
     * 更新时间
     */
    private Instant updateTime;

}
