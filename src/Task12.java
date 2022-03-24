import java.io.*;

/*
Скромность украшает человека

Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
 */
public class Task12 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();
        System.out.println(a + " зарабатывает $5,000. Ха-ха-ха");
    }
}
