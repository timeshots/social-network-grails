
<%@ page import="com.timeshots.blacklabel.socialnetwork.Profile" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'profile.label', default: 'Profile')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-profile" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-profile" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list profile">
			
				<g:if test="${profileInstance?.birthDate}">
				<li class="fieldcontain">
					<span id="birthDate-label" class="property-label"><g:message code="profile.birthDate.label" default="Birth Date" /></span>
					
						<span class="property-value" aria-labelledby="birthDate-label"><g:formatDate date="${profileInstance?.birthDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="profile.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${profileInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.interestedIn}">
				<li class="fieldcontain">
					<span id="interestedIn-label" class="property-label"><g:message code="profile.interestedIn.label" default="Interested In" /></span>
					
						<span class="property-value" aria-labelledby="interestedIn-label"><g:fieldValue bean="${profileInstance}" field="interestedIn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.religion}">
				<li class="fieldcontain">
					<span id="religion-label" class="property-label"><g:message code="profile.religion.label" default="Religion" /></span>
					
						<span class="property-value" aria-labelledby="religion-label"><g:fieldValue bean="${profileInstance}" field="religion"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.civilStatus}">
				<li class="fieldcontain">
					<span id="civilStatus-label" class="property-label"><g:message code="profile.civilStatus.label" default="Civil Status" /></span>
					
						<span class="property-value" aria-labelledby="civilStatus-label"><g:fieldValue bean="${profileInstance}" field="civilStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.nationality}">
				<li class="fieldcontain">
					<span id="nationality-label" class="property-label"><g:message code="profile.nationality.label" default="Nationality" /></span>
					
						<span class="property-value" aria-labelledby="nationality-label"><g:fieldValue bean="${profileInstance}" field="nationality"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.user}">
				<li class="fieldcontain">
					<span id="user-label" class="property-label"><g:message code="profile.user.label" default="User" /></span>
					
						<span class="property-value" aria-labelledby="user-label"><g:link controller="user" action="show" id="${profileInstance?.user?.id}">${profileInstance?.user?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="profile.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:link controller="address" action="show" id="${profileInstance?.address?.id}">${profileInstance?.address?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${profileInstance?.contact}">
				<li class="fieldcontain">
					<span id="contact-label" class="property-label"><g:message code="profile.contact.label" default="Contact" /></span>
					
						<span class="property-value" aria-labelledby="contact-label"><g:link controller="contact" action="show" id="${profileInstance?.contact?.id}">${profileInstance?.contact?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:profileInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${profileInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
