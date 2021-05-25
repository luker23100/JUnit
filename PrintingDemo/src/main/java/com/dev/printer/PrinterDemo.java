package com.dev.printer;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;

public class PrinterDemo {
	
	public static PrintService printServiceChooser(String file, DocFlavor docFlavor) {
		if(!file.endsWith("jpg")) {
			return null;
		}
		
		PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
		attributes.add(MediaSizeName.ISO_A4);
		attributes.add(new Copies(1));
		
		PrintService[] services = PrintServiceLookup.lookupPrintServices(docFlavor, attributes);
		
		if(services.length > 0) {
			return services[0];
		}
		
		return null;
	}
	
}
