package com.nab.problem;

import java.util.Comparator;
import java.util.List;

public class FindDuplicate {
    /*    Given a list of integers, find maximum and minimum of those numbers?*/
    public Integer findMaxAndMin(List<Integer> ls){
        Integer maxNumber = ls.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxNumber);
        return maxNumber;
    }
}
