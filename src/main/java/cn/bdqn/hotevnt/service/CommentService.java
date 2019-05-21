package cn.bdqn.hotevnt.service;

import cn.bdqn.hotevnt.model.Comments;

import java.util.List;

/**
 * @author SayBoy_D
 * @create 2019-05-18 13:35
 */
public interface CommentService {

    /**
     * 根据热点 Id 查询评论
     * @param hoteventsid
     * @return
     */
    List<Comments> findCommentList(long hoteventsid);

    /**
     * 增加评论
     * @param comments 实体类
     * @return
     */
    int insertComment(Comments comments);
}
