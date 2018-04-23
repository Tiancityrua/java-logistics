package freight.dao.bill;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface se_bill_dao {
    List<Map> se_hawb(Map map);
    List<String> se_hashipper();
    List<String> se_haconsignee();
    List<String> se_hawb_place(Map map);
    List<Map> se_mawb(Map map);
    List<String> se_mashipper();
    List<String> se_maconsignee();
    List<String> se_mawb_place(Map map);
    List<String> se_same(Map map);
}
