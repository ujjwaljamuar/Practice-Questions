package OopMasterChallenge;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Burger burger = new HealthyBurger("Healthy", "Chicken", 300);

	    if (burger.isExtraAdditions()) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                burger.printExtraAdditions();
                System.out.println("Choose your ingredients (Type 0 to exit): ");
                boolean hasNextInt = sc.hasNextInt();
                if (hasNextInt) {
                    int selected = sc.nextInt();
                    if (selected == 0) {
                        break;
                    }
                    burger.selectIngredient(selected);
                }
            }
            sc.close();
        }

	    burger.checkBill();
    }

    
}

