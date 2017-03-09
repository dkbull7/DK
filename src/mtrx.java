import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class mtrx {
	//��������� ����� �������� ������, �� List ��� �������� ���� �������� ����� �����
		int[][] arr = new int[7][7];
		List<Integer> LI = new ArrayList<Integer>();
		List<Integer> LJ = new ArrayList<Integer>();
		List<Integer> A = new ArrayList<Integer>();
	/*
	 *  �������� ������� ������ ������� �������, � ���� �� ������ ���������
	 *  ������ ������� �������� ������� �� �������� �� ��������� �������� ��������, �� ����� �� ���� �����(7)
	 *  ��� �������� ���������� ����������� ���������� ����������� ��������� ������� ��������
	 *
	 */
		public void makeMatrix(){
			for(int i=0; i<arr[0].length; i++){
				for(int j=0; j<arr.length; j++){
					int numb = ThreadLocalRandom.current().nextInt(0, 10 + 1);
					if(numb>7){numb=0;}
					if(i==j){
						arr[i][j]= numb;
					}
					else{
						arr[i][j]=numb;
						arr[j][i]=numb;
					}

				}
			}
		}
	/*
	 * �������� ������� �� �����
	 *
	 *
	 *
	 *
	 *
	 */
		
		public void ShowMatrix(){
			for(int i=0; i<arr[0].length; i++){

				for(int j=0; j<arr.length; j++){
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}

		}

	/*
	 * �������� �������� ������� ������� � ����� �
	 * �������� ���� ���, ��� �� ������� � LJ
	 * �������� �������� ���� ������� � LI
	 *
	 * 	
	 */
		
	public void Make(){
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(i==j){
					A.add(arr[i][j]);
				}
				else if(i!=j && j>i ){
					if(arr[i][j]!=0){
					LI.add(arr[i][j]);
					}
				}
				else if(i!=j && i>j){
					if(arr[i][j]!=0){
					LJ.add(arr[i][j]);
					}
				}
			}
		}
	}
		
	// ������ ���������� � List ����� Foreach � �������� �� �� �����
	 

	public void MakeSum(){
		int sum=0;
		for(int it : LI){
			sum+=it;
		}
		System.out.print("���� �������� ����� �������: ");
		System.out.println(sum+" ;");
		sum=0;
		for(int it : LJ){
			sum+=it;
		}
		System.out.print("���� �������� ���� �������: ");
		System.out.print(sum+" ;");
	}
		
	// �������� ��������, �� �������� � List


		public void printLI(){
			System.out.println();
			System.out.print("LI: ");
			for(int it:LI){System.out.print(it+" ");}
			System.out.println();
			System.out.print("LJ: ");
			for(int it:LJ){System.out.print(it+" ");}
			System.out.println();
			System.out.print(" A: ");
			for(int it:A){System.out.print(it+" ");}
			System.out.println();
		}
		
	}
		
