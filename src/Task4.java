/*
Сумма 10 чисел

Вывести на экран сумму чисел от 1 до 10 построчно:
1
1+2=3
1+2+3=6
1+2+3+4=10
 */
public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
