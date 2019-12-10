/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author usuario
 */
public class Animales {

    private String nombre;
    private String imagenMiniatura;
    private String imgGrande;

    public Animales(String nombre, String imagenMiniatura, String imgGrande) {
        this.nombre = nombre;
        this.imagenMiniatura = imagenMiniatura;
        this.imgGrande = imgGrande;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public String getImgGrande() {
        return imgGrande;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public void setImgGrande(String imgGrande) {
        this.imgGrande = imgGrande;
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", imagenMiniatura=" + 
                imagenMiniatura + ", imgGrande=" + imgGrande + '}';
    }
    
}
