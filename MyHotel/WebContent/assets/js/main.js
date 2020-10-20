function reservChoose(){
			document.getElementById("PageChambres").style.display="none";
			document.getElementById("PageClient").style.display="none";
			document.getElementById("PageReservationChambre").style.display="block";
			document.getElementById("PageRessource").style.display="none";

			console.log("fonction t3edda");
		}
function chambreChoose(){
	document.getElementById("PageChambres").style.display="block";
	document.getElementById("PageReservationChambre").style.display="none";
	document.getElementById("PageClient").style.display="none";
	document.getElementById("PageRessource").style.display="none";

}
function clientChoose(){
	document.getElementById("PageChambres").style.display="none";
	document.getElementById("PageReservationChambre").style.display="none";
	document.getElementById("PageClient").style.display="block";
	document.getElementById("PageRessource").style.display="none";
}
function myHotelChoose(){
	document.getElementById("PageChambres").style.display="none";
	document.getElementById("PageClient").style.display="none";
	document.getElementById("PageReservationChambre").style.display="none";
	document.getElementById("PageRessource").style.display="none";

	console.log("fonction t3edda");
}

function ressourceChoose(){
	document.getElementById("PageChambres").style.display="none";
	document.getElementById("PageClient").style.display="none";
	document.getElementById("PageReservationChambre").style.display="none";
	document.getElementById("PageRessource").style.display="block";
}