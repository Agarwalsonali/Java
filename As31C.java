// q-1 (C)
class CLEMI_calculator extends EMI_calculator  // Car Loan EMI Calculator
{
	String Car_model;
	void set_values(double PA, double ROI, int years, String Car_model)
	{
		super.Setvalues(PA, ROI, years);
		this.Car_model=Car_model;
	}
	double CalculateCLEMI()
	{
		if (Car_model.equals("Alto"))
		{
			PA=PA-10000;
		}
		return (PA * ROI * Math.pow((1+ROI),years)/ (Math.pow((1+ROI),years)-1));
	}
}
class As31CTest
{
	public static void main(String arg[])
	{
		CLEMI_calculator C1=new CLEMI_calculator();
		C1.set_values(100000,6.5,5,"Alto");
		System.out.println("EMI: " + C1.CalculateCLEMI());
	}
}
	