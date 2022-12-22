public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float p = 3.14f;
        double w = 87.5;
        // Результат задачи 1
        System.out.println("byte a" + " = " + a);
        System.out.println("short b" + " = " + b);
        System.out.println("int c" + " = " + c);
        System.out.println("long d" + " = " + d);
        System.out.println("float p" + " = " + p);
        System.out.println("double w" + " = " + w);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        byte first = 67;
        short second = -159;
        int third = 569;
        long fourth = 987678965549L;
        float fifth = 27.12f;
        double sixth = 2.786;
        // Результат задачи 2
        //чтобы Idea не жаловалась вывел в консоль
        System.out.println("byte first" + " = " + first);
        System.out.println("short second" + " = " + second);
        System.out.println("int third" + " = " + third);
        System.out.println("long fourth" + " = " + fourth);
        System.out.println("float fifth" + " = " + fifth);
        System.out.println("double sixth" + " = " + sixth);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        //Пишем код для задачи 3
        int ludaP = 23;
        int annaS = 27;
        int katyA = 30;
        int allStudent = ludaP + annaS + katyA;
        int papers = 480;
        int everyStudent = papers / allStudent;
        // Результат задачи 3
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        //пишем код для задачи 4
        byte bottlesForTwoMinutes = 16;
        byte oneMinutes = 1;
        int bottlesForOneMinutes = bottlesForTwoMinutes / 2;
        int twentyMinutes = 20;
        int bottlesForTwentyMinutes = bottlesForOneMinutes * twentyMinutes;
        int day = oneMinutes * 1440;
        int bottlesForDay = bottlesForOneMinutes * day;
        int threeDays = 3 * day;
        int bottlesForThreeDays = bottlesForDay * threeDays;
        int month = day * 30;
        long bottlesForMonth = bottlesForDay * 30L;
        // результат задачи 4
        System.out.println("За " + twentyMinutes + " машина произвела " + bottlesForTwentyMinutes + " штук бутылок");
        System.out.println("За " + day + " машина произвела " + bottlesForDay + " штук бутылок");
        System.out.println("За " + threeDays + " машина произвела " + bottlesForThreeDays + " штук бутылок");
        System.out.println("За " + month + " машина произвела " + bottlesForMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        //пишем код для задачи 5
        int allJars = 120;
        int whitePaintForRoom = 2;
        int brownPaintForRoom = 4;
        int jarsForRoom = brownPaintForRoom + whitePaintForRoom;
        int classRoom = allJars / jarsForRoom;
        int whiteJars = classRoom * whitePaintForRoom;
        int brownJars = classRoom * brownPaintForRoom;
        //результат задачи 5
        System.out.println("В школе, где " + classRoom + " классов, нужно " + whiteJars + " банок белой краски и "
                          + brownJars + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        //пишем код для задачи 6
        int oneBanana = 80;
        int fiveBananas = oneBanana * 5;
        int milk100 = 105;
        int milk200 = milk100 * 2;
        int cream = 100;
        int twoCream = cream * 2;
        int egg = 70;
        int fourEggs = egg * 4;
        int recipe = fiveBananas + milk200 + twoCream + fourEggs;
        float recipeKg = recipe / 1000f;
        //результат задачи 6
        System.out.println(recipe + " г");
        System.out.println(recipeKg + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        //пишем код для задачи 7
        int weightLoss = 7;
        int weightLossG = weightLoss * 1000;
        int little = 250;
        int many = 500;
        int maxDay = weightLossG / little;
        int minDay = weightLossG / many;
        int midlDay = (maxDay + minDay) / 2;
        //результат задачи 7
        System.out.println(maxDay + " (день)дней");
        System.out.println(minDay + " (день)дней");
        System.out.println("в среднем " + midlDay + " (день)дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        //пишем код для задачи 8
        int maryForMonth = 67760;
        int denisForMonth = 83690;
        int kristiForMonth = 76230;
        int maryForYear = maryForMonth * 12;
        int denisForYear = denisForMonth * 12;
        int kristiForYear = kristiForMonth * 12;
        int mary1 = 67760 / 100;
        int denis1 = 83690 / 100;
        int kristi1 = 76230 / 100;
        int upMary = maryForMonth + mary1 * 10;
        int upDenis = denisForMonth + denis1 * 10;
        int upKristi = kristiForMonth + kristi1 * 10;
        int upMaryForYear = upMary * 12;
        int upDenisForYear = upDenis * 12;
        int upKristiForYear = upKristi * 12;
        int differenceMary = upMaryForYear - maryForYear;
        int differenceDenis = upDenisForYear - denisForYear;
        int differenceKristi = upKristiForYear - kristiForYear;
        //результат задачи 8
        System.out.println("Маша теперь получает " + upMary + " рублей. Годовый доход вырос на " +
                           differenceMary + " рублей.");
        System.out.println("Денис теперь получает " + upDenis + " рублей. Годовой доход вырос на " +
                           differenceDenis + " рублей.");
        System.out.println("Кристина теперь получате " + upKristi + " рублейю Годовой доход вырос на " +
                           differenceKristi + " рублей.");

    }

}