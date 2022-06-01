
package net.mcreator.redstonearmorandtools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.redstonearmorandtools.RedstoneArmorAndToolsModElements;

@RedstoneArmorAndToolsModElements.ModElement.Tag
public class RedstoneHoeItem extends RedstoneArmorAndToolsModElements.ModElement {
	@ObjectHolder("redstone_armor_and_tools:redstone_hoe")
	public static final Item block = null;

	public RedstoneHoeItem(RedstoneArmorAndToolsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("redstone_hoe"));
	}
}
