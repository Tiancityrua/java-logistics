package freight.controller.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;
import freight.service.bill.in_bill_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class insert_bill {
    @Resource
    private in_bill_service service;
    @ResponseBody
    @RequestMapping(value = "/insert/bill/mawb",method = RequestMethod.POST,produces = "application/json")
    public Message in_ma(@RequestBody Mawb mawb){
        String shipper=mawb.getShipper();
        String consignee=mawb.getConsignee();
        service.in_mahis(shipper,consignee);
        return service.in_ma(mawb);
    }
    @ResponseBody
    @RequestMapping(value = "/insert/bill/hawb",method = RequestMethod.POST,produces = "application/json")
    public Message in_ha(@RequestBody Hawb hawb){
        String shipper=hawb.getShipper();
        String consignee=hawb.getConsignee();
        service.in_hahis(shipper,consignee);
        return service.in_ha(hawb);
    }

}
