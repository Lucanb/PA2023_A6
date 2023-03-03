public class GasStation {

    float gasPrice;

    public float getGasPrice()
    {
        return gasPrice;
    }

    public void setGasPrice(float gasPrice1)
    {
        gasPrice=gasPrice1;
    }
    //Object equals
    public GasStation(int gasPrice1)
    {
        setGasPrice(gasPrice1);
    }
}
