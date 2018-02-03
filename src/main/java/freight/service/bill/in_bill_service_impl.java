package freight.service.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;
import freight.dao.bill.in_bill_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class in_bill_service_impl implements in_bill_service {
    @Resource
    private in_bill_dao dao;
    @Override
    public Message in_ha(Hawb hawb) {
        int num=dao.in_hawb(hawb);
        if (num!=0){
            Message msg=new Message("success","分单插入成功");
            return msg;
        }
        else {
            Message msg=new Message("error","分单插入失败，请不要重复插入相同分单号");
            return msg;
        }
    }

    @Override
    public int in_hahis(String shipper, String consignee) {
        dao.in_hashipper(shipper);
        dao.in_haconsignee(consignee);
        return 0;
    }

    @Override
    public Message in_ma(Mawb mawb) {
        int num=dao.in_mawb(mawb);
        if(num!=0){
            Message msg=new Message("success","主单插入成功");
            return msg;
        }
        else {
            Message msg=new Message("error","主单插入失败，请不要重复插入相同主单号");
            return msg;
        }
    }

    @Override
    public int in_mahis(String shipper, String consignee) {
        dao.in_mashipper(shipper);
        dao.in_maconsignee(consignee);
        return 0;
    }
}
