package org.data.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguodong
 */
public final class POIExcelUtil {

    private POIExcelUtil(){}

    public static void main(String[] args) throws IOException {
        String path = "D:\\test.xlsx";
        getDataList(path,0,2,1);
    }

    @Test
    public void testPOI()  {
        String spath = "D:\\test.xlsx";
        try {
            getDataList(spath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<List<String>> getDataList(String path) throws IOException{
        return getDataList(path, 1, 3,1);
    }

    /**
     *
     * @param path 文件路径
     * @param initColumn 起始列
     * @param columnSize 数据总列数
     * @param initRow 起始行
     * @return
     * @throws IOException
     */
    @SuppressWarnings({ "resource", "unused" })
    public static List<List<String>> getDataList(String path, int initColumn, int columnSize, int initRow) throws IOException {

        XSSFWorkbook xssfWorkbook = null;
        File excelFile = new File(path);
        InputStream is = new FileInputStream(excelFile);
        xssfWorkbook = new XSSFWorkbook(is);

        if(xssfWorkbook==null){
//            return null;
        }

        List<List<String>> ans= new ArrayList<>();

        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if (xssfSheet == null) {
                continue;
            }
            for (int rowNum = initRow; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow == null) {
                    continue;
                }
                ArrayList<String> curarr=new ArrayList<String>();
                for(int columnNum = initColumn ; columnNum < columnSize ; columnNum++){
                    XSSFCell cell = xssfRow.getCell(columnNum);

                    curarr.add( Trim_str( getValue(cell) ) );
                }
                ans.add(curarr);
            }
        }


        for(List<String> a : ans) {
            for(String s : a) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
        return ans;
    }

    @SuppressWarnings({ "deprecation", "static-access" })
    private static String getValue(XSSFCell xssfRow) {
        if(xssfRow==null){
            return "---";
        }
        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            double cur=xssfRow.getNumericCellValue();
            long longVal = Math.round(cur);
            Object inputValue = null;
            if(Double.parseDouble(longVal + ".0") == cur) {
                inputValue = longVal;
            }else {
                inputValue = cur;
            }
            return String.valueOf(inputValue);
        } else if(xssfRow.getCellType() == xssfRow.CELL_TYPE_BLANK || xssfRow.getCellType() == xssfRow.CELL_TYPE_ERROR){
            return "---";
        }
        else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }

    @SuppressWarnings({ "deprecation", "unused", "static-access" })
    private static String getValue(HSSFCell hssfCell) {
        if(hssfCell==null){
            return "---";
        }
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            double cur=hssfCell.getNumericCellValue();
            long longVal = Math.round(cur);
            Object inputValue = null;
            if(Double.parseDouble(longVal + ".0") == cur) {
                inputValue = longVal;
            }else {
                inputValue = cur;
            }
            return String.valueOf(inputValue);
        } else if(hssfCell.getCellType() == hssfCell.CELL_TYPE_BLANK || hssfCell.getCellType() == hssfCell.CELL_TYPE_ERROR){
            return "---";
        }
        else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }

    static private String Trim_str(String str){
        if(str==null) {
            return null;
        }
        return str.replaceAll("[\\s\\?]", "").replace(" ", "");
    }
}
