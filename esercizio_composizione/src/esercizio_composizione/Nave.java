/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_composizione;

/**
 *
 * @author polenzani.pietro
 */
class Nave {
    
    private String nome;
    private double stazza;
    
    public Nave(String nome, double stazza, int motore, int cavalli){
        this.nome=nome;
        this.stazza=stazza;
              
    }
    
    @override
    public String toString(){
        system.out.println(Nave{nome='Aurora', stazza=32000.5, motore=Motore{cilindrata=12000, cavalli=40000}});
        return;
    }
   // "nome=" + nome + ", stazzaTonnellate=" + stazza+ ", motore=Motore cilindrata=" + motore + ", cavalli=" cavalli
    //Nave{nome='Aurora', stazzaTonnellate=32000.5, motore=Motore{cilindrata=12000, cavalli=40000}}

    
}
