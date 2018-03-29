package freight.service.invoice;

import freight.DO.Delivery;
import freight.DO.Detail;
import freight.DO.Invoice;
import freight.DO.Message;

import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface in_invoice_service {
    Message in_delivery(Delivery delivery);
    Message in_invoice(Invoice invoice);
    Message in_detail(List list);
}
