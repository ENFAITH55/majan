import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
 class Main{
        public static void main(String[] args){	
        Hais hais = new Hais();
            hais.makelist();
            hais.makeYama();
        Tehai player1 = new Tehai();
            hais=player1.haipai(hais);    
            System.out.println("1rihai");
            player1.rihai();
            player1.showTehai();
        Tehai player2 = new Tehai();
            hais=player2.haipai(hais);    
            System.out.println("2rihai");
            player2.rihai();
            player2.showTehai();    
        Tehai player3 = new Tehai();
            hais=player3.haipai(hais);    
            System.out.println("3rihai");
            player3.rihai();
            player3.showTehai();   
            System.out.println(hais.yama.size()); 
        Tehai player4 = new Tehai();
            hais=player4.haipai(hais);    
            System.out.println("4rihai");
            player4.rihai();
            player4.showTehai();    
            Iterator<String> it = hais.yama.iterator();  
            System.out.println("e");           
            while(it.hasNext()){
                    String e = it.next();
                        System.out.println(e);  
                              }           
        Tumo t = new Tumo();     
        for(int i=0;i<hais.yama.size();i++){                 
        t.getHai(hais,player1);
        t.dahai(hais,player1); 
        t.getHai(hais,player2);
        t.dahai(hais,player2); 
        t.getHai(hais,player3);
        t.dahai(hais,player3);
        t.getHai(hais,player4);
        t.dahai(hais,player4); 
    }

}}