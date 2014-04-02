public class Pot {

    int servings = 0;
    int capacity;
    int hungrySavages;

    public Pot(int capacity, int savages) {
        this.capacity = capacity;
        this.hungrySavages = savages;
    }

    public synchronized void getserving() throws InterruptedException {
        while (servings == 0) wait();
        --servings;
        if (servings == 0) notifyAll();
        System.out.println(servings);
    }

    public synchronized void fillpot() throws InterruptedException {
        while (servings > 0 && !this.isBanketFinished()) wait();
        servings = capacity;
        System.out.println(servings);
        notifyAll();
    }

    public synchronized void finished() {
        --hungrySavages;
        if (hungrySavages == 0) notifyAll();
    }

    public synchronized boolean isBanketFinished() {
        return hungrySavages == 0;
    }

}

