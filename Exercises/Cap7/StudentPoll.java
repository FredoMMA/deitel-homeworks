package Cap7;

/* tipo ... � um programa com dois arrays .... um q tem guardado as respostas de um questionario (respostas de 1 - 5)
 *	e a frequencia em q elas s�o respondidas ..... q ta em 6 o tamanho (porem, vai contar s� de 1 a 5 , esquecendo o index 0)
 *	ent�o .... uma das respostas do array responses � 14 (ou seja, n�o � v�lido), 
 *  mas n�o entendi como q o livro deixou os valores acima de 5 inv�lidos com esse Try e Catch
 * 
 */

public class StudentPoll {

	public static void main(String[] args) {
		
		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		int[] frequency = new int[6];
		
		for(int answer = 0; answer < responses.length; answer++) {
			
			try {
				
				++frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e);
				System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
			}
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		for(int rating = 1; rating < frequency.length; rating++) {
			
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
		}
	}
}
