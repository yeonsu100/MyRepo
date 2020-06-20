package step2_11_array;

import java.util.Random;

public class ArrayEx46 {
	public static void main(String[] args) {
		int[][] lottoSet=new int[5][7];
		
		Random ran=new Random();
		
		int win=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				int user=ran.nextInt(2);
				if(user==1) {
					lottoSet[i][j]=3;
				}else {
					lottoSet[i][j]=0;
				}
			}
			
			int  check=-1;
			int cnt=0;
			for(int j=0; j<7; j++) {
				if(lottoSet[i][j]==3) {
					cnt+=1;
				}else {
					cnt=0;
				}
				if(cnt==3) {
					check=1;
				}
			}
			
			if(check==1 && win==0) {
				win=1;
			}else {
				i-=1;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.println(lottoSet[i][j]+" ");
			}
			System.out.println();
		}
	}
}
