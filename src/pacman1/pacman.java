/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman1;

/**
 *
 * @author Afaq_Sabghatullah
 */
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class pacman extends JFrame{

	public pacman() {
		add(new Model());
	}
	
	
	public static void main(String[] args) {
		pacman pac = new pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,440);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
