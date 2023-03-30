package Calculator;
import java.util.Scanner;
public class CalculatorRunner{
    public static void main(String[] args){
        Calculator Calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        //String eqn = sc.nextLine();
        String eqn = "3*(9-(2+2))";
        System.out.println(Calculator.calc(eqn, 0, eqn.length()));
    }
}