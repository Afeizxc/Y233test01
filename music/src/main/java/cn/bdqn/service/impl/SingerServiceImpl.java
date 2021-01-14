package cn.bdqn.service.impl;

import cn.bdqn.domain.Singer;
import cn.bdqn.mapper.SingerMapper;
import cn.bdqn.service.SingerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public PageInfo queryAllAndPage(Integer currentPage, Integer pageSize,String name) {
        PageHelper.startPage(currentPage, pageSize);
        List<Singer> list = singerMapper.selectAll(name);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public Singer save(Singer singer) {
        return singerMapper.insert(singer);
    }

    @Override
    public Integer update(Singer singer) {
        return singerMapper.update(singer);
    }

    @Override
    public Integer delete(Integer id) {
        return singerMapper.delete(id);
    }

    @Override
    public Singer queryById(Integer id) {
        return singerMapper.selectById(id);
    }
}
