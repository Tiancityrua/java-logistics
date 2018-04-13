package freight.service.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import freight.DO.Message;

import java.util.List;

/**
 * <p>创建时间: 2018/4/13</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface up_invoice_service {
    Message up_delivery(Delivery delivery);
    Message up_invoice(Invoice invoice);
    Message up_detail(List list);
}
