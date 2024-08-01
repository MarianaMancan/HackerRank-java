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

class minMaxSum {

   

   public static void main(String[] args) throws IOException {
    
     Scanner scan = new Scanner(System.in);
    
      int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(numbers);
        
        Long minSum = 0L;
        Long maxSum = 0L;
        for (int i = 0; i < 4; i++) {
            minSum += numbers[i];
        }
       for (int i = 1; i < 5; i++) {
           maxSum += numbers[i];
       }

       System.out.println(minSum + " " + maxSum);


    }

}
