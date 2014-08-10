<%@ page import="com.timeshots.blacklabel.socialnetwork.Profile" %>



<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'birthDate', 'error')} ">
	<label for="birthDate">
		<g:message code="profile.birthDate.label" default="Birth Date" />
		
	</label>
	<g:datePicker name="birthDate" precision="day"  value="${profileInstance?.birthDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="profile.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="gender" maxlength="6" required="" value="${profileInstance?.gender}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'interestedIn', 'error')} ">
	<label for="interestedIn">
		<g:message code="profile.interestedIn.label" default="Interested In" />
		
	</label>
	<g:textField name="interestedIn" value="${profileInstance?.interestedIn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'religion', 'error')} ">
	<label for="religion">
		<g:message code="profile.religion.label" default="Religion" />
		
	</label>
	<g:textField name="religion" maxlength="35" value="${profileInstance?.religion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'civilStatus', 'error')} ">
	<label for="civilStatus">
		<g:message code="profile.civilStatus.label" default="Civil Status" />
		
	</label>
	<g:textField name="civilStatus" value="${profileInstance?.civilStatus}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'nationality', 'error')} required">
	<label for="nationality">
		<g:message code="profile.nationality.label" default="Nationality" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nationality" required="" value="${profileInstance?.nationality}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="profile.address.label" default="Address" />
		
	</label>
	<g:select name="address" from="${com.timeshots.blacklabel.socialnetwork.Address.list()}" multiple="multiple" optionKey="id" size="5" value="${profileInstance?.address*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'contact', 'error')} ">
	<label for="contact">
		<g:message code="profile.contact.label" default="Contact" />
		
	</label>
	<g:select name="contact" from="${com.timeshots.blacklabel.socialnetwork.Contact.list()}" multiple="multiple" optionKey="id" size="5" value="${profileInstance?.contact*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: profileInstance, field: 'user', 'error')} ">
	<label for="user">
		<g:message code="profile.user.label" default="User" />
		
	</label>
	<g:select name="user" from="${com.timeshots.blacklabel.socialnetwork.User.list()}" multiple="multiple" optionKey="id" size="5" value="${profileInstance?.user*.id}" class="many-to-many"/>

</div>

