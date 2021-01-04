class Man {
	private int age;
	private int height;
	private int weight;
 
    Man(){}
	/*Man(int age, int height, int weight){
		this.age = age;
		this.height = height;
		this.weight = weight;
	}*/
	void setAge(int age){
		this.age = age;
	}
	void setHeight(int height){
		this.height = height;
	}
	void setWeight(int weight){
		this.weight = weight;
	}
	int getAge(){
		return age;
	}
	int getHeight(){
		return height;
	}
	int getWeight(){
		return weight;
	}
}
/*class Woman extends Man 
{
	Woman(){
		super(19, 167, 55); 
	}
}*/

class ManMgr{
	public static void main(String[] args) 
	{
		
		Man m = new Man();
		m.setAge(20);
		m.setHeight(185);
		m.setWeight(85);
		//Man m = new Man(22, 188, 75);

        System.out.println("age: " + m.getAge());
		System.out.println("height: " + m.getHeight());
		System.out.println("weight: " + m.getWeight());

		new Woman();
	}
}
