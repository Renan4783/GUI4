package Exercicio1a11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class Frame {
	JTree tree;
	JLabel jlab;
	public Frame(){
		JFrame jfrm = new JFrame("Exercicio 11");
		jfrm.setSize(200, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Palavras-Chrave");
		DefaultMutableTreeNode Types = new DefaultMutableTreeNode("Tipos");
		root.add(Types);
		DefaultMutableTreeNode JTypes = new DefaultMutableTreeNode("JComponent");
		Types.add(JTypes);
		JTypes.add(new DefaultMutableTreeNode("AbstractButton"));
		JTypes.add(new DefaultMutableTreeNode("JComboBox"));
		JTypes.add(new DefaultMutableTreeNode("JLabel"));
		JTypes.add(new DefaultMutableTreeNode("JList"));
		JTypes.add(new DefaultMutableTreeNode("JScrollPanel"));
		JTypes.add(new DefaultMutableTreeNode("JTable"));
		JTypes.add(new DefaultMutableTreeNode("JTextComponent"));
		JTypes.add(new DefaultMutableTreeNode("JTree"));
		JTypes.add(new DefaultMutableTreeNode("JPanel"));
		tree = new JTree(root);
		JScrollPane jsp = new JScrollPane(tree);
		jfrm.add(jsp);
		jlab = new JLabel("Seleção da Árvore");
		jfrm.add(jlab, BorderLayout.SOUTH);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent tse) {
				jlab.setText("Selection is " + tse.getPath().getLastPathComponent());
			}
		});
	}
}
