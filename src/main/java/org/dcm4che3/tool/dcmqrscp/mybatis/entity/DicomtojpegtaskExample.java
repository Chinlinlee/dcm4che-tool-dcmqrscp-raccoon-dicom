package org.dcm4che3.tool.dcmqrscp.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DicomtojpegtaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public DicomtojpegtaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
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
     * This method corresponds to the database table public.DicomToJpegTask
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
     * This method corresponds to the database table public.DicomToJpegTask
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.DicomToJpegTask
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
     * This class corresponds to the database table public.DicomToJpegTask
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

        public Criteria andStudyuidIsNull() {
            addCriterion("studyUID is null");
            return (Criteria) this;
        }

        public Criteria andStudyuidIsNotNull() {
            addCriterion("studyUID is not null");
            return (Criteria) this;
        }

        public Criteria andStudyuidEqualTo(String value) {
            addCriterion("studyUID =", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidNotEqualTo(String value) {
            addCriterion("studyUID <>", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidGreaterThan(String value) {
            addCriterion("studyUID >", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidGreaterThanOrEqualTo(String value) {
            addCriterion("studyUID >=", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidLessThan(String value) {
            addCriterion("studyUID <", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidLessThanOrEqualTo(String value) {
            addCriterion("studyUID <=", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidLike(String value) {
            addCriterion("studyUID like", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidNotLike(String value) {
            addCriterion("studyUID not like", value, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidIn(List<String> values) {
            addCriterion("studyUID in", values, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidNotIn(List<String> values) {
            addCriterion("studyUID not in", values, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidBetween(String value1, String value2) {
            addCriterion("studyUID between", value1, value2, "studyuid");
            return (Criteria) this;
        }

        public Criteria andStudyuidNotBetween(String value1, String value2) {
            addCriterion("studyUID not between", value1, value2, "studyuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidIsNull() {
            addCriterion("seriesUID is null");
            return (Criteria) this;
        }

        public Criteria andSeriesuidIsNotNull() {
            addCriterion("seriesUID is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesuidEqualTo(String value) {
            addCriterion("seriesUID =", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidNotEqualTo(String value) {
            addCriterion("seriesUID <>", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidGreaterThan(String value) {
            addCriterion("seriesUID >", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidGreaterThanOrEqualTo(String value) {
            addCriterion("seriesUID >=", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidLessThan(String value) {
            addCriterion("seriesUID <", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidLessThanOrEqualTo(String value) {
            addCriterion("seriesUID <=", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidLike(String value) {
            addCriterion("seriesUID like", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidNotLike(String value) {
            addCriterion("seriesUID not like", value, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidIn(List<String> values) {
            addCriterion("seriesUID in", values, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidNotIn(List<String> values) {
            addCriterion("seriesUID not in", values, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidBetween(String value1, String value2) {
            addCriterion("seriesUID between", value1, value2, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andSeriesuidNotBetween(String value1, String value2) {
            addCriterion("seriesUID not between", value1, value2, "seriesuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidIsNull() {
            addCriterion("instanceUID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceuidIsNotNull() {
            addCriterion("instanceUID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceuidEqualTo(String value) {
            addCriterion("instanceUID =", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidNotEqualTo(String value) {
            addCriterion("instanceUID <>", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidGreaterThan(String value) {
            addCriterion("instanceUID >", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidGreaterThanOrEqualTo(String value) {
            addCriterion("instanceUID >=", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidLessThan(String value) {
            addCriterion("instanceUID <", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidLessThanOrEqualTo(String value) {
            addCriterion("instanceUID <=", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidLike(String value) {
            addCriterion("instanceUID like", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidNotLike(String value) {
            addCriterion("instanceUID not like", value, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidIn(List<String> values) {
            addCriterion("instanceUID in", values, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidNotIn(List<String> values) {
            addCriterion("instanceUID not in", values, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidBetween(String value1, String value2) {
            addCriterion("instanceUID between", value1, value2, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andInstanceuidNotBetween(String value1, String value2) {
            addCriterion("instanceUID not between", value1, value2, "instanceuid");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNull() {
            addCriterion("taskTime is null");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNotNull() {
            addCriterion("taskTime is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimeEqualTo(Date value) {
            addCriterion("taskTime =", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotEqualTo(Date value) {
            addCriterion("taskTime <>", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThan(Date value) {
            addCriterion("taskTime >", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("taskTime >=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThan(Date value) {
            addCriterion("taskTime <", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThanOrEqualTo(Date value) {
            addCriterion("taskTime <=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeIn(List<Date> values) {
            addCriterion("taskTime in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotIn(List<Date> values) {
            addCriterion("taskTime not in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeBetween(Date value1, Date value2) {
            addCriterion("taskTime between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotBetween(Date value1, Date value2) {
            addCriterion("taskTime not between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNull() {
            addCriterion("finishedTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNotNull() {
            addCriterion("finishedTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeEqualTo(Date value) {
            addCriterion("finishedTime =", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotEqualTo(Date value) {
            addCriterion("finishedTime <>", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThan(Date value) {
            addCriterion("finishedTime >", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishedTime >=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThan(Date value) {
            addCriterion("finishedTime <", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishedTime <=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIn(List<Date> values) {
            addCriterion("finishedTime in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotIn(List<Date> values) {
            addCriterion("finishedTime not in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeBetween(Date value1, Date value2) {
            addCriterion("finishedTime between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishedTime not between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(String value) {
            addCriterion("fileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(String value) {
            addCriterion("fileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(String value) {
            addCriterion("fileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(String value) {
            addCriterion("fileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(String value) {
            addCriterion("fileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(String value) {
            addCriterion("fileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLike(String value) {
            addCriterion("fileSize like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotLike(String value) {
            addCriterion("fileSize not like", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<String> values) {
            addCriterion("fileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<String> values) {
            addCriterion("fileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(String value1, String value2) {
            addCriterion("fileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(String value1, String value2) {
            addCriterion("fileSize not between", value1, value2, "filesize");
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
     * This class corresponds to the database table public.DicomToJpegTask
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
     * This class corresponds to the database table public.DicomToJpegTask
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