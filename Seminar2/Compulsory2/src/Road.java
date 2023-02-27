public class Road {
    public enum roadsType {
        HighWay, Express, Country
    }

    ;
    private roadsType type;
    private Float length;
    private Float speedLimit;

    public void setType(roadsType type1) {
        type = type1;
    }

    public void setLength(Float length1) {
        length = length1;
    }

    public void setSpeedLimit(Float speedLimit1) {
        speedLimit = speedLimit1;
    }

    public Float getLength() {
        return length;
    }

    public Float getSpeedLimit() {
        return speedLimit;
    }

    public roadsType getType() {
        return type;
    }

    public Road(Float speedLimit1, Float length1, roadsType type1) {
        setLength(length1);
        setType(type1);
        setSpeedLimit(speedLimit1);
    }
}