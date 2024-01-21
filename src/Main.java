public class Main {
    public static void main(String[] args) {
        // задание 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        // задание 2
        System.out.println("dog = " + (dog + 4));
        System.out.println("cat = " + (cat + 4));
        System.out.println("paper = " + (paper + 4));

        // задание 3
        System.out.println("dog = " + (dog - 3.5));
        System.out.println("cat = " + (cat - 1.6));
        System.out.println("paper = " + (paper - 7639));

        // задание 4
        var friend = 19;
        System.out.println("friend = " + friend);
        System.out.println("friend = " + (friend + 2));
        System.out.println("friend = " + ((friend + 2)/7));

        // задание 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        System.out.println("frog = " + (frog * 10));
        System.out.println("frog = " + (frog * 10 / 3.5));
        System.out.println("frog = " + (frog * 10 / 3.5 + 4));

        // задание 6
        var boxer1Weight = 78.2;
        System.out.println("Вес первого боксера = " + boxer1Weight + " кг");
        var boxer2Weight = 82.7;
        System.out.println("Вес второго боксера = " + boxer2Weight + " кг");
        System.out.println("Общий вес = " + (boxer1Weight + boxer2Weight) + " kg");
        System.out.println("Разница в весе = " + (boxer2Weight - boxer1Weight) + " кг");

        // задание 7

        System.out.println("Перевес на " + (boxer2Weight % boxer1Weight) + " кг");

        // задание 8
        System.out.println("Количество часов = " + 640 + " часов");
        System.out.println("Человек работает = " + 8 + " часов");
        System.out.println("Всего работников в компании — " + (640 / 8) + " человек");
        System.out.println("Если в компании работает " + (640 / 8 + 94) + " человек, то всего " + ((640 / 8 + 94) * 8) + " часов работы может быть поделено между сотрудниками");
    }
}