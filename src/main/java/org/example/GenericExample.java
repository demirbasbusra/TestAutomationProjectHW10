package org.example;

import java.util.Collection;
import java.util.Optional;

public class GenericExample<T> {
    private T field;

    public GenericExample(T field) {
        this.field = field;
    }

    public void printField() {
        System.out.println(field);
    }

    public static <T> T findItemInCollection(Collection<T> collection, T itemToFind) {
        Optional<T> foundItem = collection.stream()
                .filter(item -> item.equals(itemToFind))
                .findFirst();
        return foundItem.orElse(null);
    }

}
