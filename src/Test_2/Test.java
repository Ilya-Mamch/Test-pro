package Test_2;

public class Test {
    public static void main(String[] args){
        getName();


    }

    // Приветствие
    public  static void getName(){
        String name = "Ilya";
        String surname = "Mamchyk";
        int age = 23;
        System.out.println("Hello! My name is " + name + " " + surname + ".");
        System.out.println("My age is " + age + ".");
        System.out.println("Thank you for your attention!");
    }

    public  static void test2(){
        int age = 2;
        System.out.println(age);
        age = age + 1;
        System.out.print(age);
        String loft ="Аьаььаьаь";
        System.out.println(loft);
    }
}

