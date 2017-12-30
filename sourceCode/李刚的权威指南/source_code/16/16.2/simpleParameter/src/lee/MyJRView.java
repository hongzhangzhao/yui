package lee;

import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.view.*;

import javax.swing.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyJRView
{
    public static void main(String[] args) throws Exception
    {
		JRViewer jr = new JRViewer("simpleVariable.jrprint" , false);
		JFrame jf = new JFrame("±®±Ì‘§¿¿");
		jf.add(jr);
		jf.pack();
		jf.setVisible(true);

    }
}
