package freight;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * <p>创建时间: 2018/5/5</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class tess {
    public static void  main(String[] args) throws IOException {
        File ex=new File("src/main/invoice.xlsx");
        InputStream in=new FileInputStream(ex);
        XSSFWorkbook wb=new XSSFWorkbook(in);
        XSSFSheet sheet=wb.getSheetAt(0);
        XSSFCell cell1 = sheet.getRow(8).getCell(2);
        cell1.setCellValue("qqqqqqqq");
        XSSFCell cell2=sheet.getRow(8).getCell(6);
        cell2.setCellValue("Invoice Number:"+"1212121");
        XSSFCell cell3=sheet.getRow(9).getCell(6);
        cell3.setCellValue("Invoice Number:"+"11/22/2019");
        XSSFCell cell4=sheet.getRow(13).getCell(1);
        cell4.setCellValue("000-00009999");
        XSSFCell cell5=sheet.getRow(13).getCell(4);
        cell5.setCellValue("sss");
        XSSFCell cell6=sheet.getRow(13).getCell(6);
        cell6.setCellValue("hhh");
        FileOutputStream out=new FileOutputStream("src/main/invoice1.xlsx");
        wb.write(out);
        out.close();
    }
}
