package pe.joedayz.interfacesfuncionales;

@FunctionalInterface
public interface Consumable {

    void consume(); //SAM

    private void play(){}

    default void zum(){}

    static void cat(){}

    String toString();

    int hashCode();

    boolean equals(Object obj);
}
