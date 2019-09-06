<!doctype html>
<#include "../include/imports.ftl">
<html lang="en">
  <head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/bootstrap.css"/>" type="text/css"/>
    <#if hstRequest.requestContext.channelManagerPreviewRequest>
      <link rel="stylesheet" href="<@hst.webfile  path="/css/cms-request.css"/>" type="text/css"/>
    </#if>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/hippo-cool.css"/>" type="text/css"/>
    <@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
          <@hst.include ref="top"/>
        </div>
      </div>
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
          <@hst.include ref="menu"/>
        </div>
      </div>
      <div class="row">
        <@hst.include ref="main"/>
      </div>
      <div class="row">
        <@hst.include ref="footer"/>
      </div>
    </div>
    <script src="<@hst.webfile path="/js/jquery-2.1.0.min.js"/>" type="text/javascript"></script>
    <script src="<@hst.webfile path="/js/bootstrap.min.js"/>" type="text/javascript"></script>
    <script src="<@hst.webfile path="/js/less.min.js"/>" type="text/javascript"></script>
    <@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
  </body>
</html>