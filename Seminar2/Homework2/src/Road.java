public class Road {
    private String type;
    private Float length;
    private Float speedLimit;

    public void setType(RoadType type1) {
        type = type1.getType();
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Road{" +
                "type=" + type +
                ", length=" + length +
                ", speedLimit=" + speedLimit +
                '}';
    }

    public Road(Float speedLimit1, Float length1, RoadType type1) {
        setLength(length1);
        setType(type1);
        setSpeedLimit(speedLimit1);
    }
}