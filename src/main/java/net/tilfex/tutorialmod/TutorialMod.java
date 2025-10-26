package net.tilfex.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.tilfex.tutorialmod.block.ModBlocks;
import net.tilfex.tutorialmod.item.ModItemGroups;
import net.tilfex.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

    //    save mod ID in a variable
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlock();
	}
}

