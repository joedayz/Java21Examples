package pe.joedayz.concurrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PriceList {
    private List<Product> menu = new ArrayList<>();
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private Lock rl = rwl.readLock();
    private Lock wl = rwl.writeLock();

    public Product get(int id) {
        rl.lock();
        try {
            return menu.stream().findFirst().orElse(null);
        } finally {
            rl.unlock();
        }
    }

    public void add(Product product) {
        wl.lock();
        try {
            menu.add(product);
        } finally {
            wl.unlock();
        }
    }

    public static void main(String[] args) {
        PriceList priceList = new PriceList();

        Product p1 = new Product(1, "Laptop");
        Product p2 = new Product(2, "Phone");

        priceList.add(p1);
        priceList.add(p2);

        System.out.println(priceList.get(1)); // Imprime: Product{id=1, name='Laptop'}
        System.out.println(priceList.get(3)); // Imprime: null
    }
}
