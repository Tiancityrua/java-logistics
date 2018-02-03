package freight.controller.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import freight.DO.Message;
import freight.service.invoice.in_invoice_service;
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
public class insert_invoice {
    @Resource
    private in_invoice_service service;

    @ResponseBody
    @RequestMapping(value = "/insert/invoice/delivery",method = RequestMethod.POST,produces = "application/json")
    public Message in_delivery(@RequestBody Delivery delivery){
        return service.in_delivery(delivery);
    }
    @ResponseBody
    @RequestMapping(value = "/insert/invoice/duty",method = RequestMethod.POST,produces = "application/json")
    public Message in_duty(@RequestBody Invoice invoice){
        return service.in_duty(invoice);
    }

    @ResponseBody
    @RequestMapping(value = "/insert/invoice/freight",method = RequestMethod.POST,produces = "application/json")
    public Message in_fr(@RequestBody Invoice invoice){
        return service.in_freight(invoice);
    }

    @ResponseBody
    @RequestMapping(value = "/insert/invoice/logistics",method = RequestMethod.POST,produces = "application/json")
    public Message in_log(@RequestBody Invoice invoice){
        return service.in_log(invoice);
    }
}
