/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek aşağıdaki gibi yazılmalıdır
---------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input name:");
			String name = kb.nextLine();
			
			if ("exit".equals(name))
				break;
			
			System.out.print("Input number:");
			int no = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d, %s%n", no, name);
		}		
	}
}

