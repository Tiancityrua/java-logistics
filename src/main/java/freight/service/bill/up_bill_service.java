package freight.service.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface up_bill_service {
    Message up_ha(Hawb hawb);
    Message up_ma(Mawb mawb);
}
