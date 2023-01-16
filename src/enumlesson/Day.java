package enumlesson;

public enum Day {
    MONDAY ("Понедельник", 8),
    TUESDAY ("Вторник", 7),
    WEDNESDAY  ("Среда", 6),
    THURSDAY("Четверг", 8),
    FRIDAY("Пятница", 9),
    SATURDAY("Суббота", 0),
    SUNDAY("Воскресенье", 0);
    private String translationOfDay;
    private int lessons;
    Day(String description, int lessons){
        this.translationOfDay = description;
        this.lessons = lessons;
    }
    public String getDescription (){
        return this.translationOfDay;
    }
    public int getLessons (){
        return this.lessons;
    }
    @Override

    public String toString (){
        return "Сегодня --->>> " + this.translationOfDay;
    }
}
