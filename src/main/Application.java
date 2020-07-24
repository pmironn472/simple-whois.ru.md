package main;


import box.BigBox;
import box.Box;
import box.SmallBox;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        SmallBox sBox = new SmallBox();
        BigBox bBox = new BigBox();

        System.out.println(testBox(sBox));
        System.out.println(testBox(bBox));


    }

    public static Boolean testBox(Box box) {
       if(box.getClass().equals(SmallBox.class)){
           SmallBox sBox = (SmallBox)box;
           Integer value = new Random().nextInt();
           sBox.setValue(value);
           return sBox.getValue().equals(value);
       }
       else{
           BigBox bigBox = (BigBox)box;
           Integer valueOne = new Random().nextInt();
           Integer valueTwo = new Random().nextInt();
           bigBox.setValueOne(valueOne);
           bigBox.setValueTwo(valueTwo);

           return bigBox.getValueOne().equals(valueOne) && bigBox.getValueTwo().equals(valueTwo);
       }
    }

}


