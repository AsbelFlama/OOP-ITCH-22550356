/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_2_clases;

/**
 *
 * @author invitado
 */
class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        nombre = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String lastname) {
        apellidos = lastname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        edad = age;

    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char gen) {
        genero = gen;
    }
    public void imprimirDatos(){
        System.out.println("Nombre:  "+" " +nombre+ " "+apellidos);
        System.out.println("Edad:  "+" " +edad);
        if (genero == 'H'){
        System.out.println("Genero: Hombre");
        }else if (genero == 'M' ||genero == 'm') {
        System.out.println("Genero: Mujer");
        }else{
        System.out.println("Genero no registrado");
        }
        
    }
}
