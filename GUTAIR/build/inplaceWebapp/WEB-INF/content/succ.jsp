<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>信息</title>
<script type="text/javascript">
    $(document).ready(function () {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'accordion', //Types: default, vertical, accordion           
            width: 'auto', //auto or any width like 600px
            fit: true,   // 100% fit in a container
            closed: 'accordion', // Start closed if in accordion view
            activate: function(event) { // Callback function if tab is switched
                var $tab = $(this);
                var $info = $('#tabInfo');
                var $name = $('span', $info);
                $name.text($tab.text());
                $info.show();
            }
        });

        $('#verticalTab').easyResponsiveTabs({
            type: 'vertical',
            width: 'auto',
            fit: true
        });
    });
</script>
</head>
<body>
	<div class="header">
		<div class="header_top">
			<div class="container">
				<div class="logo">
					<a href="index"><img src="images/4.png" alt="" /></a>
				</div>
			</div>
		</div>
	</div>

	<h1>信息</h1>
		<table border="1" width="300px">
			<tr align="center">
			<th>seriaNumber</th>
				<th>price</th>
				<th>builder</th>
						<th>model</th>
						<th>type</th>
						<th>backWood</th>
						<th>topWood</th>
				
				
			</tr>
			<s:iterator id="GuitarList" value="#request.GuitarList">
				<tr align="center">
					<th><s:property value="#GuitarList.serialNumber" /></th>
					<th><s:property value="#GuitarList.price" /></th>
					<th><s:property value="#GuitarList.builder" /></th>
					<th><s:property value="#GuitarList.model" /></th>
					<th><s:property value="#GuitarList.type" /></th>
					<th><s:property value="#GuitarList.backWood" /></th>
			        <th><s:property value="#GuitarList.topWood" /></th>
						</tr>
			</s:iterator>
		</table>

	

</body>
</html>