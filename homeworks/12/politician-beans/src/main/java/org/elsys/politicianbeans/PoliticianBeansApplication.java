package org.elsys.politicianbeans;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PoliticianBeansApplication {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("beans.xml");
	}

}
