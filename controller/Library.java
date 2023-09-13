package WordProject.controller;

import java.util.Scanner;

public class Library {
    public int getInt(String condition, int m, int n){
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(condition +": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if(a>= m && a <=n){
                    return a;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Check your input");
            }
        }
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +" ");
        }
        System.out.println("");
    }
}
