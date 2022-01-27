public class ElderAss extends Animal{
    private final int visitPrice = 114;
    private static int visitCount = 514;

    public ElderAss(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public int getVisitPrice() {
        return visitPrice;
    }

    @Override
    public String toString() {
        return "ElderAss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", visitPrice=" + visitPrice +
                '}';
    }
}
