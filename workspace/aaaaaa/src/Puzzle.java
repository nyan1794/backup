public class Puzzle{
	public static void main(String[] args){
		
		PuzzleSub sub = new PuzzleSub();
		
		int n = sub.Stup();
		
		int[] puzzle = sub.rand(n);
		int check=sub.PuzzleCheck(puzzle,n);
		while(check != 1){
			puzzle = sub.rand(n);
			check = sub.PuzzleCheck(puzzle,n);
		}
		
		sub.PuzzlePrint(puzzle,n);
		int x =sub.PuzzleStart(puzzle,n);
		
		System.out.println("かかった手数は"+ x +"です。");
		
	}
}