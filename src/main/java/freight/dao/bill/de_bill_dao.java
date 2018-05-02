package freight.dao.bill;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface de_bill_dao {
    int de_mawb(Map map);
    int de_hawb(Map map);
}
