package Clases;

import java.awt.Desktop;
import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Directorio extends Archivo {

    public Directorio(String nombre, String autor, String ruta) {
        super(nombre, autor, ruta, "Directorio");
    }

    @Override
    public boolean crearArchivo() {
        try {
            setRuta("src/" + getRuta() + "/" + getNombre());
            File file = new File(getRuta());

            if (!file.exists()) {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Calendar calendario = Calendar.getInstance();
                String fecha = formatoFecha.format(calendario.getTime());

                file.mkdir();

                setTamanio((long) Files.size(Path.of(getRuta())) + " bytes");
                setFechaDeCreacion(fecha);
                setFechaDeModificacion(fecha);

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el archivo por que ya existe un archivo con el mismo nombre");
                return false;
            }

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            return false;
        }
    }


    @Override
    public String abrirArchivo() {
        try {
            File archivo = new File(getRuta());
            Desktop.getDesktop().open(archivo);
            setTamanio((long) Files.size(Path.of(getRuta())) + " bytes");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        
        return "";
    }

    @Override
    public boolean editarArchivo(String cadena) {
        return false;
    }

}
