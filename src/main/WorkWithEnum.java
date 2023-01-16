package main;

import enumlesson.Day;

import java.util.Arrays;

public class WorkWithEnum {
    public static void main(String[] args) {
        System.out.println(Day.WEDNESDAY);

        Day day1 = Day.FRIDAY;
        System.out.println(day1.name());
        System.out.println("Кол-во уроков в этот день --->>> " + day1.getLessons());

        Day day2 = Day.valueOf("THURSDAY");
        System.out.println(day2);
        System.out.println("Кол-во уроков в этот день --->>> " + day2.getLessons());
        System.out.println("INDEX OF DAY2 --->>> " + day2.ordinal());

        System.out.println("WORK OF METHOD  VALUES --->>> " + Arrays.toString(Day.values()));

        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case WEDNESDAY:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case FRIDAY:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case TUESDAY:
                System.out.println("Во {" + day.getDescription() + "} я не учусь");
                break;
            case THURSDAY:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;
            case SATURDAY:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;
            case SUNDAY:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;

        }

    }
}
