package net.huwugo.modhugo.ModItems;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.huwugo.modhugo.ModHugo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FORK = registerItem("fork", new Item(new FabricItemSettings()));
    public static final Item SPOON = registerItem("spoon", new Item(new FabricItemSettings()));
    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(FORK);
        entries.add(SPOON);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModHugo.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ModHugo.LOGGER.info("Registering mod items for" + ModHugo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}