<%@ page import="com.timeshots.blacklabel.socialnetwork.Contact" %>



<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'emailAddress', 'error')} required">
	<label for="emailAddress">
		<g:message code="contact.emailAddress.label" default="Email Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="emailAddress" required="" value="${contactInstance?.emailAddress}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'phoneNumber', 'error')} ">
	<label for="phoneNumber">
		<g:message code="contact.phoneNumber.label" default="Phone Number" />
		
	</label>
	<g:textField name="phoneNumber" value="${contactInstance?.phoneNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'cellphoneNumber', 'error')} ">
	<label for="cellphoneNumber">
		<g:message code="contact.cellphoneNumber.label" default="Cellphone Number" />
		
	</label>
	<g:textField name="cellphoneNumber" value="${contactInstance?.cellphoneNumber}"/>

</div>

