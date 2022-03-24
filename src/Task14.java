import java.io.*;

/*
Чистая любовь

Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 =
Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
 */
public class Task14 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        System.out.println(a + " + " + b + " + " + c + " = Чистая любовь, да-да!");
    }
}
