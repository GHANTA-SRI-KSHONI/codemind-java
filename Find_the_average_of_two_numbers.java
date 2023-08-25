import java.util.Scanner;
public class Laav{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float av=(float)(a+b)/2;
        System.out.format("%.4f",av);
    }
}