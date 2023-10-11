package org.leet.node;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGropingBy {

  public static void main(String[] args) {
    System.out.println(group(new int[]{3,3,4,1,6,6}));
  }

  private static Integer group(int[] ints) {
    Map<Integer, Long> nums = Arrays.stream(ints)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    for (int num : ints) {
      if (nums.get(num) == 1) {
        return num;
      }
    }
    return null;
  }

}
