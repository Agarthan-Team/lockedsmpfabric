package net.egotm.locked;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Locked implements ModInitializer {
	public static final String MOD_ID = "locked";

    public static final Logger LOGGER = LoggerFactory.getLogger("locked");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}