import java.io.*;
import java.util.*;
  public class StringEx{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=s.nextLine();
      System.out.println("Enter how many times the string to be display:");
      int r=s.nextInt();
      for(int i=0;i<r;i++)
      {
        System.out.println(in);
      }
  }
} 
