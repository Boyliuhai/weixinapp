package com.cug.po;

import java.util.ArrayList;
import java.util.List;

public class TempprojectemployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempprojectemployeeExample() {
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

        public Criteria andContractidIsNull() {
            addCriterion("contractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("contractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("contractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("contractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("contractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("contractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("contractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("contractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("contractId like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("contractId not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("contractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("contractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("contractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("contractId not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNull() {
            addCriterion("isspecial is null");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNotNull() {
            addCriterion("isspecial is not null");
            return (Criteria) this;
        }

        public Criteria andIsspecialEqualTo(String value) {
            addCriterion("isspecial =", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotEqualTo(String value) {
            addCriterion("isspecial <>", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThan(String value) {
            addCriterion("isspecial >", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThanOrEqualTo(String value) {
            addCriterion("isspecial >=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThan(String value) {
            addCriterion("isspecial <", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThanOrEqualTo(String value) {
            addCriterion("isspecial <=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLike(String value) {
            addCriterion("isspecial like", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotLike(String value) {
            addCriterion("isspecial not like", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialIn(List<String> values) {
            addCriterion("isspecial in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotIn(List<String> values) {
            addCriterion("isspecial not in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialBetween(String value1, String value2) {
            addCriterion("isspecial between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotBetween(String value1, String value2) {
            addCriterion("isspecial not between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathIsNull() {
            addCriterion("idCardFilePath is null");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathIsNotNull() {
            addCriterion("idCardFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathEqualTo(String value) {
            addCriterion("idCardFilePath =", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathNotEqualTo(String value) {
            addCriterion("idCardFilePath <>", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathGreaterThan(String value) {
            addCriterion("idCardFilePath >", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("idCardFilePath >=", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathLessThan(String value) {
            addCriterion("idCardFilePath <", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathLessThanOrEqualTo(String value) {
            addCriterion("idCardFilePath <=", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathLike(String value) {
            addCriterion("idCardFilePath like", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathNotLike(String value) {
            addCriterion("idCardFilePath not like", value, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathIn(List<String> values) {
            addCriterion("idCardFilePath in", values, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathNotIn(List<String> values) {
            addCriterion("idCardFilePath not in", values, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathBetween(String value1, String value2) {
            addCriterion("idCardFilePath between", value1, value2, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andIdcardfilepathNotBetween(String value1, String value2) {
            addCriterion("idCardFilePath not between", value1, value2, "idcardfilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathIsNull() {
            addCriterion("faceFilePath is null");
            return (Criteria) this;
        }

        public Criteria andFacefilepathIsNotNull() {
            addCriterion("faceFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andFacefilepathEqualTo(String value) {
            addCriterion("faceFilePath =", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathNotEqualTo(String value) {
            addCriterion("faceFilePath <>", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathGreaterThan(String value) {
            addCriterion("faceFilePath >", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathGreaterThanOrEqualTo(String value) {
            addCriterion("faceFilePath >=", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathLessThan(String value) {
            addCriterion("faceFilePath <", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathLessThanOrEqualTo(String value) {
            addCriterion("faceFilePath <=", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathLike(String value) {
            addCriterion("faceFilePath like", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathNotLike(String value) {
            addCriterion("faceFilePath not like", value, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathIn(List<String> values) {
            addCriterion("faceFilePath in", values, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathNotIn(List<String> values) {
            addCriterion("faceFilePath not in", values, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathBetween(String value1, String value2) {
            addCriterion("faceFilePath between", value1, value2, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andFacefilepathNotBetween(String value1, String value2) {
            addCriterion("faceFilePath not between", value1, value2, "facefilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathIsNull() {
            addCriterion("examReportFilePath is null");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathIsNotNull() {
            addCriterion("examReportFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathEqualTo(String value) {
            addCriterion("examReportFilePath =", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathNotEqualTo(String value) {
            addCriterion("examReportFilePath <>", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathGreaterThan(String value) {
            addCriterion("examReportFilePath >", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("examReportFilePath >=", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathLessThan(String value) {
            addCriterion("examReportFilePath <", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathLessThanOrEqualTo(String value) {
            addCriterion("examReportFilePath <=", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathLike(String value) {
            addCriterion("examReportFilePath like", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathNotLike(String value) {
            addCriterion("examReportFilePath not like", value, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathIn(List<String> values) {
            addCriterion("examReportFilePath in", values, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathNotIn(List<String> values) {
            addCriterion("examReportFilePath not in", values, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathBetween(String value1, String value2) {
            addCriterion("examReportFilePath between", value1, value2, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andExamreportfilepathNotBetween(String value1, String value2) {
            addCriterion("examReportFilePath not between", value1, value2, "examreportfilepath");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathIsNull() {
            addCriterion("insuranceFilePath is null");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathIsNotNull() {
            addCriterion("insuranceFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathEqualTo(String value) {
            addCriterion("insuranceFilePath =", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathNotEqualTo(String value) {
            addCriterion("insuranceFilePath <>", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathGreaterThan(String value) {
            addCriterion("insuranceFilePath >", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathGreaterThanOrEqualTo(String value) {
            addCriterion("insuranceFilePath >=", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathLessThan(String value) {
            addCriterion("insuranceFilePath <", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathLessThanOrEqualTo(String value) {
            addCriterion("insuranceFilePath <=", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathLike(String value) {
            addCriterion("insuranceFilePath like", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathNotLike(String value) {
            addCriterion("insuranceFilePath not like", value, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathIn(List<String> values) {
            addCriterion("insuranceFilePath in", values, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathNotIn(List<String> values) {
            addCriterion("insuranceFilePath not in", values, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathBetween(String value1, String value2) {
            addCriterion("insuranceFilePath between", value1, value2, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andInsurancefilepathNotBetween(String value1, String value2) {
            addCriterion("insuranceFilePath not between", value1, value2, "insurancefilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathIsNull() {
            addCriterion("contractLabourFilePath is null");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathIsNotNull() {
            addCriterion("contractLabourFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathEqualTo(String value) {
            addCriterion("contractLabourFilePath =", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathNotEqualTo(String value) {
            addCriterion("contractLabourFilePath <>", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathGreaterThan(String value) {
            addCriterion("contractLabourFilePath >", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("contractLabourFilePath >=", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathLessThan(String value) {
            addCriterion("contractLabourFilePath <", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathLessThanOrEqualTo(String value) {
            addCriterion("contractLabourFilePath <=", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathLike(String value) {
            addCriterion("contractLabourFilePath like", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathNotLike(String value) {
            addCriterion("contractLabourFilePath not like", value, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathIn(List<String> values) {
            addCriterion("contractLabourFilePath in", values, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathNotIn(List<String> values) {
            addCriterion("contractLabourFilePath not in", values, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathBetween(String value1, String value2) {
            addCriterion("contractLabourFilePath between", value1, value2, "contractlabourfilepath");
            return (Criteria) this;
        }

        public Criteria andContractlabourfilepathNotBetween(String value1, String value2) {
            addCriterion("contractLabourFilePath not between", value1, value2, "contractlabourfilepath");
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