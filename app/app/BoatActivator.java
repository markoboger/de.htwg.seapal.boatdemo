package app;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.util.plugin.IActivator;
import de.htwg.util.plugin.IPluginManager;
import de.htwg.util.plugin.Plugin;

@Singleton
public class BoatActivator extends IActivator {
	
	@Inject
	public BoatActivator(IPluginManager pluginManager, Plugin plugin){
		this.pluginManager = pluginManager;
		this.plugin = plugin;
		start();
	}

}
