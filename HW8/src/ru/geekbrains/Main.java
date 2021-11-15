package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        for (int i = 0; i < 7 ; i++) {
            map.put(i, "a");
        }
        System.out.println(map);
        map.remove(4, "a");
        map.remove(5, "a");
        System.out.println(map);
    }

}
