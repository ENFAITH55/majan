import java.util.*;
class Tumo{
    Random r = new Random();
    int size,rand;
    Hais hais= new Hais();
    Tehai player = new Tehai();
    void getHai(Hais h,Tehai t){
        String s = "";
        this.hais =h;
        this.size=this.hais.yama.size();
        this.rand = this.r.nextInt(this.size);
        s = this.hais.yama.get(this.rand);
        t.tehai.add(s);
        this.hais.yama.remove(s);
        t.showTehai();
    }
    void dahai(Hais h,Tehai t){
        this.hais =h;
        String s ="";
         s = new java.util.Scanner(System.in).nextLine();
        t.tehai.remove(s);
        t.pretehai = t.tehai;
        t.rihai();
        t.showTehai();
    }
}