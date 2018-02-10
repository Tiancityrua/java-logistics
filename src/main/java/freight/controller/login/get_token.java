package freight.controller.login;

import freight.DO.Userinfo;
import freight.service.login.login_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>创建时间: 2018/2/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class get_token {
    @Resource
    private login_service service;
    @ResponseBody
    @RequestMapping(value = "/login/token",method = RequestMethod.POST,produces = "application/json")
    public Map getToken(@RequestBody Userinfo userinfo){
        return service.get_token(userinfo);
    }
    @ResponseBody
    @RequestMapping(value = "/login/userinfo",method = RequestMethod.POST,produces = "application/json")
    public Map getUserinfo(@RequestBody Userinfo userinfo){
        String token=userinfo.getToken();
        return service.get_role(token);
    }
}
