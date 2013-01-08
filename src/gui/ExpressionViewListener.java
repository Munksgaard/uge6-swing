package gui;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import spreadsheet.Application;
import spreadsheet.Expression;
import spreadsheet.Position;

import ui.ExpressionInterpreter;
import ui.exception.*;

import java.util.Scanner;

public final class ExpressionViewListener 
    implements ActionListener {

  public void actionPerformed(ActionEvent event) {
	SpreadsheetView view = (SpreadsheetView) SpreadsheetsView.instance.getSelectedComponent();
	try {
		Application.instance.set(Application.instance.getCurrentPosition(), ExpressionInterpreter.interpret(new Scanner(ExpressionView.instance.getText())));
	} catch (Exception e) {
		System.out.println(Application.instance.getCurrentPosition());
		System.out.println(Application.instance.getSpreadsheets());
		System.out.println(e);
	}
  }

}
