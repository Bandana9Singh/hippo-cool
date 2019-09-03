<#include "../include/imports.ftl">

<#if cparam??> 
	<#if cparam.title??>
		<h4>${cparam.title}</h4>
	</#if>
	<#if cparam.pageNumber??>
		<p>Page number: ${cparam.pageNumber}</p>
	</#if>
</#if>
