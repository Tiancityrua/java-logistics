package freight.service.invoice;

import freight.DO.Message;
import freight.dao.invoice.de_invoice_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class de_invoice_service_impl implements de_invoice_service {
    @Resource
    private de_invoice_dao dao;

    @Override
    public Message de_note(Map map) {
        int num=dao.de_note(map);
        if(num!=0){
            Message msg=new Message("success","货单删除成功");
            return msg;
        }
        else {
            Message msg=new Message("error","货单删除失败");
            return msg;
        }
    }

    @Override
    public Message de_invoice(Map map) {
        int num=dao.de_invoice(map);
        if(num!=0){
            Message msg=new Message("success","发票删除成功");
            return msg;
        }
        else {
            Message msg=new Message("error","发票删除失败");
            return msg;
        }
    }
}
