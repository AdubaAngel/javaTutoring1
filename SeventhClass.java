public class SeventhClass {
        //METHODS

         /* static void myMethod(String fname, int age){
            System.out.println(fname + " Aduba" + " is " + age + " years old");
        }

        public static void main(String[] args) {
            /* myMethod();
            myMethod();
            myMethod(); 

            myMethod("Angel", 19);
        }  */



        /* static void checkAge(int age){
            if(age < 18){
                System.out.println("Access denied!");
            } else if(age >= 18){
                System.out.println("Access granted!");
            }
        }

        public static void main(String[] args) {
            checkAge(17);
        } */

        /* static int myMethod(int x, int y){


            return x + y;
        }

        public static void main(String[] args) {
            int z = myMethod(6, 9);
            System.out.println(z);
        } */


        /* static int doubleNumbers(int a){
            //a = 2;

            for(int i = 0; i < 5; i++){
                a = a+2;
                System.out.println(a);
            }

            return a;
        }

        public static void main(String[] args) {
            //int result = doubleNumbers(0);
            doubleNumbers(0);
        } */



        /* static int doubleNumbers(int a){
                return a * 2;
        }

        public static void main(String[] args) {
            //int result = doubleNumbers(0);
            for(int i = 1; i <= 5; i++){
                System.out.println("Double of " +  i + " is " + doubleNumbers(i) );
            }
            
        } */

        //METHOD OVERLOADING

        /* static int plusMethodInt(int x, int y){
            return x + y;
        }

        static double plusMethodDouble(double x, double y){
            return x + y;
        }

        public static void main(String[] args) {
            int myNumberOne = plusMethodInt(8, 5);
            double myDoubles = plusMethodDouble(2.0, 6.0);

            System.out.println(myNumberOne);
            System.out.println(myDoubles);
        }
     */

        //RECURSIONS

        public static int sum(int k) {
            if(k > 0 ){
                return k + sum(k - 1);
            } else{
                return 0;
            }
            
            //The recursiveness is it keeps calling k - 1 until k is 0 and then it stops;
        }

        public static void main(String[] args) {
            int result = sum(10);
            //sum(0);

            System.out.println(result);
        }
}
