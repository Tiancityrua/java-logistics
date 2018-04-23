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
    public Map se_ma(@RequestBody Map map){
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
    @RequestMapping(value = "/select/bill/maplace",method = RequestMethod.POST,produces = "application/json")
    public Map se_ma_place(@RequestBody Map map){
        return service.se_ma_place(map);
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

    @ResponseBody
    @RequestMapping(value = "/select/bill/haplace",method = RequestMethod.POST,produces = "application/json")
    public Map se_ha_place(@RequestBody Map map){
        return service.se_ha_place(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/bill/same",method = RequestMethod.POST,produces = "application/json")
    public Map se_same(@RequestBody Map map){
        return service.se_same(map);
    }


}
