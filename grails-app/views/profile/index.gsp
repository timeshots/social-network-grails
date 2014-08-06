
<%@ page import="com.timeshots.blacklabel.socialnetwork.Profile" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'profile.label', default: 'Profile')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-profile" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-profile" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="birthDate" title="${message(code: 'profile.birthDate.label', default: 'Birth Date')}" />
					
						<g:sortableColumn property="gender" title="${message(code: 'profile.gender.label', default: 'Gender')}" />
					
						<g:sortableColumn property="interestedIn" title="${message(code: 'profile.interestedIn.label', default: 'Interested In')}" />
					
						<g:sortableColumn property="religion" title="${message(code: 'profile.religion.label', default: 'Religion')}" />
					
						<g:sortableColumn property="civilStatus" title="${message(code: 'profile.civilStatus.label', default: 'Civil Status')}" />
					
						<g:sortableColumn property="nationality" title="${message(code: 'profile.nationality.label', default: 'Nationality')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${profileInstanceList}" status="i" var="profileInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${profileInstance.id}">${fieldValue(bean: profileInstance, field: "birthDate")}</g:link></td>
					
						<td>${fieldValue(bean: profileInstance, field: "gender")}</td>
					
						<td>${fieldValue(bean: profileInstance, field: "interestedIn")}</td>
					
						<td>${fieldValue(bean: profileInstance, field: "religion")}</td>
					
						<td>${fieldValue(bean: profileInstance, field: "civilStatus")}</td>
					
						<td>${fieldValue(bean: profileInstance, field: "nationality")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${profileInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
