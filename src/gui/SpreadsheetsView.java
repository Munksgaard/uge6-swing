package gui;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import spreadsheet.Spreadsheet;


public final class SpreadsheetsView
    extends JTabbedPane {

  public static final long serialVersionUID = 1L;

  public static final SpreadsheetsView instance = new SpreadsheetsView();

  private SpreadsheetsView() {
      Spreadsheet spreadsheet1 = new Spreadsheet();
      SpreadsheetView spreadsheetview1 = new SpreadsheetView(spreadsheet1);
      this.add(spreadsheet1.getName(), spreadsheetview1);
  }

}
