import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Enter the third number: ");
        int c = scan.nextInt();

        if(a > b && a > c){
            System.out.println(a + " it is bigger");
        }else if(b > c){
            System.out.println(b + " it id bigger");
        }else {
            System.out.println(c + " it is bigger");
        }
    }
}