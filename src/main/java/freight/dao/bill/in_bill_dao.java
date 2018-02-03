package freight.dao.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface in_bill_dao {
    int in_hawb(Hawb hawb);
    int in_hashipper(String shipper);
    int in_haconsignee(String consignee);
    int in_mawb(Mawb mawb);
    int in_mashipper(String shipper);
    int in_maconsignee(String consignee);

}
