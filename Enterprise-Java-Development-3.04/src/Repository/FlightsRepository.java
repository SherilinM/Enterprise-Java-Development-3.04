import java.util.List;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, String> {
    public Flights findFlightsByFlightNumber (String flightNumber);
    public List<Flights> findByFlightMileageGreaterThan(Integer flightMileage);
}