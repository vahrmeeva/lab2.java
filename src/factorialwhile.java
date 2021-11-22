import java.util.Scanner;
public class factorialwhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое натуральное число n меньше 15:");
        int n = scanner.nextInt();
        int i=1,k=1;
        while (i<=n) {
            i++;
            k = k*i;
        }
        System.out.print("n!="+k);
    }
}
