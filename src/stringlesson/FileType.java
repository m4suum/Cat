package stringlesson;

import java.util.Scanner;

public class FileType {
    public static void main(String[] args) {
        changeTypeOfFile();
    }
    public static void changeTypeOfFile (){
        String choice = "yes";
        while (choice.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the file's name ");
            String nameOfFile = scanner.nextLine();
            System.out.print("Enter the file's type ");
            String typeOfFile = scanner.next();
            String result;
            int indexOfPoint = 0;
            if (nameOfFile.contains(".")) {
                for (int i = 0; i < nameOfFile.length(); i++) {
                    if (nameOfFile.substring(i, i + 1).equals(".")) {
                        indexOfPoint = i;
                    }
                }
                result = nameOfFile.substring(0, indexOfPoint + 1);
                result += typeOfFile.toLowerCase();
            } else {
                result = nameOfFile + "." + typeOfFile.toLowerCase();
            }
            System.out.println("RESULT --->>> " + result);
            System.out.print("\nDo you want to continue? ");
            choice = scanner.next().toLowerCase();
            if (choice.equals("yes")) System.out.println("Ok, we'll continue");
            else if (choice.equals("no")) System.out.println("Okay, we'll stop");
            else{
                do {
                    System.out.print("Write your answer correctly ");
                    choice = scanner.next();
                } while (!choice.equals("yes") && !choice.equals("no"));
            }
        }
    }
}
