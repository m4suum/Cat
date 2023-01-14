package main;

import enumlesson.Days;

public class WorkWithEnum {
    public static void main(String[] args) {
        System.out.println(Days.ВТОРНИК);
        Days day = Days.ПОНЕДЕЛЬНИК;
        switch (day) {
            case ПОНЕДЕЛЬНИК:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case СРЕДА:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case ПЯТНИЦА:
                System.out.println("Учеба в {" + day.getDescription() + "}");
                break;
            case ВТОРНИК:
                System.out.println("Во {" + day.getDescription() + "} я не учусь");
                break;
            case ЧЕТВЕРГ:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;
            case СУББОТА:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;
            case ВОСКРЕСЕНЬЕ:
                System.out.println("В {" + day.getDescription() + "} я не учусь");
                break;

        }

    }
}
