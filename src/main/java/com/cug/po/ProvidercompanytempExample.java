package com.cug.po;

import java.util.ArrayList;
import java.util.List;

public class ProvidercompanytempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvidercompanytempExample() {
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

        public Criteria andBusinesslicencefilepathIsNull() {
            addCriterion("businessLicenceFilePath is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathIsNotNull() {
            addCriterion("businessLicenceFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathEqualTo(String value) {
            addCriterion("businessLicenceFilePath =", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathNotEqualTo(String value) {
            addCriterion("businessLicenceFilePath <>", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathGreaterThan(String value) {
            addCriterion("businessLicenceFilePath >", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicenceFilePath >=", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathLessThan(String value) {
            addCriterion("businessLicenceFilePath <", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathLessThanOrEqualTo(String value) {
            addCriterion("businessLicenceFilePath <=", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathLike(String value) {
            addCriterion("businessLicenceFilePath like", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathNotLike(String value) {
            addCriterion("businessLicenceFilePath not like", value, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathIn(List<String> values) {
            addCriterion("businessLicenceFilePath in", values, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathNotIn(List<String> values) {
            addCriterion("businessLicenceFilePath not in", values, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathBetween(String value1, String value2) {
            addCriterion("businessLicenceFilePath between", value1, value2, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andBusinesslicencefilepathNotBetween(String value1, String value2) {
            addCriterion("businessLicenceFilePath not between", value1, value2, "businesslicencefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathIsNull() {
            addCriterion("certificateFilePath is null");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathIsNotNull() {
            addCriterion("certificateFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathEqualTo(String value) {
            addCriterion("certificateFilePath =", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathNotEqualTo(String value) {
            addCriterion("certificateFilePath <>", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathGreaterThan(String value) {
            addCriterion("certificateFilePath >", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathGreaterThanOrEqualTo(String value) {
            addCriterion("certificateFilePath >=", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathLessThan(String value) {
            addCriterion("certificateFilePath <", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathLessThanOrEqualTo(String value) {
            addCriterion("certificateFilePath <=", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathLike(String value) {
            addCriterion("certificateFilePath like", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathNotLike(String value) {
            addCriterion("certificateFilePath not like", value, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathIn(List<String> values) {
            addCriterion("certificateFilePath in", values, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathNotIn(List<String> values) {
            addCriterion("certificateFilePath not in", values, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathBetween(String value1, String value2) {
            addCriterion("certificateFilePath between", value1, value2, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andCertificatefilepathNotBetween(String value1, String value2) {
            addCriterion("certificateFilePath not between", value1, value2, "certificatefilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathIsNull() {
            addCriterion("ESPLFilePath is null");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathIsNotNull() {
            addCriterion("ESPLFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathEqualTo(String value) {
            addCriterion("ESPLFilePath =", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathNotEqualTo(String value) {
            addCriterion("ESPLFilePath <>", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathGreaterThan(String value) {
            addCriterion("ESPLFilePath >", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("ESPLFilePath >=", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathLessThan(String value) {
            addCriterion("ESPLFilePath <", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathLessThanOrEqualTo(String value) {
            addCriterion("ESPLFilePath <=", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathLike(String value) {
            addCriterion("ESPLFilePath like", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathNotLike(String value) {
            addCriterion("ESPLFilePath not like", value, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathIn(List<String> values) {
            addCriterion("ESPLFilePath in", values, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathNotIn(List<String> values) {
            addCriterion("ESPLFilePath not in", values, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathBetween(String value1, String value2) {
            addCriterion("ESPLFilePath between", value1, value2, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andEsplfilepathNotBetween(String value1, String value2) {
            addCriterion("ESPLFilePath not between", value1, value2, "esplfilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathIsNull() {
            addCriterion("LOAFilePath is null");
            return (Criteria) this;
        }

        public Criteria andLoafilepathIsNotNull() {
            addCriterion("LOAFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andLoafilepathEqualTo(String value) {
            addCriterion("LOAFilePath =", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathNotEqualTo(String value) {
            addCriterion("LOAFilePath <>", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathGreaterThan(String value) {
            addCriterion("LOAFilePath >", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathGreaterThanOrEqualTo(String value) {
            addCriterion("LOAFilePath >=", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathLessThan(String value) {
            addCriterion("LOAFilePath <", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathLessThanOrEqualTo(String value) {
            addCriterion("LOAFilePath <=", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathLike(String value) {
            addCriterion("LOAFilePath like", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathNotLike(String value) {
            addCriterion("LOAFilePath not like", value, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathIn(List<String> values) {
            addCriterion("LOAFilePath in", values, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathNotIn(List<String> values) {
            addCriterion("LOAFilePath not in", values, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathBetween(String value1, String value2) {
            addCriterion("LOAFilePath between", value1, value2, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andLoafilepathNotBetween(String value1, String value2) {
            addCriterion("LOAFilePath not between", value1, value2, "loafilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathIsNull() {
            addCriterion("securityAgreementFilePath is null");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathIsNotNull() {
            addCriterion("securityAgreementFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathEqualTo(String value) {
            addCriterion("securityAgreementFilePath =", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathNotEqualTo(String value) {
            addCriterion("securityAgreementFilePath <>", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathGreaterThan(String value) {
            addCriterion("securityAgreementFilePath >", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("securityAgreementFilePath >=", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathLessThan(String value) {
            addCriterion("securityAgreementFilePath <", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathLessThanOrEqualTo(String value) {
            addCriterion("securityAgreementFilePath <=", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathLike(String value) {
            addCriterion("securityAgreementFilePath like", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathNotLike(String value) {
            addCriterion("securityAgreementFilePath not like", value, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathIn(List<String> values) {
            addCriterion("securityAgreementFilePath in", values, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathNotIn(List<String> values) {
            addCriterion("securityAgreementFilePath not in", values, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathBetween(String value1, String value2) {
            addCriterion("securityAgreementFilePath between", value1, value2, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andSecurityagreementfilepathNotBetween(String value1, String value2) {
            addCriterion("securityAgreementFilePath not between", value1, value2, "securityagreementfilepath");
            return (Criteria) this;
        }

        public Criteria andThreeplanIsNull() {
            addCriterion("ThreePlan is null");
            return (Criteria) this;
        }

        public Criteria andThreeplanIsNotNull() {
            addCriterion("ThreePlan is not null");
            return (Criteria) this;
        }

        public Criteria andThreeplanEqualTo(String value) {
            addCriterion("ThreePlan =", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanNotEqualTo(String value) {
            addCriterion("ThreePlan <>", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanGreaterThan(String value) {
            addCriterion("ThreePlan >", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanGreaterThanOrEqualTo(String value) {
            addCriterion("ThreePlan >=", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanLessThan(String value) {
            addCriterion("ThreePlan <", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanLessThanOrEqualTo(String value) {
            addCriterion("ThreePlan <=", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanLike(String value) {
            addCriterion("ThreePlan like", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanNotLike(String value) {
            addCriterion("ThreePlan not like", value, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanIn(List<String> values) {
            addCriterion("ThreePlan in", values, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanNotIn(List<String> values) {
            addCriterion("ThreePlan not in", values, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanBetween(String value1, String value2) {
            addCriterion("ThreePlan between", value1, value2, "threeplan");
            return (Criteria) this;
        }

        public Criteria andThreeplanNotBetween(String value1, String value2) {
            addCriterion("ThreePlan not between", value1, value2, "threeplan");
            return (Criteria) this;
        }

        public Criteria andNowworkerIsNull() {
            addCriterion("nowworker is null");
            return (Criteria) this;
        }

        public Criteria andNowworkerIsNotNull() {
            addCriterion("nowworker is not null");
            return (Criteria) this;
        }

        public Criteria andNowworkerEqualTo(String value) {
            addCriterion("nowworker =", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerNotEqualTo(String value) {
            addCriterion("nowworker <>", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerGreaterThan(String value) {
            addCriterion("nowworker >", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerGreaterThanOrEqualTo(String value) {
            addCriterion("nowworker >=", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerLessThan(String value) {
            addCriterion("nowworker <", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerLessThanOrEqualTo(String value) {
            addCriterion("nowworker <=", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerLike(String value) {
            addCriterion("nowworker like", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerNotLike(String value) {
            addCriterion("nowworker not like", value, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerIn(List<String> values) {
            addCriterion("nowworker in", values, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerNotIn(List<String> values) {
            addCriterion("nowworker not in", values, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerBetween(String value1, String value2) {
            addCriterion("nowworker between", value1, value2, "nowworker");
            return (Criteria) this;
        }

        public Criteria andNowworkerNotBetween(String value1, String value2) {
            addCriterion("nowworker not between", value1, value2, "nowworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerIsNull() {
            addCriterion("allworker is null");
            return (Criteria) this;
        }

        public Criteria andAllworkerIsNotNull() {
            addCriterion("allworker is not null");
            return (Criteria) this;
        }

        public Criteria andAllworkerEqualTo(String value) {
            addCriterion("allworker =", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerNotEqualTo(String value) {
            addCriterion("allworker <>", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerGreaterThan(String value) {
            addCriterion("allworker >", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerGreaterThanOrEqualTo(String value) {
            addCriterion("allworker >=", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerLessThan(String value) {
            addCriterion("allworker <", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerLessThanOrEqualTo(String value) {
            addCriterion("allworker <=", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerLike(String value) {
            addCriterion("allworker like", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerNotLike(String value) {
            addCriterion("allworker not like", value, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerIn(List<String> values) {
            addCriterion("allworker in", values, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerNotIn(List<String> values) {
            addCriterion("allworker not in", values, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerBetween(String value1, String value2) {
            addCriterion("allworker between", value1, value2, "allworker");
            return (Criteria) this;
        }

        public Criteria andAllworkerNotBetween(String value1, String value2) {
            addCriterion("allworker not between", value1, value2, "allworker");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleIsNull() {
            addCriterion("powerpeople is null");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleIsNotNull() {
            addCriterion("powerpeople is not null");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleEqualTo(String value) {
            addCriterion("powerpeople =", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleNotEqualTo(String value) {
            addCriterion("powerpeople <>", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleGreaterThan(String value) {
            addCriterion("powerpeople >", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("powerpeople >=", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleLessThan(String value) {
            addCriterion("powerpeople <", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleLessThanOrEqualTo(String value) {
            addCriterion("powerpeople <=", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleLike(String value) {
            addCriterion("powerpeople like", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleNotLike(String value) {
            addCriterion("powerpeople not like", value, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleIn(List<String> values) {
            addCriterion("powerpeople in", values, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleNotIn(List<String> values) {
            addCriterion("powerpeople not in", values, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleBetween(String value1, String value2) {
            addCriterion("powerpeople between", value1, value2, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowerpeopleNotBetween(String value1, String value2) {
            addCriterion("powerpeople not between", value1, value2, "powerpeople");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneIsNull() {
            addCriterion("powpeoplephone is null");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneIsNotNull() {
            addCriterion("powpeoplephone is not null");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneEqualTo(String value) {
            addCriterion("powpeoplephone =", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneNotEqualTo(String value) {
            addCriterion("powpeoplephone <>", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneGreaterThan(String value) {
            addCriterion("powpeoplephone >", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneGreaterThanOrEqualTo(String value) {
            addCriterion("powpeoplephone >=", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneLessThan(String value) {
            addCriterion("powpeoplephone <", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneLessThanOrEqualTo(String value) {
            addCriterion("powpeoplephone <=", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneLike(String value) {
            addCriterion("powpeoplephone like", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneNotLike(String value) {
            addCriterion("powpeoplephone not like", value, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneIn(List<String> values) {
            addCriterion("powpeoplephone in", values, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneNotIn(List<String> values) {
            addCriterion("powpeoplephone not in", values, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneBetween(String value1, String value2) {
            addCriterion("powpeoplephone between", value1, value2, "powpeoplephone");
            return (Criteria) this;
        }

        public Criteria andPowpeoplephoneNotBetween(String value1, String value2) {
            addCriterion("powpeoplephone not between", value1, value2, "powpeoplephone");
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