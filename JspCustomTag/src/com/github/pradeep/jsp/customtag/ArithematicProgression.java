package com.github.pradeep.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Custom Tag to generate Arithematic Progression series on JSP.
 * @author Pradeep
 *
 */
public class ArithematicProgression extends SimpleTagSupport {

	private int a;
	private int d;
	private int n;
	
	@Override
	public void doTag() throws JspException, IOException {
		int an = (a+(n-1)*d);
		for (int i=a; i<an; i+=d) {
			getJspContext().getOut().print(i + ",");
		}
		getJspContext().getOut().print(an);			
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void setN(int n) {
		this.n = n;
	}

}
