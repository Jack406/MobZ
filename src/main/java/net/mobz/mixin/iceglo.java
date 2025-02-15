package net.mobz.mixin;
import net.minecraft.entity.EntityCategory;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.IceSpikesBiome;

import net.mobz.glomod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(IceSpikesBiome.class)
public class iceglo extends Biome {
	protected iceglo(Settings settings) {
		super(settings);
	}
	@Inject(at = @At("RETURN"), method = "<init>()V")
	private void init(CallbackInfo info) {
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(glomod.CREEP, 10, 1, 2));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(glomod.ICEGOLEM, 13, 1, 1));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(glomod.ARCHERENTITY, 10, 1, 1));
	}
}