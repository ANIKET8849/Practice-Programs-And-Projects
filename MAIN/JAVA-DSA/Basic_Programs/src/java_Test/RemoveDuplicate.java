package java_Test;

import java.util.Arrays;

public class RemoveDuplicate {

	public void Remove(String str) {
		int index =0;
		char s2[]= new char[100];
		s2=str.toCharArray();
		
		
		
		for (int i = 0; i <s2.length; i++) {
			for (int j = 0; j < i; j++) {
				if (s2[i]==s2[j]) {
					s2[i]='\0';
				}
			}
			if (s2[i]!='\0') {
				System.out.print(s2[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		RemoveDuplicate rDuplicate =new RemoveDuplicate();
		String s="Hello World";
		rDuplicate.Remove(s);

	}

}
