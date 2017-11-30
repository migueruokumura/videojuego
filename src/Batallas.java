
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gost749
 */
public class Batallas {

    /**
     * @param args the command line argume
     */
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int aleat,salud;
        
        
        
        Personaje Lobo = new Personaje();
        Personaje Medusa = new Personaje();
        Personaje Escorpion = new Personaje();
        Personaje Monstruo = new Personaje();
        Personaje Final = new Personaje();
                // TOde application logic here
        
        Lobo.setAtaque1(30);
        Lobo.setAtaque2(80);
        Lobo.setAtaque3(120);
        Lobo.setDefensa(100);
        Lobo.setVelocidad(500);
        Lobo.setVida(150);
        Lobo.setNombre("Lobo");
        Lobo.setProfesion("Guerrero");
        
        Medusa.setAtaque1(50);
        Medusa.setAtaque2(70);
        Medusa.setAtaque3(100);
        Medusa.setDefensa(150);
        Medusa.setVelocidad(550);
        Medusa.setVida(250);
        Medusa.setNombre("medusa");
        Medusa.setProfesion("Curandero");
        
        Escorpion.setAtaque1(60);
        Escorpion.setAtaque2(100);
        Escorpion.setAtaque3(150);
        Escorpion.setDefensa(170);
        Escorpion.setVelocidad(480);
        Escorpion.setVida(300);
        Escorpion.setNombre("Escorpion");
        Escorpion.setProfesion("Asesino");
        
        Final.setAtaque1(120);
        Final.setDefensa(400);
        Final.setVelocidad(250);
        Final.setVida(1000);
        Final.setNombre(null);
        Final.setProfesion(null);
        
        Random rand = new Random();
        int i = (int)(rand.nextDouble()*100+100);
        int j = (int)(rand.nextDouble()*100+100);
        int k = (int)(rand.nextDouble()*100+300);
        int l = (int)(rand.nextDouble()*50+100);
        
        Monstruo.setAtaque1(i);
        Monstruo.setDefensa(j);
        Monstruo.setVelocidad(k);
        Monstruo.setVida(l);
        Monstruo.setNombre(null);
        Monstruo.setProfesion(null);
        
        
        
        System.out.println(Lobo.getNombre()+"tiene"+Lobo.getVida()+"puntos de vida");
        System.out.println(Medusa.getNombre()+"tiene"+Medusa.getVida()+"puntos de vida");
        System.out.println(Escorpion.getNombre()+"tiene"+Escorpion.getVida()+"puntos de vida");
        
        do{
            int Ataque = sc.nextInt();
            
            switch(Ataque){
                case 1:
                    salud = Lobo.getAtaque1();
                    break;
                case 2:
                    salud = Lobo.getAtaque2();
                    break;
                case 3: 
                    salud = Lobo.getAtaque3();
            }
            
                            
                                     
            
        
        
        
        
        
        
    }while(Lobo.getVida()==0||Medusa.getVida()==0||Escorpion.getVida()==0||Final.getVida()==0);
    }
}
