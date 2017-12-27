package lee;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

import javax.swing.JFrame;
import java.awt.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyJRViewer
{
    public static void main(String[] args) throws Exception
    {
		JRViewer jr = new JRViewer("static.jrprint" , false);
		JFrame jf = new JFrame("±®±Ì‘§¿¿");
		jf.add(jr);
		jf.pack();
		jf.setVisible(true);

    }
}
