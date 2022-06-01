
package net.mcreator.redstonearmorandtools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.redstonearmorandtools.RedstoneArmorAndToolsModElements;

@RedstoneArmorAndToolsModElements.ModElement.Tag
public class RedstoneSwordItem extends RedstoneArmorAndToolsModElements.ModElement {
	@ObjectHolder("redstone_armor_and_tools:redstone_sword")
	public static final Item block = null;

	public RedstoneSwordItem(RedstoneArmorAndToolsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("redstone_sword"));
	}
}
