package cn.bdqn.mapper;

import cn.bdqn.domain.Singer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 歌手dao
 * */
@Mapper
public interface SingerMapper {

    //查询全部歌手/[根据姓名模糊查询]
    public List<Singer> selectAll(String name);

    //增加歌手
    public Singer insert(Singer singer);

    //修改歌手
    public int update(Singer singer);

    //删除歌手
    public int delete(Integer id);

    //根据id查询歌手
    public Singer selectById(Integer id);
}
