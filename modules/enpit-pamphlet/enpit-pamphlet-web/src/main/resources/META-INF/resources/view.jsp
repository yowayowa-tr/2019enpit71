<%@ include file="/init.jsp" %>

<p>
	<img src="<%= request.getContextPath() %>/image/uma_Map.png" class="map"/>
	
	<div class="popup_click" data-en-location="1">
		<img src="<%= request.getContextPath() %>/image/baba.png" class="baba"  />
	</div>
	<div class="popup_click" data-en-location="2">
		<img src="<%= request.getContextPath() %>/image/hikiUma.png" class="hikiUma" />
	</div>
	<div class="popup_click" data-en-location="3">
		<img src="<%= request.getContextPath() %>/image/car.png" class="car"  />
	</div>
	<div class="popup_click" data-en-location="4">
		<img src="<%= request.getContextPath() %>/image/forest.jpg" class="forest"/>
	</div>
	
	<div id="current_location_id" data-en-location="none" ></div>
	
	<div id="popup_content" />
	
	<aui:script use="aui-modal,aui-overlay-manager" position="inline">
		$(".popup_click").click(function(event){
			var obj = $(event.currentTarget);
			var locationId = obj.data("en-location");
			
			$("#current_location_id").data("en-location", locationId);
			
			Liferay.Util.openWindow(
				{
					dialog: {
						after: {
							destroy: function(event) {
							}
						},
						destroyOnHide: true
					},
					dialogIframe: {
						bodyCssClass: 'dialog-with-footer'
					},
					id: '<portlet:namespace />openImportView',
					title:	(function(locaionId){
								if(locationId == 1)	return 'Impressions about Baba';
								if(locationId == 2)	return 'Impressions about Hiki-Uma';
								if(locationId == 3)	return 'Impressions about Go-kart';
								if(locationId == 4)	return 'Impressions about Asobi-no-Mori';
							}(locationId)),
														
					uri: '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="mvcPath" value="/details.jsp" /></portlet:renderURL>' + "&locationId=" + locationId
				}
			);
		});
	</aui:script>
</p>

