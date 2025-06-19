public class CustomerService {
    private CustomerRepository repo;
    public CustomerService(CustomerRepository r) {
        this.repo = r;
        System.out.println("CustomerService: injected with repository");
    }
    public void showCustomer(int id) {
        String cust = repo.findCustomerById(id);
        System.out.println("CustomerService: retrieved customer -> " + cust);
    }
}
