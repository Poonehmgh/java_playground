public class SamsungController implements RemoteController{
    @Override
    public void buttonA() {
        System.out.println("Button A: Play the video");
    }
    @Override
    public void buttonB(){
        System.out.println("Button B: Pause the video");
    }
}
/* also possible; public class SamsungController extends ElectricChip implements RemoteController {...*/
