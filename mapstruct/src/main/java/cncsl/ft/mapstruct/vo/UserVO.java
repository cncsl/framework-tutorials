package cncsl.ft.mapstruct.vo;

import lombok.Data;

import java.util.Set;

@Data
public class UserVO {

    private String id;

    private String username;

    private String displayName;

    private String email;

    private String gender;

    private Set<String> authorities;

    private String createTime;

    private String updateTime;

}
