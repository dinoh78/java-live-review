package week10;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList(); //raw type - can be any type, not recommended
        rawList.add(123);
        rawList.add(4534.55);
        rawList.add("hello");
        rawList.add(true);
        System.out.println("rawList = " + rawList);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(32);
        nums.add(653);
        nums.add(234);
        nums.add(432);
        nums.add(444);
        nums.add(32);
        System.out.println("size = " + nums.size());
        System.out.println("nums = " + nums);
        //add to specific index
        nums.add(0,5);
        nums.add(2,99);
        System.out.println("nums = " + nums);

        //modify value at certain index:
        nums.set(0,50);
        System.out.println("nums = " + nums);

        //read specific index:
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 5 = " + nums.get(5));
        System.out.println("last index = " + nums.get(nums.size() - 1));

        //loop trough each number and double it
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,nums.get(1)*2);
            System.out.println("nums = " + nums);

            //check if number 100 is in the list
            if (nums.contains(100)){
                System.out.println("100 is in list");

            }
            //remove from list
            nums.remove(Integer.valueOf(100));
            nums.remove(0);//index
            System.out.println("nums = " + nums);

        }


    }
}

