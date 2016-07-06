/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yotube;
import java.io.File;
import java.net.URL;
import com.github.axet.vget.VGet;

/**
 *
 * @author Adwait
 */
public class Yotube {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=s10ARdfQUOY";
            String path = "D:\\Manindar\\YTD\\";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        // TODO code application logic here
    }

