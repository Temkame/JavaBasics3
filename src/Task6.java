/*
Таблица умножения

Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
 */
public class Task6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for (int y =1; y <= 10; y++ ){
                System.out.print(y  * i + " ");
            }
            System.out.println("");
        }
    }
}
