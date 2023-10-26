import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        double feedback = 0.0;
        Memory memory = new Memory();
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("+ for Addition");
            System.out.println("- for Subtraction");
            System.out.println("* for Multiplication");
            System.out.println("/ for Division");
            System.out.println("m for Memory");
            System.out.println("s for Scientific Calculator");
            System.out.println("Q to Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice.equalsIgnoreCase("m")) {
                System.out.println("Choose an operation: ");
                System.out.println("v for View a number in the memory");
                System.out.println("+ for Add a number to the memory");
                System.out.println("- for Cancel a number to the memory");
                System.out.print("Enter your choice: ");
                String choose = scanner.next();
                switch(choose){
                    case("+"):
                        System.out.println("Insert a value: ");
                        memory.addToMemory(scanner.nextDouble());
                        break;

                    case("-"):
                        memory.clear();
                        System.out.println("Memory clear");
                        break;

                    case("v"):
                        System.out.println("Number in memory: " + memory.recall());
                        break;
                }
                continue;
            }
/*
            if (choice.equalsIgnoreCase("s")) {
                ScientificCalculator sc = new ScientificCalculator();
                System.out.println("Choose an operation: ");
                System.out.println("sin for Sine function");
                System.out.println("cos for Cosine function");
                System.out.println("tan for Tangent");
                System.out.println("cotan for Cotangent");
                System.out.println("arcsin for Arcsine");
                System.out.println("arcos for Arcosine");
                System.out.println("arctan for Arctangent");
                System.out.println("arcotan for Arcotangent");
                System.out.println("sqr for Square root");
                System.out.println("ln for natuarl log");
                System.out.println("log10 for log in base 10");
                System.out.println("pow for power");
                System.out.println("exp for exponent");
                System.out.print("Enter your choice: ");
                String choose = scanner.next();
                double res=0.0;
                switch(choose){

                    case("sin"):
                        System.out.println("Insert a value: ");
                        res=sc.sin(scanner.nextDouble());
                        System.out.println(res);
                        feedback=res;
                        break;

                    case("cos"):
                        System.out.println("Insert a value: ");
                        res=sc.cos(scanner.nextDouble());
                        System.out.println(res);
                        feedback=res;
                        break;

                    case("tan"):
                        System.out.println("Insert a value: ");
                        res=sc.sin(scanner.nextDouble());
                        System.out.println(res);
                        feedback=res;
                        break;

                    case("cotan"):
                        System.out.println("Insert a value: ");
                        res=sc.cot(scanner.nextDouble());
                        System.out.println(res);
                        feedback=res;
                        break;

                    case("pow"):
                        System.out.println("Insert a value for base: ");
                        double base=scanner.nextDouble();
                        System.out.println("Insert a value for exponent: ");
                        double exponent=scanner.nextDouble();
                        res=sc.pow(base, exponent);
                        System.out.println(res);
                        feedback=res;
                        break;

                    case("sqrt"):
                        System.out.println("Insert a value: ");
                        res=sc.sqrt(scanner.nextDouble());
                        System.out.println(res);
                        feedback=res;
                        break;
                }
                continue;
            }
*/
            System.out.print("Enter the number of values: ");
            int total_num = scanner.nextInt();
            double[] numbers = new double[total_num];

            for (int i = 0; i < total_num; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                String next=scanner.next();
                if (next.equalsIgnoreCase("f")){
                    numbers[i] = feedback;
                }
                else if (next.equalsIgnoreCase("m")){
                    numbers[i] = memory.recall();
                }
                else{
                    numbers[i] = Double.parseDouble(next);
                }

            }

            double result = 0;
            String operator = "";

            switch (choice) {
                case "+":
                    result = Sum.add(numbers);
                    operator = "+";
                    feedback=result;
                    break;
                case "-":
                    result = Subtraction.sub(numbers);
                    operator = "-";
                    feedback=result;
                    break;
                case "*":
                    result = Multiply.multiply(numbers);
                    operator = "*";
                    feedback=result;
                    break;
                case "/":
                    result = Division.divide(numbers);
                    operator = "/";
                    feedback=result;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.print("Result: ");
            for (int i = 0; i < total_num; i++) {
                System.out.print(numbers[i]);
                if (i < total_num - 1) {
                    System.out.print(" " + operator + " ");
                }
            }
            System.out.println(" = " + result);
        }

        scanner.close();
    }
}
