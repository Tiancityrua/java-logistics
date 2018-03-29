package freight.dao.invoice;

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
    List<Map> se_invoice(Map map);
    List<Map> se_delivery(Map map);
    List<Map> se_detail(Map map);
}
