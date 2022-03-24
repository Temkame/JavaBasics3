import java.io.*;

/*
Я буду зарабатывать $50 в час

Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

Пример:
Я буду зарабатывать $50 в час
 */
public class Task16 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();

        System.out.println("Я буду зарабатывать $" + a + " в час.");
    }
}
