package freight.util.other;

import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/28</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class countnum {
    public static int count(int i, List<Map> list){
        int count=2;
        for(int j=0;j<i;j++){
                for(int l=0;l<((List)(list.get(j).get("30"))).size();l++){
                    count++;
                }
                for(int l=0;l<((List)(list.get(j).get("60"))).size();l++){
                    count++;
                }
                for(int l=0;l<((List)(list.get(j).get("90"))).size();l++){
                    count++;
                }
                for(int l=0;l<((List)(list.get(j).get("120"))).size();l++){
                    count++;
                }
                for(int l=0;l<((List)(list.get(j).get("older"))).size();l++){
                count++;
                }
                count=count+2;
            }
        return count;
    }
}
