package pe.joedayz.interfacesfuncionales;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.removeIf(n -> n.length() > 10);


    }
}
