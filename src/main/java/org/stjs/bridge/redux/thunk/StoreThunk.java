package org.stjs.bridge.redux.thunk;

import org.stjs.bridge.redux.State;
import org.stjs.bridge.redux.Store;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Function;

@STJSBridge
public class StoreThunk<S extends State, R> extends Store<S> {

	public native R dispatch(Function<R> thunk);

}
