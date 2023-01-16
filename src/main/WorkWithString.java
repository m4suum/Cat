package main;


import java.util.Arrays;
import java.util.Scanner;

public class WorkWithString {
    public static void main(String[] args) {
//        System.out.print("Введите слово ");
        Scanner scanner = new Scanner(System.in);
//        String firstWord = scanner.next();
//        String secondWord = firstWord.toLowerCase().replaceAll("а", "б");
//        System.out.println(secondWord);
        String line = scanner.nextLine();
        System.out.println("Ваша строка: " + line);
        String [] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        String max = words [0];
        for (int i = 0; i < words.length; i++){
            if (words [i].length() > max.length()){
                max = words [i];
            }
        }

        System.out.println("Самое длинное слово --->>> " + max + "\nДлина самого длинного слова --->>> " + max.length());
        System.out.println("Кол-во слов --->>> " + words.length);
        System.out.println("Sub --->>> " + line.substring(2));
        System.out.print("Введите ФИО ");
        String surname = scanner.next();
        String name = scanner.next();
        String patronymic = scanner.next();
        System.out.println((name.substring(0, 1) + ".") +(patronymic.substring(0, 1) + ". ") + surname );

    }
}
