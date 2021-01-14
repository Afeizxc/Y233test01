package cn.bdqn.service;

import cn.bdqn.domain.Singer;
import cn.bdqn.domain.Song;
import com.github.pagehelper.PageInfo;

public interface SongService {

    public PageInfo queryAllAndPage(Integer currentPage, Integer pageSize, String name);

    //增加歌手
    public Song save(Song song);

    //修改歌手
    public Integer update(Song song);

    //删除歌手
    public Integer delete(Integer id);

    //根据id查询歌手
    public Song queryById(Integer id);
}
