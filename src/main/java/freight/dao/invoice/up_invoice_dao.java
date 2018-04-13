package freight.dao.invoice;

import freight.DO.Delivery;
import freight.DO.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>创建时间: 2018/4/13</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface up_invoice_dao {
    int up_delivery(Delivery delivery);
    int up_invoice(Invoice invoice);
    int up_detail(List list);
}
