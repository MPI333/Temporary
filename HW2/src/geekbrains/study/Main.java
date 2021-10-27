package geekbrains.study;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        sortBubble();
        sortSelect();
        sortInsert();
    }

    public static ArrayList<Integer> createAndFillArrayList()
    {
        Random random = new Random();
        int size = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int currentElement = 0; currentElement < size; ++currentElement) {
            arrayList.add(random.nextInt(100));
        }

        return arrayList;
    }

    public static void sortBubble() {
        ArrayList<Integer> arr = createAndFillArrayList();
        int out, in;

        long start = System.currentTimeMillis();

        for (out = arr.size() - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (arr.get(in) > arr.get(in + 1)) {
                    int tmp = arr.get(in);
                    arr.set(in, arr.get(in + 1));
                    arr.set(in + 1, tmp);
                }
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("sortBubble's time (ms):\t" + (end - start));
    }

    public static void sortSelect() {
        ArrayList<Integer> arr = createAndFillArrayList();
        int out, in, mark;

        long start = System.currentTimeMillis();

        for(out=0; out < arr.size(); out++){
            mark = out;
            for(in = out+1; in < arr.size(); in++){
                if (arr.get(in) < arr.get(mark)){
                    mark = in;
                }
            }
            int tmp = arr.get(out);
            arr.set(out, arr.get(mark));
            arr.set(mark, tmp);
        }

        long end = System.currentTimeMillis();
        System.out.println("sortSelect's time (ms):\t" + (end - start));
    }

    public static void sortInsert(){
        ArrayList<Integer> arr = createAndFillArrayList();
        int in, out;

        long start = System.currentTimeMillis();

        for(out = 1;out < arr.size(); out++){
            int temp = arr.get(out);
            in = out;
            while(in > 0 && arr.get(in - 1) >=temp){
                arr.set(in, arr.get(in - 1));
                --in;
            }
            arr.set(in, temp);
        }

        long end = System.currentTimeMillis();
        System.out.println("sortInsert's time (ms):\t" + (end - start));
    }

}
