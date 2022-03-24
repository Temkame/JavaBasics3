import java.io.*;

/*
Зарплата через 5 лет

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись: «Имя» получает «число1» через «число2» лет.
 */
public class Task11 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String с = bufferedReader.readLine();

        System.out.println(a + " получает " + b + " через" + с + " лет.");

    }
}
