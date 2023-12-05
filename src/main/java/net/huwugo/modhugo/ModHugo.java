package net.huwugo.modhugo;

import net.fabricmc.api.ModInitializer;

import net.huwugo.modhugo.ModItems.ModItemGroup;
import net.huwugo.modhugo.ModItems.ModItems;
import net.huwugo.modhugo.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModHugo implements ModInitializer {
		public static final String MOD_ID = "modhugo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}