package cncsl.ft.mybatis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 国家
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable {

    /**
     * 主要国家代码
     */
    private String primaryCode;

    /**
     * 国家名
     */
    private String countryName;

    /**
     * 首都ID
     */
    private Integer capital;

    /**
     * 次要国家代码
     */
    private String secondaryCode;

    private static final long serialVersionUID = 1L;

}