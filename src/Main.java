import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean pathExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if(isDirectory || !pathExists){
                System.out.println("Указан путь к папке или файл не существует");
                continue;
            }
            if(pathExists){
                System.out.println("Путь указан верно");
                count++;
                System.out.println("Это файл номер "+count);
            }
        }


//        System.out.println("Введите текст и нажмите <Enter>:");
//        String text = new Scanner(System.in).nextLine();
//        System.out.println("Длина текста: " + text.length());
    }
}
