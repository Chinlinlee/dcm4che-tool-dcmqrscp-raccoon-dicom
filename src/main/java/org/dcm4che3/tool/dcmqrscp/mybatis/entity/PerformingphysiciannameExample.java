package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerformingphysiciannameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public PerformingphysiciannameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
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
     * This method corresponds to the database table public.PerformingPhysicianName
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
     * This method corresponds to the database table public.PerformingPhysicianName
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.PerformingPhysicianName
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
     * This class corresponds to the database table public.PerformingPhysicianName
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

        public Criteria andX0020000eIsNull() {
            addCriterion("x0020000E is null");
            return (Criteria) this;
        }

        public Criteria andX0020000eIsNotNull() {
            addCriterion("x0020000E is not null");
            return (Criteria) this;
        }

        public Criteria andX0020000eEqualTo(String value) {
            addCriterion("x0020000E =", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eNotEqualTo(String value) {
            addCriterion("x0020000E <>", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eGreaterThan(String value) {
            addCriterion("x0020000E >", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eGreaterThanOrEqualTo(String value) {
            addCriterion("x0020000E >=", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eLessThan(String value) {
            addCriterion("x0020000E <", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eLessThanOrEqualTo(String value) {
            addCriterion("x0020000E <=", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eLike(String value) {
            addCriterion("x0020000E like", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eNotLike(String value) {
            addCriterion("x0020000E not like", value, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eIn(List<String> values) {
            addCriterion("x0020000E in", values, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eNotIn(List<String> values) {
            addCriterion("x0020000E not in", values, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eBetween(String value1, String value2) {
            addCriterion("x0020000E between", value1, value2, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andX0020000eNotBetween(String value1, String value2) {
            addCriterion("x0020000E not between", value1, value2, "x0020000e");
            return (Criteria) this;
        }

        public Criteria andPersonnameidIsNull() {
            addCriterion("PersonNameId is null");
            return (Criteria) this;
        }

        public Criteria andPersonnameidIsNotNull() {
            addCriterion("PersonNameId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnameidEqualTo(Integer value) {
            addCriterion("PersonNameId =", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidNotEqualTo(Integer value) {
            addCriterion("PersonNameId <>", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidGreaterThan(Integer value) {
            addCriterion("PersonNameId >", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PersonNameId >=", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidLessThan(Integer value) {
            addCriterion("PersonNameId <", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidLessThanOrEqualTo(Integer value) {
            addCriterion("PersonNameId <=", value, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidIn(List<Integer> values) {
            addCriterion("PersonNameId in", values, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidNotIn(List<Integer> values) {
            addCriterion("PersonNameId not in", values, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidBetween(Integer value1, Integer value2) {
            addCriterion("PersonNameId between", value1, value2, "personnameid");
            return (Criteria) this;
        }

        public Criteria andPersonnameidNotBetween(Integer value1, Integer value2) {
            addCriterion("PersonNameId not between", value1, value2, "personnameid");
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
     * This class corresponds to the database table public.PerformingPhysicianName
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
     * This class corresponds to the database table public.PerformingPhysicianName
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