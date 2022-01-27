public class Shark extends Animal{
    private final int visitPrice = 350;

    public Shark(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    public int getVisitPrice() {
        return visitPrice;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", visitPrice=" + visitPrice +
                '}';
    }
}
