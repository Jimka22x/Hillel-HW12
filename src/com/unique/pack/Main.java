package com.unique.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
//      2*) Задана строка из английских слов через пробел. Написать метод который возвращает те же слова
//      в обратном порядке. При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.
        System.out.println("task 1");
        System.out.print("Введите предложение для перестановки: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Результат перестановки: " + wordsSwap(text));
        System.out.println("-------------------------------------------------------------------------------");
    }

    private static String wordsSwap(String text) {
        String[] wordsArray = text.toLowerCase(Locale.ROOT).split("\\s");
        if (wordsArray.length <= 1) {
            System.out.println("Строка пуста/нехватает элементов для перестановки!");
            return text;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            builder.append(wordsArray[i].substring(0, 1).toUpperCase()).append(wordsArray[i].substring(1)).append(" ");
        }
        return builder.toString().trim();
    }

    private static void task2() {
//      1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
//      Есть 4 типа юнитов: башня, забор, содат и танк.
//      Забор ничего не делает и может быть разрушен
//      Башня ничего не делает и безсмертна
//      Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
//      Танк умеет то же что и солдат, плюс еще у него есть метод reload()
//      Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно.
//      Может быть больше классов чем перечилено в задаче если нужно. Создать список в котором есть юниты всех типов.
        System.out.println("task 1");
        List<Unit> unitsList = new ArrayList<>();
        unitsList.add(new Tower(0, 1));
        unitsList.add(new Wall(0, 2));
        unitsList.add(new Soldier(0, 3));
        unitsList.add(new Tank(0, 4));
        for (int i = 0; i < unitsList.size(); i++) {
            System.out.println(unitsList.get(i));
        }

        Soldier soldier = new Soldier(1, 1);
        soldier.move();
        soldier.fire();

        Tank tank = new Tank(2, 2);
        tank.move();
        tank.fire();
        tank.reload();
    }
}
