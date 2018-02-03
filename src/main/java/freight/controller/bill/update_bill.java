package freight.controller.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;
import freight.service.bill.up_bill_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class update_bill {
    @Resource
    private up_bill_service service;
    @ResponseBody
    @RequestMapping(value = "/update/bill/hawb",method = RequestMethod.POST,produces = "application/json")
    public Message up_ha(@RequestBody Hawb hawb){
        return service.up_ha(hawb);
    }
    @ResponseBody
    @RequestMapping(value = "/update/bill/mawb",method = RequestMethod.POST,produces = "application/json")
    public Message up_ma(@RequestBody Mawb mawb){
        return service.up_ma(mawb);
    }
}

