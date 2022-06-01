
package net.mcreator.redstonearmorandtools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.redstonearmorandtools.RedstoneArmorAndToolsModElements;

@RedstoneArmorAndToolsModElements.ModElement.Tag
public class RedstoneAxeItem extends RedstoneArmorAndToolsModElements.ModElement {
	@ObjectHolder("redstone_armor_and_tools:redstone_axe")
	public static final Item block = null;

	public RedstoneAxeItem(RedstoneArmorAndToolsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("redstone_axe"));
	}
}
