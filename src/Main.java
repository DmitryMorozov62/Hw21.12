public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        byte a = 67;
        short b = -159;
        int c = 569;
        long d = 987678965549L;
        float p = 27.12f;
        double w = 2.786;
        // Результат задачи 2
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
        byte twoMinutes = 2;
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

}