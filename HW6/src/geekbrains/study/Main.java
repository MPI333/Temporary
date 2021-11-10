package geekbrains.study;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int bCount = 0;
        int treeCount = 100000;

        for (int counter = 0; counter < treeCount; counter++) {
            Tree<Integer, Integer> map = new Tree<>();
            int x = 0;
            while (map.height() < 6) {
                x = random.nextInt(201) - 100;
                map.put(x, x);
            }
            map.delete(x);
            if (map.isBalance()) {
                bCount++;
            }
        }
        System.out.println("bCount:\t " + bCount + " + treeCount " + treeCount);
        System.out.println("Balanced:\t" + (double) bCount / treeCount * 100 + " %");
        System.out.println("Imbalanced:\t" + (double) (treeCount - bCount) / treeCount * 100 + " %");
    }

}
