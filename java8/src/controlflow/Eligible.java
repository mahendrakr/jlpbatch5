package controlflow;

public class Eligible {
	public static boolean isEligible(Student s) {
	      if(s.tenthMarks>=60) {
	    	  if(s.twelthMarks>=60) {
	    		  if(s.btechMarks>=60) {
	    			  return true;
	    		  }
	    		  else {
	    			  return false;
	    		  }
	    	  }
	    	  else {
	    		  return false;
	    	  }
	      }
	      else {
	    	  return false;
	      }
	}

}
