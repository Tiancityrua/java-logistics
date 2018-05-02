package freight.service.bill;

import freight.DO.Message;

import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface de_bill_service {
    Message de_mawb(Map map);
    Message de_hawb(Map map);
}
