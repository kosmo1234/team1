package exercise;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import exercise.order.domain.Customer;
import exercise.order.service.CustomerService;
import exercise.order.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {

		// ##### 2. 스프링 설정 파일을 연결 코드를 작성하고 아래 코드의 주석을 해제
		AbstractApplicationContext container = new GenericXmlApplicationContext("exercise/beans.xml");
		
		
		CustomerServiceImpl customerServiceImpl = (CustomerServiceImpl) container.getBean("customerService");
		

		// --------------------------------------
		// 아래 코드의 주석을 해제하였을 때 구현되어야 한다.
		
		
		
		Customer customer = (Customer)container.getBean("customer");		
		CustomerService customerService = (CustomerService)container.getBean("customerService");
		customerService.saveCustomer(customer);
		customerService.deleteCustomer(1);		
		
	}

}
