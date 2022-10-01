package org.postivethinking;

import java.util.ArrayList;
import java.util.List;

public class Partition {

    public List<List<Integer>> partition(List<Integer> list, int taille) {
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < list.size(); i += taille) {
            partitions.add(list.subList(i, Math.min(i + taille, list.size())));
        }
        return partitions;
    }


}
