package freight.controller.bill;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/8</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class upload_bill {
    @ResponseBody
    @RequestMapping(value = "/upload/bill/hawb",method = RequestMethod.POST,produces = "application/json")
    public Map hawb_up(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("/") + file.getOriginalFilename();
        File newfile = new File(path);
        try {
            file.transferTo(newfile);
            Tesseract tesseract=new Tesseract();
            tesseract.setPageSegMode(4);
            tesseract.setDatapath(request.getSession().getServletContext().getRealPath("/") );
            tesseract.setLanguage("eng");
            String result=tesseract.doOCR(newfile);
            String arr[]=result.split("\n\n");
            Map resultmap=new HashMap();
            Map returnmap=new HashMap<String,Map>();
            resultmap.put("mawb",arr[0]);
            resultmap.put("hawb",arr[1]);
            resultmap.put("airdeparture",arr[2]);
            resultmap.put("to1",arr[3]);
            resultmap.put("by1",arr[4]);
            resultmap.put("to2",arr[5]);
            resultmap.put("airdest",arr[6]);
            resultmap.put("flightno",arr[7]);
            resultmap.put("currency",arr[8]);
            resultmap.put("declaredcarriage",arr[9]);
            resultmap.put("declaredcustoms",arr[10]);
            resultmap.put("amountinsurance",arr[11]);
            resultmap.put("handlinginfo",arr[12]);
            resultmap.put("accountinfo",arr[13]);
            resultmap.put("shipper",arr[14]);
            String consignee="";
            for(int i=15;i<arr.length;i++){
                consignee=consignee+arr[i];
            }
            resultmap.put("consignee",consignee);
            returnmap.put("data",resultmap);
            returnmap.put("msg","success");
            return returnmap;
        } catch (IOException e) {
            Map returnmap=new HashMap();
            returnmap.put("msg","error");
            returnmap.put("event","上传错误");
            return returnmap;
        } catch (TesseractException e) {
            Map returnmap=new HashMap();
            returnmap.put("msg","error");
            returnmap.put("event","解析错误");
            return returnmap;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/upload/bill/mawb",method = RequestMethod.POST,produces = "application/json")
    public Map mawb_up(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("/") + file.getOriginalFilename();
        File newfile = new File(path);
        try {
            file.transferTo(newfile);
            Tesseract tesseract=new Tesseract();
            tesseract.setPageSegMode(4);
            tesseract.setDatapath(request.getSession().getServletContext().getRealPath("/") );
            tesseract.setLanguage("eng");
            String result=tesseract.doOCR(newfile);
            String arr[]=result.split("\n\n");
            Map resultmap=new HashMap();
            Map returnmap=new HashMap<String,Map>();
            resultmap.put("airdeparture",arr[0]);
            resultmap.put("to1",arr[1]);
            resultmap.put("to2",arr[2]);
            resultmap.put("airdest",arr[3]);
            resultmap.put("flightno",arr[4]);
            resultmap.put("currency",arr[5]);
            resultmap.put("valcarriage",arr[6]);
            resultmap.put("decalval",arr[7]);
            resultmap.put("amountinsurance",arr[8]);
            resultmap.put("handlinginfo",arr[9]);
            resultmap.put("accountinfo",arr[10]);
            resultmap.put("shipper",arr[11]);
            String consignee="";
            for(int i=12;i<arr.length;i++){
                consignee=consignee+arr[i];
            }
            resultmap.put("consignee",consignee);
            returnmap.put("data",resultmap);
            returnmap.put("msg","success");
            return returnmap;
        } catch (IOException e) {
            Map returnmap=new HashMap();
            returnmap.put("msg","error");
            returnmap.put("event","上传错误");
            return returnmap;
        } catch (TesseractException e) {
            Map returnmap=new HashMap();
            returnmap.put("msg","error");
            returnmap.put("event","解析错误");
            return returnmap;
        }
    }
}
