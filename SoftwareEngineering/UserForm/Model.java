public class Model {

	//Attributes
	private String name;
	private int age;
	private String email;
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	//Constructor
	public Model() {}

	public Model(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}

	//Getters and Setters
	public String getName (){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
		//notify();
	}

	//Methods

}