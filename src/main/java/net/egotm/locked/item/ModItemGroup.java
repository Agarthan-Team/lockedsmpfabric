package net.egotm.locked.item;

import net.egotm.locked.Locked;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LOCKED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Locked.MOD_ID, "locked_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.locked_group"))
                    .icon(()-> new ItemStack(ModItems.CLEAR_GEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BERSERKER_KEY);
                        entries.add(ModItems.CLEAR_KEY);
                        entries.add(ModItems.CRYO_KEY);
                        entries.add(ModItems.DARK_KEY);
                         entries.add(ModItems.ENDER_KEY);
                        entries.add(ModItems.FIRE_KEY);
                        entries.add(ModItems.HEALER_KEY);
                        entries.add(ModItems.MIRROR_KEY);
                        entries.add(ModItems.PLAGUE_KEY);
                        entries.add(ModItems.ROYAL_KEY);
                        entries.add(ModItems.TIDE_KEY);
                        entries.add(ModItems.BERSERK_GEM);
                        entries.add(ModItems.CLEAR_GEM);
                        entries.add(ModItems.HEALER_GEM);

                    }).build());



    public static void registerItemGroups(){

    }
}
