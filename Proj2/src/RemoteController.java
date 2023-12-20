public interface RemoteController{
    void buttonA();
    void buttonB();
    int a = 1; // constant attributes possible only
//    int b; //cannot compile with this line. case the interface should only have const attributes and functions with no body.
    //interface cannot have funcion body, unless its a default function:
    default void powerOff(){
        System.out.println("Power off implemented for every controller like this.");
    }
}