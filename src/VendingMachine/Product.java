package VendingMachine;

public class Product {

	public static void main(String[] args) {
		
		//name
		private String name;
		//price
		private double price;
		//size
		private int size;  //we can have two sizes(1 small) (2 large)
		//location
		private int [] location;  // this array will have 2 indexes (0 = row, 1 = col)
		//quantity
		private int quantity;
		
		//default constructor
		public Product() {
			this.name = "";
			this.price = 0.0;
			this.size = 0;
			this.location = new int[2];
			this.quantity =0;
			
		}
		
		//parameterized constructor
		public Product(String name, double price, int size, int[] location, int quantity) {
			this.name = "name";
			this.price = price;
			this.size = size;
			this.location = new int[2];
			this.quantity =0;
			//what are the getter and setter for all of them--class prctice 
	}
		//getters
		public String getName() {
			return name;
			
		}

		public double getPrice () {
			return price;
		}
		public int getSize () {
			return size;
		}
		public int getQuantity() {
			return quantity;
		}
		//setter
		public void setName (String name) {
			this.name = name;
			
		}
		// location
		public void setLocation(int [] location) {
			this.location = location;
		}
		public void setLocation(int row, int col) {
			// I want to check if the numbers are in range, if so, assign them to the array, if not, don't assign
			location [0] = row;
			location [1] = col;
			
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
			
		}
		//this method will validate the location entry and returns a boolean if its in range
		public boolean validateLocationEntry(int row, int col) {
			boolean validation = false;
			//row 0-6
			//col 0-4
			
			if (row 0-6) {
				// row meets the condition, so lets check the col
				if (col 0-4) {
					//col  also meets the condition, so lets change the boolean that is returned to true
					validation = true
				} else {
					//the col is out of range
					System.out.println("Coloum is not in range!");
				}
			}
			
			
			
			
			
			
			
			
			
			
			return false;
		}
	}
	
	
	
