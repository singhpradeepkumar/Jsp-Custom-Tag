package com.github.pradeep.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Custom Tag to generate Arithmetic Progression series on JSP.
 * @author Pradeep (singhpradeepkumar@hotmail.com)
 * @since 21-Apr-2017
 */
public class ArithmeticProgression extends SimpleTagSupport {

	private float a;
	private float d;
	private float n;
	private String output;
	
	@Override
	public void doTag() throws JspException, IOException {
		float an = (a+(n-1)*d);
		if (Constants.AP.AN.equalsIgnoreCase(output)) {
			getJspContext().getOut().print(an);
		}
		else if (Constants.AP.SN.equalsIgnoreCase(output)) {
			double sn = (n/2.0)*((2*a)+((n-1)*d));
			getJspContext().getOut().print(sn);
		}
		else {
			for (float i=a; i<an; i+=d) {
				getJspContext().getOut().print(i + ",");
			}
			getJspContext().getOut().print(an);
		}
	}

	
	public void setA(float a) {
		this.a = a;
	}

	public void setD(float d) {
		this.d = d;
	}

	public void setN(float n) {
		this.n = n;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
}
