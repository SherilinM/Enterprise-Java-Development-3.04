import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    public Customers findCustomersByCustomerName (String customerName);
    public Customers findCustomersById (Integer id);
    public List<Customers> findCustomersByCustomerStatus (String customerStatus);
}