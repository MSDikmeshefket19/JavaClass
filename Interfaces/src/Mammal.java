public abstract class Mammal implements Animal{
    private int age;
    private double weight;

    public Mammal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void walk();

    public void testMammal() {
        System.out.println("testing in mammal class.");
    }
    @Override
    public void eat() {
        System.out.println("eating...");
    }
}