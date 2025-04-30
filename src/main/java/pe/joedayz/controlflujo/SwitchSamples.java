package pe.joedayz.controlflujo;

public class SwitchSamples {

    public static void main(String[] args) {
//        char status = 'X';
//        double price = 10;
//        switch(status) {
//            case 'S':
//                price += 1;
//            case 'N':
//                price += 2;
//            case 'D':
//                price -=4;
//                break;
//            case 'E':
//                price =0;
//                break;
//            default:
//                price = 3;
//        }
//
//        System.out.println(price);

        char status ='N';
        double cost = 10;
        double price = switch (status){
            case 'S', 'N' -> cost +=1;
            case 'D' -> {
                double discount = cost*0.2;
                cost -= discount;
                yield cost;
            }
            case 'E' -> 0;
            default -> 3;
         };


    }
}
