package Method_overriding;

public class Card_overding {
public static void main(String[] args) {
	Birthday_card b= new Birthday_card();
	b.greetings();
	Mariage_card m =new Mariage_card();
	m.greetings();
	Holiday_card h = new Holiday_card();
	h.greetings();
	Wishing_Card w = new Wishing_Card();
	w.greetings();
	
	
}
}
