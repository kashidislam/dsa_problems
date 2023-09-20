public class Main {
    public static void main(String[] args) {

        String s = "Hello! My Name is Kashid";
        String reversed = reverseString(s);
        System.out.println(reversed);

        String palindromeCheck = "aae";
        System.out.println(isPalindrome(palindromeCheck));

        int number = 233;
        System.out.println(decimalToBinary(number));

        int n = 6;
        System.out.println(sumNaturalNumber(n));

    }
    public static String reverseString(String inputString){

        if(inputString.isEmpty()){
            return "";
        }

        return reverseString(inputString.substring(1)) + inputString.charAt(0);
    }

    public static boolean isPalindrome(String inputString){

        if(inputString.length() == 1 || inputString.isEmpty()){
            return true;
        }

        if(inputString.charAt(0) == inputString.charAt(inputString.length()-1)){
            return isPalindrome(inputString.substring(1,inputString.length()-1));
        }

        return false;
    }

    public static int decimalToBinary(int decimalNumber){
        if(decimalNumber == 0){
            return 0;
        }
        int rem = decimalNumber % 2;
        int quotient = decimalNumber / 2;

        return (decimalToBinary(quotient) * 10) + rem;
    }

    public static int sumNaturalNumber(int number){
        if(number == 1){
            return 1;
        }
        return number + sumNaturalNumber(number-1);
    }
}
