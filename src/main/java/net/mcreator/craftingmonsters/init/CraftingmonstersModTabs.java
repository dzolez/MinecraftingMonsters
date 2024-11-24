
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftingmonsters.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftingmonsters.CraftingmonstersMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CraftingmonstersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftingmonstersMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(CraftingmonstersModBlocks.CELESTIAL_STONE.get().asItem());

		}
	}
}
