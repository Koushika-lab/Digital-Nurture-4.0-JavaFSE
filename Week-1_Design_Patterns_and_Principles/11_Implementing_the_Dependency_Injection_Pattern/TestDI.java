public class TestDI {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService svc = new CustomerService(repo);
        svc.showCustomer(101);
    }
}
