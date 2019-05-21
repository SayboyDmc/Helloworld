package cn.bdqn.hotevnt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoteventsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoteventsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyWord is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyWord is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyWord =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyWord <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyWord >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyWord >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyWord <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyWord <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyWord like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyWord not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyWord in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyWord not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyWord between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyWord not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andHotcontentIsNull() {
            addCriterion("hotContent is null");
            return (Criteria) this;
        }

        public Criteria andHotcontentIsNotNull() {
            addCriterion("hotContent is not null");
            return (Criteria) this;
        }

        public Criteria andHotcontentEqualTo(String value) {
            addCriterion("hotContent =", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentNotEqualTo(String value) {
            addCriterion("hotContent <>", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentGreaterThan(String value) {
            addCriterion("hotContent >", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentGreaterThanOrEqualTo(String value) {
            addCriterion("hotContent >=", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentLessThan(String value) {
            addCriterion("hotContent <", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentLessThanOrEqualTo(String value) {
            addCriterion("hotContent <=", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentLike(String value) {
            addCriterion("hotContent like", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentNotLike(String value) {
            addCriterion("hotContent not like", value, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentIn(List<String> values) {
            addCriterion("hotContent in", values, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentNotIn(List<String> values) {
            addCriterion("hotContent not in", values, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentBetween(String value1, String value2) {
            addCriterion("hotContent between", value1, value2, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andHotcontentNotBetween(String value1, String value2) {
            addCriterion("hotContent not between", value1, value2, "hotcontent");
            return (Criteria) this;
        }

        public Criteria andSearchsumIsNull() {
            addCriterion("searchSum is null");
            return (Criteria) this;
        }

        public Criteria andSearchsumIsNotNull() {
            addCriterion("searchSum is not null");
            return (Criteria) this;
        }

        public Criteria andSearchsumEqualTo(Long value) {
            addCriterion("searchSum =", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumNotEqualTo(Long value) {
            addCriterion("searchSum <>", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumGreaterThan(Long value) {
            addCriterion("searchSum >", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumGreaterThanOrEqualTo(Long value) {
            addCriterion("searchSum >=", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumLessThan(Long value) {
            addCriterion("searchSum <", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumLessThanOrEqualTo(Long value) {
            addCriterion("searchSum <=", value, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumIn(List<Long> values) {
            addCriterion("searchSum in", values, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumNotIn(List<Long> values) {
            addCriterion("searchSum not in", values, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumBetween(Long value1, Long value2) {
            addCriterion("searchSum between", value1, value2, "searchsum");
            return (Criteria) this;
        }

        public Criteria andSearchsumNotBetween(Long value1, Long value2) {
            addCriterion("searchSum not between", value1, value2, "searchsum");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}