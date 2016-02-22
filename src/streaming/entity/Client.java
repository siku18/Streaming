/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import streaming.enumerations.TypeUtil;

/**
 *
 * @author admin
 */
public class Client {
    
    
    private String nom;
    private String prenom;
    private double solde;
    private byte age;
    private TypeUtil tu;
    
    
    public String toString(){
        return (nom + " " + prenom);
    }
    
    public Client(String nom, String prenom, long solde, String age){
        this.nom = nom;
        this.prenom = prenom;
        this.solde = (double) solde;
        this.age = Byte.parseByte(age);
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
    
}
