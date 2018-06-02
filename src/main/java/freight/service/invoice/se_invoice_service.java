package freight.service.invoice;

import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface se_invoice_service {
    Map se_invoice(Map map);
    Map se_delivery(Map map);
    Map se_detail(Map map);
    Map se_no(Map map);
    List<Map> se_invoice_all(Map map);
    List se_debtors(Map map);
    List se_creditors(Map map);
    List<Map> se_year_total();
    List<Map> se_month_total(Map map);
    List<Map> se_name_most(Map map);
    List<Map> se_origin(Map map);
    List<Map> se_dstn(Map map);
}
