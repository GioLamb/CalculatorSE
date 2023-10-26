public class Memory {
    private double value;
    public Memory() {
        value = 0.0;
    }

    public void store(double number) {
        value = number;
    }

    public double recall() {
        return value;
    }

    public void clear() {
        value = 0.0;
    }

    public void addToMemory(double number) {
        value += number;
    }

    public void subtractFromMemory(double number) {
        value -= number;
    }
    public static void main(String[] args) {
        Memory memory = new Memory();

        memory.store(42.0);


        double recalledValue = memory.recall();
        System.out.println("Value in memory: " + recalledValue);


        memory.addToMemory(10.0);

        recalledValue = memory.recall();
        System.out.println("Value in memory after the insert: " + recalledValue);

        memory.subtractFromMemory(5.0);

        recalledValue = memory.recall();
        System.out.println("Value in memory after the subtraction: " + recalledValue);

        memory.clear();
        System.out.println("Value in memory after the erase: " + memory.recall());
    }
}