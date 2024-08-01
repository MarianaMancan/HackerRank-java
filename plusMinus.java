import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class plusMinus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        
       
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        scan.close();

        System.out.printf("%.6f%n", positive / size);
        System.out.printf("%.6f%n", negative / size);
        System.out.printf("%.6f%n", zeros / size);
    }
}