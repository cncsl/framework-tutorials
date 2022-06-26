package cncsl.ft.mapstruct.entity;

import cncsl.ft.mapstruct.entity.constant.Gender;
import lombok.Data;

import java.time.Instant;
import java.util.Set;

@Data
public class UserEntity {

    private Long id;

    private String username;

    private String password;

    private String displayName;

    private String email;

    private Gender gender;

    private Set<String> authorities;

    private Instant createTime;

    private Instant updateTime;

}
