package net.tslat.aoa3.entity.minions;

import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class EntityHorntail extends AoAMinion {
	public static final float entityWidth = 0.75f;

	public EntityHorntail(final World world){
		super(world, -1, entityWidth, 1.875f);
	}

	@Override
	public float getEyeHeight() {
		return 1.46875f;
	}

	@Override
	protected double getBaseMoveSpeed() {
		return 0.3d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 270.0d;
	}

	@Override
	protected boolean isHostile() {
		return true;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 18.0d;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.MOB_NOSPIKE_LIVING;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.MOB_NOSPIKE_DEATH;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.MOB_NOSPIKE_HIT;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityHorntail;
	}
}
