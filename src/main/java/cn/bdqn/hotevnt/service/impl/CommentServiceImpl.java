package cn.bdqn.hotevnt.service.impl;

import cn.bdqn.hotevnt.mapper.CommentsMapper;
import cn.bdqn.hotevnt.model.Comments;
import cn.bdqn.hotevnt.model.CommentsExample;
import cn.bdqn.hotevnt.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SayBoy_D
 * @create 2019-05-18 13:43
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentsMapper commentsMapper;
    @Override
    public List<Comments> findCommentList(long hoteventsid) {
        CommentsExample example = new CommentsExample();
        example.createCriteria().andHoteventsidEqualTo(hoteventsid);
        return commentsMapper.selectByExample(example);
    }

    @Override
    public int insertComment(Comments comments) {
        return commentsMapper.insertSelective(comments);
    }
}
