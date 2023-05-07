package MACHINE;

 class Machine {
public void start() {
System.out.println("Starting...");
	
}
public void dog() {
	System.out.println("Grr");
}
public static void main(String args[]) {
	Machine m = new Machine() {
		@Override
		public void start() {
			System.out.println("Woooooo");
		}
		@Override
		public void dog() {
			System.out.println("Woooo");
		}
	};
	m.start();
	m.dog();
}
}