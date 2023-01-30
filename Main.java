package se.hkr.task1;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ChocolatePiece[] chocolateCalender = main.storeChocolateObjects();

        /*int k = chocolateCalender.length;
        for (int i = 0; i < k; i++) {
            System.out.println((i + 1) + "<<" + chocolateCalender[i].getShape() + " " + chocolateCalender[i].getWeight() + " " + chocolateCalender[i].getEaten());
        }*/
        main.openCalendar(chocolateCalender);

        //for(int i = 0; i < chocolateCalender.length; i++)
        //System.out.println(chocolateCalender[i].getShape()+ ", " + chocolateCalender[i].getWeight());
    }


    public ChocolatePiece[] storeChocolateObjects() {
        /*List<ChocolatePiece> arr = new ArrayList<>();
        ChocolatePiece star = new ChocolatePiece("star", 7);
        ChocolatePiece santa = new ChocolatePiece("Santa", 8);
        ChocolatePiece tree = new ChocolatePiece("tree", 6);
        arr.add(star);
        arr.add(santa);
        arr.add(tree);
        Random rand = new Random();
        List<ChocolatePiece> calender = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            int r = rand.nextInt(arr.size());
            calender.add(new ChocolatePiece(arr.get(r).getShape(),arr.get(r).getWeight()));*/


        ChocolatePiece[] calender = new ChocolatePiece[24];
        ChocolatePiece[] arr = new ChocolatePiece[3];
        arr[0] = new ChocolatePiece("Star", 7);
        arr[1] = new ChocolatePiece("Santa", 8);
        arr[2] = new ChocolatePiece("tree", 6);
        Random rand = new Random();
        for (int i = 0; i < 24; i++) {
            int r = rand.nextInt(arr.length);
            calender[i] = new ChocolatePiece(arr[r].getShape(), arr[r].getWeight());
        }
        return calender;
    }

    public void openCalendar(ChocolatePiece[] chocolateCalender) {
        Scanner input = new Scanner(System.in);
        int[] eaten = new int[24];
        while (true) {
            System.out.print("Choose window: ");
            int r = input.nextInt();

            if (r < 1 || r > 24) {
                System.out.println("Window is out of range");
            } else {
                if (chocolateCalender[r-1].isEaten()){
                    System.out.println("Chocolate piece is eaten");
                } else {//eaten[r] != 1) {
                    System.out.println(chocolateCalender[r-1].getShape() + ", " + chocolateCalender[r-1].getWeight());
                    chocolateCalender[r-1].setEaten(true);
                    eaten[r - 1] = 1;
                    IntStream stream = IntStream.of(eaten);
                    int sum = stream.sum();
                    if (sum == 24) {
                        break;
                    }
                }
            }
        }
    }
}