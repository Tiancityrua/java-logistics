package freight.service.invoice;

import freight.DO.Delivery;
import freight.DO.Detail;
import freight.DO.Invoice;
import freight.DO.Message;
import freight.dao.invoice.in_invoice_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class in_invoice_service_impl implements in_invoice_service {
    @Resource
    private in_invoice_dao dao;

    @Override
    public Message in_delivery(Delivery delivery) {
        int num=dao.in_delivery(delivery);
        if (num!=0){
            Message msg=new Message("success","货单插入成功");
            return msg;
        }
        else {
            Message msg=new Message("error","货单插入失败，重复插入相同数据");
            return msg;
        }
    }

    @Override
    public Message in_invoice(Invoice invoice) {
        int num=dao.in_invoice(invoice);
        if (num!=0){
            Message msg=new Message("success","发票插入成功");
            return msg;
        }
        else {
            Message msg=new Message("error","发票插入失败，请不要重复插入相同分单号");
            return msg;
        }
    }

    @Override
    public Message in_detail(List detail) {
        int num=dao.in_detail(detail);
        Message msg=new Message("success","发票详情插入成功");
        return msg;
    }
}
