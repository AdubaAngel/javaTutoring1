import java.util.*;

public class SixthClass {
    public static void main(String[] args) {
        

        //BREAK AND CONTINUE STATEMENTS
        /* for(int i = 0; i < 10; i++){
            if(i == 4 ){
                break;
            }
            System.out.println("i is equal to " + i);
        } */

            /* for(int i = 0; i < 10; i++){
                if( i == 4){
                    continue;
                }
                System.out.println("i is equal to " + i);
            } */

            /* for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    continue;
                }else if(i == 4){
                    break;
                }
                System.out.println("i is equal to " + i);
            } */

            //WHILE LOOPS
            /* int i = 0;
            while(i < 10){
                if(i == 4){
                    i++;
                    continue;
            }
            System.out.println(i);
            i++;
        } */
        /* The continue statement must be before the print statement so the part of the loop you want is excluded before you print the next number. The i++ must also put put within the if statement and after the print statement because if not it will just keep printing one number*/


        //ARRAYS
        /* Arrays allow us to store multiple values in a singular variable */

        /* int[] numbers = {3, -1, 7, 0, 9};

        for(int i = 0; i < numbers.length; i++){
            int n = numbers[i];
            if(n< 0){
                continue;
            } 
            if(n == 0){
                break;
            }
            System.out.println(n);
        } */ 

        /* for (int n: numbers) {
            if(n < 0){
                continue;
            }
            if(n == 0){
                break;
            }
            System.out.println(n);
        } */

    

        /* String[] cars = {"Ford", "BMW", "MAZDA", "Volvo"};

        String newCar = "Ferrari";

        //System.out.println(cars.length);

        for (int j = 0; j < cars.length; j++) {
            cars[0] = newCar;
            System.out.println(cars[j]);
        } */

        // int arraySize = 4;

        /* String[] cars = new String[arraySize];
        cars[0] = "MAZDA";
        cars[1] = "Volvo";
        cars[2] = "Ferrari";
        cars[3] = "Tesla"; 

        System.out.println(cars[0]); */

        /* for (int j = 0; j < cars.length; j++) {
            cars[j] = "MAZDA";
        } */

        /* String[] newCars = new String[]{"MAZDA", "Jeep", "Porshe", "Tesla"};
        String[] newCar = {"MAZDA", "Jeep", "Porshe", "Tesla"}; 

        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
            
        } */
        //20 22 18 35 48 26 87 70 
        //Average


        /* int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float count = 0;
        float sumTotalCount = 0;
        float avg = 0;

        for(int i = 0; i < ages.length; i++){
            count += ages[i]; 
            sumTotalCount++; 
            // i++;
        }
        avg = count/sumTotalCount;

        System.out.println(avg); */

        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        
        int length = ages.length;

        for (int age : ages) {
            sum+=age;
        }
         avg = sum/length;
         System.out.println(avg);
    }
}
