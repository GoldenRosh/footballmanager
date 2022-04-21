package football.management;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class SearchBoxModel extends AbstractListModel 
                implements ComboBoxModel, KeyListener, ItemListener
{
    ArrayList<String> db = new ArrayList<String>();
    ArrayList<String> data = new ArrayList<String>();
    String selection;
    JComboBox cb;
    ComboBoxEditor cbe;
    int currPos = 0;


    public SearchBoxModel(JComboBox jcb,ArrayList<String> db )
    {
        
        cb = jcb;
        cbe = jcb.getEditor();

        cbe.getEditorComponent().addKeyListener(this);


        this.db = db;
    }

    public void updateModel(String in)
    {
        data.clear();

        for(String s:db)
            if(s.startsWith(in))
                data.add(s);

        super.fireContentsChanged(this, 0, data.size());


        cb.hidePopup();
        cb.showPopup();
        if(data.size() != 0)
            cb.setSelectedIndex(-1);
    }

    public int getSize(){return data.size();}
    public Object getElementAt(int index){return data.get(index);}
    public void setSelectedItem(Object anItem)
                                 {selection = (String) anItem;}
    public Object getSelectedItem(){return selection;}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){}

    public void keyReleased(KeyEvent e)
    {
        String str = cbe.getItem().toString();
        JTextField jtf = (JTextField)cbe.getEditorComponent();
        currPos = jtf.getCaretPosition();

        if(e.getKeyChar() == KeyEvent.CHAR_UNDEFINED)
        {
            if(e.getKeyCode() != KeyEvent.VK_ENTER )
            {
                cbe.setItem(str);
                jtf.setCaretPosition(currPos);
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_ENTER)
            cb.setSelectedIndex(cb.getSelectedIndex());
        else
        {
            updateModel(cb.getEditor().getItem().toString());
            cbe.setItem(str);
            jtf.setCaretPosition(currPos);
        }
    }

    public void itemStateChanged(ItemEvent e)
    {
        cbe.setItem(e.getItem().toString());
        cb.setSelectedItem(e.getItem());
    }

}

