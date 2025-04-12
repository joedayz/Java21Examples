package pe.joedayz.herencia;

import java.time.LocalDateTime;

public class Food extends Product{
    private LocalDateTime bestBefore;

    public LocalDateTime getBestBefore() {
        return bestBefore;
    }
}
