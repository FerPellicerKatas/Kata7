package kata7;

public class HistogramBuilder {
    private final Iterable<Flight> flights;
    
    
    public HistogramBuilder(Iterable<Flight> flights) {
        this.flights = flights;
    }
    
    
    public Histogram build(String type, String filter, String bin) {
           
        Histogram histogram = new Histogram(type, filter, bin);
        
        for (Flight flight : this.flights) {
            if(flight.getDayOfWeek().toString().equalsIgnoreCase(filter) && 
                    Integer.parseInt(bin) >= flight.get(type))
            {
                histogram.increment(flight.get(type));
            }
        }
        return histogram;
    }
}
