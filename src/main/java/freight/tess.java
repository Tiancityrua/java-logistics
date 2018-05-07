package freight;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * <p>创建时间: 2018/5/5</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class tess {
    public static void  main(String[] args){
        File image=new File("src/main/1.txt");
        String result="GT Global Distributors\n" +
                "9 Rugby Road, Saint Thamas, Exeter\n" +
                "Devon, EX4 1BH\n" +
                "\n" +
                "INV518111501\n" +
                "\n" +
                "23/11/2015\n" +
                "\n" +
                "988-067/97¢\n" +
                "\n" +
                "SHA\n" +
                "\n" +
                "LHR\n" +
                "\n" +
                "1? pcs, 185 kg, Eyemarks";
        String arr[]=result.split("\n\n");
        System.out.println(arr);
    }
}
