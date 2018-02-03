package freight.service.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;

import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface in_bill_service {
    Message in_ha(Hawb hawb);
    int in_hahis(String shipper,String consignee);
    Message in_ma(Mawb mawb);
    int in_mahis(String shipper,String consignee);
}
