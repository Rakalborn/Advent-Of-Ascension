package net.tslat.aoa3.item.weapon.thrown;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.EnchantmentsRegister;
import net.tslat.aoa3.entity.projectiles.gun.BaseBullet;
import net.tslat.aoa3.entity.projectiles.thrown.EntityVulkram;
import net.tslat.aoa3.item.weapon.gun.BaseGun;
import net.tslat.aoa3.utils.EntityUtil;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.StringUtil;

import javax.annotation.Nullable;
import java.util.List;

public class Vulkram extends BaseThrownWeapon {
	public static final float dmg = 3f;

	public Vulkram() {
		super(dmg, 7);
		setTranslationKey("Vulkram");
		setRegistryName("aoa3:vulkram");
		setCreativeTab(CreativeTabsRegister.THROWN_WEAPONS);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return SoundEvents.ENTITY_ARROW_SHOOT;
	}

	@Override
	public BaseBullet findAndConsumeAmmo(EntityPlayer player, ItemStack weaponStack, EnumHand hand) {
		BaseGun item = (BaseGun)weaponStack.getItem();

		if (ItemUtil.findInventoryItem(player, new ItemStack(this), true, 1 + EnchantmentHelper.getEnchantmentLevel(EnchantmentsRegister.GREED, weaponStack)))
			return new EntityVulkram(player, item);

		return null;
	}

	@Override
	public void doImpactDamage(Entity target, EntityLivingBase shooter, BaseBullet bullet, float bulletDmgMultiplier) {
		if (target != null && EntityUtil.dealRangedDamage(target, shooter, bullet, dmg * bulletDmgMultiplier))
			EntityUtil.healEntity(shooter, 1.0f);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("item.Vulkram.desc.1", TextFormatting.DARK_GREEN));
		super.addInformation(stack, world, tooltip, flag);
	}
}
