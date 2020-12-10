package bsu.rfe.group9.Haranovich.lab1.var12B;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        boolean isSumCalories = false;
        boolean isSort = false;
        final int variety = 3;
        int[] count = new int[variety];

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                count[0]++;
            } else
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                count[1]++;
            } else
            if (parts[0].equals("Beef")) {
                breakfast[itemsSoFar] = new Beef(parts[1]);
                count[2]++;
            }
            if (parts[0].equals("-calories")) {
                isSumCalories = true;
            } else
                if (parts[0].equals("-sort")) {
                    isSort = true; }
                else itemsSoFar++;
        }
        System.out.println("����� � ��������");
        int[] amount = new int[6];
        for (Food item : breakfast) {
        if (item.getName().equals("Cheese")) {
        amount[0]++;
        }
        if (item.getName().equals("Apple")) {
        Apple a = (Apple) item;
        if (a.getSize().equals("Small")) {
        amount[1]++;
        }
        amount[2]++;
        }
        if (item.getName().equals("Beef")) {
        Beef a = (Beef) item;
        if (a.getPreparedness().equals("Medium")) amount[3]++;
        else if (a.getPreparedness().equals("Good")) amount[4]++;
        else amount[5]++;
        }
        if (amount[0] != 0) System.out.println("����� ����: " + amount[0]);
        if (amount[1] != 0) System.out.println("����� ������� �����: " + amount[1]);
        if (amount[2] != 0) System.out.println("����� ��������� �����: " + amount[2]);
        if (amount[3] != 0) System.out.println("����� ���� � ������: " + amount[3]);
        if (amount[4] != 0) System.out.println("����� ���� ���������� ��������: " + amount[4]);
        if (amount[5] != 0) System.out.println("����� ������������ ����: " + amount[5]);
        
        if(isSort){
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object f1, Object f2) {
                    if (f1==null) return 1;
                    if (f2==null) return -1;
                    if (((Food)f1).calculateCalories() > ((Food)f2).calculateCalories()) return 1;
                    else return -1;
                }
            });
        }
        
        
        for (Food eat: breakfast) {
            if (eat != null) {
                eat.Consume();
            } else
                break;
        }
        if (isSumCalories){
            double sumOfCalories = 0.0;
            for (Food eat: breakfast)
                if (eat!=null) {
                    sumOfCalories += eat.calculateCalories();
                } else break;
            System.out.println("������������ �������� ���������� " + sumOfCalories + " �������.");
        }
        
     
        
        System.out.println("����������� � ����������:");
        System.out.println("������: " + count[0] + "\n���: " + count[1] + "\nBeef: " + count[2]);
        System.out.println("����� ��������!");
    }
}
}