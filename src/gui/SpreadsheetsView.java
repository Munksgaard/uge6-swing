package gui;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import spreadsheet.Spreadsheet;
import spreadsheet.Application;


public final class SpreadsheetsView
    extends JTabbedPane {

  public static final long serialVersionUID = 1L;

  public static final SpreadsheetsView instance = new SpreadsheetsView();

  private SpreadsheetsView() {
      SpreadsheetView spreadsheetview1 = new SpreadsheetView(Application.instance.getWorksheet());
      this.add(Application.instance.getWorksheet().getName(), spreadsheetview1);
  }

}
