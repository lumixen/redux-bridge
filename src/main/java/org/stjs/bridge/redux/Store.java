package org.stjs.bridge.redux;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback0;

@STJSBridge
public class Store<S extends State> {

	public native void dispatch(Action action);

	public native S getState();

	public native Callback0 subscribe(Callback0 handler);

}
