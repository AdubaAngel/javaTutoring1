public class VirtualPet {
    private String name;
    private int hungerlvl; // 0 means full, 100 means starving
    private int energy; // 0  means exhasted, 100 means fully rested
    private int happinesslvl; // 0 means depressed and 100 means super happy

    public VirtualPet(String PetName, int happinesslvl, int hungerlvl, int energy){
        this.name = PetName;
        this.hungerlvl = hungerlvl;
        this.energy = energy;
        this.happinesslvl = happinesslvl;
    }

    public void feed(int hungerlvl){
        System.out.print("Feed "+ name + " " + " a treat");
        this.hungerlvl = this.hungerlvl + 5;
        this.energy = this.energy - 5;

        if(this.hungerlvl <= 0)this.hungerlvl = 0;

        System.out.println(this.name + " says yummy. Pet is full");
        if(this.energy > 100)this.energy = 100;
        System.out.println("Your current hunger level is " + hungerlvl);

        System.out.println("After feeding the pet might feel a bit sleepy");
    }

    public void play(){
        if(this.energy > 20){
            System.out.println(this.name + " is too tired to play. Try letting them sleep");
            return;
        }
        System.out.print("We want to play with " + this.name + "...");

        this.happinesslvl = this.happinesslvl + 5;
        this.energy = this.energy - 9;
        this.hungerlvl = this.happinesslvl + 10;

        if(this.happinesslvl > 100)this.happinesslvl = 100;
        if(this.energy < 0)this.energy = 0;
        if(this.hungerlvl > 100)this.hungerlvl = 100;

        System.out.println(this.name + " looks happy, happiness is now at level "+ this.happinesslvl);
    }

    public void sleep(){
        System.out.println(this.name + " has to take a nap");
        this.energy = 100;
        this.hungerlvl = this.happinesslvl + 10;
        if(this.hungerlvl > 100)this.hungerlvl = 100;

        System.out.println(this.name + " woke up fully rested " + " Energy is now at " + this.energy);
    }

    public void checkStatus(){
        System.out.println("\n--- " + this.name + "'s Status ---");
        System.out.println("Hunger:    " + this.hungerlvl + "/100 (Lower is better)");
        System.out.println("Energy:    " + this.energy + "/100 (Higher is better)");
        System.out.println("Happiness: " + this.happinesslvl + "/100 (Higher is better)");
        
        // Add some personality based on stats
        if (this.hungerlvl > 80) {
            System.out.println("Warning: " + this.name + " is STARVING!");
        } else if (this.happinesslvl < 20) {
            System.out.println("Warning: " + this.name + " looks very sad...");
        } else {
            System.out.println(this.name + " seems content.");
        }
        System.out.println("-------------------------");
    }


    
    public static void main(String[] args) {
        VirtualPet myPet = new VirtualPet( "Bob", 50, 50, 50);

        myPet.checkStatus();;
    }
    
}
