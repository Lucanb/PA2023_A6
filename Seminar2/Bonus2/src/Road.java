import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Road {
    private Object type;
    private int length;
    private double speedLimit;

    Coordonates firstCity;
    Coordonates secondCity;

    public void setType(Object type1) {
       type=type1;
    }
    public void setLength(int length1) {
        length = length1;
    }

    public void setSpeedLimit(double speedLimit1) {
        speedLimit = speedLimit1;
    }

    public int getLength() {
        return length;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public Object getType() {
        return type;
    }

    public Coordonates getFirstCity(){
       return firstCity;
    }
    public Coordonates getSecondCity(){
        return secondCity;
    }

    public void setFirstCity(Coordonates firstCity1){
        firstCity=firstCity1;
    }

    public void setSecondCity(Coordonates secondCity1){
        secondCity=secondCity1;
    }

    @Override
    public String toString() {
        return "Road{" +
                "type=" + type +
                ", length=" + length +
                ", speedLimit=" + speedLimit +
                '}';
    }
    public void setCoordonates(Coordonates firstCity1,Coordonates secondCity1){
        setFirstCity(firstCity1);
        setSecondCity(secondCity1);
    }
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public double distance(Coordonates firstCity1,Coordonates secondCity1)
    {
      double t= (sqrt(pow(firstCity1.x-secondCity1.x,2)+pow(firstCity1.y-secondCity1.y,2)));
      return t;
    }

    public Road(double speedLimit1, int length1, Object type1) {
        setLength(length1);
        setType(type1);
        setSpeedLimit(speedLimit1);
        Coordonates coord0=new Coordonates(0d,0d);
        setCoordonates(coord0,coord0);
    }

    public Road(Coordonates firstCity1,Coordonates secondCity1,double speedLimit1, int length1, Object type1){
        if(length1 >= distance(firstCity1,secondCity1)) {
            setCoordonates(firstCity1, secondCity1);
            setLength(length1);
            setType(type1);
            setSpeedLimit(speedLimit1);
        }
        else
        {
            System.out.println("Wrong distance please try again!");
        }
    }
}