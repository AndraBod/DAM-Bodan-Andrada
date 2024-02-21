public class Ford extends Car
{
    public Ford(int speed, double regularPrice, String color)
    {
        super(speed, regularPrice, color);
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice();
    }
}