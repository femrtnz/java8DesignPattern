package java8.template.banking;

import java.util.function.Consumer;

public class BankingFunctional {
	//Template Design PAttern
	public void processOperation(Operation op){
		process(op);
	}
	
	public void processOperation(Operation op, Consumer<Operation> pre, Consumer<Operation> pos){
		pre.accept(op);
		process(op);
		pos.accept(op);
	}
	
	private void process(Operation op){
		op.process();
	}
}
