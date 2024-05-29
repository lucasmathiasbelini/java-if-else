package pacote;

public class classe {
public static void main(String[] args) {

	int metas = 6;
	int dia = 14;
	if (dia >= 15) {
		System.out.println("OPSS espirou voce nao pode mais comprar :/");
	} else {
		System.out.println("Voce pode comprar!!");
		String login = "Login:";
		login = login + ".......";
		System.out.println(login);
		if (metas >= 5) {
			System.out.println("A meta bateu " + metas + " entao abriu mais 1 dia premium");
		} else {
			System.out.println("Back-end aspirado");
		}
	}
	
}
} 
