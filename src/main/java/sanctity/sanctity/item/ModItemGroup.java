package sanctity.sanctity.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sanctity.sanctity.Sanctity;
import sanctity.sanctity.block.ModBlocks;

import static sanctity.sanctity.item.ModItems.*;

public class ModItemGroup {
    public static final ItemGroup DIVINITY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Sanctity.MOD_ID, "divinity"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.divinity")).icon(() -> new ItemStack(ModItems.TRUE_DIVINITY)).entries((displayContext, entries) -> {
        entries.add(TRUE_DIVINITY);
        entries.add(LESSER_DIVINITY);
        entries.add(DIVINE_TOTEM);
    }).build());
    public static final ItemGroup ASTRALITH_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Sanctity.MOD_ID, "astralithg"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astralithg")).icon(() -> new ItemStack(ASTRALITH_INGOT)).entries((displayContext, entries) -> {
        entries.add(ModBlocks.ASTRALITH_BLOCK);
        entries.add(ModBlocks.ANCIENT_ASTRALITH);
        entries.add(MOLTEN_ASTRALITH);
        entries.add(ASTRALITH_UPGRADE_SMITHING_TEMPLATE);
        entries.add(ASTRALITH_INGOT);
        entries.add(ASTRALITH_SWORD);
        entries.add(ASTRALITH_AXE);
        entries.add(ASTRALITH_PICKAXE);
        entries.add(ASTRALITH_SHOVEL);
        entries.add(ASTRALITH_HOE);
        entries.add(VOID_TRIDENT);
        entries.add(ASTRALITH_HELMET);
        entries.add(ASTRALITH_CHESTPLATE);
        entries.add(ASTRALITH_LEGGINGS);
        entries.add(ASTRALITH_BOOTS);
    }).build());
    public static void registerItemGroups() {
        Sanctity.LOGGER.info("Registering Item Groups for Sanctity.");
    }
}
