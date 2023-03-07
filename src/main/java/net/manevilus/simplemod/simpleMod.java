package net.manevilus.simplemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class simpleMod implements ModInitializer {

	public static final String MOD_ID = "simplemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
           LOGGER.info("Hello Fabric World!");
		   
	}
}
