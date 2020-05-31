
package net.mcreator.heavenlydumpstercraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.heavenlydumpstercraft.HeavenlydumpstercraftModElements;

@HeavenlydumpstercraftModElements.ModElement.Tag
public class CopperPlateItem extends HeavenlydumpstercraftModElements.ModElement {
	@ObjectHolder("heavenlydumpstercraft:copper_plate")
	public static final Item block = null;
	public CopperPlateItem(HeavenlydumpstercraftModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("copper_plate");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
