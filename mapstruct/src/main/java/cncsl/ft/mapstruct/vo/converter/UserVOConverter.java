package cncsl.ft.mapstruct.vo.converter;

import cncsl.ft.mapstruct.base.Converter;
import cncsl.ft.mapstruct.entity.UserPO;
import cncsl.ft.mapstruct.entity.constant.Gender;
import cncsl.ft.mapstruct.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Objects;


@Mapper(imports = {Objects.class, Gender.class})
public interface UserVOConverter extends Converter<UserPO, UserVO> {

    @Override
    @Mapping(target = "displayName", source = "displayName", defaultValue = "昵称未指定")
    @Mapping(target = "gender", expression = "java(entity.getGender() == null ? null : entity.getGender().getCode())")
    UserVO convert(UserPO entity);

}
