package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeriesrequestattributesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public SeriesrequestattributesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
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
     * This method corresponds to the database table public.SeriesRequestAttributes
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
     * This method corresponds to the database table public.SeriesRequestAttributes
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.SeriesRequestAttributes
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
     * This class corresponds to the database table public.SeriesRequestAttributes
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

        public Criteria andX00080050IsNull() {
            addCriterion("x00080050 is null");
            return (Criteria) this;
        }

        public Criteria andX00080050IsNotNull() {
            addCriterion("x00080050 is not null");
            return (Criteria) this;
        }

        public Criteria andX00080050EqualTo(String value) {
            addCriterion("x00080050 =", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050NotEqualTo(String value) {
            addCriterion("x00080050 <>", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050GreaterThan(String value) {
            addCriterion("x00080050 >", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050GreaterThanOrEqualTo(String value) {
            addCriterion("x00080050 >=", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050LessThan(String value) {
            addCriterion("x00080050 <", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050LessThanOrEqualTo(String value) {
            addCriterion("x00080050 <=", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050Like(String value) {
            addCriterion("x00080050 like", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050NotLike(String value) {
            addCriterion("x00080050 not like", value, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050In(List<String> values) {
            addCriterion("x00080050 in", values, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050NotIn(List<String> values) {
            addCriterion("x00080050 not in", values, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050Between(String value1, String value2) {
            addCriterion("x00080050 between", value1, value2, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080050NotBetween(String value1, String value2) {
            addCriterion("x00080050 not between", value1, value2, "x00080050");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031IsNull() {
            addCriterion("x00080051_x00400031 is null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031IsNotNull() {
            addCriterion("x00080051_x00400031 is not null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031EqualTo(String value) {
            addCriterion("x00080051_x00400031 =", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031NotEqualTo(String value) {
            addCriterion("x00080051_x00400031 <>", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031GreaterThan(String value) {
            addCriterion("x00080051_x00400031 >", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031GreaterThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400031 >=", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031LessThan(String value) {
            addCriterion("x00080051_x00400031 <", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031LessThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400031 <=", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031Like(String value) {
            addCriterion("x00080051_x00400031 like", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031NotLike(String value) {
            addCriterion("x00080051_x00400031 not like", value, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031In(List<String> values) {
            addCriterion("x00080051_x00400031 in", values, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031NotIn(List<String> values) {
            addCriterion("x00080051_x00400031 not in", values, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031Between(String value1, String value2) {
            addCriterion("x00080051_x00400031 between", value1, value2, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400031NotBetween(String value1, String value2) {
            addCriterion("x00080051_x00400031 not between", value1, value2, "x00080051X00400031");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032IsNull() {
            addCriterion("x00080051_x00400032 is null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032IsNotNull() {
            addCriterion("x00080051_x00400032 is not null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032EqualTo(String value) {
            addCriterion("x00080051_x00400032 =", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032NotEqualTo(String value) {
            addCriterion("x00080051_x00400032 <>", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032GreaterThan(String value) {
            addCriterion("x00080051_x00400032 >", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032GreaterThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400032 >=", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032LessThan(String value) {
            addCriterion("x00080051_x00400032 <", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032LessThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400032 <=", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032Like(String value) {
            addCriterion("x00080051_x00400032 like", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032NotLike(String value) {
            addCriterion("x00080051_x00400032 not like", value, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032In(List<String> values) {
            addCriterion("x00080051_x00400032 in", values, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032NotIn(List<String> values) {
            addCriterion("x00080051_x00400032 not in", values, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032Between(String value1, String value2) {
            addCriterion("x00080051_x00400032 between", value1, value2, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400032NotBetween(String value1, String value2) {
            addCriterion("x00080051_x00400032 not between", value1, value2, "x00080051X00400032");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033IsNull() {
            addCriterion("x00080051_x00400033 is null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033IsNotNull() {
            addCriterion("x00080051_x00400033 is not null");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033EqualTo(String value) {
            addCriterion("x00080051_x00400033 =", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033NotEqualTo(String value) {
            addCriterion("x00080051_x00400033 <>", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033GreaterThan(String value) {
            addCriterion("x00080051_x00400033 >", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033GreaterThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400033 >=", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033LessThan(String value) {
            addCriterion("x00080051_x00400033 <", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033LessThanOrEqualTo(String value) {
            addCriterion("x00080051_x00400033 <=", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033Like(String value) {
            addCriterion("x00080051_x00400033 like", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033NotLike(String value) {
            addCriterion("x00080051_x00400033 not like", value, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033In(List<String> values) {
            addCriterion("x00080051_x00400033 in", values, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033NotIn(List<String> values) {
            addCriterion("x00080051_x00400033 not in", values, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033Between(String value1, String value2) {
            addCriterion("x00080051_x00400033 between", value1, value2, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00080051X00400033NotBetween(String value1, String value2) {
            addCriterion("x00080051_x00400033 not between", value1, value2, "x00080051X00400033");
            return (Criteria) this;
        }

        public Criteria andX00321033IsNull() {
            addCriterion("x00321033 is null");
            return (Criteria) this;
        }

        public Criteria andX00321033IsNotNull() {
            addCriterion("x00321033 is not null");
            return (Criteria) this;
        }

        public Criteria andX00321033EqualTo(String value) {
            addCriterion("x00321033 =", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033NotEqualTo(String value) {
            addCriterion("x00321033 <>", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033GreaterThan(String value) {
            addCriterion("x00321033 >", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033GreaterThanOrEqualTo(String value) {
            addCriterion("x00321033 >=", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033LessThan(String value) {
            addCriterion("x00321033 <", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033LessThanOrEqualTo(String value) {
            addCriterion("x00321033 <=", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033Like(String value) {
            addCriterion("x00321033 like", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033NotLike(String value) {
            addCriterion("x00321033 not like", value, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033In(List<String> values) {
            addCriterion("x00321033 in", values, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033NotIn(List<String> values) {
            addCriterion("x00321033 not in", values, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033Between(String value1, String value2) {
            addCriterion("x00321033 between", value1, value2, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00321033NotBetween(String value1, String value2) {
            addCriterion("x00321033 not between", value1, value2, "x00321033");
            return (Criteria) this;
        }

        public Criteria andX00401001IsNull() {
            addCriterion("x00401001 is null");
            return (Criteria) this;
        }

        public Criteria andX00401001IsNotNull() {
            addCriterion("x00401001 is not null");
            return (Criteria) this;
        }

        public Criteria andX00401001EqualTo(String value) {
            addCriterion("x00401001 =", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001NotEqualTo(String value) {
            addCriterion("x00401001 <>", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001GreaterThan(String value) {
            addCriterion("x00401001 >", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001GreaterThanOrEqualTo(String value) {
            addCriterion("x00401001 >=", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001LessThan(String value) {
            addCriterion("x00401001 <", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001LessThanOrEqualTo(String value) {
            addCriterion("x00401001 <=", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001Like(String value) {
            addCriterion("x00401001 like", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001NotLike(String value) {
            addCriterion("x00401001 not like", value, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001In(List<String> values) {
            addCriterion("x00401001 in", values, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001NotIn(List<String> values) {
            addCriterion("x00401001 not in", values, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001Between(String value1, String value2) {
            addCriterion("x00401001 between", value1, value2, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX00401001NotBetween(String value1, String value2) {
            addCriterion("x00401001 not between", value1, value2, "x00401001");
            return (Criteria) this;
        }

        public Criteria andX0020000dIsNull() {
            addCriterion("x0020000D is null");
            return (Criteria) this;
        }

        public Criteria andX0020000dIsNotNull() {
            addCriterion("x0020000D is not null");
            return (Criteria) this;
        }

        public Criteria andX0020000dEqualTo(String value) {
            addCriterion("x0020000D =", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dNotEqualTo(String value) {
            addCriterion("x0020000D <>", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dGreaterThan(String value) {
            addCriterion("x0020000D >", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dGreaterThanOrEqualTo(String value) {
            addCriterion("x0020000D >=", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dLessThan(String value) {
            addCriterion("x0020000D <", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dLessThanOrEqualTo(String value) {
            addCriterion("x0020000D <=", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dLike(String value) {
            addCriterion("x0020000D like", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dNotLike(String value) {
            addCriterion("x0020000D not like", value, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dIn(List<String> values) {
            addCriterion("x0020000D in", values, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dNotIn(List<String> values) {
            addCriterion("x0020000D not in", values, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dBetween(String value1, String value2) {
            addCriterion("x0020000D between", value1, value2, "x0020000d");
            return (Criteria) this;
        }

        public Criteria andX0020000dNotBetween(String value1, String value2) {
            addCriterion("x0020000D not between", value1, value2, "x0020000d");
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
     * This class corresponds to the database table public.SeriesRequestAttributes
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
     * This class corresponds to the database table public.SeriesRequestAttributes
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