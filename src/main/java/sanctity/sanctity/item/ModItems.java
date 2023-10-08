package sanctity.sanctity.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import sanctity.sanctity.Sanctity;
public class ModItems {
    public static final Item TRUE_DIVINITY = registerItem("true_divinity", new Item(new FabricItemSettings()));
    public static final Item LESSER_DIVINITY = registerItem("lesser_divinity", new Item(new FabricItemSettings()));
    public static final Item DIVINE_TOTEM = registerItem("divine_totem", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_ASTRALITH = registerItem("ancient_astralith", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_ASTRALITH = registerItem("molten_astralith", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_UPGRADE_SMITHING_TEMPLATE = registerItem("astralith_upgrade_smithing_template", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_INGOT = registerItem("astralith_ingot", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_SWORD = registerItem("astralith_sword", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_AXE = registerItem("astralith_axe", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_PICKAXE = registerItem("astralith_pickaxe", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_SHOVEL = registerItem("astralith_shovel", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_HOE = registerItem("astralith_hoe", new Item(new FabricItemSettings()));
    public static final Item VOID_TRIDENT = registerItem("void_trident", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_HELMET = registerItem("astralith_helmet", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_CHESTPLATE = registerItem("astralith_chestplate", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_LEGGINGS = registerItem("astralith_leggings", new Item(new FabricItemSettings()));
    public static final Item ASTRALITH_BOOTS = registerItem("astralith_boots", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Sanctity.MOD_ID, name), item);
    }
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TRUE_DIVINITY);
        entries.add(LESSER_DIVINITY);
        entries.add(DIVINE_TOTEM);
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
    }
    public static void registerModItems() {
        Sanctity.LOGGER.info("Registering Mod Items for Sanctity.");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientItemGroup);
    }





    }
