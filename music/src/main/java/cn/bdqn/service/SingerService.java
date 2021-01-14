package cn.bdqn.service;

import cn.bdqn.domain.Singer;
import com.github.pagehelper.PageInfo;


public interface SingerService {

    public PageInfo queryAllAndPage(Integer currentPage, Integer pageSize,String name);

    //增加歌手
    public Singer save(Singer singer);

    //修改歌手
    public Integer update(Singer singer);

    //删除歌手
    public Integer delete(Integer id);

    //根据id查询歌手
    public Singer queryById(Integer id);

}
