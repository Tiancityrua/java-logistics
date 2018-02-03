package freight.util;

import freight.DO.Mawb;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>创建时间: 2018/1/14</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class bean2map {
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map =new HashMap();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key+"", beanMap.get(key));
            }
        }
        return map;
    }
}
