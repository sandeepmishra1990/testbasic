package com.shivam.servlets;
/*import java.io.*;
import java.net.MalformedURLException;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.servlet.*;
import javax.servlet.http.*;
public class PdfServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		HttpSession session=req.getSession(false);
		if(session!=null)
		{	
			PdfPrinter printer = new PdfPrinter();

	        // Specify the document that needs to be printed
	        printer.setDocument(d);        

	        // Select a printer
	        printer.setSelectedPrinterName(
	           // Name of first printer 
	           printer.getAvailablePrinterNames()[0]);
			//out.println("<h1>PDF GENERATED</h1>");
			//session.invalidate();
		}
		out.println("</body></html>");
		
	}
}

*/