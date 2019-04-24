package net.nevermine.item.blueprint;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.structures.vanilla.AncientTeleporter;

import java.util.List;
import java.util.Random;

public class TeleporterBlueprint extends Item {
	Random rand;

	public TeleporterBlueprint() {
		rand = new Random();
		setCreativeTab(Itemizer.MiscTab);
	}

	public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer player, final World world, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
		if (!world.isRemote && world.provider.dimensionId != ConfigurationHelper.ancientcavern && world.provider.dimensionId != ConfigurationHelper.immortallis) {
			final int posx = MathHelper.floor_double(player.posX);
			final int posz = MathHelper.floor_double(player.posZ);
			final int posy = MathHelper.floor_double(player.posY);
			player.worldObj.playSoundAtEntity(player, "nevermine:AncientTeleporter", 1.0f, 1.0f);
			if (player.canPlayerEdit(posx, posy, posz, 0, par1ItemStack)) {
				new AncientTeleporter().generate(world, world.rand, posx - 5, posy, posz - 7);
			}
			player.setPositionAndUpdate(player.posX, player.posY + 5.0, player.posZ);
		}
		--par1ItemStack.stackSize;
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getLocaleString("item.AncientTeleporterBlueprint.desc.1"));
		list.add(StringUtil.getLocaleString("item.AncientTeleporterBlueprint.desc.2"));
		list.add(StringUtil.getLocaleString("item.AncientTeleporterBlueprint.desc.3"));
	}
}