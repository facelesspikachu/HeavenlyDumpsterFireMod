package net.mcreator.heavenlydumpstercraft.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.heavenlydumpstercraft.HeavenlydumpstercraftModElements;

@HeavenlydumpstercraftModElements.ModElement.Tag
public class SocialismGemFoodEatenProcedure extends HeavenlydumpstercraftModElements.ModElement {
	public SocialismGemFoodEatenProcedure(HeavenlydumpstercraftModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SocialismGemFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 200, (int) 1));
	}
}
