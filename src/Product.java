import java.util.Scanner;

//super class
public abstract class Product {
    //field
    protected double price;
    //methods
    abstract void setPrices();
    protected double getPrices(){
        return price;
    }
}

//subclass
 class Book extends Product{
    @Override
    void setPrices(){
        System.out.print("Enter the book price: ");
        Scanner input = new Scanner(System.in);
        double pr = input.nextDouble();
        //price of the parent = price of the child
        this.price= pr;
    }
}

//grandchild class
class ChildrenBook extends Book{
    @Override
    void setPrices(){
        System.out.print("Enter number of mini books: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Enter the price for one mini book: ");
        double onePrice = input.nextDouble();
        //price of the parent = price of the grandchild
        this.price=onePrice*number;
    }
}


