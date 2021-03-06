package step2_11_array;

import java.util.Scanner;

// 2차원 배열 기본문제 (2단계) 
public class ArrayEx40 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] arr=new int[3][3];
		
		int k=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=10*k;
				k+=1;
			}
		}
		
		// Q1) 인덱스 2개를 입력받아 값 출력
		System.out.print("Enter a number for index 1 : ");
		int idx1=scan.nextInt();
		System.out.print("Enter a number for index 2 : ");
		int idx2=scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		// Q2) 값을 입력받아 인덱스 2개 출력
		System.out.print("Enter a value : ");
		int value=scan.nextInt();
		
		idx1=0;
		idx2=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]==value) {
					idx1=i;
					idx2=j;
				}
			}
		}
		
		System.out.print("Index 1 : "+idx1);
		System.out.print("Index 2 : "+idx2);
		
		// Q3) 가장 큰 값의 인덱스 2개 출력
		int maxIdx=arr[0][0];
		idx1=0;
		idx2=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxIdx<arr[i][j]) {
					maxIdx=arr[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.print("Maximum index 1 : "+idx1);
		System.out.print("Second one (index 2) : "+idx2);
		
		// Q4) 입력받은 2개 값 교체
		System.out.print("Enter a number 1 for swapping");
		int num1=scan.nextInt();
		System.out.print("Enter a number 2 for swapping");
		int num2=scan.nextInt();
		
		int idx1_i=0, idx1_j=0;
		int idx2_i=0, idx2_j=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]==num1) {
					idx1_i=i;
					idx2_j=j;
				}
				if(arr[i][j]==num2) {
					idx2_i=i;
					idx2_j=j;
				}
			}
		}
		
		int temp=arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j]=arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j]=temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
