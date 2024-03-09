package automation.common;

public class Day15_Flight_Model {
    private String flyType;
    private String flyingFrom;
    private String flyingTo;
    private String departing;
    private String passengers;
    private String coach;

    public Day15_Flight_Model(String flyingFrom, String flyingTo, String departing, String passengers, String coach) {
        this.flyingFrom = flyingFrom;
        this.flyingTo = flyingTo;
        this.departing = departing;
        this.passengers = passengers;
        this.coach = coach;
    }

    public String getFlyType() {
        return flyType;
    }

    public String getFlyingFrom() {
        return flyingFrom;
    }

    public String getFlyingTo() {
        return flyingTo;
    }

    public String getDeparting() {
        return departing;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getCoach() {
        return coach;
    }
}
