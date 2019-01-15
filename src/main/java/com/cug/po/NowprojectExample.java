package com.cug.po;

import java.util.ArrayList;
import java.util.List;

public class NowprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NowprojectExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andProfessionsIsNull() {
            addCriterion("professions is null");
            return (Criteria) this;
        }

        public Criteria andProfessionsIsNotNull() {
            addCriterion("professions is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionsEqualTo(String value) {
            addCriterion("professions =", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsNotEqualTo(String value) {
            addCriterion("professions <>", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsGreaterThan(String value) {
            addCriterion("professions >", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsGreaterThanOrEqualTo(String value) {
            addCriterion("professions >=", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsLessThan(String value) {
            addCriterion("professions <", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsLessThanOrEqualTo(String value) {
            addCriterion("professions <=", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsLike(String value) {
            addCriterion("professions like", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsNotLike(String value) {
            addCriterion("professions not like", value, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsIn(List<String> values) {
            addCriterion("professions in", values, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsNotIn(List<String> values) {
            addCriterion("professions not in", values, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsBetween(String value1, String value2) {
            addCriterion("professions between", value1, value2, "professions");
            return (Criteria) this;
        }

        public Criteria andProfessionsNotBetween(String value1, String value2) {
            addCriterion("professions not between", value1, value2, "professions");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNull() {
            addCriterion("projectType is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNotNull() {
            addCriterion("projectType is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeEqualTo(String value) {
            addCriterion("projectType =", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotEqualTo(String value) {
            addCriterion("projectType <>", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThan(String value) {
            addCriterion("projectType >", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("projectType >=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThan(String value) {
            addCriterion("projectType <", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("projectType <=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLike(String value) {
            addCriterion("projectType like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotLike(String value) {
            addCriterion("projectType not like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIn(List<String> values) {
            addCriterion("projectType in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotIn(List<String> values) {
            addCriterion("projectType not in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeBetween(String value1, String value2) {
            addCriterion("projectType between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotBetween(String value1, String value2) {
            addCriterion("projectType not between", value1, value2, "projecttype");
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

        public Criteria andProvidercompanynameIsNull() {
            addCriterion("providerCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameIsNotNull() {
            addCriterion("providerCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameEqualTo(String value) {
            addCriterion("providerCompanyName =", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameNotEqualTo(String value) {
            addCriterion("providerCompanyName <>", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameGreaterThan(String value) {
            addCriterion("providerCompanyName >", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("providerCompanyName >=", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameLessThan(String value) {
            addCriterion("providerCompanyName <", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameLessThanOrEqualTo(String value) {
            addCriterion("providerCompanyName <=", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameLike(String value) {
            addCriterion("providerCompanyName like", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameNotLike(String value) {
            addCriterion("providerCompanyName not like", value, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameIn(List<String> values) {
            addCriterion("providerCompanyName in", values, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameNotIn(List<String> values) {
            addCriterion("providerCompanyName not in", values, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameBetween(String value1, String value2) {
            addCriterion("providerCompanyName between", value1, value2, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andProvidercompanynameNotBetween(String value1, String value2) {
            addCriterion("providerCompanyName not between", value1, value2, "providercompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameIsNull() {
            addCriterion("supervisorCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameIsNotNull() {
            addCriterion("supervisorCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameEqualTo(String value) {
            addCriterion("supervisorCompanyName =", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameNotEqualTo(String value) {
            addCriterion("supervisorCompanyName <>", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameGreaterThan(String value) {
            addCriterion("supervisorCompanyName >", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("supervisorCompanyName >=", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameLessThan(String value) {
            addCriterion("supervisorCompanyName <", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameLessThanOrEqualTo(String value) {
            addCriterion("supervisorCompanyName <=", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameLike(String value) {
            addCriterion("supervisorCompanyName like", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameNotLike(String value) {
            addCriterion("supervisorCompanyName not like", value, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameIn(List<String> values) {
            addCriterion("supervisorCompanyName in", values, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameNotIn(List<String> values) {
            addCriterion("supervisorCompanyName not in", values, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameBetween(String value1, String value2) {
            addCriterion("supervisorCompanyName between", value1, value2, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andSupervisorcompanynameNotBetween(String value1, String value2) {
            addCriterion("supervisorCompanyName not between", value1, value2, "supervisorcompanyname");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Integer value) {
            addCriterion("taxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Integer value) {
            addCriterion("taxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Integer value) {
            addCriterion("taxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("taxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Integer value) {
            addCriterion("taxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Integer value) {
            addCriterion("taxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Integer> values) {
            addCriterion("taxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Integer> values) {
            addCriterion("taxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Integer value1, Integer value2) {
            addCriterion("taxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Integer value1, Integer value2) {
            addCriterion("taxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathIsNull() {
            addCriterion("projectFilePath is null");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathIsNotNull() {
            addCriterion("projectFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathEqualTo(String value) {
            addCriterion("projectFilePath =", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathNotEqualTo(String value) {
            addCriterion("projectFilePath <>", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathGreaterThan(String value) {
            addCriterion("projectFilePath >", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("projectFilePath >=", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathLessThan(String value) {
            addCriterion("projectFilePath <", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathLessThanOrEqualTo(String value) {
            addCriterion("projectFilePath <=", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathLike(String value) {
            addCriterion("projectFilePath like", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathNotLike(String value) {
            addCriterion("projectFilePath not like", value, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathIn(List<String> values) {
            addCriterion("projectFilePath in", values, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathNotIn(List<String> values) {
            addCriterion("projectFilePath not in", values, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathBetween(String value1, String value2) {
            addCriterion("projectFilePath between", value1, value2, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andProjectfilepathNotBetween(String value1, String value2) {
            addCriterion("projectFilePath not between", value1, value2, "projectfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathIsNull() {
            addCriterion("contractFilePath is null");
            return (Criteria) this;
        }

        public Criteria andContractfilepathIsNotNull() {
            addCriterion("contractFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andContractfilepathEqualTo(String value) {
            addCriterion("contractFilePath =", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathNotEqualTo(String value) {
            addCriterion("contractFilePath <>", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathGreaterThan(String value) {
            addCriterion("contractFilePath >", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("contractFilePath >=", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathLessThan(String value) {
            addCriterion("contractFilePath <", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathLessThanOrEqualTo(String value) {
            addCriterion("contractFilePath <=", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathLike(String value) {
            addCriterion("contractFilePath like", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathNotLike(String value) {
            addCriterion("contractFilePath not like", value, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathIn(List<String> values) {
            addCriterion("contractFilePath in", values, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathNotIn(List<String> values) {
            addCriterion("contractFilePath not in", values, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathBetween(String value1, String value2) {
            addCriterion("contractFilePath between", value1, value2, "contractfilepath");
            return (Criteria) this;
        }

        public Criteria andContractfilepathNotBetween(String value1, String value2) {
            addCriterion("contractFilePath not between", value1, value2, "contractfilepath");
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