package org.data.execute;

import java.sql.Connection;
import java.util.List;

public interface SqlExecutor {

    List<List<String>> getData();

    String executeSql();

    int[] indexArrays();

    Class[] paramsTypeArrays();

    void execute(boolean isWriteFile);

    Connection getConnection();
}
