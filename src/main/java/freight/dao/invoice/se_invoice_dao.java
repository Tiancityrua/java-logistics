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
    List<Invoice> se_invoice_all(Map map);
    String se_detail_all(String string);
    String se_detail_vat(String string);
    List<String> se_debtors_name();
    List<Map> se_debtors_detail30(Map map);
    List<Map> se_debtors_detail60(Map map);
    List<Map> se_debtors_detail90(Map map);
    List<Map> se_debtors_detail120(Map map);
    List<Map> se_debtors_detail_120(Map map);
}
