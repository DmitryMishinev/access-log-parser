import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Year;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        double count = 0;
        List<Query> queries = new ArrayList<>();
        List<Integer> coll = new ArrayList<>();
//        while (true) {
//            System.out.println("Введите путь к файлу:");
//            String path = new Scanner(System.in).nextLine();
//            File file = new File(path);
//            boolean pathExists = file.exists();
//            boolean isDirectory = file.isDirectory();
//            if (isDirectory || !pathExists) {
//                System.out.println("Указан путь к папке или файл не существует");
//                continue;
//            }
//            if (pathExists) {
//                System.out.println("Путь указан верно");
//                count++;
//                System.out.println("Это файл номер " + count);
//            }
              System.out.println("Введите путь к файлу:");
              String path = new Scanner(System.in).nextLine();
            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader =
                        new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();
                    if (length > 1024) {
                        throw new Exception_1024("Длина строки больше 1024");
                    }
                    coll.add(length);
                    //System.out.println(Arrays.asList(line.replace(" - - ","#").split("[#\"]")));
                    queries.add(new Query(line.replace(" - - ","#").split("[#\"]")));
                    count++;

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        System.out.println("Колличество строк: " + count);
        System.out.println("Длина самой длинной строки: " + Collections.max(coll));
        System.out.println("Длина самой короткой строки: " + Collections.min(coll));
        double countGoogle=0;
        double countYandex=0;

        for (Query q : queries) {
            if (q.userAgent.equals("Googlebot")){
                countGoogle++;
            }
            if (q.userAgent.equals("YandexBot")){
                countYandex++;
            }
        }
        queries.get(0).getInfo();
        System.out.println(countYandex);
        System.out.println("Доля обращений через Googlebot: " + countGoogle/count*100.00+"%");
        System.out.println("Доля обращений через YandexBot: " + countYandex/count*100+"%");

    }

        }
        //String[] arr = line.split( "");
        //System.out.println(Arrays.asList(arr));


//        try {
//            FileReader fileReader = new FileReader(path);
//            BufferedReader reader =
//                    new BufferedReader(fileReader);
//            String line;
//            while ((line = reader.readLine()) != null) {
//                int length = line.length();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


//        System.out.println("Введите текст и нажмите <Enter>:");
//        String text = new Scanner(System.in).nextLine();
//        System.out.println("Длина текста: " + text.length());
//}
