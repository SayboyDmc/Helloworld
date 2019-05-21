package cn.bdqn.hotevnt.model;

import java.util.Date;

public class Hotevents {
    private Long id;

    private String keyword;

    private String hotcontent;

    private Long searchsum;

    private Date createdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getHotcontent() {
        return hotcontent;
    }

    public void setHotcontent(String hotcontent) {
        this.hotcontent = hotcontent;
    }

    public Long getSearchsum() {
        return searchsum;
    }

    public void setSearchsum(Long searchsum) {
        this.searchsum = searchsum;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}