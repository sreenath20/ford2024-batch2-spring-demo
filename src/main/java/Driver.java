import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] a){

        ApplicationContext appContxt = new
                ClassPathXmlApplicationContext("beans.xml");

        Employee empRef = (Employee) appContxt.getBean("employee");
        System.out.println(empRef.hashCode() +":"+empRef);

        empRef = (Employee) appContxt.getBean("employee");
        System.out.println(empRef.hashCode() +":"+empRef);

        Employee empRef2 = (Employee) appContxt.getBean("employee2");
        System.out.println(empRef2.hashCode()+":"+empRef2);
        empRef2 = (Employee) appContxt.getBean("employee2");
        System.out.println(empRef2.hashCode()+":"+empRef2);
        Address address = (Address) appContxt.getBean("address");
        System.out.println(address);
    }
}
