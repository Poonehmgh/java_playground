public class Cat extends Animal{
    public Cat() {
        super(2);
        _c_ = 456;
        System.out.println("cat constructor called!");
    }
    public Cat(int a)
    {
        super(a);
        System.out.println("lets see the polymorphic nature of this constructor. ");
    }
    private int _b_;
    public int _c_;
}