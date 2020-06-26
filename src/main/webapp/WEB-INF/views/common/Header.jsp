<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<style type="text/css"></style>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<div class="App">
		<div class="Post">
			<form class="loginForm">
				<div class="form-group">
					<label class="form-label" for="formBasicEmail">Email
						address</label><input placeholder="Enter email" type="email"
						id="formBasicEmail" class="form-control">
				</div>
				<div class="form-group">
					<label class="form-label" for="formBasicPassword">Password</label><input
						placeholder="Password" type="password" id="formBasicPassword"
						class="form-control">
				</div>
				<button type="login" class="button btn btn-primary">login</button>
				<button id="join_btn" type="join"
						class="button btn btn-primary">join</button>
			</form>
		</div>
	</div>