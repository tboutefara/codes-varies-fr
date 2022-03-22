package com.tarekboutefara.exemplejpa.main;

import com.tarekboutefara.exemplejpa.main.Personne;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-16T01:42:10")
@StaticMetamodel(Vehicule.class)
public class Vehicule_ { 

    public static volatile SingularAttribute<Vehicule, Integer> v_id;
    public static volatile SingularAttribute<Vehicule, String> matricule;
    public static volatile SingularAttribute<Vehicule, Personne> personne;
    public static volatile SingularAttribute<Vehicule, String> modele;
    public static volatile SingularAttribute<Vehicule, String> couleur;
    public static volatile SingularAttribute<Vehicule, String> marque;

}