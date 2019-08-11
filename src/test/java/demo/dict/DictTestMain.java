package demo.dict;

import org.data.common.util.POIExcelUtil;
import org.data.execute.AbstractSqlExecutor;
import java.util.List;

public class DictTestMain extends AbstractSqlExecutor {

    public static void main(String[] args) {
        AbstractSqlExecutor abstractSqlExecutor = new DictTestMain();
        abstractSqlExecutor.execute(true);
    }

    @Override
    public List<List<String>> getData() {
        String path = "D:\\字段迁移.xlsx";
        try{
            return POIExcelUtil.getDataList(path,0,8,1);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String executeSql() {
        String sql = "INSERT INTO bt_data_dict_test (`DCT_KEY` ,`DCT_TP_CD` ,`DCT_TP_NM` ,`DCT_VAL` ,`DCT_VAL_NM` ,`DCT_GRP` ,`DCT_DSC` ,`DCT_SEQ` ,"
                + "`ST_CD` ,`CREATE_TIME` ,`CREATE_USER` ,`UPDATE_TIME` ,`UPDATE_USER` ,`DEL_IND` )  "
                + "VALUES("
                + "'{0}','{1}','{2}','{3}','{4}','','',{5},'1',CURRENT_TIMESTAMP,'root',CURRENT_TIMESTAMP,'root','0')";
        return sql;
    }

    @Override
    public int[] indexArrays() {
        int[] indexs = {0,1,2,3,4,7};
        return indexs;
    }

    @Override
    public Class[] paramsTypeArrays() {
        Class[] classType = {String.class,String.class,String.class,String.class,String.class,Integer.class};
        return classType;
    }
}

