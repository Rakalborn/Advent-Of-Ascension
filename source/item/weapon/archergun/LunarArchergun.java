package net.tslat.aoa3.item.weapon.archergun;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.projectiles.gun.BaseBullet;
import net.tslat.aoa3.entity.projectiles.gun.EntityLunarHollyArrowShot;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;

import java.util.List;

public class LunarArchergun extends BaseArchergun {
	private final double baseDmg;
	private final double maxDamage = 19;
	private final int firingDelay;

	public LunarArchergun(double dmg, int durability, int fireDelayTicks, float recoil) {
		super(dmg, durability, fireDelayTicks, recoil);
		this.baseDmg = dmg;
		setTranslationKey("LunarArchergun");
		setRegistryName("aoa3:lunar_archergun");
		this.firingDelay = fireDelayTicks;
	}

	@Override
	public BaseBullet findAndConsumeAmmo(EntityPlayer player, BaseGun gun, EnumHand hand, boolean consume) {
		Item ammo = ItemUtil.findAndConsumeSpecialBullet(player, gun, consume, ItemRegister.HOLLY_ARROW, player.getHeldItem(hand));

		if (ammo != null) {
			EntityLunarHollyArrowShot arrow = new EntityLunarHollyArrowShot(player, gun, hand,120, 0);
			//arrow.motionY += 0.25f;
			return arrow;
		}

		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(ItemUtil.getFormattedDescriptionText("item.LunarArchergun.desc.1", Enums.ItemDescriptionType.POSITIVE));
		super.addInformation(stack, world, tooltip, flag);
	}
}
