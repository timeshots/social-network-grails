<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
	    <title>Login Page</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
        <link rel="icon" href="${resource(dir: 'images/timeshots', file: 'ts.ico')}">
		<link rel="stylesheet" href="${resource(dir: 'css/login', file: 'auth.css')}" type="text/css">
	</head>
	<body>
        <div class="container">
            <g:if test="${flash.message}">
                <div class="alert alert-danger">${flash.message}</div>
            </g:if>

            <form class="form-signin" role="form" controller="Login" action="authenticate" method="POST" id="loginForm" autocomplete="off">
                <div class="form-group">
                    <label for="exampleInputEmail1">Username :</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Username / Email" name="username" />

                    <label for="exampleInputPassword1">Password :</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password" />

                    <div class="checkbox">
                        <label><input type="checkbox">Check me out</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Sign in</button>
                </div>
            </form>
        </div>
        <r:layoutResources />
    </body>
</html>