package cncsl.ft.mapstruct.vo.converter;

import cncsl.ft.mapstruct.entity.UserEntity;
import cncsl.ft.mapstruct.vo.UserVO;
import cncsl.ft.mapstruct.base.Converter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collections;

@Mapper(imports = {Collections.class})
public interface UserConverter extends Converter<UserEntity, UserVO> {

    @Override
    @Mapping(target = "displayName", source = "displayName", defaultValue = "昵称未指定")
    @Mapping(target = "authorities", defaultExpression = "java(Collections.emptySet())")
    @Mapping(target = "createTime", source = "createTime", dateFormat = "yyyy-MM-dd hh:mm:ss")
    @Mapping(target = "updateTime", source = "updateTime", dateFormat = "yyyy-MM-dd hh:mm:ss")
    UserVO convert(UserEntity entity);


}
