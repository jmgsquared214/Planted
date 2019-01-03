package com.gammel.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gammel.ui.views.orderedit.OrderItemsEditor;

public class NewEditorEvent extends ComponentEvent<OrderItemsEditor> {

	public NewEditorEvent(OrderItemsEditor component) {
		super(component, false);
	}
}