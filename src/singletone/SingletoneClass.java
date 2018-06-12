package singletone;

public enum SingletoneClass {
	
	INSTANCE1, INSTANCE2;
	
	private int counter;
	
	public void setCounter(int counter){
		this.counter = counter;
	}
	
	public int getCounter(){
		return this.counter;
	}

}
