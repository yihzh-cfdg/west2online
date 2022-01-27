public class Panda extends Animal {
    private final boolean isFat;
    private final int visitPrice = 200;

    public Panda(String name, int age, String sex, double price, boolean isFat) {
        super(name, age, sex, price);
        this.isFat = isFat;
    }

    @Override
    public int getVisitPrice() {
        return visitPrice;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", isFat=" + isFat +
                ", visitPrice=" + visitPrice +
                '}';
    }
}
