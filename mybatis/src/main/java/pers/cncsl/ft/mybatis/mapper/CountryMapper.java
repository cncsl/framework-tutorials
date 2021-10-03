package pers.cncsl.ft.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pers.cncsl.ft.mybatis.entity.Country;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 国家Mapper
 */
@Repository
public interface CountryMapper {

    /**
     * 根据主键查询一条记录
     *
     * @param primaryKey 主键
     * @return 查询结果
     */
    Country selectByPrimaryKey(String primaryKey);

    /**
     * 根据主键或国家名查询一条记录
     *
     * @param primaryKey 主键
     * @param countryName 国家名
     * @return 查询结果
     */
    Country selectByCodeOrName(@Param("primaryKey") String primaryKey, @Param("countryName") String countryName);

    /**
     * 根据入参的主键数组批量查询，使用数组是最基础的情况，使用场景不多。
     *
     * @param keys 主键数组
     * @return 查询结果
     */
    List<Country> selectByPrimaryArray(String[] keys);

    /**
     * 根据入参的主键List集合批量查询，使用 List 较为简单。
     *
     * @param keys 主键List集合
     * @return 查询结果
     */
    List<Country> selectByPrimaryCodeList(List<String> keys);

    /**
     * 根据入参的主键Set集合批量查询，使用 Set 可以保证集合元素唯一。
     *
     * @param keys 主键Set集合
     * @return 查询结果
     */
    List<Country> selectByPrimaryCodeSet(Set<String> keys);

    /**
     * 根据主键和入参的其他数据更新一条记录，入参为 null 的字段不变更
     *
     * @param entity 入参数据
     * @return 更新结果
     */
    int updateByPrimaryKeySelective(Country entity);

    /**
     * 根据主键和入参的其他数据更新一条记录，入参为 null 的字段不变更
     *
     * @param primaryKey 主键
     * @return 更新结果
     */
    int updateByPrimaryKeyWithMap(@Param("primaryKey") String primaryKey, @Param("params") Map<String, String> params);

}