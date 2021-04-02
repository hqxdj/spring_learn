import config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.MyTest;

public class SpringLearnApplication {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyTest bean = context.getBean(MyTest.class);
		System.out.println(bean.getName());
	}

}
