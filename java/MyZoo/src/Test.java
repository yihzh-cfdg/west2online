public class Test {
    public static void main(String[] args) {
        Panda panda1 = new Panda("Huanhuan", 2, "Male", 4000, true);
        Panda panda2 = new Panda("Xixi", 3, "Female", 5000, false);
        Shark shark = new Shark("nana7mi", 21, "Female", 29000);
        ElderAss elderAss = new ElderAss("Tadokoro Kouji", 24, "Male", 1145.14);
        Tourist tourist1 = new Tourist("Toono", 1919810, 1);
        Tourist tourist2 = new Tourist("YHZ", 1000, 100);
        Zoo brokenZoo = new Zoo(500);
        try {
            brokenZoo.getTourist(tourist1);
        } catch (AnimalNotFoundException e) {
            System.out.println(e);
        }
        brokenZoo.keepAnimal(shark);
        try {
            brokenZoo.close();
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        System.out.println();
        Zoo myZoo = new Zoo(100000, panda1, panda2, shark);
        myZoo.keepAnimal(elderAss);
        try {
            myZoo.getTourist(tourist1);
            myZoo.getTourist(tourist2);
            myZoo.close();
        } catch (AnimalNotFoundException | InsufficientBalanceException e) {
            System.out.println(e);
        }

    }
}
