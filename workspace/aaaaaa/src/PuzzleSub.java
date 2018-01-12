import java.util.Random;
public class PuzzleSub{
	
	public int Stup(){
		System.out.print("3*3では'3' 4*4では'4' 5*5では'5' を入力：");
		return new java.util.Scanner(System.in).nextInt();
	}
	
	public int[] rand(int n){
		
		int data[] = new int[n*n];
		boolean num[] = new boolean[n*n];
		Random rand = new Random();
		
		for(int i=0; i<n*n; i++){
                num[i] = false;
		}
		
		for(int i=0; i < n*n ; ){
			int p = rand.nextInt(n*n);

			if(num[p] == false){
				data[i] = p;
				num[p] = true;
				i++;
			}
		}
		return data;
	}
	
	public static void PuzzlePrint(int x[],int n){
		
		for(int i=0;i<x.length;i++){
			
			
			if((x[i]+1) == n*n){
				System.out.print("|●|\t");
			}
			else{
				System.out.print("|" + (x[i]+1) +"|\t");
			}
			
			if(n == 3 && (i+1)%3 == 0){
				System.out.println();
			}
			else if(n == 5 && (i+1)%5 == 0){
				System.out.println();
			}
			else if(n == 4 && (i+1)%4==0){
				System.out.println();
			}
		}
	}
	
	public int PuzzleCheck(int x[],int n){
		
		int[] cPuzzle = new int[n*n];
		int ct = 0,ctp = 0,tmp;
		System.arraycopy(x,0,cPuzzle,0,x.length);
		
		for(int i =0;i<cPuzzle.length;i++){
			if(cPuzzle[i] == n*n-1){
				if(i%2==0){
					ctp=0;
				}
				else ctp =1;
			}
		}
		
		for(int i=0;i<cPuzzle.length;i++){
			if(cPuzzle[i] != i){
				for(int j=0;j<cPuzzle.length;j++){
					if(cPuzzle[j] == i){
						tmp = cPuzzle[i];
						cPuzzle[i] = cPuzzle[j];
						cPuzzle[j] = tmp;
						ct += 1;
					}
				}
			}
		}
		if(ct%2 == ctp){
			return 1;
		}
		else return 0;
	}
	
	public  int PuzzleStart(int x[],int n){
		
		System.out.println("開始します");
		
		int ans = 0;
		int ct = 1;
		
		while(ans != 2){
			
			int moveN = 0;
			System.out.println(ct+"手目");
			System.out.print("←：１　↑：２　↓：３　→:４ 諦める:０　??:");
			moveN = new java.util.Scanner(System.in).nextInt();
			
			PuzzleMove(x,n,moveN);
			PuzzlePrint(x,n);
			ans = PuzzleAns(x,n);
			
			ct +=1;
		}
		
		System.out.println();
		System.out.println("完成しました。終了です！");
		return ct;
	}
	
	public static void PuzzleMove(int x[],int n,int move){
		
		int tmp = 0;
		
		for(int i=0;i<x.length;i++){
			
			if(x[i] == (n*n-1) && move == 1 && i%n !=0){
				tmp = x[i];
				x[i] = x[(i-1)];
				x[(i-1)] = tmp;
				break;
			}
			
			else if(x[i] == (n*n-1) && move == 2 && i>n-1){
				tmp = x[i];
				x[i] = x[(i-n)];
				x[(i-n)] = tmp;
				break;
			}
			
			else if(x[i] == (n*n-1) && move == 3 && i<x.length-n){
				tmp = x[i];
				x[i] = x[(i+n)];
				x[(i+n)] = tmp;
				break;
			}
			
			else if(x[i] == (n*n-1) && move == 4 && i%n != (n-1)){
				tmp = x[i];
				x[i] = x[(i+1)];
				x[(i+1)] = tmp;
				break;
			}
			else if(move == 0){
				System.out.println("終了します。");
				System.exit(1);
			}
			
		}
	}
	
	public static int PuzzleAns(int x[],int n){
		
		for(int i=0;i<x.length;i++){
			if(x[i] != i){
				return 99;
			}
		}
		return 2;
		
	}
	
}