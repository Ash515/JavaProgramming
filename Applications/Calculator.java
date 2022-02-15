package Applications;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

class Main {
    public static void main(String[] args) {

        char operator;
        Double s1,  number1, number2, result, percentincrease, percentdecrease;
        int analysis;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, /,%");
        operator = input.next().charAt(0);

        // ask users to enter numbers

        switch (operator) {

        // performs addition between numbers
        case '+':
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            System.out.println("Enter second number");
            number2 = input.nextDouble();
            result = number1 + number2;
            System.out.println("Addition of two values:" + result);
            break;

        // performs subtraction between numbers
        case '-':
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            System.out.println("Enter second number");
            number2 = input.nextDouble();

            result = number1 - number2;
            System.out.println("Subtraction of two values:" + result);
            break;

        // performs multiplication between numbers
        case '*':
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            System.out.println("Enter second number");
            number2 = input.nextDouble();
            result = number1 * number2;
            System.out.println("Multiplication of two values:"+ result);
            break;

        // performs division between numbers
        case '/':
            System.out.println("Enter first number");
            number1 = input.nextDouble();
            System.out.println("Enter second number");
            number2 = input.nextDouble();

            result = number1 / number2;
            System.out.println("Division of two values:"+ result);
            break;
        case '%':
            System.out.println(
                    "Which operations do you want to perform?\n1.What percentage of scored from total \n 2.What percentage of total from scored \n 3.Check Increase or Decrease percentage from scored to total \n ");
            analysis = input.nextInt();
            switch (analysis) {
            case 1:
                System.out.println("Enter scored Value");
                number1 = input.nextDouble(); // score
                System.out.println("Enter total Value");
                number2 = input.nextDouble(); // total
                result = (number1 / number2) * 100;
                System.out.println(number1 + " % " + number2 + " = " + result);
                break;
            case 2:
                System.out.println("Enter scored Value");
                number1 = input.nextDouble(); // score

                System.out.println("Enter total Value");
                number2 = input.nextDouble(); // total
                s1 = ((number1 - number2) / number1) * 100;
                s1 = ((number1 - number2) / number1) * 100;
                System.out.println("Percentage of Total from Scored is" + s1);
                break;

            case 3:

                System.out.println("Enter scored Value");
                number1 = input.nextDouble(); // score

                System.out.println("Enter total Value");
                number2 = input.nextDouble(); // total
                percentincrease = ((number1 - number2) / number2) * 100;
                percentdecrease = ((number2 - number1) / number2) * 100;
                System.out.println("Increased Percent" + percentincrease);
                System.out.println("Decreased Percent" + percentdecrease);
                if (percentincrease > percentdecrease) {
                    System.out.println("Percentage of Total from Scored value it is Increasing !!");
                } else if (percentincrease < percentdecrease) {
                    System.out.println("Percentage of Total from Scored value it is Decreasing !!");
                } else {
                    System.out.println("Equal!!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;

            }

            break;
        default:
            System.out.println("Invalid operator!");
            break;
        }

        input.close();
    }

}