import java.util.Scanner;

/*Пользователь вводит с клавиатуры целое
неотрицательное число n (n<15). С помощью
циклов for и while посчитать факториал n! и вывести на
экран.*/
public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое натуральное число n меньше 15:");
        int n = scanner.nextInt();
        int i,k=1;
        for ( i=2; i<=n ; i++){
             k = k*i;
        }
        System.out.print("n!="+k);
    }
}
