package ocja.operatordecisionarrayloops;

public class LoopsWithLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l;
        outer: 
        do {
            l = 5;
            inner:
            while (true) {
                System.out.println(l--);
                if (l == 4) {
                    break outer;
                }
            }
        } while (true);
        
      ////////////////////////////////////
        
        int i = 1;
        int j = 5;
        int k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else 
                        continue B;
                }
            }
        }
        System.out.println(k);
        
        
	}

}
