package freight.controller.invoice;

import freight.service.invoice.se_invoice_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class select_invoice {
    @Resource
    private se_invoice_service service;
    @ResponseBody
    @RequestMapping(value = "/select/invoice/invoice",method = RequestMethod.POST,produces = "application/json")
    public Map se_invoice(@RequestBody Map map){
        return service.se_invoice(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/invoice/detail",method = RequestMethod.POST,produces = "application/json")
    public Map se_detail(@RequestBody Map map){
        return service.se_detail(map);
    }


    @ResponseBody
    @RequestMapping(value = "/select/invoice/delivery",method = RequestMethod.POST,produces = "application/json")
    public Map se_delivery(@RequestBody Map map){
        return service.se_delivery(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/invoice/no",method = RequestMethod.POST,produces = "application/json")
    public Map se_no(@RequestBody Map map){
        return service.se_no(map);
    }
}
