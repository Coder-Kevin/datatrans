package org.data.web.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
public class DataSourceConfigVo implements Serializable {

    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.DATA_SOURCE_KEY
     *
     * @mbg.generated
     */
    @NotEmpty(message = "数据源键不能为空")
    private String dataSourceKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.URL
     *
     * @mbg.generated
     */
    @NotEmpty(message = "数据源URL不能为空")
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.USER_NAME
     *
     * @mbg.generated
     */
    @NotEmpty(message = "数据源用户名不能为空")
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.DRIVER_CLASS_NAME
     *
     * @mbg.generated
     */
    private String driverClassName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.CREATE_USER
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_source_config.UPDATE_USER
     *
     * @mbg.generated
     */
    private String updateUser;

}