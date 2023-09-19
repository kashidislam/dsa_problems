import java.util.HashMap;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer,Integer> keyValue = new HashMap<>();
        keyValue.put(0,0);
        keyValue.put(1,1);
        int result = fibonacci(n,keyValue);
        System.out.println(result);
    }

    public static int fibonacci(int number,HashMap<Integer,Integer> map){
        if(number < 0){
            System.out.println("Invalid Input! Please take valid input");
            return -1;
        }
        if(number == 0 || number == 1) {
            return map.get(number);
        }
        if(map.containsKey(number)){
            return map.get(number);
        }
        int result = fibonacci(number-1,map) + fibonacci(number-2,map);
        map.put(number,result);
        return result;
    }

}
