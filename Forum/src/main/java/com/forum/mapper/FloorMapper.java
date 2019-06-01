package com.forum.mapper;

import com.forum.pojo.Floor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname FloorMapper
 * @Description TODO
 * @Date 2019/5/29 0029 下午 21:44
 * @Created by Administrator
 */
@Repository
public interface FloorMapper {
    @Select("select * from floor where postId=#{postId}")
    public List<Floor> selectFloorByPostId(@Param("postId") int postId);
}
