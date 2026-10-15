package agh.po.lab1;

public class tree {
	public static void main(String[] args) {
		if(args.length > 0) {
			
			int wysokosc = Integer.parseInt(args[0]);
			
		
		for (int i=0; i< wysokosc; i++){
			for (int j = 0; j < i - 1; j++){
				System.out.print("*");
		}
		for(int k=0; k < 1; k++) {
			System.out.println("*");
	}
}
}
	}
}