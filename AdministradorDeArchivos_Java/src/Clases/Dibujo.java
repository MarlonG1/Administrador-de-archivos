package Clases;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Dibujo extends Archivo {

    public Dibujo(String nombre, String autor, String ruta) {
        super(nombre, autor, ruta, "Dibujo");
    }

    @Override
    public boolean crearArchivo() {
        try {
            setRuta("src/" + getRuta() + "/" + getNombre() + ".png");
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
    public BufferedImage abrirImagen() {
        try {
            File archivo = new File(getRuta());
            BufferedImage img;
            img = ImageIO.read(archivo);
            setTamanio((long) Files.size(Path.of(getRuta())) + " bytes");
            return img;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    @Override
    public boolean editarArchivo(BufferedImage img) {
        try {
            File archivo = new File(getRuta());
            ImageIO.write(img, "PNG", archivo);
            setModificado(true);

            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Calendar calendario = Calendar.getInstance();
            String fecha = formatoFecha.format(calendario.getTime());
            setFechaDeModificacion(fecha);
            setTamanio((long) Files.size(Path.of(getRuta())) + " bytes");

            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }

        return false;
    }

}
