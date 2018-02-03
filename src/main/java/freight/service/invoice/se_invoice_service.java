package freight.service.invoice;

import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface se_invoice_service {
    Map se_duty(Map map);
    Map se_freight(Map map);
    Map se_log(Map map);
    Map se_delivery(Map map);
}
