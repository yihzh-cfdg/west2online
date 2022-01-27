import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zoo implements aboutZoo {
    private double income = 0;
    private double cost = 0;
    private int cash;
    private final List<Animal> animal = new ArrayList<>();
    private final List<Tourist> tourist = new ArrayList<>();

    public Zoo(int cash, Animal... animals) {
        this.cash = cash;
        animal.addAll(Arrays.asList(animals));
    }

    @Override
    public void keepAnimal(Animal a) {
        animal.add(a);
        cost += a.price;
        System.out.println("We have bought " + a + '.');
    }

    @Override
    public void getTourist(@NotNull Tourist a) throws AnimalNotFoundException {
        if (animal.isEmpty())
            throw new AnimalNotFoundException();
        for (int i = 0; i < a.getWantVisit(); ++i) {
            Random random = new Random();
            int visit = random.nextInt(animal.size());
            if (a.getMoney() >= animal.get(visit).getVisitPrice()) {
                a.setMoney(a.getMoney() - animal.get(visit).getVisitPrice());
                income += animal.get(visit).getVisitPrice();
                System.out.println(a.getName() + " watched " + animal.get(visit) + ", he has $" + a.getMoney() + " now.");
            } else {
                System.out.println(a.getName() + " has not enough money to watch " + animal.get(visit) + ".");
                System.out.println("So he chose to run.");
                break;
            }
        }
        System.out.println();
        tourist.add(a);

    }

    @Override
    public void close() throws InsufficientBalanceException {
        if (cost - income > cash)
            throw new InsufficientBalanceException();
        else {
            for (Tourist value : tourist) {
                System.out.println(value);
            }
            cash = cash + (int) (income - cost);
            System.out.println("We have $" + cash + " now.");
        }
    }
}
