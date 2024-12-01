import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;
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
                    count++;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        System.out.println("Колличество строк: " + count);
        System.out.println("Длина самой длинной строки: " + Collections.max(coll));
        System.out.println("Длина самой короткой строки: " + Collections.min(coll));
        }

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
    }
//}
