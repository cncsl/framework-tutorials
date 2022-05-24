package cncsl.ft.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"cncsl.ft.mybatis.mapper"})
public class DataSourceConfiguration {

}
