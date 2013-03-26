package controllers;

import util.observer.IObservable;

public interface IBoatController extends IObservable{

	void setName(String string);

	String getString();

}
