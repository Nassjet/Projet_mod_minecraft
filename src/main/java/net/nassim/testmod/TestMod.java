package net.nassim.testmod;

import net.fabricmc.api.ModInitializer;

import net.nassim.testmod.block.ModBlocks;
import net.nassim.testmod.item.ModItemGroups;
import net.nassim.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}