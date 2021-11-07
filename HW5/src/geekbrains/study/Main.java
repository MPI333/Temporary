package geekbrains.study;

public class Main {

    public static void main(String[] args) {
	System.out.println("Task #1:\t" + power(2, 3));

	Item[] items = {
	        new Item(1, 3),
            new Item(6, 4),
            new Item(4, 5),
            new Item(7, 8),
            new Item(6, 9)
	};

	Backpack backPack = new Backpack(items);
	int backpackCapacity = 13;
	System.out.println("Task #2:\t" + backPack.findItems(items.length - 1, backpackCapacity));
    }

    private static double power(double number, int p)
    {
        if (p == 0) {
            return 1;
        } else if (p < 0) {
            return (1 / number * power(number, ++p));
        } else {
            return (number * power(number, --p));
        }
    }

}
