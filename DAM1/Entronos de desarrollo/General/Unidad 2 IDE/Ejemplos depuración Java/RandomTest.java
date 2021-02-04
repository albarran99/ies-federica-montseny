import javax.swing.JOptionPane;

public class RandomTest {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		if (args.length > 0) {
			System.out.println("Se han pasado " + args.length + " argumentos");
		}
		
		String[] listaAlumnos = { "Sergio", "Alberto", "Michal", "Teodor"};
		
		int numRandom = (int) (Math.random() * listaAlumnos.length);
		
		JOptionPane.showMessageDialog(null, listaAlumnos[numRandom]);
	}

}
