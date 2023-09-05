package org.wmaterkowska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstMissingInteger {

    public static int solution(int[] A) {
        // Implement your solution here

        List<Integer> setFromArray = changeToPositiveSet(A);

        Integer counter = setFromArray.get(0);
        Boolean flag = true;
        while (flag == true) {
            if(setFromArray.get(counter) == counter) {
                counter++;
            } else {
                flag = false;
            }
        }

        return counter;

    }


    public static List<Integer> changeToPositiveSet(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 & list.contains(A[i]) == false) {}
            list.add(A[i]);
        }
        Collections.sort(list);
        return list;

    }
}
