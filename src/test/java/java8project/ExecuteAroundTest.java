package java8project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import java8.executearound.banking.OpenClose;

public class ExecuteAroundTest {
	//Execute around Design pattern - not gof

	@Test
	public void testOpenClose() throws IOException{
		//Java 6
		BufferedReader br = new BufferedReader(new FileReader("aa"));
		try {
			br.readLine();
		} finally {
			br.close();
		}

		//Java 7
		//Automatically close resource
		try (BufferedReader br1 = new BufferedReader(new FileReader("aa"))){
			br1.readLine();
		}
		
		//Functional
		OpenClose openClose = new OpenClose();
		openClose.process("Test", ex -> System.out.println("Execute"));
			
	}
	
	@Test
	public void testOpenCloseFunctional() throws IOException{
		//Functional
		OpenClose openClose = new OpenClose();
		openClose.process("Test", ex -> System.out.println("Execute"));
		
		//Functional
		openClose.process("Test", ex -> {
			System.out.println("Execute1");
			System.out.println("Execute2");
		});
			
	}
}
