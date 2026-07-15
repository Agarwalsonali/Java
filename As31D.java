// q-1 (D)
class As31DTest
{
	public static void main(String arg[])
	{
		EMI_calculator C1=new EMI_calculator();
		C1.Setvalues(200000,4.5,4);
		System.out.println("EMI: " + C1.CalculateEMI());
		HLEMI_calculator C2=new HLEMI_calculator();
		C2.setvalues(200000,4.5,4,6,"Flat");
		System.out.println("EMI: " + C2.calculateHLEMI());
		CLEMI_calculator C3=new CLEMI_calculator();
		C3.set_values(200000,4.5,4,"Swift");
		System.out.println("EMI: " + C3.CalculateCLEMI());
		CLEMI_calculator C4=new CLEMI_calculator();
		C4.set_values(200000,4.5,4,"Alto");
		System.out.println("EMI: " + C4.CalculateCLEMI());
	}
}
		