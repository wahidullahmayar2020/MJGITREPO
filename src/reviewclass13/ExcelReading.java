package reviewclass13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReading {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\Example2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> allData=new ArrayList<>();
        Map<String ,String> map;
        for (int i = 1; i < noOfRows; i++) {
            map=new LinkedHashMap<>();
            Row row=sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            allData.add(map);
            System.out.println();
        }
    }
}
