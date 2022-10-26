import java.util.*;
public class Computer {

		private String name;
		private  String brand;
		private String model;
		private int SN;
		private double price;
		
		public Computer() {
		}
		public Computer(String Name, String Brand, String Model , int SN, double Price ) {
			this.name =Name;
			this.brand = Brand;
			this.model =Model;
			this.SN = SN;
			this.price = Price;
		}
		public String getname() {
			return this.name;
		}
		public String setname(String name) {
			return this.name =name;
		}
		public String getbrand() {
			return this.brand;
		}
		public String setbrand(String brand) {
			return this.brand = brand;
		}
		public String getmodel() {
			return this.model;
			
		}
		public String setmodel(String model) {
			return this.model =model;
		}
		public int getsn() {
			return this.SN;
		}
		public int setsn(int sn) {
			return this.SN =sn;
		}
		public double getprice() {
			return this.price;
		}
		public double setprice(double price) {
			return this.price =price;
		}
		
		public static void findComputerby(String brand) {
			for(int  i =0 ;i <arr.length;i++) {
				if(arr[i].brand == brand) {
				System.out.println("\nName:"+arr[i].name+" Brand"+arr[i].brand+" Model :"+ arr[i].model +" Sn :"+arr[i].SN+ " Price : "+ arr[i].price);
			}
			}
		}
		public static void findCheaperThan(double price) {
			for(int  i =0 ;i <arr.length;i++) {
				if(arr[i].price < price) {
				System.out.println("\nName:"+arr[i].name+" Brand"+arr[i].brand+" Model :"+ arr[i].model +" Sn :"+arr[i].SN+ " Price : "+ arr[i].price);
			}
			}
		}
		
		 static int number =0 ;
		 public static  void display() {
			Scanner scan = new Scanner(System.in);
			System.out.println("What do you want to do \n\t 1.Enter new computers(password required) \n\t 2.Change information of a computer(password required) \n\t 3.Display all computers by a specific brand \n\t. 4. Display all computers under a certain price \n\t 5. Quit");
			number =scan.nextInt();
	}
		 public static Computer[] expandArray(Computer[] arr, int exp) {
				
				Computer[] expandedArray =  new Computer[arr.length + exp];
				
				for (int j = 0; j < arr.length; j++) {
					expandedArray[j] = arr[j];
					
				}

				return expandedArray;

			}
		static Computer cs;
		 static Computer []arr  ;
		 
	public static void main(String [] args) {{
		Scanner scan = new Scanner(System.in);
		
		int attemp= 0;
		int password = 123;
		
		display();
		switch (number){
		case 1 : 
			
			int pass,i = 0;
			do {
				
				System.out.println("\n Enter the password");
				pass = scan.nextInt();
				attemp++;
				if(attemp == 3) {
					display();
				}
			}while(pass != password&&attemp <3);
			System.out.println("\n Enter the no of computers you want to enter:");
			int size= scan.nextInt();
			arr = new Computer[size];
			while(i<arr.length) {
				cs =new Computer();
				System.out.println("\nEnter the name");
				cs.name = scan.next();
				System.out.println("\nEnter the brand");
				cs.brand = scan.next();
				System.out.println("\nEnter the model");
				cs.model = scan.next();
				System.out.println("\nEnter the SN");
				cs.SN = scan.nextInt();
				System.out.println("\nEnter the price");
				cs.price = scan.nextDouble();
				arr[i]=  cs;
				i++;
			}
			display();
			break;
		case 2:
				int choice=0;
				do {
					
				System.out.println("\n Enter the password");
				pass = scan.nextInt();
				attemp++;
				if(attemp == 3) {
					display();
				}
				}while(pass != password&&attemp <3);
				
				System.out.println("Enter the computer number which you want to search :");
				int search = scan.nextInt();
				for(int i1 = 0; i1 <arr.length;i1++) {
					if(i1 == search) {
						System.out.println("\nName:"+arr[i1].name+" Brand"+arr[i1].brand+" Model :"+ arr[i1].model +" Sn :"+arr[i1].SN+ " Price : "+ arr[i1].price);
					int choice1;
					do {
					System.out.println("\nWhich information you want to change:\n\t1.brand.\\n\\t1.model.\\n\\t1.Sn.\\n\\t1Price\nEnter the choice:.");
					 choice1 = scan.nextInt();
					switch (choice1) {
					case 1:
						System.out.println("\nEnter the new value");
						arr[i1].brand =scan.next();
						break;
					
					case 2:
						System.out.println("\nEnter the new value");
						arr[i1].model =scan.next();
						break;
					case 3:
						System.out.println("\nEnter the new value");
						arr[i1].SN =scan.nextInt();
						break;
					case 4:
						System.out.println("\nEnter the new value");
						arr[i1].price =scan.nextDouble();
						break;
					default:
						System.out.println("\nYou enter the wrong choice");
					}
					}while(choice1!=1||choice1!=2||choice1!=3||choice1!=4);
					
					}else {
						int num=0;
						do {
						System.out.println("\n\tWant to add user .press1\n\twant to quit:press2");
						 num = scan.nextInt();
					}while(num!=1||num!=2);
						if(num==1) {
							 int start = arr.length;
							 arr = expandArray(arr, 1);
							for(int j = start; j<arr.length;j++) {
								cs =new Computer();
								System.out.println("\nEnter the name");
								cs.name = scan.next();
								System.out.println("\nEnter the brand");
								cs.brand = scan.next();
								System.out.println("\nEnter the model");
								cs.model = scan.next();
								System.out.println("\nEnter the SN");
								cs.SN = scan.nextInt();
								System.out.println("\nEnter the name");
								cs.price = scan.nextDouble();
								arr[j]=  cs;
								j++;
							}
								
						}else {
							display();

						}
				
					}
				
				}
				break;
		
		case 3:
			System.out.println("\nEnter the brand name");
			String bname = scan.next();
			findComputerby(bname);
			break;
		case 4:
		System.out.println("\nEnter the brand name");
		double price = scan.nextDouble();
				findCheaperThan(price);
				break;
		default :
			System.out.println("Sorry ");
			}
	
	
		}
			
	}		

}
	