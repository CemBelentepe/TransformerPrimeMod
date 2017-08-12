package theccb.tfp.handlers;

import theccb.tfp.init.BlockInit;
import theccb.tfp.init.ItemInit;

public class RegistryHandler {
	public static void Client() {
		
	}
	
	public static void Common() {
		BlockInit.init();
		BlockInit.register();
		
		ItemInit.init();
		ItemInit.register();
	}
}
