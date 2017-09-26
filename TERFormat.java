/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terformat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hoangcuong2011
 */
public class TERFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader buf = new BufferedReader(new FileReader(args[0]));
        System.out.println(args[0]);
        FileWriter fi_w = new FileWriter(args[0]+".toTERFormat");
        String s = "";
        int count = 0;
        while((s=buf.readLine())!=null) {
            //System.out.println(s);
            s = s.trim();
            s = s + " (AFA"+count+")";
            fi_w.write(s+"\n");
            count++;
        }
        buf.close();
        fi_w.close();
    }
    
}
