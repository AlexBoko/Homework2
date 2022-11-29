public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

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
    public static void task3 () {
        System.out.println("Задача 6");
        var boxerCapacityLeft1 = 78.2;
        var boxerCapacityLeft2 = 82.7;
        var capacityLeft = boxerCapacityLeft1 + boxerCapacityLeft2;
        System.out.println("Общий вес двух бойцов " + capacityLeft + " кг!");
        var capacityLeft1 = boxerCapacityLeft2-boxerCapacityLeft1;
        System.out.println("Разница между весамми бойцов " + capacityLeft1 + " кг!");

        System.out.println("Задача 7");
        var overload = (boxerCapacityLeft1 + boxerCapacityLeft2) % boxerCapacityLeft1;
        System.out.println("Разница весов спортсменов " + overload + " кг");

        System.out.println("Задача 8");
        var workingHours = 640;
        var employeesWorking = 8;
        var employeesCompany = workingHours / employeesWorking;
        System.out.println("Всего работников в компании " + employeesCompany + " человек");

        var employeesCompany1 = 94;
        var employeeHours = employeesCompany1 * employeesWorking;
        var workingHours1 = workingHours + employeeHours;
        System.out.println("Если в компании работает " + (employeesCompany + employeesCompany1) + " человек,то всего " + workingHours1 + " часов работы может быть поделено между сотрудниками" );

    }}

