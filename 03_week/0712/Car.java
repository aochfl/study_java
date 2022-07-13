class Car{
	String company;
	String model;
	String color;
	int maxSpeed;
	Car(){
		model="제네시스";
		color="검정";
		maxSpeed=300;
	}
	Car( String model){
		this.model = model;
		this.color = "미정";
		this.maxSpeed = 0;
	}
	
	Car( String model, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = 0;
	}

	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.println("company :"+company + " / model : "+model+" / color : "+color +" / maxSpeed :"+maxSpeed);
	}
}