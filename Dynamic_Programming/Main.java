import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();   //number < 46 (overflow Integer MAX_VALUE)
        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }

        if (n <= 2) {
            map.put(n, 1);
            return map.get(n);
        }
        map.put(n,fibonacci(n-1) + fibonacci(n-2));
        return map.get(n);
    }
}