import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class mtrx {
	//Оголошуємо масив заданого розміру, та List щоб записати туди невідомме число даних
		int[][] arr = new int[7][7];
		List<Integer> LI = new ArrayList<Integer>();
		List<Integer> LJ = new ArrayList<Integer>();
		List<Integer> A = new ArrayList<Integer>();
	/*
	 *  Наступна функція просто створює матрицю, з якою ми будемо працювати
	 *  Велику кількість нульових значень ми отримуємо за допомогою заміщення елементів, які більше за дане число(7)
	 *  Щоб отримати симетричне відображення присвоюємо протилежним елементам однакові значення
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
	 * Виводимо матрицю на екран
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
	 * Записуємо елементи головної діагоналі у масив А
	 * Елементи вищі цих, але не нульову у LJ
	 * Ненульові елементи нище діагоналі у LI
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
		
	// Додаємо результати у List через Foreach і виводимо їх на екран
	 

	public void MakeSum(){
		int sum=0;
		for(int it : LI){
			sum+=it;
		}
		System.out.print("Сума елементів нижче діагоналі: ");
		System.out.println(sum+" ;");
		sum=0;
		for(int it : LJ){
			sum+=it;
		}
		System.out.print("Сума елементів вище діагоналі: ");
		System.out.print(sum+" ;");
	}
		
	// Виводимо значення, що записаны у List


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
		
