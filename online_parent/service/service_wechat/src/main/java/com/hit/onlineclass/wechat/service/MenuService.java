package com.hit.onlineclass.wechat.service;

import com.hit.onlineclass.model.wechat.Menu;
import com.hit.onlineclass.vo.wechat.MenuVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 订单明细 订单明细 服务类
 * </p>
 *
 * @author hit
 * @since 2022-04-30
 */
public interface MenuService extends IService<Menu> {

    //获取所有菜单，按照一级和二级菜单封装
    List<MenuVo> findMenuInfo();

    //获取所有一级菜单
    List<Menu> findMenuOneInfo();

    //同步菜单方法
    void syncMenu();

    //公众号菜单删除
    void removeMenu();
}
