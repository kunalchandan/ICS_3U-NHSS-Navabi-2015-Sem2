import java.util.*;
public class Exam_Review_ICS_11
{
  public static void main(String[]args)
  {
    mma();
  }
  public static void mma()
  {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your weight?");
    int weight = in.nextInt();
    if (weight <= 125) 
    {
      System.out.println("Flyweight");
    }
    else if ((weight > 125) && (weight <=135)) 
    {
      System.out.println("Bantamweight");
    }
    else if ((weight > 135) && (weight <=145)) 
    {
      System.out.println("Featherweight");
    }
    else if ((weight > 145) && (weight <=155)) 
    {
      System.out.println("Lightweight");
    }
    else if ((weight > 155) && (weight <=165)) 
    {
      System.out.println("Welterweight");
    }
    else if ((weight > 175) && (weight <=185)) 
    {
      System.out.println("Middleweight");
    }
    else if ((weight > 185) && (weight <=205)) 
    {
      System.out.println("Light Heavyweight");
    }
    else if ((weight > 205) && (weight <=265)) 
    {
      System.out.println("Heavyweight");
    }
  }
}