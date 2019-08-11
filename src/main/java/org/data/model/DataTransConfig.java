package org.data.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class DataTransConfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.ID
     *
     * @mbg.generated
     */
    @TableField(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.DATA_TRANS_CODE
     *
     * @mbg.generated
     */
    private String dataTransCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.DATA_SOURCE_CODE
     *
     * @mbg.generated
     */
    private String dataSourceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.DATA_TRANS_TYPE
     *
     * @mbg.generated
     */
    private String dataTransType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.DATA_TRANS_ORDER
     *
     * @mbg.generated
     */
    private Integer dataTransOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.CREATE_USER
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.UPDATE_USER
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.DATA_SQL_CONTENT
     *
     * @mbg.generated
     */
    private String dataSqlContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_trans_config.TRANS_SQL_CONTENT
     *
     * @mbg.generated
     */
    private String transSqlContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.ID
     *
     * @return the value of data_trans_config.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.ID
     *
     * @param id the value for data_trans_config.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.DATA_TRANS_CODE
     *
     * @return the value of data_trans_config.DATA_TRANS_CODE
     *
     * @mbg.generated
     */
    public String getDataTransCode() {
        return dataTransCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.DATA_TRANS_CODE
     *
     * @param dataTransCode the value for data_trans_config.DATA_TRANS_CODE
     *
     * @mbg.generated
     */
    public void setDataTransCode(String dataTransCode) {
        this.dataTransCode = dataTransCode == null ? null : dataTransCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.DATA_SOURCE_CODE
     *
     * @return the value of data_trans_config.DATA_SOURCE_CODE
     *
     * @mbg.generated
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.DATA_SOURCE_CODE
     *
     * @param dataSourceCode the value for data_trans_config.DATA_SOURCE_CODE
     *
     * @mbg.generated
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode == null ? null : dataSourceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.DATA_TRANS_TYPE
     *
     * @return the value of data_trans_config.DATA_TRANS_TYPE
     *
     * @mbg.generated
     */
    public String getDataTransType() {
        return dataTransType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.DATA_TRANS_TYPE
     *
     * @param dataTransType the value for data_trans_config.DATA_TRANS_TYPE
     *
     * @mbg.generated
     */
    public void setDataTransType(String dataTransType) {
        this.dataTransType = dataTransType == null ? null : dataTransType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.DATA_TRANS_ORDER
     *
     * @return the value of data_trans_config.DATA_TRANS_ORDER
     *
     * @mbg.generated
     */
    public Integer getDataTransOrder() {
        return dataTransOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.DATA_TRANS_ORDER
     *
     * @param dataTransOrder the value for data_trans_config.DATA_TRANS_ORDER
     *
     * @mbg.generated
     */
    public void setDataTransOrder(Integer dataTransOrder) {
        this.dataTransOrder = dataTransOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.CREATE_USER
     *
     * @return the value of data_trans_config.CREATE_USER
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.CREATE_USER
     *
     * @param createUser the value for data_trans_config.CREATE_USER
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.CREATE_TIME
     *
     * @return the value of data_trans_config.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.CREATE_TIME
     *
     * @param createTime the value for data_trans_config.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.UPDATE_USER
     *
     * @return the value of data_trans_config.UPDATE_USER
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.UPDATE_USER
     *
     * @param updateUser the value for data_trans_config.UPDATE_USER
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.UPDATE_TIME
     *
     * @return the value of data_trans_config.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.UPDATE_TIME
     *
     * @param updateTime the value for data_trans_config.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.DATA_SQL_CONTENT
     *
     * @return the value of data_trans_config.DATA_SQL_CONTENT
     *
     * @mbg.generated
     */
    public String getDataSqlContent() {
        return dataSqlContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.DATA_SQL_CONTENT
     *
     * @param dataSqlContent the value for data_trans_config.DATA_SQL_CONTENT
     *
     * @mbg.generated
     */
    public void setDataSqlContent(String dataSqlContent) {
        this.dataSqlContent = dataSqlContent == null ? null : dataSqlContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_trans_config.TRANS_SQL_CONTENT
     *
     * @return the value of data_trans_config.TRANS_SQL_CONTENT
     *
     * @mbg.generated
     */
    public String getTransSqlContent() {
        return transSqlContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_trans_config.TRANS_SQL_CONTENT
     *
     * @param transSqlContent the value for data_trans_config.TRANS_SQL_CONTENT
     *
     * @mbg.generated
     */
    public void setTransSqlContent(String transSqlContent) {
        this.transSqlContent = transSqlContent == null ? null : transSqlContent.trim();
    }
}