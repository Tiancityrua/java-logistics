package freight.service.bill;

import freight.DO.Message;
import freight.dao.bill.de_bill_dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/2</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class de_bill_service_impl implements de_bill_service {
    @Resource
    private de_bill_dao dao;

    @Override
    public Message de_mawb(Map map) {
        int num=dao.de_mawb(map);
        if(num!=0){
            Message msg=new Message("success","主单删除成功");
            return msg;
        }
        else {
            Message msg=new Message("error","主单删除失败");
            return msg;
        }
    }

    @Override
    public Message de_hawb(Map map) {
        int num=dao.de_hawb(map);
        if(num!=0){
            Message msg=new Message("success","分单删除成功");
            return msg;
        }
        else {
            Message msg=new Message("error","分单删除失败");
            return msg;
        }
    }
}
