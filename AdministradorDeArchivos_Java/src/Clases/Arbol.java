package Clases;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.io.File;

public class Arbol {

    public static TreeModel implementarNodos(File directorio) {
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(directorio.getName());
        creacionDeNodos(directorio, raiz);
        return new DefaultTreeModel(raiz);
    }

    private static void creacionDeNodos(File directorio, DefaultMutableTreeNode hijos) {
        File[] files = directorio.listFiles();
        if (files != null) {
            for (File file : files) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());
                hijos.add(node);
                if (file.isDirectory()) {
                    creacionDeNodos(file, node);
                }
            }
        }
    }
}
