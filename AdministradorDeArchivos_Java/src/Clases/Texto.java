package Clases;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Texto extends Archivo{

    public Texto(String nombre, String autor, String ruta) {
        super(nombre, autor, ruta, "Texto");
    }
 
    @Override
    public boolean crearArchivo() {
        try {
            setRuta("src/" + getRuta() + "/" + getNombre() + ".txt");
            File file = new File(getRuta());

            if (!file.exists()) {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Calendar calendario = Calendar.getInstance();
                String fecha = formatoFecha.format(calendario.getTime());

                file.createNewFile();

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
        String cadena = "";

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(getRuta());
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String lineas;

            while ((lineas = br.readLine()) != null) {
                cadena += lineas + "\n";
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }

        }

        return cadena;
    }

    @Override
    public boolean editarArchivo(String cadena) {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calendario = Calendar.getInstance();
        String fecha = formatoFecha.format(calendario.getTime());

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(getRuta());
            pw = new PrintWriter(fichero);

            String[] lineas = cadena.split("\n");

            for (int i = 0; i < lineas.length; i++) {
                pw.println(lineas[i]);
            }
            setFechaDeModificacion(fecha);
            return true;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
                setTamanio((long) Files.size(Path.of(getRuta())) + " bytes");
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }

        return false;
    }
}
