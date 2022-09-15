class A
{
	public static void main(String args[])
	{
		double Taxable_Income=1100000;
		double slab=0;
		double surcharge=0;
		double he=0;
		if(Taxable_Income>=0 && Taxable_Income<=250000)
		{
			slab=0;
		}
		else if(Taxable_Income>250000 && Taxable_Income<=500000)
		{
			slab=(5*Taxable_Income)/100;
		}
		else if(Taxable_Income>500000 && Taxable_Income<=750000)
		{
			slab=(10*Taxable_Income)/100;
		}
		else if(Taxable_Income>750000 && Taxable_Income<=1000000)
		{
			slab=(15*Taxable_Income)/100;
		}
		else if(Taxable_Income>1000000 && Taxable_Income<=1250000)
		{
			slab=(20*Taxable_Income)/100;
		}
		else if(Taxable_Income>1250000 && Taxable_Income<=1500000)
		{
			slab=(25*Taxable_Income)/100;
		}
		else if(Taxable_Income>1500000)
		{
			slab=(30*Taxable_Income)/100;
		}
		
		if(Taxable_Income>5000000)
		{
			surcharge=(10*slab)/100;		
		}
		else if(Taxable_Income>10000000)
		{
			surcharge=(15*slab)/100;
		}
		else if(Taxable_Income>20000000)
		{
			surcharge=(25*slab)/100;
		}
		else if(Taxable_Income>50000000)
		{
			surcharge=(37*slab)/100;
		}

		he=(4*slab)/100;
		
		System.out.println(slab);
		System.out.println(surcharge);
		System.out.println(he);	
		System.out.println(slab+surcharge+he);
	}

}
