<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
	    <title>Sign Up</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
        <link rel="shortcut icon" href="${resource(dir: 'images/timeshots', file: 'ts.ico')}" type="images/x-icon">
		<link rel="stylesheet" href="${resource(dir: 'css/signup', file: 'signup.css')}" type="text/css">
	</head>
	<body>
        <div class="container">
            <h2>Sign Up</h2>
            <h5>forever's free and always be.</h5>
            <form class="form-signin" role="form" controller="userRegistration" action="register" method="POST" id="loginForm" autocomplete="off">
                <g:if test="${flash.message}">
                    <div class="alert alert-danger">${flash.message}</div>
                </g:if>
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleInputFirstName1" placeholder="First Name" name="firstName" required />
                    <input type="text" class="form-control" id="exampleInputLastName1" placeholder="Last Name" name="lastName" required />
                    <input type="text" class="form-control" id="exampleInputUserName1" placeholder="Username" name="username" required />
                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" name="emailAddress" required autofocus />
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password" required />
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Re-enter password" name="confirmPassword" required />

                    <h3>Birthday</h3>
                    <div class="form-inline" role="form">
                        <div class="form-group">
                            <select class="form-control-month" name="birthday_month">
                                <option value="00">Month</option>
                                <option value="01">Jan</option>
                                <option value="02">Feb</option>
                                <option value="03">Mar</option>
                                <option value="04">Apr</option>
                                <option value="05">May</option>
                                <option value="06">Jun</option>
                                <option value="07">Jul</option>
                                <option value="08">Aug</option>
                                <option value="09">Sep</option>
                                <option value="10">Oct</option>
                                <option value="11">Nov</option>
                                <option value="12">Dec</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <select class="form-control-date" name="birthday_date">
                                <option value="00">Date</option>
                                <g:each var="i" in="${(1..<32)}">
                                    <option value="${i}">${i++}</option>
                                </g:each>
                            </select>
                        </div>
                        <div class="form-group">
                            <select class="form-control-year" name="birthday_year">
                                <option value="0000">Year</option>
                                <g:each var="i" in="${(1900..<2015)}">
                                    <option value="${i}">${i++}</option>
                                </g:each>
                            </select>
                        </div>
                    </div>
                    <h4><small>to ensure that you are not minor age.</small></h4>
                    <div class="radio">
                        <label><input type="radio" name="sex" value="1">Female</label>
                        <label><input type="radio" name="sex" value="2">Male</label>
                    </div>
                    <h5><small>By clicking Sign Up, you agree to our <a href="#">Terms</a> and that you<br/>have read our <a href="#">Data</a> <a href="#">Use</a> <a href="#">Policy</a>, including our <a href="#">Cookie Use</a>.</small></h5>
                    <button type="submit" class="btn btn-primary">Sign Up</button>
                </div>
            </form>
        </div>
        <r:layoutResources />
    </body>
</html>