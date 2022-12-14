package com.hit.onlineclass.vod.mapper;

import com.hit.onlineclass.model.vod.Course;
import com.hit.onlineclass.vo.vod.CoursePublishVo;
import com.hit.onlineclass.vo.vod.CourseVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author hit
 * @since 2022-04-22
 */
public interface CourseMapper extends BaseMapper<Course> {

    //根据课程id查询发布课程信息
    CoursePublishVo selectCoursePublishVoById(Long id);

    //根据课程id查询课程详情
    CourseVo selectCourseVoById(Long courseId);
}
