package jun11;

public class QuadraticTimeExample {

	public static void main(String[] args) {
          int[] numbers= {1,3,5,7,3,1};
          boolean hasDuplicate=false;
          for (int i=0;i<numbers.length;i++) {
        	  for(int j=i+1;j<numbers.length;j++) {
        		  if(numbers[i]==numbers[j]) {
        			  hasDuplicate=true;
        			  System.out.println("duplicate found:"+numbers[i]);
        		  }
        	  }
          }
          if(!hasDuplicate) {
        	  System.out.println("No duplicates found");
          }
	}

}
