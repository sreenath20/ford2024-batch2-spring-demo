import components.sub.Discount;
import components.sub.Product;
import components.ProductAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] a){

//        //XML config
//
//        ApplicationContext appContxt = new
//                ClassPathXmlApplicationContext("beans.xml");
//
//        Employee empRef = (Employee) appContxt.getBean("employee");
//        System.out.println(empRef.hashCode() +":"+empRef);
//
//        empRef = (Employee) appContxt.getBean("employee");
//        System.out.println(empRef.hashCode() +":"+empRef);
//
//        Employee empRef2 = (Employee) appContxt.getBean("employee2");
//        System.out.println(empRef2.hashCode()+":"+empRef2);
//        empRef2 = (Employee) appContxt.getBean("employee2");
//        System.out.println(empRef2.hashCode()+":"+empRef2);
//        Address address = (Address) appContxt.getBean("address");
//        System.out.println(address);
//
//        // Java config
//
//        ApplicationContext appContext = new
//                AnnotationConfigApplicationContext(AppConfig.class);
//        Employee emp= (Employee) appContext.getBean("employee");
//        System.out.println(emp.hashCode()+":"+emp);
//        emp= (Employee) appContext.getBean("employee");
//        System.out.println(emp.hashCode()+":"+emp);
//        Address address = (Address) appContext.getBean("address");
//        System.out.println(address);

        // Annotation based config
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ProductAppConfig.class);
        Product product = (Product) appContext.getBean("product");
        System.out.println(product);
        Discount discount = (Discount) appContext.getBean("discount");

        System.out.println(discount);
    }
}
