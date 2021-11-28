import java.util.*;
import java.util.Random;
class Tehai{
    ArrayList<String> pretehai=new ArrayList<String>();
    ArrayList<String> tehai=new ArrayList<String>();
    Hais hais = new Hais();
    int i,size,prev=0;
    Random r = new Random();
    int h;
    Hais haipai(Hais l){
        String s = "";
        this.hais=l;
        this.h=hais.yama.size();
           for(i=0;i<13;i++){
            h=hais.yama.size();
               this.size = this.r.nextInt(h);
               s = this.hais.yama.get(this.size);
                this.pretehai.add(s); 
                this.hais.yama.remove(s);
           }
           return l;
    }
    void showTehai(){    
        Iterator<String> it = tehai.iterator();           
        while(it.hasNext()){
                String e = it.next();
                    System.out.print(e+" ");  
                    
                          }          
                          System.out.println(" ");
       }
       void showpreTehai(){    
        Iterator<String> it = pretehai.iterator();           
        while(it.hasNext()){
                String e = it.next();
                    System.out.println(e);  
                          }          
       }   
    void rihai(){
        int k,m,n,o;
        String s = "";
        for(k=0;k<9;k++){
            for(m=0;m<4;m++){
                n = this.pretehai.indexOf(k+1+"m");
                if(n!=-1){
                    s = this.pretehai.get(n);
                    this.tehai.add(s);
                    this.pretehai.remove(n);
                }
                
            }
        }
       
    for(k=0;k<9;k++){
        for(m=0;m<4;m++){
            n = this.pretehai.indexOf(k+1+"p");
            if(n!=-1){
                s = this.pretehai.get(n);
                this.tehai.add(s);
                this.pretehai.remove(n);
            }
            
        }
    }
   
for(k=0;k<9;k++){
    for(m=0;m<4;m++){
        n = this.pretehai.indexOf(k+1+"s");
        if(n!=-1){
            s = this.pretehai.get(n);
            this.tehai.add(s);
            this.pretehai.remove(n);
        }
        
    }
}   
for(k=0;k<9;k++){
    for(m=0;m<4;m++){
        n = this.pretehai.indexOf(k+1+"j");
        if(n!=-1){
            s = this.pretehai.get(n);
            this.tehai.add(s);
            this.pretehai.remove(n);
        }
        
    }
}
}   
    }