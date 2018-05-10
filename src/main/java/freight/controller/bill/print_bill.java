package freight.controller.bill;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/10</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class print_bill {
    @ResponseBody
    @RequestMapping(value = "/print/bill/hawb",method = RequestMethod.POST)
    public void print_invoice(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response) {
        String path=request.getSession().getServletContext().getRealPath("/")+"hawb.xls";
        File excel=new File(path);
        InputStream in= null;
        try {
            in = new FileInputStream(excel);
            HSSFWorkbook wb=new HSSFWorkbook(in);
            HSSFSheet sheet=wb.getSheetAt(0);
            HSSFCell cell1=sheet.getRow(2).getCell(19);
            cell1.setCellValue((String) map.get("shipperNo"));
            HSSFCell cell2=sheet.getRow(3).getCell(0);
            cell2.setCellValue((String) map.get("shipper"));
            HSSFCell cell3=sheet.getRow(5).getCell(36);
            cell3.setCellValue((String) map.get("issuedBy"));
            HSSFCell cell4=sheet.getRow(11).getCell(19);
            cell4.setCellValue((String) map.get("consigneeNo"));
            HSSFCell cell5=sheet.getRow(12).getCell(0);
            cell5.setCellValue((String) map.get("consignee"));
            HSSFCell cell6=sheet.getRow(20).getCell(0);
            cell6.setCellValue((String) map.get("issuingCarrier"));
            HSSFCell cell7=sheet.getRow(26).getCell(0);
            cell7.setCellValue((String) map.get("agentIata"));
            HSSFCell cell8=sheet.getRow(26).getCell(19);
            cell8.setCellValue((String) map.get("accountNo"));
            HSSFCell cell9=sheet.getRow(29).getCell(0);
            cell9.setCellValue((String) map.get("airDeparture"));
            HSSFCell cell10=sheet.getRow(32).getCell(0);
            cell10.setCellValue((String) map.get("to1"));
            HSSFCell cell11=sheet.getRow(32).getCell(4);
            cell11.setCellValue((String) map.get("by1"));
            HSSFCell cell12=sheet.getRow(32).getCell(23);
            cell12.setCellValue((String) map.get("to2"));
            HSSFCell cell13=sheet.getRow(32).getCell(27);
            cell13.setCellValue((String) map.get("by2"));
            HSSFCell cell14=sheet.getRow(32).getCell(29);
            cell14.setCellValue((String) map.get("to3"));
            HSSFCell cell15=sheet.getRow(32).getCell(34);
            cell15.setCellValue((String) map.get("by3"));
            HSSFCell cell16=sheet.getRow(36).getCell(0);
            cell16.setCellValue((String) map.get("airDest"));
            HSSFCell cell17=sheet.getRow(36).getCell(19);
            cell17.setCellValue((String) map.get("flightNo"));
            HSSFCell cell18=sheet.getRow(36).getCell(27);
            cell18.setCellValue((String) map.get("flightDate"));
            HSSFCell cell19=sheet.getRow(20).getCell(36);
            cell19.setCellValue((String) map.get("accountInfo"));
            HSSFCell cell20=sheet.getRow(32).getCell(36);
            cell20.setCellValue((String) map.get("currency"));
            HSSFCell cell21=sheet.getRow(33).getCell(39);
            cell21.setCellValue((String) map.get("chgCode"));
            HSSFCell cell22=sheet.getRow(33).getCell(41);
            cell22.setCellValue((String) map.get("wtVal"));
            HSSFCell cell23=sheet.getRow(33).getCell(45);
            cell23.setCellValue((String) map.get("other"));
            HSSFCell cell24=sheet.getRow(32).getCell(49);
            cell24.setCellValue((String) map.get("declaredCarriage"));
            HSSFCell cell25=sheet.getRow(32).getCell(61);
            cell25.setCellValue((String) map.get("declaredCustoms"));
            HSSFCell cell26=sheet.getRow(36).getCell(36);
            cell26.setCellValue((String) map.get("amountInsurance"));
            HSSFCell cell27=sheet.getRow(39).getCell(0);
            cell27.setCellValue((String) map.get("handlingInfo"));
            HSSFCell cell28=sheet.getRow(43).getCell(61);
            cell28.setCellValue((String) map.get("sci"));
            HSSFCell cell29=sheet.getRow(47).getCell(0);
            cell29.setCellValue((String) map.get("noPieces"));
            HSSFCell cell30=sheet.getRow(47).getCell(4);
            cell30.setCellValue((String) map.get("grossWeight"));
            HSSFCell cell31=sheet.getRow(61).getCell(0);
            cell31.setCellValue((String) map.get("totalPieces"));
            HSSFCell cell32=sheet.getRow(61).getCell(4);
            cell32.setCellValue((String) map.get("totalWeight"));
            HSSFCell cell33=sheet.getRow(47).getCell(11);
            cell33.setCellValue((String) map.get("kgLb"));
            HSSFCell cell34=sheet.getRow(45).getCell(13);
            cell34.setCellValue((String) map.get("rateClass"));
            HSSFCell cell35=sheet.getRow(47).getCell(14);
            cell35.setCellValue((String) map.get("itemNo"));
            HSSFCell cell36=sheet.getRow(47).getCell(23);
            cell36.setCellValue((String) map.get("chargeWeight"));
            HSSFCell cell37=sheet.getRow(47).getCell(30);
            cell37.setCellValue((String) map.get("rate"));
            HSSFCell cell38=sheet.getRow(47).getCell(40);
            cell38.setCellValue((String) map.get("total1"));
            HSSFCell cell39=sheet.getRow(61).getCell(40);
            cell39.setCellValue((String) map.get("total2"));
            HSSFCell cell40=sheet.getRow(47).getCell(51);
            cell40.setCellValue((String) map.get("nature"));
            HSSFCell cell41=sheet.getRow(65).getCell(0);
            cell41.setCellValue((String) map.get("weightPpd"));
            HSSFCell cell42=sheet.getRow(65).getCell(14);
            cell42.setCellValue((String) map.get("weightColl"));
            HSSFCell cell43=sheet.getRow(68).getCell(0);
            cell43.setCellValue((String) map.get("valPpd"));
            HSSFCell cell44=sheet.getRow(68).getCell(14);
            cell44.setCellValue((String) map.get("valColl"));
            HSSFCell cell45=sheet.getRow(71).getCell(0);
            cell45.setCellValue((String) map.get("taxPpd"));
            HSSFCell cell46=sheet.getRow(71).getCell(14);
            cell46.setCellValue((String) map.get("taxColl"));
            HSSFCell cell47=sheet.getRow(74).getCell(0);
            cell47.setCellValue((String) map.get("agentPpd"));
            HSSFCell cell48=sheet.getRow(74).getCell(14);
            cell48.setCellValue((String) map.get("agentColl"));
            HSSFCell cell49=sheet.getRow(77).getCell(0);
            cell49.setCellValue((String) map.get("carrierPpd"));
            HSSFCell cell50=sheet.getRow(77).getCell(14);
            cell50.setCellValue((String) map.get("carrierColl"));
            HSSFCell cell51=sheet.getRow(83).getCell(0);
            cell51.setCellValue((String) map.get("totalPpd"));
            HSSFCell cell52=sheet.getRow(83).getCell(14);
            cell52.setCellValue((String) map.get("totalColl"));
            HSSFCell cell53=sheet.getRow(86).getCell(0);
            cell53.setCellValue((String) map.get("currencyRates"));
            HSSFCell cell54=sheet.getRow(86).getCell(14);
            cell54.setCellValue((String) map.get("destCurrency"));
            HSSFCell cell55=sheet.getRow(89).getCell(14);
            cell55.setCellValue((String) map.get("chargesDest"));
            HSSFCell cell56=sheet.getRow(89).getCell(28);
            cell56.setCellValue((String) map.get("totalColl"));
            HSSFCell cell57=sheet.getRow(65).getCell(28);
            cell57.setCellValue((String) map.get("otherCharges"));
            HSSFCell cell58=sheet.getRow(82).getCell(28);
            cell58.setCellValue((String) map.get("signatureShipper"));
            HSSFCell cell59=sheet.getRow(87).getCell(38);
            cell59.setCellValue((String) map.get("excutedOn"));
            HSSFCell cell60=sheet.getRow(87).getCell(47);
            cell60.setCellValue((String) map.get("place"));
            HSSFCell cell61=sheet.getRow(88).getCell(41);
            cell61.setCellValue((String) map.get("signatureCarrier"));
            response.setHeader("Content-Disposition", "attachment;Filename=" + URLEncoder.encode("hawb.xls", "UTF-8"));
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
