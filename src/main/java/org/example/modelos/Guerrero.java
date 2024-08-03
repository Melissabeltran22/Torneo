package org.example.modelos;

public abstract class Guerrero {

    private String nombre;
    private Integer poderPelea;
    private Integer poderDefensa;
    private Integer vida;

    public Guerrero() {
    }


    public Guerrero(String nombre) {
        this.nombre = nombre;
    }

    public Guerrero(String nombre, Integer poderPelea, Integer poderDefensa, Integer vida) {
        this.nombre = nombre;
        this.poderPelea = poderPelea;
        this.poderDefensa = poderDefensa;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoderPelea() {
        return poderPelea;
    }

    public void setPoderPelea(Integer poderPelea) {
        this.poderPelea = poderPelea;
    }

    public Integer getPoderDefensa() {
        return poderDefensa;
    }

    public void setPoderDefensa(Integer poderDefensa) {
        this.poderDefensa = poderDefensa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }





    public void pelear(Guerrero competidorUno, Guerrero competidorDos){
        int resultado = competidorUno.poderPelea - competidorDos.poderPelea;
        if(resultado>0){
            System.out.println(competidorUno.getNombre()+" Gana");
        } else if (resultado==0){
            System.out.println("---- EMPATE !!! ----");
        } else{
            System.out.println(competidorDos.getNombre()+" Gana");
        }
    }

    public abstract void saludar();
}
