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
    public Map se_duty(Map map) {
        List list=dao.se_duty(map);
        Map result=new HashMap<String, List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_freight(Map map) {
        List list=dao.se_freight(map);
        Map result=new HashMap<String, List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_log(Map map) {
        List list=dao.se_log(map);
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
}
