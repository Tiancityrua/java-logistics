package freight.service.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import freight.DO.Message;
import freight.dao.invoice.up_invoice_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>创建时间: 2018/4/13</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class up_invoice_service_impl implements up_invoice_service {
    @Resource
    private up_invoice_dao dao;
    @Override
    public Message up_delivery(Delivery delivery) {
        int num=dao.up_delivery(delivery);
        if(num!=0){
            Message msg=new Message("success","货单更新成功");
            return msg;
        }
        else {
            Message msg=new Message("error","货单更新失败，请检查提交数据完整性");
            return msg;
        }
    }

    @Override
    public Message up_invoice(Invoice invoice) {
        int num=dao.up_invoice(invoice);
        if(num!=0){
            Message msg=new Message("success","发票更新成功");
            return msg;
        }
        else {
            Message msg=new Message("error","发票更新失败，请检查提交数据完整性");
            return msg;
        }
    }

    @Override
    public Message up_detail(List list) {
        int num=dao.up_detail(list);
        Message msg=new Message("success","发票详情更新成功");
        return msg;
    }
}
