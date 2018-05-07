package freight.controller.invoice;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>创建时间: 2018/5/6</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
@Controller
public class upload_invoice {
    @ResponseBody
    @RequestMapping(value = "/upload/invoice/invoice",method = RequestMethod.POST,produces = "application/json")
    public Map invoice_up(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request){
        String path=request.getSession().getServletContext().getRealPath("/")+file.getOriginalFilename();
        File newfile=new File(path);
        try {
            file.transferTo(newfile);
            ITesseract tesseract=new Tesseract();
            tesseract.setPageSegMode(4);
            String result=tesseract.doOCR(newfile);
            String arr[]=result.split("\n\n");
            Map resultmap=new HashMap();
            resultmap.put("invoiceTo",arr[0]);
            resultmap.put("invoiceNo",arr[1]);
            resultmap.put("date",arr[2]);
            resultmap.put("billLaden",arr[3]);
            resultmap.put("origin",arr[4]);
            resultmap.put("dstn",arr[5]);
            resultmap.put("nature",arr[6]);
            Map returnmap=new HashMap<String,Map>();
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
