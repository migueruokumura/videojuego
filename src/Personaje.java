/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gost749
 */
public class Personaje {
    
    private int ataque1,ataque2,ataque3, defensa, vida, velocidad;
    private String Profesion;
    private String Nombre;
   

    public Personaje(int ataque1, int ataque2, int ataque3, int defensa, int vida, int velocidad, String Profesion, String Nombre) {
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.defensa = defensa;
        this.vida = vida;
        this.velocidad = velocidad;
        this.Profesion = Profesion;
        this.Nombre = Nombre;
        
       
    }

    Personaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the ataque1
     */
    public int getAtaque1() {
        return ataque1;
    }

    /**
     * @param ataque1 the ataque1 to set
     */
    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    /**
     * @return the ataque2
     */
    public int getAtaque2() {
        return ataque2;
    }

    /**
     * @param ataque2 the ataque2 to set
     */
    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    /**
     * @return the ataque3
     */
    public int getAtaque3() {
        return ataque3;
    }

    /**
     * @param ataque3 the ataque3 to set
     */
    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the Profesion
     */
    public String getProfesion() {
        return Profesion;
    }

    /**
     * @param Profesion the Profesion to set
     */
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    }

   