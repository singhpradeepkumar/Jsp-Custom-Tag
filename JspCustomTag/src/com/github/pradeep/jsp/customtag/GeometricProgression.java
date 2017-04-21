package com.github.pradeep.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GeometricProgression extends SimpleTagSupport {

	private float a;
	private float r;
	private float n;
	private String output;
	
	@Override
	public void doTag() throws JspException, IOException {
		float rn = r;
		for (int i=2; i<n; i++) {
			rn = rn*r;
		}
		float an = a*rn;
			
		if (Constants.GP.AN.equalsIgnoreCase(output)) {
			getJspContext().getOut().print(an);
		}
		else {
			float rd=1;
			getJspContext().getOut().print(a + ",");
			for (int i=2; i<n; i++) {
				rd = rd * r;
				getJspContext().getOut().print(a*rd + ",");
			}
			getJspContext().getOut().print(an);
		}
	}

	public void setA(float a) {
		this.a = a;
	}
	
	public void setR(float r) {
		this.r = r;
	}
	
	public void setN(float n) {
		this.n = n;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
}
