package kz.lab.module1.advanced;

import java.time.LocalDateTime;
import java.util.Set;

public record Order(long id, double price, LocalDateTime orderDate, Set<String> items ) {
    public Order {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        if (!orderDate.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("OrderDate must be in the past");
        }

        items = Set.copyOf(items);
    }
}
