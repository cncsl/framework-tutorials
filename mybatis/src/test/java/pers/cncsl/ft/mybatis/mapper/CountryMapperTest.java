package pers.cncsl.ft.mybatis.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.cncsl.ft.mybatis.entity.Country;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CountryMapperTest {

    @Autowired
    private CountryMapper mapper;

    @Test
    void selectByPrimaryKey() {
        Country chn = mapper.selectByPrimaryKey("CHN");
        assertNotNull(chn);
        log.debug(chn.toString());
    }

    @Test
    void selectByPrimaryCodeOrName() {
        Country resultByCode = mapper.selectByCodeOrName("CHN", null);
        Country resultByName = mapper.selectByCodeOrName(null, "China");
        Country resultByCodeAndName = mapper.selectByCodeOrName("CHN", "China");

        log.debug("resultByCode: {}", resultByCode);
        log.debug("resultByName: {}", resultByName);
        log.debug("resultByCodeAndName: {}", resultByCodeAndName);

        assertNotNull(resultByCode);
        assertNotNull(resultByName);
        assertNotNull(resultByCodeAndName);
    }

    @Test
    void batchSelect() {
        String[] codeArray = {"CHN", "USA"};

        mapper.selectByPrimaryArray(codeArray);
        mapper.selectByPrimaryCodeList(Arrays.stream(codeArray).collect(Collectors.toList()));
        mapper.selectByPrimaryCodeSet(Arrays.stream(codeArray).collect(Collectors.toSet()));
    }

    @Test
    void updateByPrimaryKeySelective() {
        Country beforeUpdate = mapper.selectByPrimaryKey("CHN");
        log.debug("beforeUpdate: {}", beforeUpdate);
        assertNotNull(beforeUpdate);

        Country update = Country.builder().primaryCode("CHN").countryName("中国").build();
        int rows = mapper.updateByPrimaryKeySelective(update);
        assertEquals(1, rows);

        Country afterUpdate = mapper.selectByPrimaryKey("CHN");
        log.debug("afterUpdate: {}", afterUpdate);
        assertNotEquals(beforeUpdate, afterUpdate);
    }

    @Test
    void updateByPrimaryKeyWithMap() {
        Country beforeUpdate = mapper.selectByPrimaryKey("CHN");
        log.debug("beforeUpdate: {}", beforeUpdate);
        assertNotNull(beforeUpdate);

        Map<String, String> updateParam = new HashMap<>();
        updateParam.put("country_name", "中国");
        int rows = mapper.updateByPrimaryKeyWithMap("CHN", updateParam);
        assertEquals(1, rows);

        Country afterUpdate = mapper.selectByPrimaryKey("CHN");
        log.debug("afterUpdate: {}", afterUpdate);
        assertNotEquals(beforeUpdate, afterUpdate);
    }
}