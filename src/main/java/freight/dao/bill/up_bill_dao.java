package freight.dao.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import org.springframework.stereotype.Repository;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface up_bill_dao {
    int up_ha(Hawb hawb);
    int up_ma(Mawb mawb);
}
