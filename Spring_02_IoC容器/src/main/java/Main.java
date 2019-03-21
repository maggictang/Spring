import bean.FileNameGenerator;
import innerbean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scope.CustomerService;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("spring.xml");
        FileNameGenerator fileNameGenerator = (FileNameGenerator) context.getBean("FileNameGenerator");
        System.out.println(fileNameGenerator);

        Customer customer = (Customer) context.getBean("Customer2");
        System.out.println(customer);
        // 单例，只会生成一个对象，每次都会返回这个对象
        CustomerService singletonA = (CustomerService) context.getBean("CustomerServiceSingleton");
        singletonA.setMessage("Singleton");
        System.out.println("Message：" + singletonA.getMessage());

        CustomerService singletonB = (CustomerService) context.getBean("CustomerServiceSingleton");
        System.out.println("Message：" + singletonB.getMessage());
        // 原型，每次请求都会返回一个新的对象
        CustomerService prototypeA = (CustomerService) context.getBean("CustomerServicePrototype");
        prototypeA.setMessage("Prototype");
        System.out.println("Message：" + prototypeA.getMessage());

        CustomerService prototypeB = (CustomerService) context.getBean("CustomerServicePrototype");
        System.out.println("Message：" + prototypeB.getMessage());

        // 集合类型的Bean
        collection.Customer customer1 = (collection.Customer) context.getBean("CustomerCollection");
        System.out.println(customer1.getLists().toString());
        System.out.println(customer1.getSets().toString());
        System.out.println(customer1.getMaps().toString());
        System.out.println(customer1.getPros().toString());
    }
}
