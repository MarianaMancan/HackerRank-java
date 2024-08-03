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

class miniMaxSum {


 public static void miniMaxSum(List<Integer> arr) {
       
        Collections.sort(arr);
        
     
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

       
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr.get(i);
        }

      
        System.out.println(minSum + " " + maxSum);
    }

}

public class miniMaxSum1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        miniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}