package com.tarekboutefara.exemplejpa.main;

import com.tarekboutefara.exemplejpa.main.Poste;
import com.tarekboutefara.exemplejpa.main.Vehicule;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-16T01:46:25")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile ListAttribute<Personne, Vehicule> vehicules;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile SingularAttribute<Personne, Integer> p_id;
    public static volatile ListAttribute<Personne, Poste> postes;

}