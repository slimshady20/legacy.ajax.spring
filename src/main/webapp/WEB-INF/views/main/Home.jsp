<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
body,h1 {font-family: "Raleway", Arial, sans-serif}
h1 {letter-spacing: 6px}
.w3-row-padding img {margin-bottom: 12px}

</style>
<script>
$('#join').click(function(){
	console.log('이동화면 진입')
	alert("${context}");
	location.href= "${context}/user/join/form"
})
</script>

