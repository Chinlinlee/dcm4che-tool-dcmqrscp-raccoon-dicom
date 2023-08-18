package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DicomcontentsqExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public DicomcontentsqExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
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
     * This method corresponds to the database table public.DicomContentSQ
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
     * This method corresponds to the database table public.DicomContentSQ
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomContentSQ
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
     * This class corresponds to the database table public.DicomContentSQ
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

        public Criteria andX0040a010IsNull() {
            addCriterion("x0040A010 is null");
            return (Criteria) this;
        }

        public Criteria andX0040a010IsNotNull() {
            addCriterion("x0040A010 is not null");
            return (Criteria) this;
        }

        public Criteria andX0040a010EqualTo(String value) {
            addCriterion("x0040A010 =", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010NotEqualTo(String value) {
            addCriterion("x0040A010 <>", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010GreaterThan(String value) {
            addCriterion("x0040A010 >", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010GreaterThanOrEqualTo(String value) {
            addCriterion("x0040A010 >=", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010LessThan(String value) {
            addCriterion("x0040A010 <", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010LessThanOrEqualTo(String value) {
            addCriterion("x0040A010 <=", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010Like(String value) {
            addCriterion("x0040A010 like", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010NotLike(String value) {
            addCriterion("x0040A010 not like", value, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010In(List<String> values) {
            addCriterion("x0040A010 in", values, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010NotIn(List<String> values) {
            addCriterion("x0040A010 not in", values, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010Between(String value1, String value2) {
            addCriterion("x0040A010 between", value1, value2, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a010NotBetween(String value1, String value2) {
            addCriterion("x0040A010 not between", value1, value2, "x0040a010");
            return (Criteria) this;
        }

        public Criteria andX0040a040IsNull() {
            addCriterion("x0040A040 is null");
            return (Criteria) this;
        }

        public Criteria andX0040a040IsNotNull() {
            addCriterion("x0040A040 is not null");
            return (Criteria) this;
        }

        public Criteria andX0040a040EqualTo(String value) {
            addCriterion("x0040A040 =", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040NotEqualTo(String value) {
            addCriterion("x0040A040 <>", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040GreaterThan(String value) {
            addCriterion("x0040A040 >", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040GreaterThanOrEqualTo(String value) {
            addCriterion("x0040A040 >=", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040LessThan(String value) {
            addCriterion("x0040A040 <", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040LessThanOrEqualTo(String value) {
            addCriterion("x0040A040 <=", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040Like(String value) {
            addCriterion("x0040A040 like", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040NotLike(String value) {
            addCriterion("x0040A040 not like", value, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040In(List<String> values) {
            addCriterion("x0040A040 in", values, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040NotIn(List<String> values) {
            addCriterion("x0040A040 not in", values, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040Between(String value1, String value2) {
            addCriterion("x0040A040 between", value1, value2, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a040NotBetween(String value1, String value2) {
            addCriterion("x0040A040 not between", value1, value2, "x0040a040");
            return (Criteria) this;
        }

        public Criteria andX0040a160IsNull() {
            addCriterion("x0040A160 is null");
            return (Criteria) this;
        }

        public Criteria andX0040a160IsNotNull() {
            addCriterion("x0040A160 is not null");
            return (Criteria) this;
        }

        public Criteria andX0040a160EqualTo(String value) {
            addCriterion("x0040A160 =", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160NotEqualTo(String value) {
            addCriterion("x0040A160 <>", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160GreaterThan(String value) {
            addCriterion("x0040A160 >", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160GreaterThanOrEqualTo(String value) {
            addCriterion("x0040A160 >=", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160LessThan(String value) {
            addCriterion("x0040A160 <", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160LessThanOrEqualTo(String value) {
            addCriterion("x0040A160 <=", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160Like(String value) {
            addCriterion("x0040A160 like", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160NotLike(String value) {
            addCriterion("x0040A160 not like", value, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160In(List<String> values) {
            addCriterion("x0040A160 in", values, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160NotIn(List<String> values) {
            addCriterion("x0040A160 not in", values, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160Between(String value1, String value2) {
            addCriterion("x0040A160 between", value1, value2, "x0040a160");
            return (Criteria) this;
        }

        public Criteria andX0040a160NotBetween(String value1, String value2) {
            addCriterion("x0040A160 not between", value1, value2, "x0040a160");
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

        public Criteria andSopinstanceuidIsNull() {
            addCriterion("SOPInstanceUID is null");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidIsNotNull() {
            addCriterion("SOPInstanceUID is not null");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidEqualTo(String value) {
            addCriterion("SOPInstanceUID =", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidNotEqualTo(String value) {
            addCriterion("SOPInstanceUID <>", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidGreaterThan(String value) {
            addCriterion("SOPInstanceUID >", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidGreaterThanOrEqualTo(String value) {
            addCriterion("SOPInstanceUID >=", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidLessThan(String value) {
            addCriterion("SOPInstanceUID <", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidLessThanOrEqualTo(String value) {
            addCriterion("SOPInstanceUID <=", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidLike(String value) {
            addCriterion("SOPInstanceUID like", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidNotLike(String value) {
            addCriterion("SOPInstanceUID not like", value, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidIn(List<String> values) {
            addCriterion("SOPInstanceUID in", values, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidNotIn(List<String> values) {
            addCriterion("SOPInstanceUID not in", values, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidBetween(String value1, String value2) {
            addCriterion("SOPInstanceUID between", value1, value2, "sopinstanceuid");
            return (Criteria) this;
        }

        public Criteria andSopinstanceuidNotBetween(String value1, String value2) {
            addCriterion("SOPInstanceUID not between", value1, value2, "sopinstanceuid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.DicomContentSQ
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
     * This class corresponds to the database table public.DicomContentSQ
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