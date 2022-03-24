import java.io.*;

/*
Спонсор - это звучит гордо

Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.

Пример:
Коля проспонсировал Лену, и она стала известной певицей.
 */
public class Task13 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        System.out.println(a + " проспонсировал " + b + ", и она стала известной певицей.");
    }
}
