import java.util.Scanner;

public class NextPalindrome {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int in=scan.nextInt();
	while(in-->0) {
		int p=scan.nextInt();
		
		boolean flag=true;
		while(flag) {
			if(isPalindrome(p))
				break;
			else
				p++;
		}
		System.out.println(p);
	}
	
}

private static boolean isPalindrome(int p) {
	// TODO Auto-generated method stub
	int j=0,m=p;
	while(m>0) {
		int l=m%10;
		 j=j*10+l;
		 m=m/10;
	}
	if(j==p) {
		return true;}
	else
		
	return false;
}
}
