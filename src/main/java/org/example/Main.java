package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу!" +
                "\nВведите размер списка: ");
        int N = scanner.nextInt() - 1;
        logger.log("Введите верхнюю границу значений элементов в списке:");
        int M = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= N; i++) {
            list.add(random.nextInt(M));
        }
        logger.log("Создаем и наполняем список: " + list.stream().map(s -> s + "").collect(Collectors.toList()));
        logger.log("Введите входные данные для фильтрации: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтр!");
        Filter filter = new Filter(f);
        filter.filterOut(list);
        logger.log("Завершаем программу!");
    }
}