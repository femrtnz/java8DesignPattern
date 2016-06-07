package java8.executearound.banking;

import java.io.IOException;
import java.util.function.Consumer;

public class OpenClose {

	public void process(String value, Consumer<String> middle) throws IOException{
		System.out.println("Open resource");
		middle.accept(value);
		System.out.println("Close resource");
	}
	
}
