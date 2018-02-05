package freight.controller.bill;

import freight.service.bill.se_bill_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class select_bill {
    @Resource
    private se_bill_service service;
    @ResponseBody
    @RequestMapping(value = "/select/bill/mawb",method = RequestMethod.POST,produces = "application/json")
    public Map se_ma(@RequestBody Map map, HttpServletResponse response){
        return service.se_ma(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/mashipper",method = RequestMethod.GET,produces = "application/json")
    public Map se_mahis_shipper(){
        return service.se_mahis_shipper();
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/maconsignee",method = RequestMethod.GET,produces = "application/json")
    public Map se_mahis_consignee(){
        return service.se_mahis_consignee();
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/hawb",method = RequestMethod.POST,produces = "application/json")
    public Map se_ha(@RequestBody Map map){
        return service.se_ha(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/hashipper",method = RequestMethod.GET,produces = "application/json")
    public Map se_hahis_shipper(){
        return service.se_hahis_shipper();
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/haconsignee",method = RequestMethod.GET,produces = "application/json")
    public Map se_hahis_consignee(){
        return service.se_hahis_consignee();
    }
}
