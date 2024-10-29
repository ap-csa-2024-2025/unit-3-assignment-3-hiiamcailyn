import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int x2 = sc.nextInt(); 

    if (x2 == 0)
    {
      System.out.print("Error Message");
    }
    else 
    {
      double ratio = (double) x1/ x2;
      if  (1 < ratio && ratio <= 8)
      {
        System.out.println("Ratio ok");
      }
    }
  }



    // TODO: Problem 2


    // TODO: Problem 3
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  // public static boolean rectEqual(Rectangle r1, Rectangle r2)
  // {
  //   // implement solution here
  //   return false;
  }
}
