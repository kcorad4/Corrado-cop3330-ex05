import java.util.Scanner;

public class SimpleMath {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the first number");
        int first = sc.nextInt();
        System.out.println("what is the second number");
        int second = sc.nextInt();

        int sum = first + second;
        System.out.println(first + "+" + second + "=" + sum);

        int sub = first - second;
        System.out.println(first + "-" +second + "=" + sub);

        int multiply = first * second;
        System.out.println(first + "*" + second + "=" + multiply);

        int div = first / second;
        System.out.println(first +"/" + second + "=" + div);

    }

}
