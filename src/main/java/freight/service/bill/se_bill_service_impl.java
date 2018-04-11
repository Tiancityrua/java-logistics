package freight.service.bill;

import freight.dao.bill.se_bill_dao;
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
public class se_bill_service_impl implements se_bill_service {
    @Resource
    private se_bill_dao dao;
    @Override
    public Map se_ha(Map map) {
        List list=dao.se_hawb(map);
        Map result=new HashMap<String,List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_hahis_shipper() {
        List list=dao.se_hashipper();
        Map<String,List> map=new HashMap<String, List>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map se_hahis_consignee() {
        List list=dao.se_haconsignee();
        Map<String,List> map=new HashMap<String, List>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map se_ma(Map map) {
        List list=dao.se_mawb(map);
        Map result=new HashMap<String,List<Map>>();
        result.put("data",list);
        return result;
    }

    @Override
    public Map se_mahis_shipper() {
        List list=dao.se_mashipper();
        Map<String,List> map=new HashMap<String, List>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map se_mahis_consignee() {
        List list=dao.se_maconsignee();
        Map<String,List> map=new HashMap<String, List>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map se_ma_place(Map map) {
        List list=dao.se_mawb_place(map);
        Map result=new HashMap<String,List<Map>>();
        result.put("data",list);
        return result;
    }
}
