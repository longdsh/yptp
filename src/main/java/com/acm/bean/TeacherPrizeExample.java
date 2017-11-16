package com.acm.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherPrizeExample() {
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

        public Criteria andTacheridIsNull() {
            addCriterion("tacherId is null");
            return (Criteria) this;
        }

        public Criteria andTacheridIsNotNull() {
            addCriterion("tacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTacheridEqualTo(String value) {
            addCriterion("tacherId =", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridNotEqualTo(String value) {
            addCriterion("tacherId <>", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridGreaterThan(String value) {
            addCriterion("tacherId >", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridGreaterThanOrEqualTo(String value) {
            addCriterion("tacherId >=", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridLessThan(String value) {
            addCriterion("tacherId <", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridLessThanOrEqualTo(String value) {
            addCriterion("tacherId <=", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridLike(String value) {
            addCriterion("tacherId like", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridNotLike(String value) {
            addCriterion("tacherId not like", value, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridIn(List<String> values) {
            addCriterion("tacherId in", values, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridNotIn(List<String> values) {
            addCriterion("tacherId not in", values, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridBetween(String value1, String value2) {
            addCriterion("tacherId between", value1, value2, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTacheridNotBetween(String value1, String value2) {
            addCriterion("tacherId not between", value1, value2, "tacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeIsNull() {
            addCriterion("teacherNmae is null");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeIsNotNull() {
            addCriterion("teacherNmae is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeEqualTo(String value) {
            addCriterion("teacherNmae =", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeNotEqualTo(String value) {
            addCriterion("teacherNmae <>", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeGreaterThan(String value) {
            addCriterion("teacherNmae >", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeGreaterThanOrEqualTo(String value) {
            addCriterion("teacherNmae >=", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeLessThan(String value) {
            addCriterion("teacherNmae <", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeLessThanOrEqualTo(String value) {
            addCriterion("teacherNmae <=", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeLike(String value) {
            addCriterion("teacherNmae like", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeNotLike(String value) {
            addCriterion("teacherNmae not like", value, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeIn(List<String> values) {
            addCriterion("teacherNmae in", values, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeNotIn(List<String> values) {
            addCriterion("teacherNmae not in", values, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeBetween(String value1, String value2) {
            addCriterion("teacherNmae between", value1, value2, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andTeachernmaeNotBetween(String value1, String value2) {
            addCriterion("teacherNmae not between", value1, value2, "teachernmae");
            return (Criteria) this;
        }

        public Criteria andPrizenameIsNull() {
            addCriterion("prizeName is null");
            return (Criteria) this;
        }

        public Criteria andPrizenameIsNotNull() {
            addCriterion("prizeName is not null");
            return (Criteria) this;
        }

        public Criteria andPrizenameEqualTo(String value) {
            addCriterion("prizeName =", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameNotEqualTo(String value) {
            addCriterion("prizeName <>", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameGreaterThan(String value) {
            addCriterion("prizeName >", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameGreaterThanOrEqualTo(String value) {
            addCriterion("prizeName >=", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameLessThan(String value) {
            addCriterion("prizeName <", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameLessThanOrEqualTo(String value) {
            addCriterion("prizeName <=", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameLike(String value) {
            addCriterion("prizeName like", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameNotLike(String value) {
            addCriterion("prizeName not like", value, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameIn(List<String> values) {
            addCriterion("prizeName in", values, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameNotIn(List<String> values) {
            addCriterion("prizeName not in", values, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameBetween(String value1, String value2) {
            addCriterion("prizeName between", value1, value2, "prizename");
            return (Criteria) this;
        }

        public Criteria andPrizenameNotBetween(String value1, String value2) {
            addCriterion("prizeName not between", value1, value2, "prizename");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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