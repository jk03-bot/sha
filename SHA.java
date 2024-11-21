import java.io.*;
import java.util.*;
class SHA
{
	public static void main(String args[])
	{
		int A=0x67452301;
		int B=0xEFCDAB89;
		int C=0x98BADCFE;
		int D=0x10325476;
		int E=0xC3D2E1F0;
		int k=0x5A827999;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input");
		String a=in.nextLine();
		byte[] input=a.getBytes();
		int w[]=new int[16];
		for(int i=0;i<input.length;i++)
		{
			if(i<4)
			{
				w[0]|=(input[i] & 0xFF) <<(24-(i*8));
		}}
		int f=(B & C)|(~B & D);
		int temp=Integer.rotateLeft(A,5)+f+E+w[0]+k;
		E=D;
		D=C;
		C=Integer.rotateLeft(B,30);
		B=A;
		A=temp;
		System.out.printf("A:%08x, B:%08x, C:%08x, D:%08x, E:%08x",A,B,C,D,E);
	}
}