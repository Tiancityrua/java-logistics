package freight.controller.invoice;

import freight.DO.Delivery;
import freight.DO.Detail;
import freight.DO.Invoice;
import freight.DO.Message;
import freight.service.invoice.up_invoice_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>创建时间: 2018/4/13</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class update_invoice {
    @Resource
    private up_invoice_service service;
    @ResponseBody
    @RequestMapping(value = "/update/invoice/delivery",method = RequestMethod.POST,produces = "application/json")
    public Message up_delivery(@RequestBody Delivery delivery){
        return service.up_delivery(delivery);
    }
    @ResponseBody
        @RequestMapping(value = "/update/invoice/invoice",method = RequestMethod.POST,produces = "application/json")
    public Message up_invoice(@RequestBody Invoice invoice){
        return service.up_invoice(invoice);
    }
    @ResponseBody
    @RequestMapping(value = "/update/invoice/detail",method = RequestMethod.POST,produces = "application/json")
    public Message up_detail(@RequestBody List<Detail> detail){
        return service.up_detail(detail);
    }
}
