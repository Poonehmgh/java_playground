
public class Item {
    private int         _id_;
    private String      _name_;
    private double      _price_;
    public Item(String name, double price, int id){
        set_name_(name);
        set_price_(price);
        set_id_(id);
    }
    public void set_id_(int id)
    {
        _id_ = id;
    }
    public void set_name_(String name)
    {
        _name_ = name;
    }
    public void set_price_(double price)
    {
        _price_ = price;
    }
    public int get_id_(){
        return  _id_;
    }

    public double get_price_() {
        return _price_;
    }
    public String get_name_()
    {
        return _name_;
    }
}