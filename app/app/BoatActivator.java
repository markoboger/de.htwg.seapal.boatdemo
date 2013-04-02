package app;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.util.plugin.ActivatorSingleton;
import de.htwg.util.plugin.PluginManager;

@Singleton
public class BoatActivator extends ActivatorSingleton {
	
	@Inject
	public BoatActivator(PluginManager pluginManager){
		this.pluginManager = pluginManager;
		start();
	}

}
