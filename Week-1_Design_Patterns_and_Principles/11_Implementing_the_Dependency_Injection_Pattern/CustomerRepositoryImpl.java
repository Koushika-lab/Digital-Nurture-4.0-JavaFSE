public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        System.out.println("CustomerRepositoryImpl: looking up customer for ID " + id);
        return "Customer#" + id;
    }
}
