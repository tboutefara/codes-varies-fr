# Graphe Simple

## Objectif

Dans cet exemple, l'objectif est de cr�er et afficher un graphe. On parle de graphe simple non-orient�.

## Structure de donn�es

La strcuture utuilis�e sera une matrice n x n, o� n est le nombre de neoud de notre graphe. Un deuxi�me vecteur sera utilis� pour
stocker les �tiquettes des noeuds.

## Utilisation

Ce code peut �tre import� pour dessiner des graphes. Il suffit de traduire le graphe de sa forme originale vers une matrice
de taille n x n.

## Dessin

Pour cette version, on peut penser � trois modes de dessin :

* **Al�atoire** : 
On positionne les noeuds al�atoirement.

* ** Circulaire** :
On positionne les noeuds sous forme d'un cercle.

* ** LMin�aire** :
On positionne les noeuds sous une forme lin�aire de gauche � droite.

Il n'y a pas une m�thode correcte pur toutes les situation; il est important de choisir la bonne m�thode selon le type
du graphe et des donn�es trait�es.