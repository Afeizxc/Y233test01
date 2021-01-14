package cn.bdqn.mapper;

import cn.bdqn.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员dao
 * */
@Mapper
public interface AdminMapper {
    public Admin selectById(String name, String password );
}
