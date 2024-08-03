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

class timeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    
        String period = s.substring(s.length() - 2);
     
        int hour = Integer.parseInt(s.substring(0, 2));
        
     if (period.equals("AM")) {
          
            if (hour == 12) {
                hour = 0;
            }
        } else { 
         
            if (hour != 12) {
                hour += 12;
            }
        }
         String hourString = String.format("%02d", hour);
       
        String result = hourString + s.substring(2, s.length() - 2);
        
        return result;

    }

}

public class timeConversion1{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
