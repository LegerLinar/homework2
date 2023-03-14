public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }

    public static void part1() {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void part2() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void part3() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

    }
        public static void part4(){

        System.out.println("Задача 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryBoxersWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Суммарный вес боксеров " + summaryBoxersWeights + "кг");
        var difBoxersWeights = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница боксеров в весе " + difBoxersWeights + "кг");

        System.out.println("Задача 7");

        var heavierBoxerAdvantage = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Более тяжелый боксер имеет превосходство на " + heavierBoxerAdvantage + " кг");

        var lighterBoxerDisatvantage = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Более легкий боксер уступает в весе на " + lighterBoxerDisatvantage + " кг");

        }
}