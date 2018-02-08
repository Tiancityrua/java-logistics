package freight.service.login;

import freight.DO.Userinfo;

import java.util.Map;

/**
 * <p>创建时间: 2018/2/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface login_service {
    Map get_token(Userinfo userinfo);
    Map get_role(String token);
}
