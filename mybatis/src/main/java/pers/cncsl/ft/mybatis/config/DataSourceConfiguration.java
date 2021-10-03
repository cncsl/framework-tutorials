package pers.cncsl.ft.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"pers.cncsl.ft.mybatis.mapper"})
public class DataSourceConfiguration {

}
