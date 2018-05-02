package freight.dao.invoice;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface de_invoice_dao {
    int de_note(Map map);
    int de_invoice(Map map);
}
