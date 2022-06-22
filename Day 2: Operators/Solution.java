import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        double T = sc.nextDouble(); // tip percentage
        double X = sc.nextDouble(); // tax percentage
        
        double tip = T/100 * M;
        double tax = X/100 * M;
        double total = M + tip + tax;
        int t = (int) Math.round(total);
        
        System.out.println(t);
    }
}