public abstract class ColdDrink implements IItem{
    public IPacking packing(){
        return new Bottle();
    }
    public abstract float price();
}
