package org.locationtech.geoff.ui.swt.events;

import java.util.function.Consumer;

import org.locationtech.geoff.GeoMap;
import org.locationtech.geoff.core.logging.LogUtil;
import org.locationtech.geoff.ui.swt.events.HandlersManager.EventConsumer;

public class EventsDispatcher {
	private boolean changing;
	private Consumer<Runnable> changeConsumer;

	public EventsDispatcher() {
	}

	public void setChangeConsumer(Consumer<Runnable> changeConsumer) {
		this.changeConsumer = changeConsumer;
	}

	public void dispatchEvent(String evtName, GeoMap map, Object[] params) {
		EventConsumer consumer = HandlersManager.getInstance().get(evtName);

		if (consumer == null) {
			LogUtil.warn(getClass(), "No handler found for event: " + evtName);
			return;
		}

		Runnable decoratedChange = () -> {
			changing = true;

			try {
				consumer.consume(map, params);
			} finally {
				changing = false;
			}
		};

		if (changeConsumer == null) {
			decoratedChange.run();
		} else {
			changeConsumer.accept(decoratedChange);
		}
	}

	public boolean isDispatching() {
		return changing;
	}
}
