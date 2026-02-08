import java.util.Scanner;

public class mainAngel {

    public static void main(String[] args) {
        //System.out.println(angel.getName());
        Person angel = new Person();
        angel.setName("Amaka");

        System.out.println(angel.getName());

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter username: ");
        //sc.nextLine();

        String userName =  sc.nextLine();
        System.out.println("Username is " +  userName);

    }

}
