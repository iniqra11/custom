<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<div class="span-24">
	<div class="slider_component">
		<div id="homepage_slider" class="svw">
			<ul>
				<c:forEach items="${banners}" var="banner" varStatus="status">
					<c:url value="${banner.urlLink}" var="encodedUrl" />
					<li><a tabindex="-1" href="${encodedUrl}"<c:if test="${banner.external}"> target="_blank"</c:if>><img src="${banner.media.URL}" alt="${not empty banner.headline? banner.headline : banner.media.altText}" WIDTH="1400" title="${not empty banner.content? banner.content : banner.media.altText}"/></a></li>

				</c:forEach>
			</ul>
		</div>
	</div>
</div>