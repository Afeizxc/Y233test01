package cn.bdqn.controller;

import cn.bdqn.bean.ResponseResult;
import cn.bdqn.domain.Singer;
import cn.bdqn.service.SingerService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SingerController {

    @Autowired
    private SingerService singerService;

    @RequestMapping("/singer/queryAllAndParams")
    public ResponseResult queryAll(@RequestParam(required = false, defaultValue = "1") Integer currentPage,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize,String name){
        PageInfo list = singerService.queryAllAndPage(currentPage, pageSize,name);
        return new ResponseResult(200,list,"success");
    }

    @RequestMapping("/singer/queryAllNoParams")
    public ResponseResult queryAllNoParams(@RequestParam(required = false, defaultValue = "1") Integer currentPage,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize){
        PageInfo list = singerService.queryAllAndPage(currentPage, pageSize,null);
        return new ResponseResult(200,list,"success");
    }

    @PostMapping("/singer/save")
    public ResponseResult save(Singer singer){
        Singer s = singerService.save(singer);
        if(s != null){
            return new ResponseResult(200,s,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }


    @RequestMapping("/singer/update")
    public ResponseResult update(Singer singer){
        int i = singerService.update(singer);
        if(i>0){
            return new ResponseResult(200,null,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }



    @RequestMapping("/singer/deleteById")
    public ResponseResult deleteById(Integer id){
        int i = singerService.delete(id);
        if(i>0){
            return new ResponseResult(200,null,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }

    @RequestMapping("/singer/queryById")
    public ResponseResult queryById(Integer id){
        Singer singer = singerService.queryById(id);
        if(singer != null){
            return new ResponseResult(200,singer,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }
}
