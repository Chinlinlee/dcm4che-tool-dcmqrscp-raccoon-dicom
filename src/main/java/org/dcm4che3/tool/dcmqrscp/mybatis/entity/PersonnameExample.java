package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonnameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public PersonnameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlphabeticIsNull() {
            addCriterion("alphabetic is null");
            return (Criteria) this;
        }

        public Criteria andAlphabeticIsNotNull() {
            addCriterion("alphabetic is not null");
            return (Criteria) this;
        }

        public Criteria andAlphabeticEqualTo(String value) {
            addCriterion("alphabetic =", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticNotEqualTo(String value) {
            addCriterion("alphabetic <>", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticGreaterThan(String value) {
            addCriterion("alphabetic >", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticGreaterThanOrEqualTo(String value) {
            addCriterion("alphabetic >=", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticLessThan(String value) {
            addCriterion("alphabetic <", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticLessThanOrEqualTo(String value) {
            addCriterion("alphabetic <=", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticLike(String value) {
            addCriterion("alphabetic like", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticNotLike(String value) {
            addCriterion("alphabetic not like", value, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticIn(List<String> values) {
            addCriterion("alphabetic in", values, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticNotIn(List<String> values) {
            addCriterion("alphabetic not in", values, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticBetween(String value1, String value2) {
            addCriterion("alphabetic between", value1, value2, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andAlphabeticNotBetween(String value1, String value2) {
            addCriterion("alphabetic not between", value1, value2, "alphabetic");
            return (Criteria) this;
        }

        public Criteria andIdeographicIsNull() {
            addCriterion("ideographic is null");
            return (Criteria) this;
        }

        public Criteria andIdeographicIsNotNull() {
            addCriterion("ideographic is not null");
            return (Criteria) this;
        }

        public Criteria andIdeographicEqualTo(String value) {
            addCriterion("ideographic =", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicNotEqualTo(String value) {
            addCriterion("ideographic <>", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicGreaterThan(String value) {
            addCriterion("ideographic >", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicGreaterThanOrEqualTo(String value) {
            addCriterion("ideographic >=", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicLessThan(String value) {
            addCriterion("ideographic <", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicLessThanOrEqualTo(String value) {
            addCriterion("ideographic <=", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicLike(String value) {
            addCriterion("ideographic like", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicNotLike(String value) {
            addCriterion("ideographic not like", value, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicIn(List<String> values) {
            addCriterion("ideographic in", values, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicNotIn(List<String> values) {
            addCriterion("ideographic not in", values, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicBetween(String value1, String value2) {
            addCriterion("ideographic between", value1, value2, "ideographic");
            return (Criteria) this;
        }

        public Criteria andIdeographicNotBetween(String value1, String value2) {
            addCriterion("ideographic not between", value1, value2, "ideographic");
            return (Criteria) this;
        }

        public Criteria andPhoneticIsNull() {
            addCriterion("phonetic is null");
            return (Criteria) this;
        }

        public Criteria andPhoneticIsNotNull() {
            addCriterion("phonetic is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneticEqualTo(String value) {
            addCriterion("phonetic =", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticNotEqualTo(String value) {
            addCriterion("phonetic <>", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticGreaterThan(String value) {
            addCriterion("phonetic >", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticGreaterThanOrEqualTo(String value) {
            addCriterion("phonetic >=", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticLessThan(String value) {
            addCriterion("phonetic <", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticLessThanOrEqualTo(String value) {
            addCriterion("phonetic <=", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticLike(String value) {
            addCriterion("phonetic like", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticNotLike(String value) {
            addCriterion("phonetic not like", value, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticIn(List<String> values) {
            addCriterion("phonetic in", values, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticNotIn(List<String> values) {
            addCriterion("phonetic not in", values, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticBetween(String value1, String value2) {
            addCriterion("phonetic between", value1, value2, "phonetic");
            return (Criteria) this;
        }

        public Criteria andPhoneticNotBetween(String value1, String value2) {
            addCriterion("phonetic not between", value1, value2, "phonetic");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNull() {
            addCriterion("createdAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNotNull() {
            addCriterion("createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedatEqualTo(Date value) {
            addCriterion("createdAt =", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotEqualTo(Date value) {
            addCriterion("createdAt <>", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThan(Date value) {
            addCriterion("createdAt >", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("createdAt >=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThan(Date value) {
            addCriterion("createdAt <", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThanOrEqualTo(Date value) {
            addCriterion("createdAt <=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatIn(List<Date> values) {
            addCriterion("createdAt in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotIn(List<Date> values) {
            addCriterion("createdAt not in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatBetween(Date value1, Date value2) {
            addCriterion("createdAt between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotBetween(Date value1, Date value2) {
            addCriterion("createdAt not between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNull() {
            addCriterion("updatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNotNull() {
            addCriterion("updatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatEqualTo(Date value) {
            addCriterion("updatedAt =", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotEqualTo(Date value) {
            addCriterion("updatedAt <>", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThan(Date value) {
            addCriterion("updatedAt >", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedAt >=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThan(Date value) {
            addCriterion("updatedAt <", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThanOrEqualTo(Date value) {
            addCriterion("updatedAt <=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIn(List<Date> values) {
            addCriterion("updatedAt in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotIn(List<Date> values) {
            addCriterion("updatedAt not in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatBetween(Date value1, Date value2) {
            addCriterion("updatedAt between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotBetween(Date value1, Date value2) {
            addCriterion("updatedAt not between", value1, value2, "updatedat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.PersonName
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.PersonName
     *
     * @mbg.generated
     */
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