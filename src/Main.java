public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        byte a = 123;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 12345;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 12345678;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 123456789101112L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.1234567f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.1234567890;
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("task2"); //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        float g = 27.12f;
        long h = 987678965549L;
        byte i = 2;
        short j = 786; // ??мб в задании ошибка, тк в одном случае точка, в другом запятая??
        double k = 2.768;
        boolean l = i > 100;
        System.out.println(l);
        short m = 569;
        short n = -159;
        int o = 27897;
        byte p = 67;

        System.out.println("task3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short sheets = 480;
        int sheetsPerStudent = (sheets / (studentsLP + studentsAS + studentsEA));
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println("task4");
        byte bottlesPerTwoMin = 16;
        int bottlesPerMin = bottlesPerTwoMin / 2;
        int bottlesPerTwentyMin = bottlesPerMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerTwentyMin + " штук");
        int bottlesPerDay = bottlesPerMin * 60 * 24;
        System.out.println("За день машина произвела бутылок " + bottlesPerDay + " штук");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottlesPerThreeDays + " штук");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук");

        System.out.println("task5");
        byte tins = 120;
        byte whitePaintForClassroom = 2;
        byte brownPaintForClassroom = 4;
        int tinsForClassroom = whitePaintForClassroom + brownPaintForClassroom;
        int classrooms = tins / tinsForClassroom;
        int whitePaint = classrooms * whitePaintForClassroom;
        int brownPaint = classrooms * brownPaintForClassroom;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("task6");
        byte bananasInRecipe = 5;
        int bananasWeight = 80 * bananasInRecipe;
        short milkInRecipe = 200;
        int milkWeight = 105 * (milkInRecipe / 100);
        byte iceCreamInRecipe = 2;
        int iceCreamWeight = 100 * iceCreamInRecipe;
        byte eggsInRecipe = 4;
        int eggsWeight = 70 * eggsInRecipe;
        int breakfastWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес завтрака " + breakfastWeightGrams + " грамм");
        float breakfastWeightKilo = breakfastWeightGrams / 1000f;
        System.out.println("Вес завтрака " + breakfastWeightKilo + " килограмм");

        System.out.println("task7");
        byte goal = 7;
        short firstWay = 250;
        short secondWay = 500;
        short goalGrams = 7 * 1000;
        int daysFirstWay = goalGrams / firstWay;
        int daysSecondWay = goalGrams / secondWay;
        System.out.println("Если терять по " + firstWay + " грамм, то спортсмен похудеет за " + daysFirstWay + " дней");
        System.out.println("Если терять по " + secondWay + " грамм, то спортсмен похудеет за " + daysSecondWay + " дней");

        System.out.println("task8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float payIncrement = 0.1f;
        float salaryM1 = salaryM + salaryM * payIncrement;
        float salaryD1 = salaryD + salaryD * payIncrement;
        float salaryK1 = salaryK + salaryK * payIncrement;
        float differenceM = salaryM1 - salaryM;
        float differenceD = salaryD1 - salaryD;
        float differenceK = salaryK1 - salaryK;
        System.out.println("Маша теперь получает " + salaryM1 + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + salaryD1 + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + salaryK1 + " рублей. Годовой доход вырос на " + differenceK + " рублей");
    }
}