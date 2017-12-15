package presentacion;

import javax.swing.*;
import java.awt.*;

class MiListCellRenderer extends DefaultListCellRenderer {
	
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	ImageIcon iconoUser1;
	ImageIcon iconoUser2;
	ImageIcon iconoUser3;
	ImageIcon iconoUser4;
	ImageIcon iconoUser5;
	ImageIcon iconoUser6;
	ImageIcon iconoUser7;
	ImageIcon iconoUser8;
	ImageIcon iconoUser9;
	ImageIcon iconoUser10;

	
	public MiListCellRenderer () {
		iconoUser1 = new ImageIcon(MiListCellRenderer.class.getResource("ap1.png"));
		iconoUser2 = new ImageIcon(MiListCellRenderer.class.getResource("ap2.png"));
		iconoUser3 = new ImageIcon(MiListCellRenderer.class.getResource("ap3.png"));
		iconoUser4 = new ImageIcon(MiListCellRenderer.class.getResource("ap4.png"));
		iconoUser5 = new ImageIcon(MiListCellRenderer.class.getResource("ap5.png"));
		iconoUser6 = new ImageIcon(MiListCellRenderer.class.getResource("ap6.png"));
		iconoUser7 = new ImageIcon(MiListCellRenderer.class.getResource("ap7.png"));
		iconoUser8 = new ImageIcon(MiListCellRenderer.class.getResource("ap8.png"));
		iconoUser9 = new ImageIcon(MiListCellRenderer.class.getResource("ap9.png"));
		iconoUser10 = new ImageIcon(MiListCellRenderer.class.getResource("ap10.png"));
	}
	
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
		if (list.getModel().getElementAt(index) == "Raquel Ramos") {
			renderer.setIcon(iconoUser7);
		} else if (list.getModel().getElementAt(index) == "Jesus Ramos"){
				renderer.setIcon(iconoUser1);
		} else if (list.getModel().getElementAt(index) == "Juan Lopez"){
			renderer.setIcon(iconoUser9);
		} else if (list.getModel().getElementAt(index) == "Marta Casas"){
			renderer.setIcon(iconoUser6);
			
		} else if (list.getModel().getElementAt(index) == "Miguel Rodriguez"){
			renderer.setIcon(iconoUser3);

		}
		return renderer;

	}
	

}