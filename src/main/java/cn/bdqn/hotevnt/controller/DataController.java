package cn.bdqn.hotevnt.controller;

import cn.bdqn.hotevnt.model.Comments;
import cn.bdqn.hotevnt.model.Hotevents;
import cn.bdqn.hotevnt.service.CommentService;
import cn.bdqn.hotevnt.service.EventService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 异步数据获取、提交Controller
 *
 * @author SayBoy_D
 * @create 2019-05-18 13:56
 */
@RestController
public class DataController {
    @Resource
    private CommentService commentService;

    @Resource
    private EventService eventService;


    @RequestMapping("/EventList.do")
    public Map<String, Object> Eventlist(int draw, int start, @RequestParam(defaultValue = "") String keyword) {
        Map<String, Object> map = new HashMap<>(16);
        int total = eventService.count();
        PageInfo<Hotevents> pageInfo = eventService.LikeEventList(start, 3, keyword);
        map.put("draw", draw);
        map.put("recordsTotal", total);
        map.put("recordsFiltered", total);
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping("/commentAdd.do")
    public Map<String, Object> insertComment(Comments comments) {
        Map<String, Object> map = new HashMap<>(16);

        Hotevents events = null;
        try {
            events = eventService.findEvents(comments.getHoteventsid());
            commentService.insertComment(comments);
            events.setSearchsum(events.getSearchsum() + 1);
            eventService.updata(events);
            map.put("ret", 1);
        } catch (Exception e) {
            map.put("ret", 0);
        }

        return map;
    }
}
