package julyday1;

public class Car {
	

		public void applyBreak() {
			System.out.println("apply break");
		}
		
		public void applyGear() {
			System.out.println("Apply Gear");
		}
		
		public void switchOnAc() {
			System.out.println("Switch On Ac on");
		}
		
		public void applyAcclerate() {
			System.out.println("Apply Accelerate");
		}
		public static void main(String[] args) {
			
	        Car pmw = new Car();
	        pmw.applyBreak();
	        pmw.applyGear();
	        pmw.switchOnAc();
	        pmw.applyAcclerate();
		}

	
}
