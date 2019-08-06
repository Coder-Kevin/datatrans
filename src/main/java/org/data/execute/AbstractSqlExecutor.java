package org.data.execute;

import org.apache.commons.collections4.CollectionUtils;
import org.data.consts.CommonConstants;
import org.data.util.FileUtils;
import org.data.util.StringUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractSqlExecutor {

    public abstract List<List<String>> getData();

    public abstract String executeSql();

    public abstract int[] indexArrays();

    public abstract Class[] paramsTypeArrays();

    public void execute(boolean isWriteFile){

        int[] indexs = indexArrays();
        if(null == indexs || indexs.length == 0){
            throw new IllegalArgumentException("数据源角标数组不能为空");
        }

        String sql = executeSql();
        if(StringUtil.isEmpty(sql)){
            throw new IllegalArgumentException("执行sql模板不能为空");
        }

        List<List<String>> list = getData();
        if(CollectionUtils.isEmpty(list)){
            throw new IllegalArgumentException("数据源为空");
        }

        Class[] classes = paramsTypeArrays();

        Connection conn = null;
        Statement state = null;
        try {
            Class.forName(CommonConstants.DRIVER_MYSQL);
            conn = DriverManager.getConnection(CommonConstants.URL, CommonConstants.USER_NAME, CommonConstants.PASSWORD);
            state = conn.createStatement();
            conn.setAutoCommit(false);



            StringBuilder countryBuilder = new StringBuilder();
            for(List<String> data : list) {
                String nSql = sql;
                for(int i=0;i<indexs.length;i++){
                    if(classes[i].equals(Integer.class)){
                        Integer seq = StringUtil.isNotEmpty(data.get(indexs[i])) ? Integer.valueOf(data.get(indexs[i])) : 0;

                        nSql = nSql.replaceAll("\\{"+i+"\\}", seq.toString());
                    }else{
                        nSql = nSql.replaceAll("\\{"+i+"\\}", data.get(indexs[i]));
                    }
                }
                countryBuilder.append(nSql).append(";").append("\r\n");
                state.addBatch(nSql);
            }

            if(isWriteFile) {
                FileUtils.writeFile("d:\\country_20180706.txt", countryBuilder.toString());
            }

            state.executeBatch();
            conn.commit();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("回滚出错！");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if(state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
