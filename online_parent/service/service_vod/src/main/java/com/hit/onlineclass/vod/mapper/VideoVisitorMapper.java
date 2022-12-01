package com.hit.onlineclass.vod.mapper;

import com.hit.onlineclass.model.vod.VideoVisitor;
import com.hit.onlineclass.vo.vod.VideoVisitorCountVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 视频来访者记录表 Mapper 接口
 * </p>
 *
 * @author hit
 * @since 2022-04-25
 */
public interface VideoVisitorMapper extends BaseMapper<VideoVisitor> {

    //课程统计的接口
    List<VideoVisitorCountVo> findCount(@Param("courseId") Long courseId,
                                        @Param("startDate")String startDate,
                                        @Param("endDate")String endDate);
}
