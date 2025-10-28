import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // printNTimes("code", 3);
    // printNums();
    // uprightNumberTriangle(5);
    // starTree();
    multTable();
  }

  public static void printNTimes(String word, int N)
  {
    int i = 0;
    String output = "";
    while (i < word.length()) {
      String n = word.substring(i, i + 1);
      output = output + n + n + n;
      i++;
    }
    System.out.println(output);
  }

  public static void printNums()
  {
    int i = 10;
    while (i > 0) {
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println("");
      i--;
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    int i = 1;
    while (i <= N) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
      i++;
    }
  }

  public static void starTree()
  {
    int i = 10;
    int e = 0;
    while (i > 0) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
      
      for (int l = 0; l <= e; l++) {
        System.out.print(" ");
      }
      e++;
      i--;
    }
  }

  public static void multTable()
  {
    for (int l  = 1; l <= 10; l++) {
      for (int i = 1; i <= 10; i++) {
        System.out.print(i*l + " ");
      }
      System.out.println("");
  }
  }
}
