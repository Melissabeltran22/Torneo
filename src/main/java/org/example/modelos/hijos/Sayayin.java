package org.example.modelos.hijos;

import org.example.modelos.Guerrero;

public class Sayayin extends Guerrero {
    public Sayayin() {
    }

    public Sayayin(String nombre, Integer poderPelea, Integer poderDefensa, Integer vida, Integer fase) {
        super(nombre, poderPelea, poderDefensa, vida);
        this.fase = fase;
    }

    @Override
    public void saludar() {
        System.out.println("Hola Insecto, soy" + getNombre());

    }



    private Integer fase;

    public Integer getFase() {
        return fase;
    }

    public void setFase(Integer fase) {
        this.fase = fase;
    }


}
