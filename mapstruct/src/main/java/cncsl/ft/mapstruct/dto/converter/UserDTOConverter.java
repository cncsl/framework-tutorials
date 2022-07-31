package cncsl.ft.mapstruct.dto.converter;

import cncsl.ft.mapstruct.base.Converter;
import cncsl.ft.mapstruct.dto.UserDTO;
import cncsl.ft.mapstruct.entity.UserPO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserDTOConverter extends Converter<UserPO, UserDTO> {

    @Override
    @Mapping(target = "displayName", source = "displayName", defaultValue = "昵称未指定")
    @Mapping(target = "gender", expression = "java(entity.getGender() == null ? null : entity.getGender().getCode())")
    UserDTO convert(UserPO entity);
}
