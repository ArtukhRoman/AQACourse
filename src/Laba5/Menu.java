package Laba5;

import java.io.IOException;

public class Menu {
	
	public ContainerPerson container_p;
	public Person p;
	public CosoleInputReader input_data;
	
	Menu(){
		container_p = new ContainerPerson(2);
		input_data = new CosoleInputReader();
	}
	
	
	public void init(){
		String s = null;
        s = input_data.readConsoleString();
        //if(s.length() == 0){
            
        	System.out.println();
    		System.out.println("============================== ");
    		System.out.println(""
    				+ "Menu");
    		System.out.println( "  |_Add Person  - enter 1");
    		System.out.println( "  |_Find Person          ");
    		System.out.println( "     |_By name  - enter 2");
    		System.out.println( "     |_By age   - enter 3");
    		System.out.println( "  |_Exit        - enter 4");
    //    }		
}
	
	public void showGreatMessage(){  
		System.out.println("CLICK ENTER EACH TIME WHEN YOU WANT TO CALL MENU");
}
	
	
	public void router(Integer sub_menu) throws IOException{
		
		switch (sub_menu) {	
		case 1:
			while (!container_p.isFull()) {
				Person p = new Person(input_data.readName(), input_data.readConsoleInt());
				container_p.addPerson(p);
			}
			if(container_p.isFull()){
				input_data.clean();	
				System.out.println( "Storage is full. Y can't add any more");
				container_p.printStorage();
			}
			init();
			sub_menu = input_data.readConsoleSubMenu();
			router(sub_menu);
		break;
		
		case 2:
			container_p.findPersonByName(input_data.readName());
			init();
			sub_menu = input_data.readConsoleSubMenu();
			router(sub_menu);
		break;	
			
		case 3:
			container_p.findPersonByAge(input_data.readConsoleInt());
			init();
			sub_menu = input_data.readConsoleSubMenu();
			router(sub_menu);
		break;
			
		 case 4:
			 System.out.println("Bye mister");
		     System.exit(0);
		    break;
		}
	   
	}
}
	


