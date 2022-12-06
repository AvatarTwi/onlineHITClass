package com.hit.onlineclass.vod.service;

import java.io.InputStream;
import java.util.Map;

public interface VodService {
    //上传视频
    String uploadVideo(InputStream inputStream, String originalFilename);
    //删除视频
    void removeVideo(String videoSourceId);

    //点播视频播放接口
    Map<String, Object> getPlayAuth(Long courseId, Long videoId);
}
