abstract class SecondNinthClass{
    public String firstName = "Dan";
    public int age = 56;

    public abstract void study();
}

abstract class Student extends SecondNinthClass {
    public int gradYear = 2018;

    public void study(){
        System.out.println("Studying all day long");
    }

    //Next Class is encapsulation. Ensuring sensitive data is hidden from users

}