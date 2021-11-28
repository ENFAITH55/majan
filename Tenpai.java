import java.util;
class Tenpai{
    Tehai tehai;
    int i,j,mentu=0;
    int[] jantou = new int[2];
    int[][] syuntu = new int[4][3];
    int[][] kotu = new int[4][3]; 

    void Tenpai(Tehai t){
        this.tehai = t;
    }
    boolean isTenpai(){
        setHead();
        setSyuntu();
    }
    void setHead(){
        for(i=0;i<13;i++){
            if(this.tehai.tehai.get(i)==this.tehai.tehai.get(i+1)&& !Arrays.asList(jantou).contains(i)){
                jantou[0] = i;
                jantou[1] = i+1;
                System.out.println(jantou);
            }
        }
    }
    void setSyuntu(){
        for(i=0;i<13;i++){
            for(j=0;j<3;j++){
                if(this.tehai.tehai.get(i)==this.tehai.tehai.get(i).charAt(1)+1+this.tehai.tehai.get(i).charAt(2)&&
                this.tehai.tehai.get(i+1)==this.tehai.tehai.get(i+1).charAt(1)+1+this.tehai.tehai.get(i+1).charAt(2)){
                    syuntu[mentu][0]=i;
                    syuntu[mentu][1]=i+1;
                    syuntu[mentu][2]=i+2;
                    mentu+=1;
                }

            }
        }
    }
}