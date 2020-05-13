package com.zy.gmall.user.mapper;

import com.zy.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();
}
