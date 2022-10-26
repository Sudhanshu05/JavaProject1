
public class part_1 {
	
	public static  class Computer{

		//Attribute declaration
		private String brand;
		private String model;
		private Long Sn;
		private Double price;
		private static int numberOfObjectsCreated = 0;
		
		
	    //Constructor
		public Computer(String Brand,String Model, Long sn, Double Price ) {
			this.brand = Brand;
			this.model = Model;
			this.Sn =sn;
			this.price = Price;
			numberOfObjectsCreated ++;
			
		}
		public Computer() {
			this.brand = "Apple";
			this.model = "2007";
			this.Sn= 1101l;
			this.price = 3000d;
		}
		
		//getters
		public String getbrand() {
			return brand;		
		}
		public String getmodel() {
			return model;		
		}
		public Long Sn() {
			return Sn;		
		}
		public Double price() {
			return price;		
		}
		//setters
		public void setbrand(String sbrand) {
			this.brand =sbrand;
		}
		public void setmodel(String smodel) {
			this.brand =smodel;
			
		}
		public void setSn(Long Sn) {
			this.Sn =Sn;
		}
		public void setprice(Double Price) {
			this.price = Price;
		}
		//Method
		//1.To display all the information
		public void display() {
			System.out.println("Brand : "+brand+"\n Model"+model+"\n Sn"+Sn+"\n Price"+price);
			
		}
		
		//2.To compare the price
		public int  equals(Computer obj) {
			if(this.brand == obj.brand&&this.model==obj.model&&this.price == obj.price) {
				return 0;
			}
			else return 1;
		}
	
	
	
		public static void  main(String[] args) {
			int verify ;
			Computer obj1 = new Computer();
			Computer obj2 = new Computer();
			//obj1 all information
			obj1.brand = "Dell";
			obj1.model= " 2019";
			obj1.Sn= 101l;
			obj1.price =3200d;
			//Methods for obj1
			obj1.display();
			//obj2 all information
			obj1.brand = "Dell";
			obj1.model= " 2019";
			obj1.Sn= 103l;
			obj1.price =3200d;
			//Methods for obj2
			obj2.display();
			//Compare 
			verify  = obj1.equals(obj2);
			if(verify == 0) {
				System.out.println("Both are equal");
			}else {
				System.out.println("Both are not equal");
			}
			// find the number of objects;
			System.out.println ("There are " + Computer.numberOfObjectsCreated  + " objects in this class");
			
		}
	}
}
