package Assement4;

public class IceCream extends Product implements LickAble,Consumable{
    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }


    @Override
    public boolean saleToLick() {
        return false;
    }

    @Override
    public void consume() {
        System.out.println(getPrice());
    }
}
