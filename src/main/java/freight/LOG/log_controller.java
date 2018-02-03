package freight.LOG;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * <p>创建时间: 2018/1/20</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Aspect
@Component
public class log_controller {
    private static final Logger logger=Logger.getLogger(log_controller.class);
    @Pointcut("execution( * freight.controller.*.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void dobefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //url
        logger.info(request.getRequestURI());
        //method
        logger.info(request.getMethod());
        //ip
        logger.info(request.getRemoteAddr());
        //类方法
        logger.info(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info(joinPoint.getArgs().toString());
    }


}
