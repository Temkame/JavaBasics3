import java.io.*;

/*
Как захватить мир

Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
( Последовательность вводимых данных имеет большое значение.)

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
 */
public class Task10 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        System.out.println(a + " захватит мир через " + b + " лет. Му-ха-ха");
    }
}
