public abstract class Animal {
    protected String name;
    protected int age;
    protected String sex;
    protected double price;
    protected int visitPrice;
    public Animal(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public abstract int getVisitPrice();

    @Override
    public abstract String toString();
}
