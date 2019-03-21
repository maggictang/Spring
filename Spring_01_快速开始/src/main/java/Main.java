import hello.HelloWorld;
import loosely_coupled.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {
	    context = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
        helloWorld.printHello();

        OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
        outputHelper.generatorOutput();
    }
}
