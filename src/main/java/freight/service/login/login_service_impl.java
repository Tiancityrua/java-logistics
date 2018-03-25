package freight.service.login;

import freight.DO.Userinfo;
import freight.dao.login.login_dao;
import freight.util.token.Jwt;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>创建时间: 2018/2/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Service
public class login_service_impl implements login_service {
    @Resource
    private login_dao dao;
    @Override
    public Map get_token(Userinfo userinfo) {
        Map map=new HashMap();
        String role=dao.se_role(userinfo);
        if (role!=null) {
            String username = userinfo.getUsername();
            String token = Jwt.createToken(username, role);
            userinfo.setToken(token);
            map.put("token",token);
            map.put("code",200);
            return map;
        }
        else {
            map.put("code",401);
            map.put("token","");
            return map;
        }
    }

    @Override
    public Map get_role(String token) {
        Map map=new HashMap();
        try {
            Claims claims = Jwt.praseToken(token);
            String role = claims.get("role", String.class);
            map.put("role",role);
            String usernmae=claims.get("username",String.class);
            map.put("username",usernmae);
            return map;
        }catch (Exception e) {
            return null;
        }
    }
}
