package kata7;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Flight {
    private final DayOfWeek dayOfWeek;
    private final LocalTime departureTime;
    private final LocalTime arrivalTime;
    private final int departureDelay;
    private final int arrivalDelay;
    private final int duration;
    private final int distance;
    private final boolean cancelled;
    private final boolean diverted;

    public Flight(DayOfWeek dayOfWeek, LocalTime departureTime, LocalTime 
            arrivalTime, int departureDelay, int arrivalDelay, int duration, 
            int distance, boolean cancelled, boolean diverted) {
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureDelay = departureDelay;
        this.arrivalDelay = arrivalDelay;
        this.duration = duration;
        this.distance = distance;
        this.cancelled = cancelled;
        this.diverted = diverted;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureDelay() {
        return departureDelay;
    }

    public int getArrivalDelay() {
        return arrivalDelay;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean isDiverted() {
        return diverted;
    }
    
    public int get(String field){
        
        switch (field) {
            case "departureDelay":
                return getDepartureDelay();
            case "arrivalDelay":
                return getArrivalDelay();
            case "duration":
                return getDuration();
            case "distance":
                return getDistance();
            default:
                return 0;
        }
    }
    
    public Map<String, Integer> getValueMethods(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("departureDelay", this.getDepartureDelay());
        map.put("arrivalDelay", this.getArrivalDelay());
        map.put("duration", this.getDuration());
        map.put("distance", this.getDistance());
        
        return map;
    }
    
    @Override
    public String toString() {
        return "Flight{" + "dayOfWeek=" + dayOfWeek + ", departureTime=" + 
                departureTime + ", arrivalTime=" + arrivalTime + 
                ", departureDelay=" + departureDelay + ", arrivalDelay=" + 
                arrivalDelay + ", duration=" + duration + ", distance=" + 
                distance + ", cancelled=" + cancelled + ", diverted=" + 
                diverted + '}';
    }

}
