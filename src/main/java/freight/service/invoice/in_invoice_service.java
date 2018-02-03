package freight.service.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import freight.DO.Message;

import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface in_invoice_service {
    Message in_delivery(Delivery delivery);
    Message in_duty(Invoice invoice);
    Message in_freight(Invoice invoice);
    Message in_log(Invoice invoice);
}
