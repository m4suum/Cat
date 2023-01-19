package main;


import java.util.Arrays;
import java.util.Scanner;

public class WorkWithString {
    public static void main(String[] args) {
        System.out.print("Введите слово ");
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = firstWord.toLowerCase().replaceAll("а", "б");
        System.out.println("Все 'а' заменены на 'б' --->>> " + secondWord);
        System.out.print("\nВведите строку ");
        String line = scanner.nextLine();
        System.out.println("Ваша строка --->>> " + line);
        String [] words = line.split(" +");
        System.out.println("Массив получившийся из слов вашей сроки --->>> " + Arrays.toString(words));
        String max = words [0];
        for (int i = 0; i < words.length; i++){
            if (words [i].length() > max.length()){
                max = words [i];
            }
        }
        System.out.println("\nСамое длинное слово --->>> " + max + "\nДлина самого длинного слова --->>> " + max.length());
        System.out.println("Кол-во слов --->>> " + words.length);
        System.out.print("\nВведите ФИО ");
        String snp = scanner.nextLine();
        String [] name = snp.split(" +");
        System.out.println((name[1].substring(0, 1).toUpperCase() + ".") +(name[2].substring(0, 1).toUpperCase() + ". ") + name [0].substring(0,1).toUpperCase() + name [0].substring(1).toLowerCase());

    }
}
