package freight.controller.invoice;

import freight.service.invoice.se_invoice_service;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/24</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class statistics_invoice {
    @Resource
    private se_invoice_service service;
    @ResponseBody
    @RequestMapping(value = "/statistics/invoice/invoice",method = RequestMethod.GET)
    public void st_invoice(HttpServletResponse response){
        List<Map> list=service.se_invoice_all();
        HSSFWorkbook wb=new HSSFWorkbook();
        HSSFSheet sheet=wb.createSheet("sheet1");
        HSSFRow row=sheet.createRow(0);
        HSSFCell cell1=row.createCell(0);
        HSSFCell cell2=row.createCell(1);
        HSSFCell cell3=row.createCell(2);
        HSSFCell cell4=row.createCell(3);
        HSSFCell cell5=row.createCell(4);
        HSSFCell cell6=row.createCell(5);
        HSSFCell cell7=row.createCell(6);
        HSSFCell cell8=row.createCell(7);
        HSSFCell cell9=row.createCell(8);
        HSSFCell cell10=row.createCell(9);
        HSSFCell cell11=row.createCell(10);
        cell1.setCellValue("Trans ID");
        cell2.setCellValue("Type");
        cell3.setCellValue("Date");
        cell4.setCellValue("Contact Name");
        cell5.setCellValue("Contact Reference");
        cell6.setCellValue("Invoice Number");
        cell7.setCellValue("Ref");
        cell8.setCellValue("Details");
        cell9.setCellValue("Net");
        cell10.setCellValue("VAT");
        cell11.setCellValue("Total");
        for (int i=1;i<list.size();i++){
            HSSFRow row1=sheet.createRow(i);
            HSSFCell Cell1=row1.createCell(0);
            Cell1.setCellValue((String) list.get(i-1).get("id"));
            HSSFCell Cell2=row1.createCell(1);
            Cell2.setCellValue((String) list.get(i-1).get("type"));
            HSSFCell Cell3=row1.createCell(2);
            Cell3.setCellValue((String) list.get(i-1).get("date"));
            HSSFCell Cell4=row1.createCell(3);
            Cell4.setCellValue((String) list.get(i-1).get("name"));
//            HSSFCell Cell5=row1.createCell(4);
//            Cell5.setCellValue((String) list.get(i-1).get("type"));
            HSSFCell Cell6=row1.createCell(5);
            Cell6.setCellValue((String) list.get(i-1).get("invoiceno"));
            HSSFCell Cell7=row1.createCell(6);
            Cell7.setCellValue((String) list.get(i-1).get("ref"));
//            HSSFCell Cell8=row1.createCell(7);
//            Cell8.setCellValue((String) list.get(i-1).get(""));
            HSSFCell Cell9=row1.createCell(8);
            Cell9.setCellValue((String) list.get(i-1).get("Net"));
            HSSFCell Cell10=row1.createCell(9);
            Cell10.setCellValue((String) list.get(i-1).get("VAT"));
            HSSFCell Cell11=row1.createCell(10);
            Cell11.setCellValue((String) list.get(i-1).get("total"));
        }
        response.setContentType("application/vnd.ms-excel; charset=utf-8");
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            wb.write(outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
