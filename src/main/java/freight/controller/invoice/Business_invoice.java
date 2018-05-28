package freight.controller.invoice;

import freight.service.invoice.se_invoice_service;
import freight.util.other.countnum;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/24</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class Business_invoice {
    @Resource
    private se_invoice_service service;
    @ResponseBody
    @RequestMapping(value = "/business/invoice/invoice",method = RequestMethod.POST)
    public void st_invoice(@RequestBody Map map,HttpServletResponse response){
        String year= (String) map.get("year");
        Map querymap=new HashMap();
        if(year!=null&year!=""){
            String date1=year+"-01-01";
            String date2=year+"-12-31";
            querymap.put("date1",date1);
            querymap.put("date2",date2);
        }
        List<Map> list=service.se_invoice_all(querymap);
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
        for (int i=1;i<list.size()+1;i++){
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
    @ResponseBody
    @RequestMapping(value = "/business/invoice/debtors",method = RequestMethod.POST)
    public void deb_invoice(@RequestBody Map map,HttpServletResponse response){
        List<Map> resultlist=service.se_debtors(map);
        HSSFWorkbook wb=new HSSFWorkbook();
        HSSFSheet sheet=wb.createSheet("sheet1");
        HSSFRow Row=sheet.createRow(0);
        HSSFCell Cell1=Row.createCell(0);
        HSSFCell Cell2=Row.createCell(1);
        Cell1.setCellValue("Date");
        Cell2.setCellValue((String) map.get("time"));
        HSSFRow Row1=sheet.createRow(1);
        HSSFCell Cell3=Row1.createCell(0);
        HSSFCell Cell4=Row1.createCell(1);
        HSSFCell Cell5=Row1.createCell(2);
        HSSFCell Cell6=Row1.createCell(3);
        HSSFCell Cell7=Row1.createCell(4);
        HSSFCell Cell8=Row1.createCell(5);
        HSSFCell Cell9=Row1.createCell(6);
        HSSFCell Cell10=Row1.createCell(7);
        HSSFCell Cell11=Row1.createCell(8);
        HSSFCell Cell12=Row1.createCell(9);
        HSSFCell Cell13=Row1.createCell(10);
        Cell3.setCellValue("0");
        Cell4.setCellValue("Date");
        Cell5.setCellValue("Reference");
        Cell6.setCellValue("Total");
        Cell7.setCellValue("Due Date");
        Cell8.setCellValue("O/S Amt");
        Cell9.setCellValue("< 30 days");
        Cell10.setCellValue("< 60 days");
        Cell11.setCellValue("< 90 days");
        Cell12.setCellValue("< 120 days");
        Cell13.setCellValue("Older");
        for(int i=0;i<resultlist.size();i++){
            int count= countnum.count(i,resultlist);
            Map resultmap=resultlist.get(i);
            String name=resultmap.get("name")+",Terms:30 days - OVERDUE";
            HSSFCell cell=sheet.createRow(count).createCell(0);
            cell.setCellValue(name);
            List<Map> list1= (List<Map>) resultmap.get("120");
            List<Map> list2= (List<Map>) resultmap.get("90");
            List<Map> list3= (List<Map>) resultmap.get("60");
            List<Map> list4= (List<Map>) resultmap.get("30");
            for (int j=0;j<list1.size();j++){
                HSSFCell cell1=sheet.createRow(count+1).createCell(1);
                HSSFCell cell2=sheet.createRow(count+1).createCell(2);
                HSSFCell cell3=sheet.createRow(count+1).createCell(3);
                HSSFCell cell4=sheet.createRow(count+1).createCell(4);
                HSSFCell cell5=sheet.createRow(count+1).createCell(5);
                HSSFCell cell6=sheet.createRow(count+1).createCell(9);
                cell1.setCellValue(list1.get(j).get("date").toString());
                cell2.setCellValue((String) list1.get(j).get("invoice_no"));
                cell3.setCellValue((Double) list1.get(j).get("total"));
                cell4.setCellValue(list1.get(j).get("duetime").toString());
                cell5.setCellValue((Double) list1.get(j).get("total"));
                cell6.setCellValue((Double) list1.get(j).get("total"));
            }
            for (int j=0;j<list2.size();j++){
                HSSFCell cell1=sheet.createRow(list1.size()+count+1).createCell(1);
                HSSFCell cell2=sheet.createRow(list1.size()+count+1).createCell(2);
                HSSFCell cell3=sheet.createRow(list1.size()+count+1).createCell(3);
                HSSFCell cell4=sheet.createRow(list1.size()+count+1).createCell(4);
                HSSFCell cell5=sheet.createRow(list1.size()+count+1).createCell(5);
                HSSFCell cell6=sheet.createRow(list1.size()+count+1).createCell(8);
                cell1.setCellValue(list2.get(j).get("date").toString());
                cell2.setCellValue((String) list2.get(j).get("invoice_no"));
                cell3.setCellValue((Double) list2.get(j).get("total"));
                cell4.setCellValue(list2.get(j).get("duetime").toString());
                cell5.setCellValue((Double) list2.get(j).get("total"));
                cell6.setCellValue((Double) list2.get(j).get("total"));
            }
            for (int j=0;j<list3.size();j++){
                HSSFCell cell1=sheet.createRow(list1.size()+list2.size()+count+1).createCell(1);
                HSSFCell cell2=sheet.createRow(list1.size()+list2.size()+count+1).createCell(2);
                HSSFCell cell3=sheet.createRow(list1.size()+list2.size()+count+1).createCell(3);
                HSSFCell cell4=sheet.createRow(list1.size()+list2.size()+count+1).createCell(4);
                HSSFCell cell5=sheet.createRow(list1.size()+list2.size()+count+1).createCell(5);
                HSSFCell cell6=sheet.createRow(list1.size()+list2.size()+count+1).createCell(7);
                cell1.setCellValue(list3.get(j).get("date").toString());
                cell2.setCellValue((String) list3.get(j).get("invoice_no"));
                cell3.setCellValue((Double) list3.get(j).get("total"));
                cell4.setCellValue(list3.get(j).get("duetime").toString());
                cell5.setCellValue((Double) list3.get(j).get("total"));
                cell6.setCellValue((Double) list3.get(j).get("total"));
            }
            for (int j=0;j<list4.size();j++) {
                HSSFCell cell1 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(1);
                HSSFCell cell2 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(2);
                HSSFCell cell3 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(3);
                HSSFCell cell4 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(4);
                HSSFCell cell5 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(5);
                HSSFCell cell6 = sheet.createRow(list1.size() + list2.size() + list3.size() + count + 1).createCell(6);
                cell1.setCellValue(list4.get(j).get("date").toString());
                cell2.setCellValue((String) list4.get(j).get("invoice_no"));
                cell3.setCellValue((Double) list4.get(j).get("total"));
                cell4.setCellValue(list4.get(j).get("duetime").toString());
                cell5.setCellValue((Double) list4.get(j).get("total"));
                cell6.setCellValue((Double) list4.get(j).get("total"));
            }
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
