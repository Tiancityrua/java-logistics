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
    List<Map> se_invoice_all();
}
