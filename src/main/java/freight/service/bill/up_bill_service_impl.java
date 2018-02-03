package freight.service.bill;

import freight.DO.Hawb;
import freight.DO.Mawb;
import freight.DO.Message;
import freight.dao.bill.up_bill_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class up_bill_service_impl implements up_bill_service {
    @Resource
    private up_bill_dao dao;
    @Override
    public Message up_ha(Hawb hawb) {
        int num=dao.up_ha(hawb);
        if (num!=0){
            Message msg=new Message("success","分单更新成功");
            return msg;
        }
        else {
            Message msg=new Message("error","分单更新发生错误,请检查提交数据完整性");
            return msg;
        }
    }

    @Override
    public Message up_ma(Mawb mawb) {
        int num=dao.up_ma(mawb);
        if (num!=0){
            Message msg=new Message("success","主单更新成功");
            return msg;
        }
        else {
            Message msg=new Message("error","主单更新发生错误,请检查提交数据完整性");
            return msg;
        }
    }
}
