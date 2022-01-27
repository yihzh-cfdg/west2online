public class Tourist {
    private final String name;
    private int money;
    private int wantVisit;

    public Tourist(String name, int money, int wantVisit) {
        this.name = name;
        this.money = money;
        this.wantVisit = wantVisit;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWantVisit() {
        return wantVisit;
    }

    @Override
    public String toString() {
        return "Name of Tourist is " + name + ",\n" +
                "He wants to see " + wantVisit + " kinds of animals,\n" +
                "and has " + money + " dollars in cash.\n";
    }
}
