/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author user1
 */
public class Example1 {
    
    public static boolean chekText(String str) {
     Pattern pattern = Pattern.compile(".+\\.+(com|org|ru)");
     Matcher matcher = pattern.matcher(str);
     return matcher.matches();
    }
    
        public static boolean chekText2(String str) {
     Pattern pattern = Pattern.compile("^Java$");
     Matcher matcher = pattern.matcher(str);
     return matcher.matches();
    }
    
    public static void main(String[] args) {
      //  System.out.println(chekText("Jva"));
    //  System.out.println(chekText("yandex.ee"));
       
     String a = "Выхожу один я на дорогу";
     System.out.print(a.replaceAll("[ао]дин", "вдвоем"));
    }
}
