public class Main {
    public static void main(String[] args) {
 // задача 1
        int a = 1322334;
        System.out.println("Значение переменной a с типом int равно " + a );
        byte b = 38;
        System.out.println("Значение переменной b с типом byte равно " + b );
        short c = -3748;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1234567890L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float i = 45.23f;
        System.out.println("Значение переменной i с типом float равно " + i);
        double f = -3456.9876543;
        System.out.println("Значение переменной f с типом double равно " + f);
 // задача 2
       float catOne = 27.12f;
       System.out.println(catOne);
       long catTwo = 987678965549L;
       double dogOne = 2.786;
       System.out.println(dogOne);
       short  dogTwo = 569;
       System.out.println(dogTwo);
       short fishOne = -159;
       System.out.println(fishOne);
       int fishTwo = 27897;
       System.out.println(fishTwo);
       byte frog = 67;
       System.out.println(frog);
       // задача 3
        byte firstClass = 23;
        int secondClass = 27;
        short thirdClass = 30;
        short paper = 480;
        int printingPaper = paper / ( firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + printingPaper + " листов бумаги");
        // задача 4
        short detailMinute = 8;
        int twentyMinuts =  20 * detailMinute;
        System.out.println("За двадцать минут машина произвела " + twentyMinuts + " штук бутылок" );
        byte day = 24;
        short minuteHour = 60;
        byte detailsMinute = 8; //количество деталей за минуту беру с первого рассчета для всех последующих пунктов
        long detailDay = (day * minuteHour) * detailsMinute;
        System.out.println("За двадцать четыре часа машина произвела " + detailDay + " штук бутылок");
        byte threeHour = 72;
        short minutesHour = 60;
        byte detailMin = 8;
        long partstDay = (threeHour * minutesHour) * detailMin;
        System.out.println("За три дня машина произвела " + partstDay + " штук бутылок");
        byte month = 31;
        byte oneHour = 60;
        short dayOne = 24;
        byte detail = 8;
        long detailMonth =((oneHour * dayOne) * month) * detail;
        System.out.println("За один месяц машина произвела " + detailMonth + " штук бутылок");
        //задача 5
        byte jar = 120;
        byte wJar = 2;
        short bJar = 4;
        int allClass = jar / (wJar + bJar);
        long allW = allClass * wJar;
        long allB = allClass * bJar;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allW + " банок белой краски и " + allB + " банок коричневой краски");
        // задача 6
        short bananGram = 80;
        byte banans = 5;
        int allBanans = banans * bananGram;
        short milkOne = 105;
        int milkTwo = milkOne * 2;
        byte iceCream = 2;
        byte iceGram = 100;
        int allPlombir = iceGram * iceCream;
        byte eggGram = 70;
        byte eggs = 4;
        int allEggs = eggs * eggGram;
        long allBreakfast = allBanans + allPlombir + allEggs + milkTwo;
        int kg = 1000;
        double breakfustKg = allBreakfast / (float) kg;
        System.out.println("Вес такого спортивного завтрака " + allBreakfast + " грамм, а в переводе на кг " + breakfustKg);
        // задача 7
        byte k = 7;
        short gr = 1000;
        int weight = k * gr;
        short grOne = 250;
        short grTwo = 500;
        int loseOne = weight / grOne;
        int loseTwo = weight / grTwo;
        byte kgGr = 2;
        int allDays = (loseOne + loseTwo) / kgGr;
        System.out.println("Уйдет " + loseOne + " дней, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println("Уйдет " + loseTwo + " дней, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("На похудение в среднем потребуется " + allDays + " день");
        // 8 задача
        int Masha = 67760;
        byte x = 10;
        byte y = 12;
        int pro = Masha / x;
        int yearOff = Masha * y;
        int yearOn = (Masha + pro) * 12;
        int pay = yearOn - yearOff;
        System.out.println("Маша теперь получает " + yearOn +" рублей в год. Годовой доход вырос на " + pay + " рублей");
        int Denis = 83690;
        byte v = 10;
        byte z = 12;
        int proq = Denis / v;
        int yearsOff = Denis * z;
        int yearsOn = (Denis + proq) * 12;
        int pays = yearsOn - yearsOff;
        System.out.println("Денис теперь получает " + yearsOn + " рублей в год. Годовой доход вырос на " + pays + " рублей");
        int Kristina = 76230;
        byte j = 10;
        byte n = 12;
        int prok = Kristina / j;
        int yearf = Kristina * n;
        int yearn = (Kristina + prok) * 12;
        int money = yearn - yearf;
        System.out.println("Кристина теперь получает " + yearn + " рублей в год. Годовой доход вырос на " + money + " рублей");















    }
}

