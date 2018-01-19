package com.shivam.servlets;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType( "text/html" );
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style>table, th, td {border: 1px solid black;border-collapse: collapse;}</style>");
		out.println("</head>");
		out.println(" <body  style=background:Cornsilk;>");
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
		 out.println("<center>");
		 out.println("<h2>Thank you "+session.getAttribute("Name")+"</h2>");
		 out.println("</center>");
		 out.println("<center>");
		 out.println("<h3><i><u>Your response fetched by us is as follows</u></i></h3>");
		 out.println("</center>");
		 out.println("<center>");
		 out.println("<form action=\"");
		 out.println("actionjsp.jsp\" method=get>");
		 out.println("<br><br>");
		 out.println("<input type=submit value=\"END TASK\"></form>");
			out.println("<table>");
				out.println("<tr>");
					out.println("<th>Query Number</th>");
					out.println("<th>Your Response Recorded</th>");
				out.println("</tr>");
				
				//for question 1
				
				String q1=(String)req.getAttribute("Ques1");       //getting from request
				String r1=(String)session.getAttribute("Ques1");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you had the sensation of not emptying your bladder?</td>");
				out.println("<td>"+r1+"</td>");
				out.println("</tr>");
				
				//for question 2
				
				String q2=(String)req.getAttribute("Ques2");
				String r2=(String)session.getAttribute("Ques2");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you had to urinate less than every two hours?</td>");
				out.println("<td>"+r2+"</td>");
				out.println("</tr>");
				
				//for question 3
				
				String q3=(String)req.getAttribute("Ques3");
				String r3=(String)session.getAttribute("Ques3");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you found you stopped and started again several times when you urinated?</td>");
				out.println("<td>"+r3+"</td>");
				out.println("</tr>");
				
				//for question 4
				
				String q4=(String)req.getAttribute("Ques4");
				String r4=(String)session.getAttribute("Ques4");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you found it difficult to postpone urination?</td>");
				out.println("<td>"+r4+"</td>");
				out.println("</tr>");
				
				//for question 5
				
				String q5=(String)req.getAttribute("Ques5");
				String r5=(String)session.getAttribute("Ques5");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you had a weak urinary stream?</td>");
				out.println("<td>"+r5+"</td>");
				out.println("</tr>");
				
				//for question 6
				
				String q6=(String)req.getAttribute("Ques6");
				String r6=(String)session.getAttribute("Ques6");   //getting from session
				out.println("<tr>");
				out.println("<td>How often have you had to strain to start urination?</td>");
				out.println("<td>"+r6+"</td>");
				out.println("</tr>");
				
				//for question 7
				
				String q7=(String)req.getAttribute("Ques7");
				String r7=(String)session.getAttribute("Ques7");   //getting from session
				out.println("<tr>");
				out.println("<td>How many times did you typically get up at night to urinate?</td>");
				out.println("<td>"+r7+"</td>");
				out.println("</tr>");
				
				//for question 8
				
				String q8=(String)req.getAttribute("Ques8");
				String r8=(String)session.getAttribute("Ques8");   //getting from session
				out.println("<tr>");
				out.println("<td>If you were to spend the rest of your life with your urinary condition just the eway it is now, how would you feel about that?</td>");
				out.println("<td>"+r8+"</td>");
				out.println("</tr>");
				
				out.println("</table>");
				out.println("</form>");
				out.println("</center>");
				out.println("<br><br><br><br><br>");
				out.println("<footer>");
				out.println("<p>");
				out.println("<center>");
				out.println("<i>I-PSS Survey Result</i>");
				out.println("<br>");
				out.println("<strong>Note:</strong>");
				out.println("<i>To Save & print PDF press ->ctrl+p</i>");
				out.println("</center>");
				out.println("</p>");
				out.println("</footer>");
			}
		out.println("</body></html>");
		}
		//session.invalidate();        // --> We'll do this or not?
		
	}


