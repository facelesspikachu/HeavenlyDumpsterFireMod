
package net.mcreator.heavenlydumpstercraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.heavenlydumpstercraft.procedures.SocialismGemFoodEatenProcedure;
import net.mcreator.heavenlydumpstercraft.HeavenlydumpstercraftModElements;

@HeavenlydumpstercraftModElements.ModElement.Tag
public class SocialismGemItem extends HeavenlydumpstercraftModElements.ModElement {
	@ObjectHolder("heavenlydumpstercraft:socialism_gem")
	public static final Item block = null;
	public SocialismGemItem(HeavenlydumpstercraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64)
					.food((new Food.Builder()).hunger(7).saturation(0.5f).setAlwaysEdible().build()));
			setRegistryName("socialism_gem");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 100;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				SocialismGemFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
