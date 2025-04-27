package pe.joedayz.records;

import java.time.LocalDateTime;

public record Delivery(Product product, LocalDateTime time) {
}
