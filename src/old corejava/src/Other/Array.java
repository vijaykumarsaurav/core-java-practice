package Other;

public class Array {

	public Array() {
	}

	public static void main(String[] args) {
		
		int sum=0;
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,0};
		System.out.println("A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,} length :"+A.length);
		for (int i = 0; i < 15; i++) {
			sum += A[i];
		}
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if(min > A[i])
				min = A[i];
		}
		A[15]=sum;
		A[16]=sum/15;
		A[17] = min;
		for (int i : A) {
			System.out.print(i+" ");
		}
	}
	
	

}
