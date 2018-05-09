package freight.controller.invoice;


import freight.DO.Detail;
import freight.dao.invoice.se_invoice_dao;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/9</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class print_invoice {
    @Resource
    private se_invoice_dao dao;
    @ResponseBody
    @RequestMapping(value = "/print/invoice/invoice",method = RequestMethod.POST)
    public void print_invoice(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response){
        Map querymap=new HashMap();
        querymap.put("invoiceNo",map.get("invoiceNo"));
        List<Detail> list=dao.se_detail(querymap);
        String path=request.getSession().getServletContext().getRealPath("/")+"invoice.xlsx";
        File excel=new File(path);
        InputStream in= null;
        try {
            in = new FileInputStream(excel);
            XSSFWorkbook wb=new XSSFWorkbook(in);
            XSSFSheet sheet=wb.getSheetAt(0);
            XSSFCell cell1 = sheet.getRow(8).getCell(2);
            cell1.setCellValue((String) map.get("invoiceTo"));
            XSSFCell cell2=sheet.getRow(8).getCell(6);
            cell2.setCellValue("Invoice Number:"+map.get("invoiceNo"));
            XSSFCell cell3=sheet.getRow(9).getCell(6);
            cell3.setCellValue("Invoice Date:"+map.get("date"));
            XSSFCell cell4=sheet.getRow(13).getCell(1);
            cell4.setCellValue((String) map.get("billLaden"));
            XSSFCell cell5=sheet.getRow(13).getCell(4);
            cell5.setCellValue((String) map.get("origin"));
            XSSFCell cell6=sheet.getRow(13).getCell(6);
            cell6.setCellValue((String) map.get("dstn"));
            XSSFCell cell7=sheet.getRow(33).getCell(5);
            cell7.setCellValue((String) map.get("total"));
            XSSFCell cell8=sheet.getRow(15).getCell(1);
            cell8.setCellValue((String) map.get("nature"));
            XSSFCell cell9=sheet.getRow(11).getCell(7);
            cell9.setCellValue((String) map.get("terms"));
            for (int i=0;i<list.size();i++){
                XSSFCell cell10=sheet.getRow(i+17).getCell(1);
                cell10.setCellValue(list.get(i).getDescription());
                XSSFCell cell11=sheet.getRow(i+17).getCell(5);
                cell11.setCellValue(list.get(i).getAmount());
            }
            response.setHeader("Content-Disposition", "attachment;Filename=" + URLEncoder.encode("invoice.xlsx", "UTF-8"));
            response.setContentType("application/vnd.ms-excel; charset=utf-8") ;
            OutputStream outputStream = response.getOutputStream();
            wb.write(outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
