<#include "../include/imports.ftl">
<#if document??>
	<div class="hero-image">
	  <div class="hero-text">	
	    <#if document.image??>
	    	<img src="<@hst.link hippobean=document.image />" alt="${document.title?html}"/>
	    </#if>	
	    <#if document.title??>
	    	<h1 style="font-size:50px">${document.title}</h1>
	    </#if>	
	    <@hst.html hippohtml=document.content/>
	  </div>
	</div>
</#if>