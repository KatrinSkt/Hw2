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
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);

        // задание 3
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        paper = paper - 7639;
        System.out.println("paper = " + paper);

        // задание 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        // задание 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

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
        var workHours = 640;
        System.out.println("Количество часов = " + workHours + " часов");
        var humanWork = 8;
        System.out.println("Человек работает = " + humanWork + " часов");
        var people = workHours / humanWork;
        System.out.println("Всего работников в компании — " + people + " человек");
        people = people + 94;
        workHours = people * 8;
        System.out.println("Если в компании работает " + people + " человека, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}