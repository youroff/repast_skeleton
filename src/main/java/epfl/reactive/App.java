package epfl.reactive;

import logist.LogistPlatform;

public class App {
	
	public static void main(String[] args) {
		LogistPlatform.main(new String[]{"config/reactive.xml", "reactive-random"});
	}
}
