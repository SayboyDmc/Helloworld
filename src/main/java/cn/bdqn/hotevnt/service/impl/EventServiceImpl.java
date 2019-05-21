package cn.bdqn.hotevnt.service.impl;

import cn.bdqn.hotevnt.mapper.HoteventsMapper;
import cn.bdqn.hotevnt.model.Hotevents;
import cn.bdqn.hotevnt.model.HoteventsExample;
import cn.bdqn.hotevnt.service.EventService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SayBoy_D
 * @create 2019-05-18 13:39
 */
@Service
public class EventServiceImpl implements EventService {

    @Resource
    private HoteventsMapper eventMapper;
    @Override
    public PageInfo<Hotevents> findEventList(int start, int length) {
        HoteventsExample eventsExample = new HoteventsExample();
        PageHelper.startPage(start, length);
        eventsExample.setOrderByClause("searchsum desc");
        List<Hotevents> hotevents = eventMapper.selectByExample(eventsExample);
        PageInfo<Hotevents> pageInfo = new PageInfo<>(hotevents);
        return pageInfo;
    }

    @Override
    public PageInfo<Hotevents> LikeEventList(int start, int length,String keyword) {
        PageHelper.startPage(start, length);
        HoteventsExample eventsExample = new HoteventsExample();

        eventsExample.createCriteria().andKeywordLike("%"+keyword+"%");
        List<Hotevents> hotevents = eventMapper.selectByExample(eventsExample);
        PageInfo<Hotevents> pageInfo = new PageInfo<>(hotevents);
        return pageInfo;
    }

    @Override
    public Hotevents findEvents(Long id) {
        return eventMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count() {
        return (int) eventMapper.countByExample(null);
    }

    @Override
    public int updata(Hotevents hotevents) {
        return eventMapper.updateByPrimaryKeySelective(hotevents);
    }
}
