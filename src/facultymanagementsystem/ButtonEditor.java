package facultymanagementsystem;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author Krishna ASML
 */
public class ButtonEditor extends DefaultCellEditor {
  protected JButton button;
  private String    label;
  private boolean   isPushed;
  public ButtonEditor(JCheckBox checkBox) {
    super(checkBox);
    button = new JButton();
    button.setOpaque(false);
    
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
      }
    });
  }

    @Override
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else{
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    //label = (value ==null) ? "Download" : value.toString();
    label = (value ==null) ? "Remove" : value.toString();
    button.setText( label );
    isPushed = true;
    return button;
  }

    @Override
  public Object getCellEditorValue() {
    if (isPushed)  {
      //
      //
      //JOptionPane.showMessageDialog(button ,label + ": Ouch!");
      // System.out.println();
    }
    isPushed = false;
    return new String( label ) ;
  }

    @Override
  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }

    @Override
  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
}
