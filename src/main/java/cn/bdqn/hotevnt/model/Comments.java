package cn.bdqn.hotevnt.model;

import java.util.Date;

public class Comments {
    private Long id;

    private Long hoteventsid;

    private Date commentdate;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHoteventsid() {
        return hoteventsid;
    }

    public void setHoteventsid(Long hoteventsid) {
        this.hoteventsid = hoteventsid;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}