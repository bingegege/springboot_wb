package com.wb.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DyDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyDateExample() {
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

        public Criteria andGnbidIsNull() {
            addCriterion("gNBID is null");
            return (Criteria) this;
        }

        public Criteria andGnbidIsNotNull() {
            addCriterion("gNBID is not null");
            return (Criteria) this;
        }

        public Criteria andGnbidEqualTo(Integer value) {
            addCriterion("gNBID =", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidNotEqualTo(Integer value) {
            addCriterion("gNBID <>", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidGreaterThan(Integer value) {
            addCriterion("gNBID >", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gNBID >=", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidLessThan(Integer value) {
            addCriterion("gNBID <", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidLessThanOrEqualTo(Integer value) {
            addCriterion("gNBID <=", value, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidIn(List<Integer> values) {
            addCriterion("gNBID in", values, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidNotIn(List<Integer> values) {
            addCriterion("gNBID not in", values, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidBetween(Integer value1, Integer value2) {
            addCriterion("gNBID between", value1, value2, "gnbid");
            return (Criteria) this;
        }

        public Criteria andGnbidNotBetween(Integer value1, Integer value2) {
            addCriterion("gNBID not between", value1, value2, "gnbid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPciIsNull() {
            addCriterion("PCI is null");
            return (Criteria) this;
        }

        public Criteria andPciIsNotNull() {
            addCriterion("PCI is not null");
            return (Criteria) this;
        }

        public Criteria andPciEqualTo(Integer value) {
            addCriterion("PCI =", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotEqualTo(Integer value) {
            addCriterion("PCI <>", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThan(Integer value) {
            addCriterion("PCI >", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciGreaterThanOrEqualTo(Integer value) {
            addCriterion("PCI >=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThan(Integer value) {
            addCriterion("PCI <", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciLessThanOrEqualTo(Integer value) {
            addCriterion("PCI <=", value, "pci");
            return (Criteria) this;
        }

        public Criteria andPciIn(List<Integer> values) {
            addCriterion("PCI in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotIn(List<Integer> values) {
            addCriterion("PCI not in", values, "pci");
            return (Criteria) this;
        }

        public Criteria andPciBetween(Integer value1, Integer value2) {
            addCriterion("PCI between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andPciNotBetween(Integer value1, Integer value2) {
            addCriterion("PCI not between", value1, value2, "pci");
            return (Criteria) this;
        }

        public Criteria andRsrpUlIsNull() {
            addCriterion("RSRP_UL is null");
            return (Criteria) this;
        }

        public Criteria andRsrpUlIsNotNull() {
            addCriterion("RSRP_UL is not null");
            return (Criteria) this;
        }

        public Criteria andRsrpUlEqualTo(Float value) {
            addCriterion("RSRP_UL =", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlNotEqualTo(Float value) {
            addCriterion("RSRP_UL <>", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlGreaterThan(Float value) {
            addCriterion("RSRP_UL >", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlGreaterThanOrEqualTo(Float value) {
            addCriterion("RSRP_UL >=", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlLessThan(Float value) {
            addCriterion("RSRP_UL <", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlLessThanOrEqualTo(Float value) {
            addCriterion("RSRP_UL <=", value, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlIn(List<Float> values) {
            addCriterion("RSRP_UL in", values, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlNotIn(List<Float> values) {
            addCriterion("RSRP_UL not in", values, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlBetween(Float value1, Float value2) {
            addCriterion("RSRP_UL between", value1, value2, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpUlNotBetween(Float value1, Float value2) {
            addCriterion("RSRP_UL not between", value1, value2, "rsrpUl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlIsNull() {
            addCriterion("RSRP_DL is null");
            return (Criteria) this;
        }

        public Criteria andRsrpDlIsNotNull() {
            addCriterion("RSRP_DL is not null");
            return (Criteria) this;
        }

        public Criteria andRsrpDlEqualTo(Float value) {
            addCriterion("RSRP_DL =", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlNotEqualTo(Float value) {
            addCriterion("RSRP_DL <>", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlGreaterThan(Float value) {
            addCriterion("RSRP_DL >", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlGreaterThanOrEqualTo(Float value) {
            addCriterion("RSRP_DL >=", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlLessThan(Float value) {
            addCriterion("RSRP_DL <", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlLessThanOrEqualTo(Float value) {
            addCriterion("RSRP_DL <=", value, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlIn(List<Float> values) {
            addCriterion("RSRP_DL in", values, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlNotIn(List<Float> values) {
            addCriterion("RSRP_DL not in", values, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlBetween(Float value1, Float value2) {
            addCriterion("RSRP_DL between", value1, value2, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andRsrpDlNotBetween(Float value1, Float value2) {
            addCriterion("RSRP_DL not between", value1, value2, "rsrpDl");
            return (Criteria) this;
        }

        public Criteria andSinrUlIsNull() {
            addCriterion("SINR_UL is null");
            return (Criteria) this;
        }

        public Criteria andSinrUlIsNotNull() {
            addCriterion("SINR_UL is not null");
            return (Criteria) this;
        }

        public Criteria andSinrUlEqualTo(Float value) {
            addCriterion("SINR_UL =", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlNotEqualTo(Float value) {
            addCriterion("SINR_UL <>", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlGreaterThan(Float value) {
            addCriterion("SINR_UL >", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlGreaterThanOrEqualTo(Float value) {
            addCriterion("SINR_UL >=", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlLessThan(Float value) {
            addCriterion("SINR_UL <", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlLessThanOrEqualTo(Float value) {
            addCriterion("SINR_UL <=", value, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlIn(List<Float> values) {
            addCriterion("SINR_UL in", values, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlNotIn(List<Float> values) {
            addCriterion("SINR_UL not in", values, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlBetween(Float value1, Float value2) {
            addCriterion("SINR_UL between", value1, value2, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrUlNotBetween(Float value1, Float value2) {
            addCriterion("SINR_UL not between", value1, value2, "sinrUl");
            return (Criteria) this;
        }

        public Criteria andSinrDlIsNull() {
            addCriterion("SINR_DL is null");
            return (Criteria) this;
        }

        public Criteria andSinrDlIsNotNull() {
            addCriterion("SINR_DL is not null");
            return (Criteria) this;
        }

        public Criteria andSinrDlEqualTo(Float value) {
            addCriterion("SINR_DL =", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlNotEqualTo(Float value) {
            addCriterion("SINR_DL <>", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlGreaterThan(Float value) {
            addCriterion("SINR_DL >", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlGreaterThanOrEqualTo(Float value) {
            addCriterion("SINR_DL >=", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlLessThan(Float value) {
            addCriterion("SINR_DL <", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlLessThanOrEqualTo(Float value) {
            addCriterion("SINR_DL <=", value, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlIn(List<Float> values) {
            addCriterion("SINR_DL in", values, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlNotIn(List<Float> values) {
            addCriterion("SINR_DL not in", values, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlBetween(Float value1, Float value2) {
            addCriterion("SINR_DL between", value1, value2, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andSinrDlNotBetween(Float value1, Float value2) {
            addCriterion("SINR_DL not between", value1, value2, "sinrDl");
            return (Criteria) this;
        }

        public Criteria andDelayRequestIsNull() {
            addCriterion("DELAY_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andDelayRequestIsNotNull() {
            addCriterion("DELAY_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andDelayRequestEqualTo(Integer value) {
            addCriterion("DELAY_REQUEST =", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestNotEqualTo(Integer value) {
            addCriterion("DELAY_REQUEST <>", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestGreaterThan(Integer value) {
            addCriterion("DELAY_REQUEST >", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELAY_REQUEST >=", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestLessThan(Integer value) {
            addCriterion("DELAY_REQUEST <", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestLessThanOrEqualTo(Integer value) {
            addCriterion("DELAY_REQUEST <=", value, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestIn(List<Integer> values) {
            addCriterion("DELAY_REQUEST in", values, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestNotIn(List<Integer> values) {
            addCriterion("DELAY_REQUEST not in", values, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_REQUEST between", value1, value2, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelayRequestNotBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_REQUEST not between", value1, value2, "delayRequest");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessIsNull() {
            addCriterion("DELAY_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessIsNotNull() {
            addCriterion("DELAY_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessEqualTo(Integer value) {
            addCriterion("DELAY_SUCCESS =", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessNotEqualTo(Integer value) {
            addCriterion("DELAY_SUCCESS <>", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessGreaterThan(Integer value) {
            addCriterion("DELAY_SUCCESS >", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELAY_SUCCESS >=", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessLessThan(Integer value) {
            addCriterion("DELAY_SUCCESS <", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessLessThanOrEqualTo(Integer value) {
            addCriterion("DELAY_SUCCESS <=", value, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessIn(List<Integer> values) {
            addCriterion("DELAY_SUCCESS in", values, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessNotIn(List<Integer> values) {
            addCriterion("DELAY_SUCCESS not in", values, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_SUCCESS between", value1, value2, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelaySuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_SUCCESS not between", value1, value2, "delaySuccess");
            return (Criteria) this;
        }

        public Criteria andDelayFailIsNull() {
            addCriterion("DELAY_FAIL is null");
            return (Criteria) this;
        }

        public Criteria andDelayFailIsNotNull() {
            addCriterion("DELAY_FAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDelayFailEqualTo(Integer value) {
            addCriterion("DELAY_FAIL =", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailNotEqualTo(Integer value) {
            addCriterion("DELAY_FAIL <>", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailGreaterThan(Integer value) {
            addCriterion("DELAY_FAIL >", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELAY_FAIL >=", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailLessThan(Integer value) {
            addCriterion("DELAY_FAIL <", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailLessThanOrEqualTo(Integer value) {
            addCriterion("DELAY_FAIL <=", value, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailIn(List<Integer> values) {
            addCriterion("DELAY_FAIL in", values, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailNotIn(List<Integer> values) {
            addCriterion("DELAY_FAIL not in", values, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_FAIL between", value1, value2, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayFailNotBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_FAIL not between", value1, value2, "delayFail");
            return (Criteria) this;
        }

        public Criteria andDelayIsNull() {
            addCriterion("DELAY is null");
            return (Criteria) this;
        }

        public Criteria andDelayIsNotNull() {
            addCriterion("DELAY is not null");
            return (Criteria) this;
        }

        public Criteria andDelayEqualTo(Float value) {
            addCriterion("DELAY =", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotEqualTo(Float value) {
            addCriterion("DELAY <>", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThan(Float value) {
            addCriterion("DELAY >", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThanOrEqualTo(Float value) {
            addCriterion("DELAY >=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThan(Float value) {
            addCriterion("DELAY <", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThanOrEqualTo(Float value) {
            addCriterion("DELAY <=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayIn(List<Float> values) {
            addCriterion("DELAY in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotIn(List<Float> values) {
            addCriterion("DELAY not in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayBetween(Float value1, Float value2) {
            addCriterion("DELAY between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotBetween(Float value1, Float value2) {
            addCriterion("DELAY not between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andNsaRequestIsNull() {
            addCriterion("NSA_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andNsaRequestIsNotNull() {
            addCriterion("NSA_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andNsaRequestEqualTo(Integer value) {
            addCriterion("NSA_REQUEST =", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestNotEqualTo(Integer value) {
            addCriterion("NSA_REQUEST <>", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestGreaterThan(Integer value) {
            addCriterion("NSA_REQUEST >", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestGreaterThanOrEqualTo(Integer value) {
            addCriterion("NSA_REQUEST >=", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestLessThan(Integer value) {
            addCriterion("NSA_REQUEST <", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestLessThanOrEqualTo(Integer value) {
            addCriterion("NSA_REQUEST <=", value, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestIn(List<Integer> values) {
            addCriterion("NSA_REQUEST in", values, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestNotIn(List<Integer> values) {
            addCriterion("NSA_REQUEST not in", values, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestBetween(Integer value1, Integer value2) {
            addCriterion("NSA_REQUEST between", value1, value2, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaRequestNotBetween(Integer value1, Integer value2) {
            addCriterion("NSA_REQUEST not between", value1, value2, "nsaRequest");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessIsNull() {
            addCriterion("NSA_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessIsNotNull() {
            addCriterion("NSA_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessEqualTo(Integer value) {
            addCriterion("NSA_SUCCESS =", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessNotEqualTo(Integer value) {
            addCriterion("NSA_SUCCESS <>", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessGreaterThan(Integer value) {
            addCriterion("NSA_SUCCESS >", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("NSA_SUCCESS >=", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessLessThan(Integer value) {
            addCriterion("NSA_SUCCESS <", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("NSA_SUCCESS <=", value, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessIn(List<Integer> values) {
            addCriterion("NSA_SUCCESS in", values, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessNotIn(List<Integer> values) {
            addCriterion("NSA_SUCCESS not in", values, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessBetween(Integer value1, Integer value2) {
            addCriterion("NSA_SUCCESS between", value1, value2, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("NSA_SUCCESS not between", value1, value2, "nsaSuccess");
            return (Criteria) this;
        }

        public Criteria andNsaFailIsNull() {
            addCriterion("NSA_FAIL is null");
            return (Criteria) this;
        }

        public Criteria andNsaFailIsNotNull() {
            addCriterion("NSA_FAIL is not null");
            return (Criteria) this;
        }

        public Criteria andNsaFailEqualTo(Integer value) {
            addCriterion("NSA_FAIL =", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailNotEqualTo(Integer value) {
            addCriterion("NSA_FAIL <>", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailGreaterThan(Integer value) {
            addCriterion("NSA_FAIL >", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("NSA_FAIL >=", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailLessThan(Integer value) {
            addCriterion("NSA_FAIL <", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailLessThanOrEqualTo(Integer value) {
            addCriterion("NSA_FAIL <=", value, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailIn(List<Integer> values) {
            addCriterion("NSA_FAIL in", values, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailNotIn(List<Integer> values) {
            addCriterion("NSA_FAIL not in", values, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailBetween(Integer value1, Integer value2) {
            addCriterion("NSA_FAIL between", value1, value2, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andNsaFailNotBetween(Integer value1, Integer value2) {
            addCriterion("NSA_FAIL not between", value1, value2, "nsaFail");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andThroughputUlIsNull() {
            addCriterion("THROUGHPUT_UL is null");
            return (Criteria) this;
        }

        public Criteria andThroughputUlIsNotNull() {
            addCriterion("THROUGHPUT_UL is not null");
            return (Criteria) this;
        }

        public Criteria andThroughputUlEqualTo(Integer value) {
            addCriterion("THROUGHPUT_UL =", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlNotEqualTo(Integer value) {
            addCriterion("THROUGHPUT_UL <>", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlGreaterThan(Integer value) {
            addCriterion("THROUGHPUT_UL >", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlGreaterThanOrEqualTo(Integer value) {
            addCriterion("THROUGHPUT_UL >=", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlLessThan(Integer value) {
            addCriterion("THROUGHPUT_UL <", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlLessThanOrEqualTo(Integer value) {
            addCriterion("THROUGHPUT_UL <=", value, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlIn(List<Integer> values) {
            addCriterion("THROUGHPUT_UL in", values, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlNotIn(List<Integer> values) {
            addCriterion("THROUGHPUT_UL not in", values, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlBetween(Integer value1, Integer value2) {
            addCriterion("THROUGHPUT_UL between", value1, value2, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputUlNotBetween(Integer value1, Integer value2) {
            addCriterion("THROUGHPUT_UL not between", value1, value2, "throughputUl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlIsNull() {
            addCriterion("THROUGHPUT_DL is null");
            return (Criteria) this;
        }

        public Criteria andThroughputDlIsNotNull() {
            addCriterion("THROUGHPUT_DL is not null");
            return (Criteria) this;
        }

        public Criteria andThroughputDlEqualTo(Integer value) {
            addCriterion("THROUGHPUT_DL =", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlNotEqualTo(Integer value) {
            addCriterion("THROUGHPUT_DL <>", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlGreaterThan(Integer value) {
            addCriterion("THROUGHPUT_DL >", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlGreaterThanOrEqualTo(Integer value) {
            addCriterion("THROUGHPUT_DL >=", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlLessThan(Integer value) {
            addCriterion("THROUGHPUT_DL <", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlLessThanOrEqualTo(Integer value) {
            addCriterion("THROUGHPUT_DL <=", value, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlIn(List<Integer> values) {
            addCriterion("THROUGHPUT_DL in", values, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlNotIn(List<Integer> values) {
            addCriterion("THROUGHPUT_DL not in", values, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlBetween(Integer value1, Integer value2) {
            addCriterion("THROUGHPUT_DL between", value1, value2, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andThroughputDlNotBetween(Integer value1, Integer value2) {
            addCriterion("THROUGHPUT_DL not between", value1, value2, "throughputDl");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("TIME not between", value1, value2, "time");
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