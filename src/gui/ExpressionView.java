package gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

public final class ExpressionView
    extends JTextField {

  public static final long serialVersionUID = 1L;

  public static final ExpressionView instance = new ExpressionView();

  private ExpressionView() {
	super("");
	this.addActionListener(new ExpressionViewListener());
  }

}
