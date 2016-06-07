package java8.template.banking;

public abstract class Banking {
	//Template Design PAttern
	public void processOperation(Operation op){
		preProcessing(op);
		process(op);
		postProcessing(op);
	}
	
	protected abstract void postProcessing(Operation op);
	
	protected abstract void preProcessing(Operation op);

	private void process(Operation op){
		op.process();
	}
}
