package com.example.georeglow;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.common.Mod;
import net.neoforged.registries.DeferredRegister;
import net.neoforged.registries.ForgeRegistries;
import net.neoforged.registries.RegistryObject;

@Mod("georeglow")
public class GeOreGlowMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "georeglow");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "georeglow");

    public static final RegistryObject<Block> GLOW_BUDDING_BLOCK = BLOCKS.register("glow_budding_block",
        () -> new Block(Block.Properties.copy(Blocks.GLOWSTONE)));

    public static final RegistryObject<Item> GLOW_BUDDING_ITEM = ITEMS.register("glow_budding_block",
        () -> new BlockItem(GLOW_BUDDING_BLOCK.get(), new Item.Properties().arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

    public GeOreGlowMod() {
        BLOCKS.register();
        ITEMS.register();
    }
}
