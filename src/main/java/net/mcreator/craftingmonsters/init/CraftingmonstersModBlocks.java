
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftingmonsters.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftingmonsters.block.CelestialStoneBlock;
import net.mcreator.craftingmonsters.CraftingmonstersMod;

public class CraftingmonstersModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CraftingmonstersMod.MODID);
	public static final DeferredBlock<Block> CELESTIAL_STONE = REGISTRY.register("celestial_stone", CelestialStoneBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
