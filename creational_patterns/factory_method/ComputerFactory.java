package creational_patterns.factory_method;

import creational_patterns.factory_method.design.Computer;
import creational_patterns.factory_method.design.PC;
import creational_patterns.factory_method.design.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) 
            return new PC(ram, hdd, cpu);
		
        else if("Server".equalsIgnoreCase(type)) 
            return new Server(ram, hdd, cpu);
		
		return null;
	}
}