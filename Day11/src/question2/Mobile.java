package question2;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	String a;
	String b;
	int flag1 = 0;
	int flag2=0;
	void searchOutdatedModel(String company, String... model) {
		
		
		for(String o:outdatedModels)
		{
		for(String m:model)
		{
			if(o.equals(m))
			{
				flag1=1;
				a=m;
				break;
			}
			else
			{
				flag2=1;
				b=m;
				break;	
			}
		}
		
		}
		if(flag1==1)
		{
			System.out.println("OUTDATED"+"_"+a);
		}
		else if(flag2==1)
		{
			System.out.println(company+"_"+b);
		}
		
	}
}	


