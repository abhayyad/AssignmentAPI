package ocja.javabasicsanddatatypes;

public class PrimitiveDataType {
	
	 public static void main(String[] args) {
	        char c = 'Z';
	        byte b = 107;
	        short s = 77;
	        long l = 100_00l;
	        int i = 9_2;
	        float f = 2.02f; 
	        double d = 10_0.35d;
	        l = c + i;
	        c = (char) b;
	        c = (char) s;
	        b = (byte) c;
	        s = (short) c;
	        i = c;
	        c  = (char) i;  	        
	        f = c * l * i * f;
	        f = l + i + c;
	        i = (int)d;
	        f = (long)d;
	        
	        System.out.println(c);
	        System.out.println(l);
	        System.out.println(i);
	        System.out.println(f);
	        System.out.println(d);
	        System.out.println(b);
	        System.out.println(s);
	        
	        // size (Number) : byte < short < int < long < float < double
	        // size char and mum(starting int) : char < int < long < float < double
	      
	        // +++++++Rules for above two+++++
	        // small data type  assigned to higher data type is OK
	        // higher data type assigned to lower data type is not OK , 
	        //                    has to be type-casted to lower data type.
	       	        
	       // char , short and byte has to type casted to each other if need to be assigned
	    }

}
