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
    @RequestMapping(value = "/select/invoice/duty",method = RequestMethod.POST,produces = "application/json")
    public Map se_duty(@RequestBody Map map){
        return service.se_duty(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/invoice/freight",method = RequestMethod.POST,produces = "application/json")
    public Map se_freight(@RequestBody Map map){
        return service.se_freight(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/invoice/logistics",method = RequestMethod.POST,produces = "application/json")
    public Map se_log(@RequestBody Map map){
        return service.se_log(map);
    }

    @ResponseBody
    @RequestMapping(value = "/select/invoice/delivery",method = RequestMethod.POST,produces = "application/json")
    public Map se_delivery(@RequestBody Map map){
        return service.se_delivery(map);
    }
}
