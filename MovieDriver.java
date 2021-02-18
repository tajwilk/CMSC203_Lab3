import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String answer;		
		
		do {
		Movie myMovie = new Movie();
		
		System.out.print("Enter the name of a movie: ");
		myMovie.setTitle(stdin.nextLine());
		System.out.print("Enter that movie's rating: ");
		myMovie.setRating(stdin.nextLine());
		System.out.print("Enter the number of tickets sold: ");
		myMovie.setSoldTickets(stdin.nextInt());
		stdin.nextLine();
		
		System.out.println(myMovie);
		
		System.out.print("Do you want to enter another? (y or n): ");
		answer = stdin.nextLine();
		
		} while(answer.equals("y"));
	}
}
