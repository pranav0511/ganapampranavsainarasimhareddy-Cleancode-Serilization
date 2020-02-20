package com.Interest;

public class Interest {
	public int Simple(double principle,float rate,float time) {
		double Simple_Interest=(principle*time*rate)/100;
		return (int)Simple_Interest;
	}
	public int comp(double principle,float rate,float no_of_years,float time) {
		rate/=100;
		double Compound_interest=principle*Math.pow((1+ rate/no_of_years),no_of_years*time);
				return (int)Compound_interest;
	}

}
