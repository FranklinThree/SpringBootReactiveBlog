package com.github.franklinthree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.franklinthree.model.local.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
