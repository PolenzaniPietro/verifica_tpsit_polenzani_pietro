/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_composizione;

/**
 *
 * @author polenzani.pietro
 */
class Motore extends Nave{
    private int motore;
    private int cavalli;

    public Motore(String nome, double stazza, int motore, int cavalli) {
        super(nome, stazza, motore, cavalli);
    }
}
