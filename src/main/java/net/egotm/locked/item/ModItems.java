package net.egotm.locked.item;

import net.egotm.locked.Locked;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BERSERKER_KEY = registerItem("key_berserker",
            new Item(new FabricItemSettings()));
    public static final Item CLEAR_KEY = registerItem("key_clear",
            new Item(new FabricItemSettings()));
    public static final Item CRYO_KEY = registerItem("key_cryo",
            new Item(new FabricItemSettings()));
    public static final Item DARK_KEY = registerItem("key_dark",
            new Item(new FabricItemSettings()));
    public static final Item FIRE_KEY = registerItem("key_fire",
            new Item(new FabricItemSettings()));
    public static final Item HEALER_KEY = registerItem("key_healer",
            new Item(new FabricItemSettings()));
    public static final Item ROYAL_KEY = registerItem("key_royal",
            new Item(new FabricItemSettings()));
    public static final Item PLAGUE_KEY = registerItem("key_plague",
            new Item(new FabricItemSettings()));
    public static final Item STORM_KEY = registerItem("key_storm",
            new Item(new FabricItemSettings()));
 public static final Item TIDE_KEY = registerItem("key_tide",
            new Item(new FabricItemSettings()));
    public static final Item MIRROR_KEY = registerItem("key_mirror",
            new Item(new FabricItemSettings()));
    public static final Item ENDER_KEY = registerItem("key_ender",
            new Item(new FabricItemSettings()));
    public static final Item BERSERK_GEM = registerItem("gem_berserker",
            new Item(new FabricItemSettings()));
    public static final Item CLEAR_GEM = registerItem("gem_clear",
            new Item(new FabricItemSettings()));
    public static final Item HEALER_GEM = registerItem("gem_healer",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Locked.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
