package freight.service.login;

import freight.DO.Userinfo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>创建时间: 2018/2/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class login_service_impl implements login_service {
    @Override
    public Map get_token(Userinfo userinfo) {
        return null;
    }

    @Override
    public Map get_role(String token) {
        return null;
    }
}
