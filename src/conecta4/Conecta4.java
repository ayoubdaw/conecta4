package conecta4;
import java.util.Scanner;
/**
 *
 * @author Ayoub
 */
public class Conecta4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		
		partida juego = new partida();
		
		while (!juego.terminado()|| tablero.victoria == false){
			switch(juego.getTurno()){
				
				case "BLANCO":
					System.out.print("Columna: ");
					int col = teclado.nextInt();
					partida.mesa.ponerFicha(partida.blanco, col);
					partida.mesa.cuatroEnRaya(partida.blanco);
					break;
				
				case "NEGRO":
					System.out.print("Columna: ");
					col = teclado.nextInt();
					partida.mesa.ponerFicha(partida.negro, col);
					partida.mesa.cuatroEnRaya(partida.negro);
					break;			
			}
		}
		
		System.out.println(" GAME OVER ");
		System.out.println();
		juego.mostrarTablero();
	}
}
