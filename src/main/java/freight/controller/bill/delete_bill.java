package freight.controller.bill;

import freight.DO.Message;
import freight.service.bill.de_bill_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/3</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class delete_bill {
    @Resource
    private de_bill_service service;
    @ResponseBody
    @RequestMapping(value = "/delete/bill/mawb",method = RequestMethod.POST,produces = "application/json")
    public Message de_ma(@RequestBody Map map){
        return service.de_mawb(map);
    }
    @ResponseBody
    @RequestMapping(value = "/delete/bill/hawb",method = RequestMethod.POST,produces = "application/json")
    public Message de_ha(@RequestBody Map map){
        return service.de_hawb(map);
    }
}
