//author: Yazid Escudero

import java.util.Scanner;

public class Calculator {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the frist NUMBER");
    double firstNum = in.nextDouble();
    System.out.println("Please enter the operator");
    char userOperator = in.next().charAt(0);
    System.out.println("Please enter the second NUMBER");
    double secondNum = in.nextDouble();

    switch(userOperator) {
      case '+':
        System.out.println(firstNum + secondNum);
        break;

      case '-':
        System.out.println(firstNum - secondNum);
        break;

      case '/':
        System.out.println(firstNum / secondNum);
        break;

      case '%':
        System.out.println(firstNum % secondNum);
        break;

      case '*':
      case 'x':
      case 'X':
        System.out.println(firstNum * secondNum);
        break;

      default:
        System.out.println("Invalid Operator");
    }


  }

}
