package cn.bdqn.mapper;

import cn.bdqn.domain.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * 歌曲dao
 */
@Mapper
public interface SongMapper {

    //查询全部歌曲/[根据名字模糊查询]
    public List<Song> selectAll(String name);

    //增加歌曲
    public Song insert(Song song);

    //修改歌曲
    public int update(Song singer);

    //删除歌曲
    public int delete(Integer id);

    //根据id查询歌曲
    public Song selectById(Integer id);
}
