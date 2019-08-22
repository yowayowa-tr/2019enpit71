<%@ include file="/init.jsp" %>

<p class = "root">
	<img src="<%= request.getContextPath() %>/image/uma_Map.png" class="map"/>
	<div id="aui_popup_click1">
		<img src="<%= request.getContextPath() %>/image/baba.png" class="baba"/>
	</div>
	<div id="aui_popup_click2">
		<img src="<%= request.getContextPath() %>/image/hikiUma.png" class="hikiUma"/>
	</div>
	<div id="aui_popup_click3">
		<img src="<%= request.getContextPath() %>/image/car.png" class="car"/>
	</div>
	<div id="aui_popup_click4">
		<img src="<%= request.getContextPath() %>/image/forest.jpg" class="forest"/>
	</div>
	
	<div id="aui_popup_content1" >
	</div>
	
	<div id="aui_popup_content2" >
	</div>
	
	<div id="aui_popup_content3" >
	</div>
	
	<div id="aui_popup_content4" >
	</div>

	<aui:script use="aui-modal,aui-overlay-manager">
		A.one("#aui_popup_click1").on('click',function(event){
			var dialog = new A.Modal({
				title: "AUI Popup",
				bodyContent: 'AUI Modal1',
				headerContent: 'Modal header1',
				centered: true,
				modal: true,
				height: 520,
				render: '#aui_popup_content1',
				close: true
			});
			dialog.render();
		});
	</aui:script>
	
	<aui:script use="aui-modal,aui-overlay-manager">
		A.one("#aui_popup_click2").on('click',function(event){
			var dialog = new A.Modal({
				title: "AUI Popup",
				bodyContent: 'AUI Modal2',
				headerContent: 'Modal header2',
				centered: true,
				modal: true,
				height: 520,
				render: '#aui_popup_content2',
				close: true
			});
			dialog.render();
		});
	</aui:script>
	
	<aui:script use="aui-modal,aui-overlay-manager">
		A.one("#aui_popup_click3").on('click',function(event){
			var dialog = new A.Modal({
				title: "AUI Popup",
				bodyContent: 'AUI Modal3',
				headerContent: 'Modal header3',
				centered: true,
				modal: true,
				height: 520,
				render: '#aui_popup_content3',
				close: true
			});
			dialog.render();
		});
	</aui:script>
	
	<aui:script use="aui-modal,aui-overlay-manager">
		A.one("#aui_popup_click4").on('click',function(event){
			var dialog = new A.Modal({
				title: "AUI Popup",
				bodyContent: 'AUI Modal4',
				headerContent: 'Modal header4',
				centered: true,
				modal: true,
				height: 520,
				render: '#aui_popup_content4',
				close: true
			});
			dialog.render();
		});
	</aui:script>
</p>

<p>
	<b><liferay-ui:message key="enpitpamphletweb.caption"/></b>
</p>

<div class="container">
<div class="scroll">
	<div class="ux-contents">
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleText</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleText</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleTextSampleTextSampleTextSample</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleText</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleText</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
		<div class="share">
			<p class="name">mi</p>
			<p class="comment">SampleText</p>
			<p class="timestamp">2019/08/21 hh/mm/ss</p>
		</div>
	</div>
</div>

	
	
	<div class="form-group">
	<input class="form-control" id="basicInputTypeText" placeholder="Please Enter a Content" type="text"/>
	<button class="btn send-button" type="button">Send</button>
	</div>

</div>

<script>

</script>
