package com.topisv.wms.output.basic.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContainerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContainerPOExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContainerCodeIsNull() {
            addCriterion("container_code is null");
            return (Criteria) this;
        }

        public Criteria andContainerCodeIsNotNull() {
            addCriterion("container_code is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCodeEqualTo(String value) {
            addCriterion("container_code =", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeNotEqualTo(String value) {
            addCriterion("container_code <>", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeGreaterThan(String value) {
            addCriterion("container_code >", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("container_code >=", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeLessThan(String value) {
            addCriterion("container_code <", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeLessThanOrEqualTo(String value) {
            addCriterion("container_code <=", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeLike(String value) {
            addCriterion("container_code like", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeNotLike(String value) {
            addCriterion("container_code not like", value, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeIn(List<String> values) {
            addCriterion("container_code in", values, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeNotIn(List<String> values) {
            addCriterion("container_code not in", values, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeBetween(String value1, String value2) {
            addCriterion("container_code between", value1, value2, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerCodeNotBetween(String value1, String value2) {
            addCriterion("container_code not between", value1, value2, "containerCode");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andUseBatchIsNull() {
            addCriterion("use_batch is null");
            return (Criteria) this;
        }

        public Criteria andUseBatchIsNotNull() {
            addCriterion("use_batch is not null");
            return (Criteria) this;
        }

        public Criteria andUseBatchEqualTo(String value) {
            addCriterion("use_batch =", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchNotEqualTo(String value) {
            addCriterion("use_batch <>", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchGreaterThan(String value) {
            addCriterion("use_batch >", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchGreaterThanOrEqualTo(String value) {
            addCriterion("use_batch >=", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchLessThan(String value) {
            addCriterion("use_batch <", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchLessThanOrEqualTo(String value) {
            addCriterion("use_batch <=", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchLike(String value) {
            addCriterion("use_batch like", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchNotLike(String value) {
            addCriterion("use_batch not like", value, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchIn(List<String> values) {
            addCriterion("use_batch in", values, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchNotIn(List<String> values) {
            addCriterion("use_batch not in", values, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchBetween(String value1, String value2) {
            addCriterion("use_batch between", value1, value2, "useBatch");
            return (Criteria) this;
        }

        public Criteria andUseBatchNotBetween(String value1, String value2) {
            addCriterion("use_batch not between", value1, value2, "useBatch");
            return (Criteria) this;
        }

        public Criteria andContainerStatusIsNull() {
            addCriterion("container_status is null");
            return (Criteria) this;
        }

        public Criteria andContainerStatusIsNotNull() {
            addCriterion("container_status is not null");
            return (Criteria) this;
        }

        public Criteria andContainerStatusEqualTo(String value) {
            addCriterion("container_status =", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusNotEqualTo(String value) {
            addCriterion("container_status <>", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusGreaterThan(String value) {
            addCriterion("container_status >", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("container_status >=", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusLessThan(String value) {
            addCriterion("container_status <", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusLessThanOrEqualTo(String value) {
            addCriterion("container_status <=", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusLike(String value) {
            addCriterion("container_status like", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusNotLike(String value) {
            addCriterion("container_status not like", value, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusIn(List<String> values) {
            addCriterion("container_status in", values, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusNotIn(List<String> values) {
            addCriterion("container_status not in", values, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusBetween(String value1, String value2) {
            addCriterion("container_status between", value1, value2, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andContainerStatusNotBetween(String value1, String value2) {
            addCriterion("container_status not between", value1, value2, "containerStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerIsNull() {
            addCriterion("create_owner is null");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerIsNotNull() {
            addCriterion("create_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerEqualTo(String value) {
            addCriterion("create_owner =", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerNotEqualTo(String value) {
            addCriterion("create_owner <>", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerGreaterThan(String value) {
            addCriterion("create_owner >", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("create_owner >=", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerLessThan(String value) {
            addCriterion("create_owner <", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerLessThanOrEqualTo(String value) {
            addCriterion("create_owner <=", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerLike(String value) {
            addCriterion("create_owner like", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerNotLike(String value) {
            addCriterion("create_owner not like", value, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerIn(List<String> values) {
            addCriterion("create_owner in", values, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerNotIn(List<String> values) {
            addCriterion("create_owner not in", values, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerBetween(String value1, String value2) {
            addCriterion("create_owner between", value1, value2, "createOwner");
            return (Criteria) this;
        }

        public Criteria andCreateOwnerNotBetween(String value1, String value2) {
            addCriterion("create_owner not between", value1, value2, "createOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerIsNull() {
            addCriterion("update_owner is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerIsNotNull() {
            addCriterion("update_owner is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerEqualTo(String value) {
            addCriterion("update_owner =", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerNotEqualTo(String value) {
            addCriterion("update_owner <>", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerGreaterThan(String value) {
            addCriterion("update_owner >", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("update_owner >=", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerLessThan(String value) {
            addCriterion("update_owner <", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerLessThanOrEqualTo(String value) {
            addCriterion("update_owner <=", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerLike(String value) {
            addCriterion("update_owner like", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerNotLike(String value) {
            addCriterion("update_owner not like", value, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerIn(List<String> values) {
            addCriterion("update_owner in", values, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerNotIn(List<String> values) {
            addCriterion("update_owner not in", values, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerBetween(String value1, String value2) {
            addCriterion("update_owner between", value1, value2, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andUpdateOwnerNotBetween(String value1, String value2) {
            addCriterion("update_owner not between", value1, value2, "updateOwner");
            return (Criteria) this;
        }

        public Criteria andOptimisticIsNull() {
            addCriterion("optimistic is null");
            return (Criteria) this;
        }

        public Criteria andOptimisticIsNotNull() {
            addCriterion("optimistic is not null");
            return (Criteria) this;
        }

        public Criteria andOptimisticEqualTo(Integer value) {
            addCriterion("optimistic =", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticNotEqualTo(Integer value) {
            addCriterion("optimistic <>", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticGreaterThan(Integer value) {
            addCriterion("optimistic >", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticGreaterThanOrEqualTo(Integer value) {
            addCriterion("optimistic >=", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticLessThan(Integer value) {
            addCriterion("optimistic <", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticLessThanOrEqualTo(Integer value) {
            addCriterion("optimistic <=", value, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticIn(List<Integer> values) {
            addCriterion("optimistic in", values, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticNotIn(List<Integer> values) {
            addCriterion("optimistic not in", values, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticBetween(Integer value1, Integer value2) {
            addCriterion("optimistic between", value1, value2, "optimistic");
            return (Criteria) this;
        }

        public Criteria andOptimisticNotBetween(Integer value1, Integer value2) {
            addCriterion("optimistic not between", value1, value2, "optimistic");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNull() {
            addCriterion("location_code is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("location_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("location_code =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("location_code <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("location_code >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("location_code >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("location_code <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("location_code <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("location_code like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("location_code not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("location_code in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("location_code not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("location_code between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("location_code not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIsNull() {
            addCriterion("shelf_code is null");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIsNotNull() {
            addCriterion("shelf_code is not null");
            return (Criteria) this;
        }

        public Criteria andShelfCodeEqualTo(String value) {
            addCriterion("shelf_code =", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotEqualTo(String value) {
            addCriterion("shelf_code <>", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeGreaterThan(String value) {
            addCriterion("shelf_code >", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_code >=", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLessThan(String value) {
            addCriterion("shelf_code <", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLessThanOrEqualTo(String value) {
            addCriterion("shelf_code <=", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLike(String value) {
            addCriterion("shelf_code like", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotLike(String value) {
            addCriterion("shelf_code not like", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIn(List<String> values) {
            addCriterion("shelf_code in", values, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotIn(List<String> values) {
            addCriterion("shelf_code not in", values, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeBetween(String value1, String value2) {
            addCriterion("shelf_code between", value1, value2, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotBetween(String value1, String value2) {
            addCriterion("shelf_code not between", value1, value2, "shelfCode");
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