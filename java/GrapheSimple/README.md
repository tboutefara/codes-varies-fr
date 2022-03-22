# Graphe Simple

## Objectif

Dans cet exemple, l'objectif est de créer et afficher un graphe. On parle de graphe simple non-orienté.

## Structure de données

La strcuture utuilisée sera une matrice n x n, où n est le nombre de neoud de notre graphe. Un deuxième vecteur sera utilisé pour
stocker les étiquettes des noeuds.

## Utilisation

Ce code peut être importé pour dessiner des graphes. Il suffit de traduire le graphe de sa forme originale vers une matrice
de taille n x n.

## Dessin

Pour cette version, on peut penser à trois modes de dessin :

* **Aléatoire** : 
On positionne les noeuds aléatoirement.

* ** Circulaire** :
On positionne les noeuds sous forme d'un cercle.

* ** LMinéaire** :
On positionne les noeuds sous une forme linéaire de gauche à droite.

Il n'y a pas une méthode correcte pur toutes les situation; il est important de choisir la bonne méthode selon le type
du graphe et des données traitées.