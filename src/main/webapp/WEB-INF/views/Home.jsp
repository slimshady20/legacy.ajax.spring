<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="common/Header.jsp"/>
<div> 
        
            <div class="my-2">
               

            </div>
            <div class="my-2">
                 <button id="join">회원 가입</button>
            </div>

    
   
        <h1 class="w3-xlarge black--text" >지하철 타고 즐기는 한국여행</h1>
        <h1>Welcome</h1>
       

</div>
</body>
</html>
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

