package org.positivethinking;


import org.junit.Assert;
import org.junit.Test;
import org.postivethinking.Partition;

import java.util.ArrayList;
import java.util.List;

public class PartitionTest {

    @Test
    public void partition_works() {
        Partition p = new Partition();
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        List<List<Integer>> resultPartition1 =  p.partition(test, 1);
        Assert.assertEquals(5,resultPartition1.size());

        List<List<Integer>> resultPartition2 =  p.partition(test, 2);
        Assert.assertEquals(3,resultPartition2.size());

        List<List<Integer>> resultPartition3=  p.partition(test, 3);
        Assert.assertEquals(2,resultPartition3.size());
    }

    @Test
    public void partition_with_emptyList_should_return_emptyList() {
        Partition p = new Partition();
        List<Integer> testEmpty = new ArrayList<>(0);

        List<List<Integer>> resultPartition1 =  p.partition(testEmpty, 1);
        Assert.assertEquals(0,resultPartition1.size());

    }

}
