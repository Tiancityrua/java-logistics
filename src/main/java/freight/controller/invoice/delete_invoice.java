package freight.controller.invoice;

import freight.DO.Message;
import freight.service.invoice.de_invoice_service;
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
public class delete_invoice {
    @Resource
    private de_invoice_service service;
    @ResponseBody
    @RequestMapping(value = "/delete/invoice/invoice",method = RequestMethod.POST,produces = "application/json")
    public Message de_invoice(@RequestBody Map map){
        return service.de_invoice(map);
    }
    @ResponseBody
    @RequestMapping(value = "/delete/invoice/note",method = RequestMethod.POST,produces = "application/json")
    public Message de_note(@RequestBody Map map){
        return service.de_note(map);
    }
}
