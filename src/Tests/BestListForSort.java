package Tests;

import java.util.*;

public class BestListForSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int[] array2 = array;
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(random.nextInt(100));
        }
        LinkedList <Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkedList.add(random.nextInt(100));
        }


        double startTime0 = System.currentTimeMillis();
        {
            Collections.sort(arrayList);
        }
        double time0 = System.currentTimeMillis() - startTime0;
        System.out.println("ARRAY_LIST'S SPEED  COLLECTIONS SORT --->>> " + time0);



        double startTime1 = System.currentTimeMillis();
        {
            quickSort(array, 0, array.length - 1);
        }
        double time1 = System.currentTimeMillis() - startTime1;
        System.out.println("ARRAY'S SPEED  quickSort --->>> " + time1);



        double startTime2 = System.currentTimeMillis();
        {
            innerSort (array2);
        }
        double time2 = System.currentTimeMillis() - startTime2;
        System.out.println("ARRAY'S SPEED  ARRAYSORT --->>> " + time2);




        double startTime3 = System.currentTimeMillis();
        {
            Collections.sort(linkedList);
        }
        double time3 = System.currentTimeMillis() - startTime3;
        System.out.println("LINKED_LIST'S SPEED  COLLECTIONS SORT --->>> " + time3);

    }

    public static void innerSort(int[] integers) {
        Arrays.sort(integers);
    }
    public static void quickSort(int[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}
