import java.util.Scanner;

public class ClasseCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber = 0;
        while (scan.hasNext()){
            lineNumber ++;
            System.out.println(lineNumber + " " + scan.nextLine());
        }
    }
}
