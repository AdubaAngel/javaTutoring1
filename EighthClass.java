public class EighthClass {
    //DRY Principle: Don't repeat yourself

    //A class is a template for objects and an object is an instance of a class. 
    //An object can inherit from a class

    /* int health = 100;
    int intelligence = 200;

    int age;


     public static void main(String[] args) {
        EighthClass myObj = new EighthClass();
        EighthClass myObj2 = new EighthClass();


        //myObj.health = 300;
        myObj.age = 89;
        System.out.println("Health: " + myObj.health);
        System.out.println("Age: " + myObj.age);

        myObj2.health = 50;
        myObj2.age = 104;
        System.out.println("Obj2 Health: " + myObj2.health);
        System.out.println("Obj2 Age: " + myObj2.age);
    } */  
    
    /* static void myMethod(){
        System.out.println("Hello World");
        //String greeting = "Hello World";
    }

    public static void main(String[] args) {
        myMethod();
        //System.out.println(greeting);
    } */

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed){
        System.out.println("The max speed is: " + maxSpeed);
    }
    
    public static void main(String[] args) {
        EighthClass myCar = new EighthClass();
        myCar.fullThrottle();
        myCar.speed(90);
    }

    /* The '.' is used to access the object attributes and methods. Which means the house attributes. What the house has and what the house can d */

    //Next class 
}
