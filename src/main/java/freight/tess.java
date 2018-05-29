package freight;



import freight.util.other.countnum;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/5</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class tess {
    public static void  main(String[] args) throws IOException {
//        List returnlist=new ArrayList();
//        for(int i=0;i<3;i++) {
//            List list1 = new ArrayList();
//            Map map1 = new HashMap();
//            map1.put("111", "111");
//            map1.put("232", "222");
//            list1.add(map1);
//            List list2 = new ArrayList();
//            Map map2 = new HashMap();
//            map2.put("111", "111");
//            map2.put("232", "222");
//            list2.add(map2);
//            List list3 = new ArrayList();
//            Map map3 = new HashMap();
//            map3.put("111", "111");
//            map3.put("232", "222");
//            list3.add(map3);
//            List list4 = new ArrayList();
//            Map map4 = new HashMap();
//            map4.put("111", "111");
//            map4.put("232", "222");
//            list4.add(map4);
//            Map result = new HashMap();
//            result.put("30", list1);
//            result.put("60", list2);
//            result.put("90", list3);
//            result.put("120", list4);
//            result.put("name", "wo");
//            returnlist.add(result);
//        }
//        countnum.count(0,returnlist);
        String up1="F"+(1+2);String down1="F"+(1+2+1);String form1="sum("+up1+":"+down1+")";
        System.out.print(form1);
    }
}
