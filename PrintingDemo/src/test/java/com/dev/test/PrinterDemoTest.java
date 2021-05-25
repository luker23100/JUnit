package com.dev.test;

import static com.dev.printer.PrinterDemo.printServiceChooser;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.print.DocFlavor;
import javax.print.PrintService;

import org.junit.jupiter.api.Test;

public class PrinterDemoTest {
	
	@Test
	public void isNullWhenFileExtensionIsDifferentThanJPG() {
		//given
		String file = "SomeFile.txt";
		DocFlavor docFlavor = DocFlavor.INPUT_STREAM.JPEG;
		
		//when
		PrintService service = printServiceChooser(file, docFlavor);
		
		//then
		assertNull(service);
	}
	
	@Test
	public void isNullWhenIncorrectDocFlavorProvided() {
		//given
		String file = "SomeFile.jpg";
		DocFlavor docFlavor = DocFlavor.STRING.TEXT_PLAIN;
		
		//when
		PrintService service = printServiceChooser(file, docFlavor);
		
		//then
		assertNull(service);
	}
	
	@Test
	public void returnsCorrectPrintServiceWhenProvidedCorrectValues() {
		//given
		String file = "SomeFile.jpg";
		DocFlavor docFlavor = DocFlavor.INPUT_STREAM.JPEG;
		
		//when
		PrintService service = printServiceChooser(file, docFlavor);
		
		//then
		assertNotNull(service);
	}
	
}
