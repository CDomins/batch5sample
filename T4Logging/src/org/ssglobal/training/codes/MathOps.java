package org.ssglobal.training.codes;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MathOps {
	
	//Private logger object
	private Logger logger = Logger.getLogger(MathOps.class.getName());
	
	public MathOps() {
		//Set the level of the logging
		logger.setLevel(Level.ALL);
		
		//Create file handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log");
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			
			// Create Formatter
			SimpleFormatter txtFormatter = new SimpleFormatter();
			fileHandler.setFormatter(txtFormatter);
			
			logger.addHandler(fileHandler);
			
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MathOps(int x, int y) {
		//Set the level of the logging
		logger.setLevel(Level.ALL);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int div(int x, int y) throws ArithmeticException{
		logger.info("Start of method div with parameters: %d, %d".formatted(x, y));
		if (y == 0) {
			logger.severe("Division by zero error");
			throw new ArithmeticException();
		}
		logger.info("End of method div with parameters: %d, %d".formatted(x, y));
		return x / y;
	}
	
	public int[] displayArray(int[] arrData) {
		System.out.println(Arrays.toString(arrData));
		return arrData;
	}
}
