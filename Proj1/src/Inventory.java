import java.util.ArrayList;
import java.util.Scanner;

class Inventory
{
    private ArrayList<Item> _listOfItems_;
    private String _tempName_;
    private int _tempId_;
    private double _tempPrice_;

    public Inventory(){
        _tempId_ = 1000;
        _listOfItems_ = new ArrayList<Item>();
        System.out.println("Inventory created!");
    }

    public void addItem(Scanner scanner)
    {
        System.out.println("Name: ");
        _tempName_ = scanner.next();
        System.out.println("Price: ");
        _tempPrice_ = scanner.nextDouble();
        _tempId_ += 1;

        Item newItem = new Item(_tempName_, _tempPrice_, _tempId_);
        _listOfItems_.add(newItem);
        System.out.println("New item created!: " + _listOfItems_.get(_listOfItems_.size() - 1).get_name_() + " Id: " + _listOfItems_.get(_listOfItems_.size() - 1).get_id_());
    }
    public void addItem(int index, Scanner scanner)
    {
        System.out.println("Name: ");
        _tempName_ = scanner.next();
        System.out.println("Price: ");
        _tempPrice_ = scanner.nextDouble();
        _listOfItems_.get(index).set_price_(_tempPrice_);
        _listOfItems_.get(index).set_name_(_tempName_);
        System.out.println("Item " + _listOfItems_.get(index).get_id_() + " was updated!");
    }

    public ArrayList<Item> getListOfItems()
    {
        return _listOfItems_;
    }

    public void set_listOfItems_(ArrayList<Item> _listOfItems_) {
        this._listOfItems_ = _listOfItems_;
    }
    public void viewInventory()
    {
        System.out.println("ID   | NAME   | PRICE   |");
        for(int i = 0; i < _listOfItems_.size(); i++)
            System.out.println(_listOfItems_.get(i).get_id_() +  "   " + _listOfItems_.get(i).get_name_() + "   " + _listOfItems_.get(i).get_price_());
    }
    public void updateItem(Scanner scanner)
    {
        this.viewInventory();
        System.out.println("Select the ID of item to update.");
        int id = scanner.nextInt();
        int index = findIndex(id);
        this.addItem(index, scanner);
    }
    private int findIndex(int id)
    {
        for (int i = 0; i < _listOfItems_.size(); i++)
            if (_listOfItems_.get(i).get_id_() == id)
                return i;
        return -1;
    }
    public void searchInventory(Scanner scanner)
    {
        System.out.println("What item are you looking for?");
        _tempName_ = scanner.next();
        int indicator = 0;
        for (int i = 0; i < _listOfItems_.size(); i++)
        {
            if (_listOfItems_.get(i).get_name_().equals(_tempName_))
            {
                System.out.println("Found: " + _listOfItems_.get(i).get_name_() + " id: " + _listOfItems_.get(i).get_id_());
                indicator++;
            }
        }
        if (indicator == 0)
            System.out.println("Not found!");

    }

}