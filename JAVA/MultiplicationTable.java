// Java program to print table of a number 
import java.io.*;

class GfG {

    public static void printTable(int n)  {
              
        for (int i = 1; i <= 10; ++i) 
            System.out.println(n + " * " + i +
                               " = " + n * i);
    }
  
    public static void main(String arg[]){   
        int n = 5; 
		printTable(n);
    }
}