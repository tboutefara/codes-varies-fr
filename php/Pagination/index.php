<?php

$mysql_id = mysqli_connect('localhost', 'root', 'tarek');
mysqli_select_db($mysql_id, 'exemple_pagination');

$page = 1;
$limite = 10;

if(isset($_GET["p"])){
	$page = intval($_GET["p"]);
}

if(isset($_GET["l"])){
	$limite = intval($_GET["l"]);
}

$requete_nombre_personnes = "Select count(*) as nbr_personnes from exemple";
$resultat_nombre_personnes = mysqli_query($mysql_id, $requete_nombre_personnes);
$nombre_personnes_ligne = mysqli_fetch_assoc($resultat_nombre_personnes);
$nombre_personnes = intval($nombre_personnes_ligne["nbr_personnes"]);

$requete = "Select * from exemple limit ".(($page -1) * $limite).",".$limite;
$personnes = mysqli_query($mysql_id, $requete);

?>
<!DOCTYPE html>
<html>
	<head>
		<title>Exemple Pagination</title>
	</head>
	<style>
		#home {
			width : 800px;
			margin-left : auto;
			margin-right : auto;		
		}
		
		table {
			width : 100%;
			margin-top : 20px;		
		}
		
		.code {
			width : 20%;		
		}
		
		.prenom {
			width : 40%;		
		}
		
		.nom {
			width : 40%;		
		}
		
		table, tr, td	{
			border: 2px double green;
			border-collapse : collapse;
			
			padding : 10px;
		}
		
		#limite {
			width : 30%;
			margin-left : 20px;		
		}
		
		#envoyer {
			width : 30%;
			margin-left : 20px;
		}
		
		.pages {
			width : 250px;
			margin-left : auto;
			margin-right : auto;
			margin-top : 20px;
		}
		
		a {
			margin-left : 5px;
			margin-right : 5px;		
		}
	</style>
	<body>
		<div id="home">
			<h1>Liste des personnes</h1>
			<form action="index.php" method="GET">
				<select name="l" id="limite">
					<option value="10" label="10"></option>
					<option value="20" label="20"></option>
					<option value="30" label="30"></option>
					<option value="40" label="40"></option>
					<option value="50" label="50"></option>				
				</select>
				<input type="submit" value="Envoyer" id="envoyer"/>			
			</form>
			<table>
				<tr>
					<td class="code">Code</td><td class="prenom">Prénom</td><td class="nom">Nom</td>
				</tr>
					<?php
					if($nombre_personnes == 0){
						echo "Pas de données";					
					}else{
						while($personne = mysqli_fetch_assoc($personnes)){
					?>
						<tr>
							<td class="code"><?php echo $personne["id"]; ?></td>
							<td class="prenom"><?php echo $personne["prenom"]; ?></td>
							<td class="nom"><?php echo $personne["nom"]; ?></td>
						</tr>
					<?php
						}
					}
					?>
			</table>
			<div class="pages">
			<?php
				$nombre_pages = intval($nombre_personnes / $limite);
				if($nombre_pages > 0){
					for($i = 1; $i <= $nombre_pages; $i++){
				?>
					<a href="index.php?p=<?php echo $i; ?>&l=<?php echo $limite; ?>"><?php echo $i; ?></a>
				<?php						
					}				
				} 
			?>
			</div>
		</div>
	</body>
</html>