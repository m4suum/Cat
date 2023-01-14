package enumlesson;

public enum Days {
    ПОНЕДЕЛЬНИК ("Понедельник"),
    ВТОРНИК ("Вторник"),
    СРЕДА ("Среда"),
    ЧЕТВЕРГ("Четверг"),
    ПЯТНИЦА("Пятница"),
    СУББОТА("Суббота"),
    ВОСКРЕСЕНЬЕ("Воскресенье");
    private String description;
    Days(String description){
        this.description = description;
    }
    public String getDescription (){
        return this.description;
    }
}
