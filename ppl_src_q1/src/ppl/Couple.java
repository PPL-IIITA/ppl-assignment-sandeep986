package ppl;

public class Couple {
	 String name;
	    Boy boy;
	    Girl girl;
	    Couple(Boy boy, Girl girl)
	    {
	        name=boy.name+" and "+girl.name;
	        this.boy=boy;
	        this.girl=girl;
	    }

}
