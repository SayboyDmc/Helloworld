package cn.bdqn.hotevnt.controller;

import cn.bdqn.hotevnt.model.Comments;
import cn.bdqn.hotevnt.model.Hotevents;
import cn.bdqn.hotevnt.service.CommentService;
import cn.bdqn.hotevnt.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 跳转Controller
 *
 * @author SayBoy_D
 * @create 2019-05-18 13:46
 */
@Controller
public class indexController {
    @Resource
    private CommentService commentService;

    @Resource
    private EventService eventService;

    @RequestMapping("/")
    public String hotEventsList(){
        return "hotEventsList";
    }


    @RequestMapping("/comments")
    public String commentsList(Model model,long hoteventsid){
        Hotevents events = eventService.findEvents(hoteventsid);
        List<Comments> commentList = commentService.findCommentList(hoteventsid);
        model.addAttribute("event", events);
        model.addAttribute("commentList",commentList);
        return "commentList";
    }
}
