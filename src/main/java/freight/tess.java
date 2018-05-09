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
//        POIFSFileSystem fs=new POIFSFileSystem(new FileInputStream(ex));
//        HSSFWorkbook wb=new HSSFWorkbook(fs);
//        HSSFSheet sheet=wb.getSheetAt(0);
//        HSSFCell cell1=sheet.getRow(9).getCell(3);
//        cell1.setCellValue(222);
//        HSSFCell cell2=sheet.getRow(18).getCell(2);
//        cell2.setCellValue(222222);
//        FileOutputStream out=new  FileOutputStream("src/main/invoice1.xls");
//        wb.write(out);
//        out.close();
        InputStream in=new FileInputStream(ex);
        XSSFWorkbook wb=new XSSFWorkbook(in);
        XSSFSheet sheet=wb.getSheetAt(0);
        XSSFCell cell = sheet.getRow(8).getCell(2);
        cell.setCellValue("qqqqqqqq");
        FileOutputStream out=new FileOutputStream("src/main/invoice1.xlsx");
        wb.write(out);
        out.close();
    }
}
