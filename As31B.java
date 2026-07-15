// q-1 (B)
class HLEMI_calculator extends EMI_calculator   // Home Loan EMI Calculator
{
	double repo_rate;
	String TOH;           // Type of Home
	void setvalues(double PA, double ROI, int years, double repo_rate, String TOH)
	{
		super.Setvalues(PA, ROI, years);
		this.repo_rate=repo_rate;
		this.TOH=TOH;
	}
	double repo_rate()
	{
		return repo_rate;
	}
	double calculateHLEMI()
	{
		return (PA * ROI * Math.pow((1+repo_rate),years)/ (Math.pow((1+repo_rate),years)-1));
	}
}
class As31BTest
{
	public static void main(String arg[])
	{
		HLEMI_calculator C1=new HLEMI_calculator();
		C1.setvalues(100000,6.5,5,4,"Flat");
		C1.repo_rate();
		System.out.println("EMI: " + C1.calculateHLEMI());
	}
}
	