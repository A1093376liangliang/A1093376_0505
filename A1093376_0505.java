import java.util.*;

class MyException extends Exception{
    MyException(String a){
        super(a);
    }
}
public class A1093376_0505{
    public static void main(String[] args) throws Exception{
        int l1=45, l2=20, l3=02, l4=27, l5=38, l6=15;

        int x1, x2, x3, x4, x5, x6;
        System.out.print("請輸入六個整數(1~49):");
        Scanner input = new Scanner(System.in);
        x1=input.nextInt();
        x2=input.nextInt();
        x3=input.nextInt();
        x4=input.nextInt();
        x5=input.nextInt();
        x6=input.nextInt();
        try{
            if(x1<1 || x1>49 || x2<1 || x2>49 || x3<1 || x3>49 || x4<1 || x4>49 || x5<1 || x5>49 || x6<1 || x6>49){
                throw new MyException("請輸入1～49範圍內之整數～謝謝");
            }
            if(l1==x1 && l2==x2 && l3==x3 && l4==x4 && l5==x5 && l6==x6){
                System.out.print("恭喜中到大獎～");
            }else{
                System.out.println("很遺憾，沒有中獎，下次再加油～");
                System.out.print("本次得獎號碼為:45 20 02 27 38 15");
            }
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
