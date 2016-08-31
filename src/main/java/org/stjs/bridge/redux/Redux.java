package org.stjs.bridge.redux;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Function;
import org.stjs.javascript.functions.Function2;

@STJSBridge
public class Redux<S extends State, A extends Action> {

	public native Store createStore(Function2<S, A, S> reducer);

	public native Store createStore(Function2<S, A, S> reducer, S initialState);

	public native Store createStore(Function2<S, A, S> reducer, S initialState, Function enhancer);

	public native Store createStore(Function2<S, A, S> reducer, Function enhancer);

	public native Function2 combineReducers(Object reducers);

	public native Function applyMiddleware(Object... middlewares);

}
