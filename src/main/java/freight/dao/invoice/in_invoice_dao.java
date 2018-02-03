package freight.dao.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface in_invoice_dao {
    int in_delivery(Delivery delivery);
    int in_duty(Invoice invoice);
    int in_freight(Invoice invoice);
    int in_log(Invoice invoice);
}
