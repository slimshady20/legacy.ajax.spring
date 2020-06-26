<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div> 
	<div class="my-2">
	</div>
	<div class="my-2">
	     <button id="join">회원 가입</button>
	     <button id="login">로그인</button>
	</div>
    <h1 class="w3-xlarge black--text" >지하철 타고 즐기는 서울여행</h1>
    <h1>Welcome</h1>
</div>
<script>
$('#join').click(function(){
	console.log('이동화면 진입')
	alert("${context}");
	location.href= "${context}/user/join/form"
})
</script>
