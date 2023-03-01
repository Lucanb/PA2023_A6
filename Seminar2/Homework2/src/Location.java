
public class Location {
    ;
    private StringBuilder Name;
    private String type;
    private Coordonates coord;

    public void setName(StringBuilder Name1) {
        Name = Name1;
    }

    public void setType(LocationType type1) {
        type = type1.getType();
    }

    public void setCoord(Coordonates coord1) {
        coord = coord1;
    }

    public StringBuilder getName() {
        return Name;
    }

    public String getType() {
        return type;
    }

    public Coordonates getCoord() {
        return coord;
    }

   /* public String toString()
    {
        String myString = new String("");
        myString+=Name;
        myString+="\n";
        myString+=coord.x;
        myString+="\n";
        myString+=coord.y;
        myString+="\n";
        myString+=type;
        myString+="\n";
        return myString;
    }

    */

    @Override
    public String toString() {
        return "Location{" +
                "Name=" + Name +
                ", type=" + type +
                ", coord=" + "(" + coord.x + "," + coord.y + ")" +
                '}';
    }

    public Location(StringBuilder Name1, LocationType types1, Coordonates coord1) {
        setCoord(coord1);
        setType(types1);
        setName(Name1);
    }

}