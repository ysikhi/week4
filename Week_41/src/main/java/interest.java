public class interest 
{
	double simple(double p,double r,double t)
	{
		return (p*t*r)/100;
	}
	double compound(double p,double r,double t)
	{
		double d= (p*Math.pow(1+r/100,t));
		return d;
	}
}