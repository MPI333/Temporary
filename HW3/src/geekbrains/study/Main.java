package geekbrains.study;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("Qwerty!"));
    }

    public static String reverseString(String string) {
        StringBuilder str = new StringBuilder();

        for (int strLen = (string.length() - 1); strLen >= 0; --strLen) {
            str.append(string.charAt(strLen));
        }

        return str.toString();
    }
}
