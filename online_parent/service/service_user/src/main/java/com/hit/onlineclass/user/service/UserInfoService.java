package com.hit.onlineclass.user.service;

import com.hit.onlineclass.model.user.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author hit
 * @since 2022-04-29
 */
public interface UserInfoService extends IService<UserInfo> {

    //openid查询
    UserInfo getUserInfoOpenid(String openId);
}
