package conecta4;
/**
 *
 * @author Ayoub
 */
public class partida{
	
	private static int cont=0;
	static tablero mesa;
	public static ficha blanco;
	public static ficha negro;
	
///////// PARTIDA() ////////////////////////////////////////////////////////////////////////////////////////////////
	partida(){
		iniciarPartida();
	}
	
///////// INICIARPARTIDA() ////////////////////////////////////////////////////////////////////////////////////////////////
	public void iniciarPartida(){
		mesa = new tablero();
		blanco= new ficha("B");
		negro = new ficha("N");
	}
	
///////// GETTURNO() ////////////////////////////////////////////////////////////////////////////////////////////////
	String getTurno(){
		String turno;
		mostrarTablero();
		if (cont %2 == 0)
			turno = "BLANCO";
		else
			turno = "NEGRO";
		
		System.out.println("Turno del jugador "+turno+": ");
		cont++;
		return turno;
	}
	
/////// PONFICHA() ////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean ponFicha(int col){
		/*IMPLEMENTAR*/
		return true;
	}
	
///////// TERMINADO() ////////////////////////////////////////////////////////////////////////////////////////////////
	boolean terminado(){
	int fin = 0;
	
	for(int i=0;i<=mesa.getFilas();i++)
		fin = fin + tablero.huecos[i];
	
	if (fin == 0)
		return true;
	else
		return false;
}

///////// GANADOR() ////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean ganador(){
		if(terminado()){
			if(partida.mesa.cuatroEnRaya(blanco)){
				System.out.println("Ha ganado el Jugador Blanco");
			}
			else if(partida.mesa.cuatroEnRaya(negro)){
				System.out.println("Ha ganado el Jugador Negro");
			}
			else{
				System.out.println("Ha ocurrido un empate");
			}
		}
		return true;
	}

///////// MOSTRARTABLERO() ////////////////////////////////////////////////////////////////////////////////////////////////
	public void mostrarTablero(){
	
	for (int i=0;i<mesa.getFilas();i++){
		for (int j=0;j<mesa.getColumnas();j++){
			System.out.print(i+","+j+"["+tablero.mesa[i][j]+"] ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
}

///////// CAMBIARTURNO() ////////////////////////////////////////////////////////////////////////////////////////////////
	public static void cambiarTurno() {
		cont++;
	}
}
