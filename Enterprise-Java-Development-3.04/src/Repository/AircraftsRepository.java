import java.util.List;

@Repository
public interface AircraftsRepository extends JpaRepository<Aircrafts, String> {
    public Aircrafts findAircraftsByAircraftName (String aircraftName);
    public List<Aircrafts> findAircraftsByAircraftNameContaining (String airc