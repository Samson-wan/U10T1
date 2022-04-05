import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println(factorial(10));
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));

    }

    public static int factorial(int num){
        int product = 1;
        for(int i = 1; i <= num; i++){
            product *= i;
        }
        return product;
    }

    public static String countdown(int num){
        if(num == 0){
            return "Blastoff!";
        }
        return num  + " " + countdown(num - 1);
    }
}
