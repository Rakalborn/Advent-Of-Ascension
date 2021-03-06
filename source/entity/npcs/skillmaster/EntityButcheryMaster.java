package net.tslat.aoa3.entity.npcs.skillmaster;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ArmourRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.entity.base.AoATraderRecipe;

import javax.annotation.Nullable;

public class EntityButcheryMaster extends EntitySkillMaster {
	public EntityButcheryMaster(World world) {
		super(world);
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityButcheryMaster;
	}

	@Override
	protected void getTradesList(final NonNullList<AoATraderRecipe> newTradesList) {
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.BUTCHERY_HELMET)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.BUTCHERY_CHESTPLATE)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.BUTCHERY_LEGS)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.BUTCHERY_BOOTS)));
	}
}
