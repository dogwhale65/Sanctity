package sanctity.sanctity;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sanctity.sanctity.block.ModBlocks;
import sanctity.sanctity.item.ModItemGroup;
import sanctity.sanctity.item.ModItems;

public class Sanctity implements ModInitializer {
	public static final String MOD_ID = "sanctity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Registering Mod Items and Item Groups for Sanctity.");
	}
}
