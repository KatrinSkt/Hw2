public class Main {
    public static void main(String[] args) {

       var dog = 8.0;
       System.out.println("dog = " + dog);
       var cat = 3.6;
       System.out.println("cat = " + cat);
       var paper = 763789;
       System.out.println("paper = " + paper);

       var result1 = dog + 4;
       System.out.println("dog = " + result1);
       var result2 = cat + 4;
       System.out.println("cat = " + result2);
       var result3 = paper + 4;
       System.out.println("paper = " + result3);

       var result4 = dog - 3.5;
       System.out.println("dog = " + result4);
       var result5 = cat - 1.6;
       System.out.println("cat = " + result5);
       var result6 = paper - 7639;
       System.out.println("paper = " + result6);

       var friend = 19;
       System.out.println("friend = " + friend);
       var result7 = friend + 2;
       System.out.println("friend = " + result7);
       var result8 = result7/7;
       System.out.println("friend = " + result8);

       var frog = 3.5;
       System.out.println("frog = " + frog);
       var result9 = frog * 10;
       System.out.println("frog = " + result9);
       var result10 = result9/3.5;
       System.out.println("frog = " + result10);
       var result11 = result10 + 4;
       System.out.println("frog = " + result11);

       var boxer1Weight = 78.2;
       System.out.println("boxer1Weight = " + boxer1Weight);
       var boxer2Weight = 82.7;
       System.out.println("boxer2Weight = " + boxer2Weight);
       var result12 = boxer1Weight + boxer2Weight;
       System.out.println("boxersWeight = " + result12 + "kg");
       var differenceWeight = boxer2Weight - boxer1Weight;
       System.out.println("differenceWeigt = " + differenceWeight + "kg");

       var overload = boxer2Weight % boxer1Weight;
       System.out.println("Перевес на " + overload + " кг");

       var workHours = 640;
       System.out.println("Количество часов = " + workHours + " часов");
       var humanWork = 8;
       System.out.println("Человек работает = " + humanWork + " часов");
       var people = workHours / humanWork;
       System.out.println("Всего работников в компании — " + people + " человек");
       var people2 = people + 94;
       var workHours2 = people2 * 8;
       System.out.println("Если в компании работает " + people2 + " человек, то всего " + workHours2 + " часов работы может быть поделено между сотрудниками");

    }
}