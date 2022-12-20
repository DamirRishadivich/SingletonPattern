package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public int f;
    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        result.addAll(list);
        int count = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < f) {
                logger.log("Элемент "+ result.get(i) + " не проходит");
            } else {
                logger.log("Элемент " + result.get(i) + " проходит");
                count++;
            }
        }
        logger.log("Прошло фильтр " + count + " элемента(ов) из " + result.size());
        logger.log("Выводим результат на экран. Отфильтрованный список: " + result.stream().filter(x -> x>f).collect(Collectors.toList()));
        return result.stream().filter(x -> x>f).collect(Collectors.toList());
    }
}
