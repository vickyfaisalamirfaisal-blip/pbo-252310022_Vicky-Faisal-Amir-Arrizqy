package praktikum4;

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<Integer>();

        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);

        System.out.println(age);

        age.set(1, 100);
        System.out.println(age);

        age.remove(3);
        System.out.println(age);

        age.clear();
        System.out.println(age);
    }
}
