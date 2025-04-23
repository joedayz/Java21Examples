package pe.joedayz.herencia;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Food extends Product{
    private BigDecimal discount;
    private LocalDateTime bestBefore;

    {
        System.out.println("5. Inicializando instancia Food...");
    }


    static{
        System.out.println("3. Static Inicializando Food ...");
    }

    public Food(){
        super("Cake");
        System.out.println("6. Constructor Food...");
    }

    public LocalDateTime getBestBefore() {
        return bestBefore;
    }

    public BigDecimal getDiscount(){
        return getPrice().subtract(this.discount.add(super.getDiscount()));
    }
}
