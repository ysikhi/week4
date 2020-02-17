public class houseconcost 
{
	/*Here "ms" means materials of standard and input can be given from 1 to 4 numbers 
	example if ms=1 means materials of standard is standard materials and ms=2 means materials of 
	standard is above standard materials.and variable "s" is whether we need fully automation or not
	the input is in the format of boolean*/
	double est(int ms,float area,boolean s)
	{
		if(ms==1&&s==false)
		{
			return area*1200;
		}
		else if(ms==2&&s==false)
		{
			return area*1500;
		}
		else if(ms==3&&s==false)
		{
			return area*1800;
		}
		else if(ms==4&&s==true)
		{
			return area*2500;
		}
		return 0;
	}
}
