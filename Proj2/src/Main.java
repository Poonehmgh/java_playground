public class Main {
    public static void main(String[] args) {
        //Animal cat = new Cat();
        //System.out.println(cat._c_); cannot compile, becaue if the cat is of type Animal, it cannot access the attributes of cat. only the atrinutes of Animal.

        //Cat cat = new Cat (12); constructor overloading
        // access specifiers:
//        Cat cat = new Cat();
//        System.out.println(cat._a_); doable when protected and public.


        /*here the below code was surprisingly compiled. why? because: */
        //In Java, an interface cannot be directly instantiated, but what I am doing in this code is
        // creating an anonymous class that implements the RemoteController interface.
        // This is a common practice known as anonymous class instantiation.


//        RemoteController a = new RemoteController() {
//            @Override
//            public void buttonA() {
//                System.out.println("A");
//            }
//
//            @Override
//            public void buttonB() {
//                System.out.println("B");
//            }
//        };
        /*implementing an interface*/
        SamsungController tv = new SamsungController();
        tv.buttonA();
        tv.powerOff();
        /*anonymous implementation*/
        ElectricChip chipA = new ElectricChip() {
            @Override
            void led() {
                System.out.println("LED is blue");
            }
        };
        chipA.led();



    }
}