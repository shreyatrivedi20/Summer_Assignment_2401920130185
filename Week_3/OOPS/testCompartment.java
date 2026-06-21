import java.util.Random;
abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
     public String notice(){
         return "This coach is reserved for people having a ticket of first class.";
     }
}
class General extends Compartment {
    public String notice() {
        return "This coach is reserved for people having a ticket of general class.";
    }
}
class Ladies extends Compartment {
    public String notice() {
        return "This coach is reserved for ladies only.";
    }
}
class Luggage extends Compartment {
    public String notice() {
        return "This coach is reserved for keeping luggage only.";
    }
}
public class TestCompartment {
    public static void main(String[] args) {

                Compartment[] arr = new Compartment[10];
                Random random = new Random();

                for (int i = 0; i < 10; i++) {
                    int num = random.nextInt(4) + 1; // random number 1 to 4

                    switch (num) {
                        case 1:
                            arr[i] = new FirstClass();
                            break;

                        case 2:
                            arr[i] = new Ladies();
                            break;

                        case 3:
                            arr[i] = new General();
                            break;

                        case 4:
                            arr[i] = new Luggage();
                            break;
                    }
                }

                for (int i = 0; i < 10; i++) {
                    System.out.println(arr[i].notice());
                }
    }
}
