package pe.joedayz.numbers;

import java.math.BigDecimal;

public class Numbers {

    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(12.99);
        BigDecimal taxRate = BigDecimal.valueOf(0.18);
        BigDecimal tax = price.multiply(taxRate);
        System.out.println(tax);
        price = price.add(tax).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(price);

        BigDecimal taxedPrice = price.add(tax).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(taxedPrice);

    }
}
