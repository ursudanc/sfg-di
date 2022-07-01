package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

        ApplicationContext ctx  =   SpringApplication.run(SfgDiApplication.class, args);
        MyController myCnt = (MyController) ctx.getBean("myController");
        String greeting = myCnt.sayHello();
        System.out.println(greeting);

        System.out.println("------- Property");
        PropertyInjectedController propertyInjC= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjC.getGreeting());

        System.out.println("------- Setter");
        SetterInjectedController setterInjC= (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjC.getGreeting());

        System.out.println("------ Constructor");
        ConstructorInjectedController constructorInjectedC= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedC.getGreeting());
	}

}
