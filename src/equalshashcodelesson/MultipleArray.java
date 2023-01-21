package equalshashcodelesson;

import java.util.ArrayList;

public class MultipleArray {
    public static void main(String[] args) {
        ArrayList<Multiple> nums = new ArrayList<>();
        Multiple multiple1 = new Multiple(1, 2);
        Multiple multiple2 = new Multiple(5, 3);
        Multiple multiple3 = new Multiple(8, 6);
        Multiple multiple4 = new Multiple(24, 2);
        Multiple multiple5 = new Multiple(16, 3);
        Multiple multiple6 = new Multiple(121, 6);
        checkMultiple(multiple1, nums);
        checkMultiple(multiple2, nums);
        checkMultiple(multiple3, nums);
        checkMultiple(multiple4, nums);
        checkMultiple(multiple5, nums);
        checkMultiple(multiple6, nums);
    }

    public static void checkMultiple(Multiple multiple, ArrayList<Multiple> nums) {
        boolean isHas = true;
        for (Multiple num : nums) {
            if (multiple.equals(num)) {
                isHas = false;
                System.out.println("A = " + multiple.getA() + ", B = " + multiple.getB() + ", there is already such a result --->>> " + num.getMultiple());
                break;
            }
        }
        if (isHas) {
            System.out.println("A = " + multiple.getA() + ", B = " + multiple.getB() + ", numbers can be added because their product --->>> " + multiple.getMultiple());
            nums.add(multiple);
        }

    }
}
