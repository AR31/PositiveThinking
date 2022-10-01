package org.postivethinking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(16);
        test.add(18);
        test.add(50);
        Partition p = new Partition();
        p.partition(test, 3);
    }
}