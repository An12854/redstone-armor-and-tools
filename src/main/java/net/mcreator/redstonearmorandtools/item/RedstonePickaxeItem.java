
package net.mcreator.redstonearmorandtools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.redstonearmorandtools.RedstoneArmorAndToolsModElements;

@RedstoneArmorAndToolsModElements.ModElement.Tag
public class RedstonePickaxeItem extends RedstoneArmorAndToolsModElements.ModElement {
	@ObjectHolder("redstone_armor_and_tools:redstone_pickaxe")
	public static final Item block = null;

	public RedstonePickaxeItem(RedstoneArmorAndToolsModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("redstone_pickaxe"));
	}
}
