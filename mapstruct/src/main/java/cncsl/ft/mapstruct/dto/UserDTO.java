package cncsl.ft.mapstruct.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

/**
 * 用户信息DTO
 */
@Data
public class UserDTO {

    /**
     * UID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

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
