/*!
    * Start Bootstrap - SB Admin v6.0.1 (https://startbootstrap.com/templates/sb-admin)
    * Copyright 2013-2020 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    (function($) {
    "use strict";

    // Add active state to sidbar nav links
    var path = window.location.href; // because the 'href' property of the DOM element is the absolute path
        $("#layoutSidenav_nav .sb-sidenav a.nav-link").each(function() {
            if (this.href === path) {
                $(this).addClass("active");
            }
        });

    // Toggle the side navigation
    $("#sidebarToggle").on("click", function(e) {
        e.preventDefault();
        $("body").toggleClass("sb-sidenav-toggled");
    });
    
    
    
 // Call the dataTables jQuery plugin
    $(document).ready(function() {
    	var table = $('#leagueTable').DataTable({
			"sAjaxSource": "/leagues",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "league_name"}
			],
			"columnDefs": [ {
			    "targets": 0,
			    "data": "league_name",
			    "render": function ( data, type, row, meta ) {
			    	console.log(row);
			      return '<a href="/leagueDetails/'+row.league_id+'">'+data+'</a>';
			    }
			  } ]
    	})
    	$.fn.dataTable.ext.errMode = 'none'; $('#playerTable').on('error.dt', function(e, settings, techNote, message) { console.log( 'An error occurred: ', message); });


    	var table = $('#playerTable').DataTable({
			"sAjaxSource": "/playerTable",
			"sAjaxDataProp": "",
			"order": [[ 3, "asc" ]],
			"aoColumns": [
			      { "mData": "PhotoUrl"},
			      { "mData": "PlayerID"},
			      { "mData": "FirstName"},
			      { "mData": "LastName"},
			      { "mData": "Active"},
			      { "mData": "Age"},
			      { "mData": "ByeWeek"},
			      { "mData": "Position"}
			],
			"columnDefs": [ {
			    "targets": 0,
			    "data": "PhotoUrl",
			    "sDefaultContent": "",
			    "render": function ( data, type, row, meta ) {
			    	console.log(row);
			      return '<img src="'+data+'">';
			    }
			  } ]
    	})
    	
    } );
    
    $(function () {
        $('#search-by-teams').on('click', function (e) {
            var team = $('#pro-teams').val();
            window.location.href = "/playersDetails/" + team;
        });
    });
    
    $(function() {
	   $('.allowCopy').click(function() {
	     $(this).focus();
	     $(this).select();
	     document.execCommand('copy');
	   });
	});
    
    $('[data-toggle="tooltip"]').tooltip();
    
})(jQuery);