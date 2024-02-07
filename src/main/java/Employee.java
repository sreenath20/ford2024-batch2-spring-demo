public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    private  Address address; // has-a relationship / Employee has-a dependency on address

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter Injection of address");
        // customisation
        address.setCity("Bangalore");
        this.address = address;
    }

    public Employee(Integer id, String name, Double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        this.address = address;
    }

    public Employee(Address address) {
        System.out.println("Constructor Injection of address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
}
