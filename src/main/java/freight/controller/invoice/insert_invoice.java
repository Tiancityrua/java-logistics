package freight.controller.invoice;

import freight.DO.Delivery;
import freight.DO.Detail;
import freight.DO.Invoice;
import freight.DO.Message;
import freight.service.invoice.in_invoice_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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
    @RequestMapping(value = "/insert/invoice/invoice",method = RequestMethod.POST,produces = "application/json")
    public Message in_invoice(@RequestBody Invoice invoice){
        return service.in_invoice(invoice);
    }

    @ResponseBody
    @RequestMapping(value = "/insert/invoice/detail",method = RequestMethod.POST,produces = "application/json")
    public Message in_detail(@RequestBody List<Detail> detail){
        return service.in_detail(detail);
    }
}
