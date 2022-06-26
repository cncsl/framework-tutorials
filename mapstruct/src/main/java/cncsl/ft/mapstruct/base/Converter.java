package cncsl.ft.mapstruct.base;

import java.util.List;
import java.util.Set;

/**
 * JavaBean 类型转换
 *
 * @param <S> 原类型
 * @param <T> 目标类型
 */
public interface Converter<S, T> {

    T convert(S s);

    List<T> convert(List<S> list);

    Set<T> convert(Set<S> set);

}
