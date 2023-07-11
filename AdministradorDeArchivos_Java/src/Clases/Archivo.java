package Clases;

import java.awt.image.BufferedImage;
import java.io.File;

public class Archivo {

    private String nombre;
    private String autor;
    private String tamanio;
    private String fechaDeCreacion;
    private String fechaDeModificacion;
    private String tipoDeArchivo;
    private String ruta;
    
    
    private boolean modificado;

    public Archivo() {

    }

    public Archivo(String nombre, String autor, String ruta, String tipoDeArchivo) {
        this.nombre = nombre;
        this.autor = autor;
        this.ruta = ruta;
        this.tipoDeArchivo = tipoDeArchivo;
    }

    public void eliminarArchivo(){
        File archivo = new File(getRuta());
        archivo.delete();   
    }
    
    
    public boolean crearArchivo() {
        return false;
    }

    public String abrirArchivo() {
        return "";
    }
    
    public BufferedImage abrirImagen(){
        return null;
    }

    public boolean editarArchivo(String cadena) {
        return false;
    }

    public boolean editarArchivo(BufferedImage img) {
        return false;
    }

    public void editarArchivo() {
    }

    public String getTipoDeArchivo() {
        return tipoDeArchivo;
    }

    public String getRuta() {
        return ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setFechaDeModificacion(String fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public void setTipoDeArchivo(String tipoDeArchivo) {
        this.tipoDeArchivo = tipoDeArchivo;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    
    

}
