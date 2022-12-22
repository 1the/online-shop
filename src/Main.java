public class Main {
    public static void main(String[] args) {
        Product [] arr=new Product[2];
        arr[0]=new Book();
        arr[0].setPrices();
        arr[1]=new ChildrenBook();
        arr[1].setPrices();
        System.out.println("Total cost is: "+(arr[0].getPrices()+arr[1].getPrices()));
    }
}
