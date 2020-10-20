<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->

<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.css" rel="stylesheet">
<link href="assets/table/bootstrap-table.min.css" rel="stylesheet">
<link href="assets/table/extensions/filter-control/bootstrap-table-filter-control.min.css" rel="stylesheet">



<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<center>
	<h1>
		<j:out value="Liste des clients" />
		
	</h1>
	</center>
	<div id="toolbar" >
	<form action="TraiteChambreButttons" method="post">
	
	</form>
		<button id="edit" name="button" class="btn btn-secondary"  value="edit" >Modifier</button>
	
	<div  class="select" >
	<select class="form-control">
	<option value="">Export Basic</option>
	<option value="all">Export All</option>
	<option value="selected">Export Selected</option>
	
	</select>
	</div>
	</div>
	<div class="container mt-2 nb-2">
	<table
	id="table"
	data-toggle="table"
	data-pagination="true"
	data-search="true"
	
	data-toolbar="#toolbar"
	data-advanced-search="true"
	data-id-table="advancedTable"
	data-filter-control="true"
	data-filter-show-clear="true"
	data-show-columns="true"
	data-show-toggle="true"
	data-show-refresh="true"
	data-show-fullscreen="true"
	data-show-pagination-switch="true"
	data-pagination-pre-text="Previous"
	data-pagination-next-text="Next"
	data-pagination-h-align="left" 
	data-pagination-detail-h-align="right"
	data-page-list="[10,20,30,40,50,ALL]"
	data-show-print="true"
	data-show-export="true"
	data-click-to-select="true"
	
	>
		<thead>
			<!--  
			<tr>
			<th rowspan="2" data-checkbox="true" data-valign="middle"></th>
			<th colspan="5" data-align="center"> Liste des chambres</th>
			</tr>
			-->
			<tr>
				<!--  <th>ID</th>-->
				<th data-field="state"  data-checkbox="true" data-visible="true"></th>
				<th data-field="idclient" data-sortable="true" data-filter-control="input" >IdClient</th>
				<th data-field="nom" data-sortable="true"  data-filter-control="input">Nom</th>
				<th data-field="prenom" data-sortable="true"  data-filter-control="select" >Prenom</th>
				<th data-field="numtel" data-sortable="true"  data-filter-control="input">Numero telephone</th>
				<th data-field="age" data-sortable="true"  data-filter-control="select">Age</th>
			</tr>
		</thead>
		<tbody>
		
			<j:forEach var="ch" items="${ls}">
				<tr>
				<th data-checkbox="true" data-valign="middle"></th>
				<td><j:out value="${ch.idClient }"></j:out></td>
				<td><j:out value="${ch.nomClient }"></j:out></td>
				<td><j:out value="${ch.prenomClient}"></j:out></td>
				<td><j:out value="${ch.numTel }"></j:out></td>
				<td><j:out value="${ch.age }"></j:out></td>
				
					
					
				</tr>

			</j:forEach>
			
		</tbody>


	</table>
</div>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.5.3/umd/popper.min.js" ></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="https://unpkg.com/xlsx/dist/xlsx.full.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2.0.0/FileSaver.min.js" ></script>
	<script src="assets/table/bootstrap-table.min.js"></script>
	
	<script src="assets/table/extensions/filter-control/bootstrap-table-filter-control.min.js"></script>
	<script src="assets/table/extensions/toolbar/bootstrap-table-toolbar.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/TableExport/5.2.0/js/tableexport.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/3.5.13/jspdf.plugin.autotable.js" ></script>
	
	<script src="assets/table/extensions/print/bootstrap-table-print.min.js"></script>
	
	<script src="assets/table/extensions/export/bootstrap-table-export.min.js"></script>
	
<script>
var table=$('#table')
$('#remove').on('click',function(){
	var ids=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.numchambre
	})
	table.bootstrapTable('remove',{
		field: 'numchambre',
		values: ids
	})
	})
$('#edit').on('click',function(){
	var ids=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.idclient});
	var ne=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.nom});
	var tc=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.prenom});
	var nbp=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.numtel});
	var pc=$.map(table.bootstrapTable('getSelections'),function(row){
		 return row.age});
	
	let idclient=ids[0];
	let nom=ne[0];
	let prenom=tc[0];
	let numtel=nbp[0];
	let age= parseInt(pc[0]);
	
	
		 $.ajax({
			 type: "POST",
			 data:{"id":"5","button":"edit"},
			 url:"TraiteChambreButttons",
			 dataType:"text",
			 
			 success: function(data){
				 
				 window.location.href="AjoutClient.jsp?idclient="+idclient+"&nom="+nom+"&prenom="+prenom+"&numtel="+numtel+"&age="+age;
			 }
		 }
				 );
			
		 
}

		)
	$('#removeAll').on('click',function(){
		table.bootstrapTable('removeAll')
		
	})
	$('select').on('click',function(){
		if($(this).val()=='selected'){
			table.bootstrapTable('showColumn','state')
		}else{
			table.bootstrapTable('hideColumn','state')
		}
		table.bootstrapTable({
			exportDataType: $(this).val(),
			exportTypes: ['json','xml','csv','txt','sql','excel','pdf']
		})
	})

</script>
</body>
</html>
<script>

</script>