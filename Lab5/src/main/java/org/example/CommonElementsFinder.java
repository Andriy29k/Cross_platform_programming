package org.example;
import java.util.*;

public class CommonElementsFinder {
    public static <T> Set<T> findCommonElements(Set<T> set1, Set<T> set2) {
        Set<T> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        return commonElements;
    }
}
