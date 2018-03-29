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
}
