package freight.service.invoice;

import freight.DO.Message;

import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface de_invoice_service {
    Message de_note(Map map);
    Message de_invoice(Map map);
}
