package com.example.demo.mapper;

import com.example.demo.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:24:53
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
