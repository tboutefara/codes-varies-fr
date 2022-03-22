package com.tarekboutefara.exemplejpa.main;

import com.tarekboutefara.exemplejpa.main.Personne;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-16T01:39:26")
@StaticMetamodel(Poste.class)
public class Poste_ { 

    public static volatile SingularAttribute<Poste, Integer> o_id;
    public static volatile SingularAttribute<Poste, String> appelation;
    public static volatile ListAttribute<Poste, Personne> personnes;

}