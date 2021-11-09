
import java.util.*;  
   
class Teste {  
    public static void main(String[] args) {  
        Locale loc = Locale.getDefault();  
        System.out.println ("O idioma do seu sitema é:"); 
        System.out.println (loc.getLanguage()); 
        System.out.println (loc.getDisplayLanguage());  
    }  
}  
