package freight.dao.invoice;

import freight.DO.Delivery;
import freight.DO.Detail;
import freight.DO.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface se_invoice_dao {
    List<Invoice> se_invoice(Map map);
    List<Delivery> se_delivery(Map map);
    List<Detail> se_detail(Map map);
    String se_no1(String query1);
    String se_no2(String query2);
    List<Invoice> se_invoice_all();
    String se_detail_all(String string);
    String se_detail_vat(String string);
}
