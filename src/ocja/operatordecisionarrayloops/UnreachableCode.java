package ocja.operatordecisionarrayloops;

public class UnreachableCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int elements = 0;
        Object [] arr = {"A", "E", "I", new Object(), "O", "U"}; //Line n1
        for(Object obj : arr) { //Line n2
            if(obj instanceof String) {
                continue;
            } else {
                break;
            }
   //         elements++; //Line n3 - unreachable code - compile time error
        }
        System.out.println(elements); //Line n4

	}

}
