package com.tiger.zmz.dao.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhanghai2
 * @Description: 通用Mapper
 * @date 2019-7-17
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
