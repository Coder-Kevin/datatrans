package org.data.execute.impl;

import org.data.common.util.ConnectionUtil;
import org.data.execute.AbstractSqlExecutor;
import org.data.model.DataSourceConfig;
import org.data.model.DataTransConfig;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

public class JdbcSqlExecutor extends AbstractSqlExecutor {

    private DataTransConfig dataTransConfig;

    private DataSourceConfig dataSourceConfig;

    public JdbcSqlExecutor(DataTransConfig dataTransConfig, DataSourceConfig dataSourceConfig){
        this.dataTransConfig = dataTransConfig;
        this.dataSourceConfig = dataSourceConfig;
    }

    @Override
    public List<List<String>> getData() {
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(dataTransConfig.getDataSqlContent());
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()){
                // TODO
//                ResultSetMetaData metaData = resultSet.getMetaData();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String executeSql() {
        return null;
    }

    @Override
    public int[] indexArrays() {
        return new int[0];
    }

    @Override
    public Class[] paramsTypeArrays() {
        return new Class[0];
    }

    @Override
    public Connection getConnection() {
        return ConnectionUtil.getConnection(dataSourceConfig);
    }
}
