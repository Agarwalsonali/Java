// q-1 (A)
class EMI_calculator
{
	double PA;   // Principal Amount
	double ROI;  // Rate of Interest
	int years;   // No. of Years
	void Setvalues(double PA, double ROI, int years)
	{
		this.PA=PA;
		this.ROI=ROI/100;
		this.years=years;
	}
	double CalculateEMI()
	{
		return (PA * ROI * Math.pow((1+ROI),years)/ (Math.pow((1+ROI),years)-1));
	}
}
class As31ATest
{
	public static void main(String arg[])
	{
		EMI_calculator C1=new EMI_calculator();
		C1.Setvalues(100000,6.5,5);
		System.out.println("EMI: " + C1.CalculateEMI());
	}
}
		