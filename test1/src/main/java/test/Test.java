package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/11/5 17:12
 * @Created by zhangtao
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = app.getBean(UserService.class);
		System.out.println(bean);
	}
}
