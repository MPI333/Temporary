package geekbrains.study;

public class Backpack {
    private Item[] items;

    Backpack(Item[] items) {
        this.items = items;
    }

    int findItems(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > weight) {
            return findItems(i - 1, weight);
        } else {
            return Math.max(findItems(i - 1, weight),
                    findItems(i - 1, weight - items[i].weight) + items[i].price);
        }
    }
}
