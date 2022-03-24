/*
Произведение 10 чисел

Вывести на экран произведение чисел от 1 до 10.
Подсказка: будет три миллиона с хвостиком
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(getFactorial(10));

    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i =1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
