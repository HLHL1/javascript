package com.forum.service;

import com.forum.mapper.FloorMapper;
import com.forum.pojo.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname FloorService
 * @Description TODO
 * @Date 2019/5/29 0029 下午 21:40
 * @Created by Administrator
 */
@Service
public class FloorService {

    @Autowired
    private FloorMapper floorMapper;

    public List<Floor> selectFloorByPostId(int postId){
        return floorMapper.selectFloorByPostId(postId);
    }


}
