package cn.bdqn.service.impl;

import cn.bdqn.domain.Singer;
import cn.bdqn.domain.Song;
import cn.bdqn.mapper.SongMapper;
import cn.bdqn.service.SongService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Override
    public PageInfo queryAllAndPage(Integer currentPage, Integer pageSize, String name) {
        PageHelper.startPage(currentPage, pageSize);
        List<Song> lists = songMapper.selectAll(name);
        PageInfo pageInfo = new PageInfo(lists);
        return pageInfo;
    }

    @Override
    public Song save(Song song) {
        return songMapper.insert(song);
    }

    @Override
    public Integer update(Song song) {
        return songMapper.update(song);
    }

    @Override
    public Integer delete(Integer id) {
        return songMapper.delete(id);
    }

    @Override
    public Song queryById(Integer id) {
        return songMapper.selectById(id);
    }
}
