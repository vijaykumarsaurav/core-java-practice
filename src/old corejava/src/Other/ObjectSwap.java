package Other;

public class ObjectSwap {
	
	String id;
	String name ;
	float price;
	public ObjectSwap(String id	,String name ,float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void swap(ObjectSwap lap,ObjectSwap desk)
	{
		float temp = lap.price;
		lap.price = desk.price;
		desk.price = temp;
		
	}
	void display(){
		System.out.println("Id : "+this.id +" Name : "+this.name +" Price :"+this.price);
	}
	public static void main(String[] args) {

		ObjectSwap lap = new ObjectSwap("LENOVO-123","Lenovo",25000.0f);
		ObjectSwap desk = new ObjectSwap("HCL-123","HCL",15000.0f);
		desk.swap(lap, desk);
		lap.display();
		desk.display();
		ObjectSwap d2 = desk; ///direct ref copy to other ref
		d2.display();
		d2 = new ObjectSwap("des","vijay",35000.0f);
		d2.swap(d2, desk);
		d2.display();
		
	}

}
