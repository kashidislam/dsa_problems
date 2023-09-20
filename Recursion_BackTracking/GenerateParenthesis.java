import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // take the input number n 
        //GENERATE BALANCED PARENTHESIS OF LENGTH 2*n
        List<String> result = generateBalancedParenthesis(n);
        System.out.println(result.size());  // Number of balanced Parenthesis
        for(String str : result){
            System.out.println(str);
        }
    }

    public static List<String> generateBalancedParenthesis(int n){
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrackingHelper(answer,sb,0,0,n);
        return answer;
    }

    private static void backtrackingHelper(List<String> bag, StringBuilder curr, int open, int close, int max){
        if(curr.length() == max*2){
            bag.add(curr.toString());
        }
        if(open < max){
            //append '(' at the first
            curr.append('(');
            // do the recursion
            backtrackingHelper(bag,curr,open+1,close,max);
            //undo
            curr.deleteCharAt(curr.length()-1);
        }
        if(close < open){
            //append ')' at the first
            curr.append(')');
            // do the recursion
            backtrackingHelper(bag,curr,open,close+1,max);
            //undo
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
