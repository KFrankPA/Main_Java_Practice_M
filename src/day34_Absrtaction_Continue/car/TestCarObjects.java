package day34_Absrtaction_Continue.car;

public class TestCarObjects {
    public static void main(String[] args) {



       // Car car1 = new Car("X6", "Red", 2020, 45000);

        Honda honda1 = new Honda("Pilot", "White", 2022, 35000);
        Audi audi1 = new Audi("Q6", "Silver", 2021, 29000);
        Tesla tesla1 = new Tesla("Model Y", "Blue", 2022, 55000);


        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);

        System.out.println("==============================");

        honda1.start();
        audi1.start();
        tesla1.start();

        System.out.println("===========================");

        honda1.stop();
        audi1.stop();
        tesla1.stop();
        System.out.println("=============================");

        tesla1.canAutoPark();

Car car = new Tesla("weh", "hksd",1555,200);

    }

}
