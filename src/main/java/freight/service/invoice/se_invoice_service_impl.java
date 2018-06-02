package freight.service.invoice;

import freight.DO.Detail;
import freight.DO.Invoice;
import freight.dao.invoice.se_invoice_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class se_invoice_service_impl implements se_invoice_service {
    @Resource
    private se_invoice_dao dao;


    @Override
    public Map se_invoice(Map map) {
        List list=dao.se_invoice(map);
        Map result=new HashMap<String, List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_delivery(Map map) {
        List list=dao.se_delivery(map);
        Map result=new HashMap<String, List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_detail(Map map) {
        List list=dao.se_detail(map);
        Map result=new HashMap<String, List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_no(Map map) {
        Map returnmap=new HashMap();
        String time= (String) map.get("time");
        String query1="DVI518"+time+"%";
        String no1=dao.se_no1(query1);
        if(no1!=null){
            Long num1=Long.parseLong(no1);
            num1++;
            String result1=String.valueOf(num1);
            returnmap.put("dvi",result1);
        }
        else {
            String result1="518"+time+"001";
            returnmap.put("dvi",result1);
        }
        String query2="INV518"+time+"%";
        String no2=dao.se_no2(query2);
        if(no2!=null){
            Long num2=Long.parseLong(no2);
            num2++;
            String result2=String.valueOf(num2);
            returnmap.put("inv",result2);
        }
        else {
            String result2="518"+time+"001";
            returnmap.put("inv",result2);
        }
        return returnmap;
    }

    @Override
    public List<Map> se_invoice_all(Map map) {
        List<Map> resultlist = new ArrayList<Map>();
        List<Invoice> alllist=dao.se_invoice_all(map);
        for (Invoice invoice:alllist){
            String no=invoice.getInvoiceNo();
            String total=invoice.getTotal();
            Map resultmap=new HashMap();
            String net=dao.se_detail_all(no);
            if (net!=""&&net!=null){
                resultmap.put("Net",net);
                String vat=dao.se_detail_vat(no);
                resultmap.put("VAT",vat);
            }
            else{
                resultmap.put("VAT","0");
                resultmap.put("Net",total);
            }
            String id=invoice.getNo();
            String type=invoice.getType();
            String date=invoice.getDate();
            String name=invoice.getInvoiceTo();
            String invoiceno=invoice.getInvoiceNo();
            String ref=invoice.getBillLaden();
            resultmap.put("id",id);
            resultmap.put("type",type);
            resultmap.put("name",name);
            resultmap.put("date",date);
            resultmap.put("invoiceno",invoiceno);
            resultmap.put("ref",ref);
            resultmap.put("total",total);
            resultlist.add(resultmap);
        }
        return resultlist;
    }

    public List se_debtors(Map getmap){
        String time= (String) getmap.get("time");
        List<String> namelist=dao.se_debtors_name();
        List returnlist=new ArrayList<Map>();
        for (String name:namelist){
            Map map=new HashMap();
            map.put("time",time);
            map.put("invoiceTo",name);
            List<Map> list1=dao.se_debtors_detail30(map);
            List<Map> list2=dao.se_debtors_detail60(map);
            List<Map> list3=dao.se_debtors_detail90(map);
            List<Map> list4=dao.se_debtors_detail120(map);
            List<Map> list5=dao.se_debtors_detail_120(map);
            Map resultmap=new HashMap();
            resultmap.put("30",list1);
            resultmap.put("60",list2);
            resultmap.put("90",list3);
            resultmap.put("120",list4);
            resultmap.put("older",list5);
            resultmap.put("name",name);
            returnlist.add(resultmap);
        }
        return returnlist;
    }

    @Override
    public List se_creditors(Map getmap) {
        String time= (String) getmap.get("time");
        List<String> namelist=dao.se_creditors_name();
        List returnlist=new ArrayList<Map>();
        for (String name:namelist){
            Map map=new HashMap();
            map.put("time",time);
            map.put("invoiceTo",name);
            List<Map> list1=dao.se_creditors_detail30(map);
            List<Map> list2=dao.se_creditors_detail60(map);
            List<Map> list3=dao.se_creditors_detail90(map);
            List<Map> list4=dao.se_creditors_detail120(map);
            List<Map> list5=dao.se_creditors_detail_120(map);
            Map resultmap=new HashMap();
            resultmap.put("30",list1);
            resultmap.put("60",list2);
            resultmap.put("90",list3);
            resultmap.put("120",list4);
            resultmap.put("older",list5);
            resultmap.put("name",name);
            returnlist.add(resultmap);
        }
        return returnlist;
    }

    @Override
    public List<Map> se_year_total() {
        List<Map> yearmap=dao.se_year_total();
        return yearmap;
    }

    @Override
    public List<Map> se_month_total(Map map) {
        List<Map> monthmap=dao.se_month_total(map);
        return monthmap;
    }

    @Override
    public List<Map> se_name_most(Map map) {
        List<Map> namemap=dao.se_name_most(map);
        return namemap;
    }

    @Override
    public List<Map> se_origin(Map map) {
        List origin=dao.se_origin(map);
        return origin;
    }

    @Override
    public List<Map> se_dstn(Map map) {
        List dstn=dao.se_dstn(map);
        return dstn;
    }


}
