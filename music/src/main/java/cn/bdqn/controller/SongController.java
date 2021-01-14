package cn.bdqn.controller;

import cn.bdqn.bean.ResponseResult;
import cn.bdqn.domain.Singer;
import cn.bdqn.domain.Song;
import cn.bdqn.service.SongService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("/song/queryAll")
    public ResponseResult queryAll(@RequestParam(required = false, defaultValue = "1") Integer currentPage,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize,String name){
        PageInfo list = songService.queryAllAndPage(currentPage, pageSize,name);
        return new ResponseResult(200,list,"success");
    }


    @PostMapping("/song/save")
    public ResponseResult save(Song song){
        Song s = songService.save(song);
        if(s != null){
            return new ResponseResult(200,s,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }


    @RequestMapping("/song/update")
    public ResponseResult update(Song song){
        int i = songService.update(song);
        if(i>0){
            return new ResponseResult(200,null,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }



    @RequestMapping("/song/deleteById")
    public ResponseResult deleteById(Integer id){
        int i = songService.delete(id);
        if(i>0){
            return new ResponseResult(200,null,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }

    @RequestMapping("/song/queryById")
    public ResponseResult queryById(Integer id){
        Song song = songService.queryById(id);
        if(song != null){
            return new ResponseResult(200,song,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }
}
