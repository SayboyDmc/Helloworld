package cn.bdqn.hotevnt.service;


import cn.bdqn.hotevnt.model.Hotevents;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author SayBoy_D
 * @create 2019-05-18 13:34
 */
public interface EventService {

    /**
     * 查询所有数据
     * @return
     */
    PageInfo<Hotevents> findEventList(int start, int length);

    /**
     * 模糊查询数据
     * @param keyword
     * @return
     */
    PageInfo<Hotevents> LikeEventList(int start, int length,String keyword);

    /**
     * 根据ID查找数据
     * @param id
     * @return
     */
    Hotevents findEvents(Long id);

    /**
     * 所有数据长度
     * @return
     */
    int count();

    /**
     * 修改记录数
     * @param hotevents
     * @return
     */
    int updata(Hotevents hotevents);
}
