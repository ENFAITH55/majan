import java.util.*;
public class Hais{
    
        List<String> hai = new ArrayList<String>();
        List<String> yama = new ArrayList<String>();
        int i=0;
        int m=0;
        
    
    void makelist(){
        int m;
        for(m=0;m<4;m++){
             this.hai.add("1m");
             this.hai.add("2m");
             this.hai.add("3m");
             this.hai.add("4m");
             this.hai.add("5m");
             this.hai.add("6m");
             this.hai.add("7m");
             this.hai.add("8m");
             this.hai.add("9m");
             this.hai.add("1p");
             this.hai.add("2p");
             this.hai.add("3p");
             this.hai.add("4p");
             this.hai.add("5p");
             this.hai.add("6p");
             this.hai.add("7p");
             this.hai.add("8p");
             this.hai.add("9p");
             this.hai.add("1s");
             this.hai.add("2s");
             this.hai.add("3s");
             this.hai.add("4s");
             this.hai.add("5s");
             this.hai.add("6s");
             this.hai.add("7s");
             this.hai.add("8s");
             this.hai.add("9s");
             this.hai.add("1j");
             this.hai.add("2j");
             this.hai.add("3j");
             this.hai.add("4j");
             this.hai.add("5j");
             this.hai.add("6j");
             this.hai.add("7j");
    } }
    void showList(){    
     Iterator<String> it = hai.iterator();           
     while(it.hasNext()){
             String e = it.next();
                 System.out.println(e);  
                       }          
 
    }
    void makeYama(){
        Iterator<String> itr = hai.iterator();           
     for(i=0;i<4;i++){
        while(itr.hasNext()){
            String e = itr.next();
            this.yama.add(e);
    }
}
}
}   
