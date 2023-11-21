package net.huwugo.modhugo.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.huwugo.modhugo.ModHugo;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CUTLERY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ModHugo.MOD_ID, "cutlery"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cutlery"))
                    .icon(() -> new ItemStack(ModItems.FORK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FORK);
                        entries.add(ModItems.SPOON);
                    }).build());

    public static void registerItemGroup() {
        ModHugo.LOGGER.info("Registering Item Groups for " + ModHugo.MOD_ID);
    }
}