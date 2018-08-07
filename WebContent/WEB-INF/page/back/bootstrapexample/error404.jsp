<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->

		<!-- #section:pages/error -->
		<div class="error-container">
			<div class="well">
				<h1 class="grey lighter smaller">
					<span class="blue bigger-125">
						<i class="ace-icon fa fa-sitemap"></i>
						404
					</span>
					Page Not Found
				</h1>

				<hr />
				<h3 class="lighter smaller">We looked everywhere but we couldn't find it!</h3>

				<div>
					<form class="form-search">
						<span class="input-icon align-middle">
							<i class="ace-icon fa fa-search"></i>

							<input type="text" class="search-query" placeholder="Give it a search..." />
						</span>
						<button class="btn btn-sm" type="button">Go!</button>
					</form>

					<div class="space"></div>
					<h4 class="smaller">Try one of the following:</h4>

					<ul class="list-unstyled spaced inline bigger-110 margin-15">
						<li>
							<i class="ace-icon fa fa-hand-o-right blue"></i>
							Re-check the url for typos
						</li>

						<li>
							<i class="ace-icon fa fa-hand-o-right blue"></i>
							Read the faq
						</li>

						<li>
							<i class="ace-icon fa fa-hand-o-right blue"></i>
							Tell us about it
						</li>
					</ul>
				</div>

				<hr />
				<div class="space"></div>

				<div class="center">
					<a href="javascript:history.back()" class="btn btn-grey">
						<i class="ace-icon fa fa-arrow-left"></i>
						Go Back
					</a>

					<a href="#" class="btn btn-primary">
						<i class="ace-icon fa fa-tachometer"></i>
						Dashboard
					</a>
				</div>
			</div>
		</div>

		<!-- /section:pages/error -->

		<!-- PAGE CONTENT ENDS -->
	</div><!-- /.col -->
</div><!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [null, null]
	$('.page-content-area').ace_ajax('loadScripts', scripts, function() {
	  //inline scripts related to this page
	});
</script>
