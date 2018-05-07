package freight.service.invoice;

import freight.dao.invoice.se_invoice_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        String query1="DVI"+time+"%";
        String no1=dao.se_no1(query1);
        if(no1!=null){
            Long num1=Long.parseLong(no1);
            num1++;
            String result1=String.valueOf(num1);
            returnmap.put("dvi",result1);
        }
        else {
            String result1=time+"001";
            returnmap.put("dvi",result1);
        }
        String query2="IVD"+time+"%";
        String no2=dao.se_no2(query2);
        if(no2!=null){
            Long num2=Long.parseLong(no2);
            num2++;
            String result2=String.valueOf(num2);
            returnmap.put("ivd",result2);
        }
        else {
            String result2=time+"001";
            returnmap.put("ivd",result2);
        }
        return returnmap;
    }
}
