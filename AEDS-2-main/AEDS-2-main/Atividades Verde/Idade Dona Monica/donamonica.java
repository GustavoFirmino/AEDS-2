import java.util.*;

class dona monica{

public static void main(String[] agrs){
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextInt()){
	int M = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();
	int MaisVelho = M - (A + B);

	System.out.println(MaisVelho);
}
	sc.close();
	}
}