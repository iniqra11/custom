<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
1234
<div class="slider_component simple-banner">
	<div id="homepage_slider" class="svw">


       <ul>
			<c:forEach items="${banners}" var="banner" varStatus="status">

			    <div></div>
				<c:if test="${ycommerce:evaluateRestrictions(banner)}">
				    <div id="bannerContent">${banner.content}</div>
					<c:url value="${banner.urlLink}" var="encodedUrl" />
					<c:if test="${ycommerce:validateUrlScheme(banner.media.url)}">
						<li>
							<c:choose>
								<c:when test="${!ycommerce:validateUrlScheme(encodedUrl)}">
									<img src="${fn:escapeXml(banner.media.url)}"
										alt="${not empty banner.headline ? fn:escapeXml(banner.headline) : fn:escapeXml(banner.media.altText)}"
										title="${not empty banner.headline ? fn:escapeXml(banner.headline) : fn:escapeXml(banner.media.altText)}"/>
								</c:when>

								<c:otherwise>
									<a tabindex="-1" href="${fn:escapeXml(encodedUrl)}"<c:if test="${banner.external}"> target="_blank"</c:if>>
										<img id="bannerImg" src="${fn:escapeXml(banner.media.url)}"
											alt="${not empty banner.headline ? fn:escapeXml(banner.headline) : fn:escapeXml(banner.media.altText)}"
											title="${not empty banner.headline ? fn:escapeXml(banner.headline) : fn:escapeXml(banner.media.altText)}"/>
									</a>
								</c:otherwise>
							</c:choose>
						</li>
					</c:if>
				</c:if>
			</c:forEach>
		</ul>
	</div>
</div>
