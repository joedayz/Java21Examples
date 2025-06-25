package pe.joedayz.operadores;

public class SwitchSamples {

    public static void main(String[] args) {
        char status = 'N';
        double cost = 10;

        double price = switch (status) {
            default -> 3;
            case 'S', 'N' -> cost + 1;
            case 'D' -> {
                double discount = cost * 0.2;
                cost -= discount;
                yield cost;
            }
            case 'E' -> 0;

        };

        System.out.println("Final price: " + price);
    }
}
