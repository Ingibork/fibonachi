package fibanachi;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 *     Решить двумя способами: с помощью цикла и с помощью
 * рекурсии.
 */
public class fiba {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int fiba = scanner.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;

        System.out.print(n0+" "+n1+" ");
        for(int j = 3; ; j++){

            n2=n0+n1;
            if (fiba < n2)
                break;
            System.out.print(n2+" ");
            n0=n1; //1
            n1=n2;  //2

        }
        System.out.println("end");
    }
}
