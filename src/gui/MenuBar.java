package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gui.language.Language;

import gui.control.ExitListener;

public final class MenuBar
    extends JMenuBar {

  public static final long serialVersionUID = 1L;

  public static final MenuBar instance = new MenuBar();

  private MenuBar() {
    super();
    this.add(this.newFileMenu());
  }

  private JMenu newFileMenu() {
    final JMenu menu = new JMenu(Language.instance.file());
    menu.add(this.newExitMenuItem());
    return menu;
  }

  private JMenuItem newExitMenuItem() {
    final JMenuItem menuItem = new JMenuItem(Language.instance.exit());
    menuItem.addActionListener(ExitListener.instance);
    return menuItem;
  }

}
