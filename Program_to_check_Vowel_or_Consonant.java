import java.util.Scanner;
public class Kshoni
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
      char ch=s.next().charAt(0);
      if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
      {
          System.out.println("Vowel");
      }
      else
      {
          System.out.println("Consonant");
      }
    }
}
        