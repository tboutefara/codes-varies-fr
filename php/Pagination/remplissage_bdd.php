<?php

$mysql_id = mysqli_connect('localhost', 'root', 'tarek');
mysqli_select_db($mysql_id, 'exemple_pagination');

$supprimer_table = "Drop Table If Exists exemple";
mysqli_query($mysql_id, $supprimer_table);

$creer_table = "Create Table exemple (id Integer Primary Key Auto_Increment, nom Char(20), prenom Char(20))";
mysqli_query($mysql_id, $creer_table);

$noms = array('Cruse', 'Diesel', 'Pitt', 'Clooney');
$prenoms = array('Tom', 'Vin', 'Brad', 'George');

for($i = 1; $i < 101; $i++){
	$index1 = rand(0, 3);
	$index2 = rand(0, 3);
	
	$requete = "Insert into exemple Values (NULL, '".$noms[$index1]."', '".$prenoms[$index2]."')";
	mysqli_query($mysql_id, $requete);
}

?>