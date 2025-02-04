package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator! Default units are degrees, display mode is Decimal.");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        Scanner input = new Scanner(System.in);
        ScientificFunctionality sf = new ScientificFunctionality();
        BasicCalculator bc = new BasicCalculator();

        boolean loop = true;
        double screen = 0;

        do {

            if (screen == 0) {
                System.out.print("Enter number: ");
                screen = input.nextDouble();
            } else {

            System.out.print("Enter operation: ");
            String operation = input.next();
            String operator = operation.toLowerCase();

            switch (operator) {
                case "clear":
                    screen = 0;
                    Console.println("Answer: %s", screen);
                    break;
                case "+":
                    System.out.println("Enter number: ");
                    double num2 = input.nextDouble();
                    screen = bc.add(screen, num2);
                    Console.println("Answer: %s", screen);
                    break;
                case "-":
                    System.out.println("Enter number: ");
                    num2 = input.nextDouble();
                    screen = bc.subtract(screen, num2);
                    Console.println("Answer: %s", screen);
                    break;
                case "*":
                    System.out.println("Enter number: ");
                    num2 = input.nextDouble();
                    screen = bc.multiply(screen, num2);
                    Console.println("Answer: %s", screen);
                    break;
                case "/":
                    System.out.println("Enter number: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Divide by 0 error");
                    } else {
                        screen = bc.divide(screen, num2);
                        Console.println("Answer: %s", screen);
                    }
                    break;
                case "%":
                    System.out.println("Enter number: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Divide by 0 error");
                    } else {
                        screen = bc.modulus(screen, num2);
                        Console.println("Answer: %s", screen);
                    }
                    break;
                case "square":
                    screen *= screen;
                    Console.println("Answer: %s", screen);
                    break;
                case "squareroot":
                    screen = Math.sqrt(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "exponent":
                    System.out.println("Enter number: ");
                    num2 = input.nextDouble();
                    screen = Math.pow(screen, num2);
                    Console.println("Answer: %s", screen);
                    break;
                case "inverse":
                    screen = 1 / screen;
                    Console.println("Answer: %s", screen);
                    break;
                case "negative":
                    screen = -screen;
                    Console.println("Answer: %s", screen);
                    break;
                case "sin":
                    screen = sf.calcSine(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "cos":
                    screen = sf.calcCoSine(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "tan":
                    screen = sf.calcTangent(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "arcsin":
                    screen = sf.calcInverseSine(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "arccos":
                    screen = sf.calcInverseCosine(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "arctan":
                    screen = sf.calcInverseTangent(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "log":
                    screen = sf.calcLog(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "inverselog":
                    screen = sf.calcInverseLog(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "ln":
                    screen = sf.calcNaturalLog(screen);
                    Console.println("Answer: %s", screen);
                    break;
                case "inverseln":
                    screen = sf.calcInverseNaturalLog(screen);
                    Console.println("Answer: %s", screen);
                    break;

                case "units":
                    System.out.println("Degrees or Radians? ");
                    String units = input.next();
                    System.out.println(sf.switchUnitsMode(units));
                    break;
                case "mode":
                    System.out.println("Binary, Octal, Decimal or Hexadecimal? ");
                    String mode = input.next();
                    System.out.println(sf.switchDisplayMode(mode));
                    break;
                default:
                    System.out.println("Command not recognized.");
                    break;
                    }
            System.out.println("Continue? Y or N: ");
            String more = input.next();
            if (more.equals("N")) {
                loop = false;
            }}
        } while(loop);
    }
}
