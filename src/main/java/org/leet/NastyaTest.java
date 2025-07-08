package org.leet;

import java.util.Arrays;
import java.util.List;

public class NastyaTest {
    public static void main(String[] args) {
        String consignee = "Ростовская область, кулинарный 1цех, 164776, г. Москва, ул. Черемушкинская, д. 5/1, кв.9";
        String[] split = consignee.split(",");
        List<String> strs = Arrays.asList(split);
        List<String> collect = strs.stream().map(String::trim).filter(x -> x.matches("\\d+")).toList();
        System.out.println(collect);
    }
}
