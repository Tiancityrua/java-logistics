package freight.dao.login;

import freight.DO.Userinfo;
import org.springframework.stereotype.Repository;

/**
 * <p>创建时间: 2018/2/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Repository
public interface login_dao {
//    int up_token(Userinfo userinfo);
    String se_role(Userinfo userinfo);
}
