<?php
$nombre = $_REQUEST['nombres'];
$apellido = $_REQUEST['apellidos'];
$edad = $_REQUEST['edad'];
$lugar = $_REQUEST['lugar'];

echo "<h1> ATU-DESVIOS POR OBRAS </h1>";
echo $nombre." ". $apellido." , gracias por dejar tu aviso. Ahora todos los usuarios sabrán que en ".$lugar. " hay un desvío por obras.";
?>
