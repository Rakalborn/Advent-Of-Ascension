package net.tslat.aoa3.structure.creeponia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.trader.EntityExplosivesExpert;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ExplosivesTower extends AoAStructure { //StructureSize: 8x29x8
	private static final IBlockState whitewashBricks = BlockRegister.WHITEWASH_BRICKS.getDefaultState();
	private static final IBlockState creeponiaBricks = BlockRegister.CREEPONIA_BRICKS.getDefaultState();

	public ExplosivesTower() {
		super("ExplosivesTower");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 0, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 0, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 0, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 1, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 1, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 1, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 1, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 2, 1, whitewashBricks);
		addBlock(world, basePos, 1, 2, 2, whitewashBricks);
		addBlock(world, basePos, 1, 2, 3, whitewashBricks);
		addBlock(world, basePos, 1, 2, 4, whitewashBricks);
		addBlock(world, basePos, 1, 2, 5, whitewashBricks);
		addBlock(world, basePos, 1, 2, 6, whitewashBricks);
		addBlock(world, basePos, 2, 2, 1, whitewashBricks);
		addBlock(world, basePos, 2, 2, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 2, 6, whitewashBricks);
		addBlock(world, basePos, 3, 2, 1, whitewashBricks);
		addBlock(world, basePos, 3, 2, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 2, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 2, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 2, 6, whitewashBricks);
		addBlock(world, basePos, 4, 2, 1, whitewashBricks);
		addBlock(world, basePos, 4, 2, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 2, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 2, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 2, 6, whitewashBricks);
		addBlock(world, basePos, 5, 2, 1, whitewashBricks);
		addBlock(world, basePos, 5, 2, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 2, 6, whitewashBricks);
		addBlock(world, basePos, 6, 2, 1, whitewashBricks);
		addBlock(world, basePos, 6, 2, 2, whitewashBricks);
		addBlock(world, basePos, 6, 2, 3, whitewashBricks);
		addBlock(world, basePos, 6, 2, 4, whitewashBricks);
		addBlock(world, basePos, 6, 2, 5, whitewashBricks);
		addBlock(world, basePos, 6, 2, 6, whitewashBricks);
		addBlock(world, basePos, 3, 3, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 3, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 3, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 3, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 4, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 4, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 4, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 4, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 5, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 5, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 5, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 5, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 6, 1, whitewashBricks);
		addBlock(world, basePos, 1, 6, 2, whitewashBricks);
		addBlock(world, basePos, 1, 6, 3, whitewashBricks);
		addBlock(world, basePos, 1, 6, 4, whitewashBricks);
		addBlock(world, basePos, 1, 6, 5, whitewashBricks);
		addBlock(world, basePos, 1, 6, 6, whitewashBricks);
		addBlock(world, basePos, 2, 6, 1, whitewashBricks);
		addBlock(world, basePos, 2, 6, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 6, 6, whitewashBricks);
		addBlock(world, basePos, 3, 6, 1, whitewashBricks);
		addBlock(world, basePos, 3, 6, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 6, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 6, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 6, 6, whitewashBricks);
		addBlock(world, basePos, 4, 6, 1, whitewashBricks);
		addBlock(world, basePos, 4, 6, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 6, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 6, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 6, 6, whitewashBricks);
		addBlock(world, basePos, 5, 6, 1, whitewashBricks);
		addBlock(world, basePos, 5, 6, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 6, 6, whitewashBricks);
		addBlock(world, basePos, 6, 6, 1, whitewashBricks);
		addBlock(world, basePos, 6, 6, 2, whitewashBricks);
		addBlock(world, basePos, 6, 6, 3, whitewashBricks);
		addBlock(world, basePos, 6, 6, 4, whitewashBricks);
		addBlock(world, basePos, 6, 6, 5, whitewashBricks);
		addBlock(world, basePos, 6, 6, 6, whitewashBricks);
		addBlock(world, basePos, 3, 7, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 7, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 7, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 7, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 8, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 8, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 8, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 8, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 9, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 9, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 9, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 9, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 10, 1, whitewashBricks);
		addBlock(world, basePos, 1, 10, 2, whitewashBricks);
		addBlock(world, basePos, 1, 10, 3, whitewashBricks);
		addBlock(world, basePos, 1, 10, 4, whitewashBricks);
		addBlock(world, basePos, 1, 10, 5, whitewashBricks);
		addBlock(world, basePos, 1, 10, 6, whitewashBricks);
		addBlock(world, basePos, 2, 10, 1, whitewashBricks);
		addBlock(world, basePos, 2, 10, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 10, 6, whitewashBricks);
		addBlock(world, basePos, 3, 10, 1, whitewashBricks);
		addBlock(world, basePos, 3, 10, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 10, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 10, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 10, 6, whitewashBricks);
		addBlock(world, basePos, 4, 10, 1, whitewashBricks);
		addBlock(world, basePos, 4, 10, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 10, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 10, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 10, 6, whitewashBricks);
		addBlock(world, basePos, 5, 10, 1, whitewashBricks);
		addBlock(world, basePos, 5, 10, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 10, 6, whitewashBricks);
		addBlock(world, basePos, 6, 10, 1, whitewashBricks);
		addBlock(world, basePos, 6, 10, 2, whitewashBricks);
		addBlock(world, basePos, 6, 10, 3, whitewashBricks);
		addBlock(world, basePos, 6, 10, 4, whitewashBricks);
		addBlock(world, basePos, 6, 10, 5, whitewashBricks);
		addBlock(world, basePos, 6, 10, 6, whitewashBricks);
		addBlock(world, basePos, 3, 11, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 11, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 11, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 11, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 12, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 12, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 12, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 12, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 13, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 13, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 13, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 13, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 14, 1, whitewashBricks);
		addBlock(world, basePos, 1, 14, 2, whitewashBricks);
		addBlock(world, basePos, 1, 14, 3, whitewashBricks);
		addBlock(world, basePos, 1, 14, 4, whitewashBricks);
		addBlock(world, basePos, 1, 14, 5, whitewashBricks);
		addBlock(world, basePos, 1, 14, 6, whitewashBricks);
		addBlock(world, basePos, 2, 14, 1, whitewashBricks);
		addBlock(world, basePos, 2, 14, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 14, 6, whitewashBricks);
		addBlock(world, basePos, 3, 14, 1, whitewashBricks);
		addBlock(world, basePos, 3, 14, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 14, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 14, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 14, 6, whitewashBricks);
		addBlock(world, basePos, 4, 14, 1, whitewashBricks);
		addBlock(world, basePos, 4, 14, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 14, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 14, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 14, 6, whitewashBricks);
		addBlock(world, basePos, 5, 14, 1, whitewashBricks);
		addBlock(world, basePos, 5, 14, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 14, 6, whitewashBricks);
		addBlock(world, basePos, 6, 14, 1, whitewashBricks);
		addBlock(world, basePos, 6, 14, 2, whitewashBricks);
		addBlock(world, basePos, 6, 14, 3, whitewashBricks);
		addBlock(world, basePos, 6, 14, 4, whitewashBricks);
		addBlock(world, basePos, 6, 14, 5, whitewashBricks);
		addBlock(world, basePos, 6, 14, 6, whitewashBricks);
		addBlock(world, basePos, 3, 15, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 15, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 15, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 15, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 16, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 16, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 16, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 16, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 17, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 17, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 17, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 17, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 18, 1, whitewashBricks);
		addBlock(world, basePos, 1, 18, 2, whitewashBricks);
		addBlock(world, basePos, 1, 18, 3, whitewashBricks);
		addBlock(world, basePos, 1, 18, 4, whitewashBricks);
		addBlock(world, basePos, 1, 18, 5, whitewashBricks);
		addBlock(world, basePos, 1, 18, 6, whitewashBricks);
		addBlock(world, basePos, 2, 18, 1, whitewashBricks);
		addBlock(world, basePos, 2, 18, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 18, 6, whitewashBricks);
		addBlock(world, basePos, 3, 18, 1, whitewashBricks);
		addBlock(world, basePos, 3, 18, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 18, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 18, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 18, 6, whitewashBricks);
		addBlock(world, basePos, 4, 18, 1, whitewashBricks);
		addBlock(world, basePos, 4, 18, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 18, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 18, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 18, 6, whitewashBricks);
		addBlock(world, basePos, 5, 18, 1, whitewashBricks);
		addBlock(world, basePos, 5, 18, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 18, 6, whitewashBricks);
		addBlock(world, basePos, 6, 18, 1, whitewashBricks);
		addBlock(world, basePos, 6, 18, 2, whitewashBricks);
		addBlock(world, basePos, 6, 18, 3, whitewashBricks);
		addBlock(world, basePos, 6, 18, 4, whitewashBricks);
		addBlock(world, basePos, 6, 18, 5, whitewashBricks);
		addBlock(world, basePos, 6, 18, 6, whitewashBricks);
		addBlock(world, basePos, 3, 19, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 19, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 19, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 19, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 20, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 20, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 20, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 20, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 21, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 21, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 21, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 21, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 22, 1, whitewashBricks);
		addBlock(world, basePos, 1, 22, 2, whitewashBricks);
		addBlock(world, basePos, 1, 22, 3, whitewashBricks);
		addBlock(world, basePos, 1, 22, 4, whitewashBricks);
		addBlock(world, basePos, 1, 22, 5, whitewashBricks);
		addBlock(world, basePos, 1, 22, 6, whitewashBricks);
		addBlock(world, basePos, 2, 22, 1, whitewashBricks);
		addBlock(world, basePos, 2, 22, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 22, 6, whitewashBricks);
		addBlock(world, basePos, 3, 22, 1, whitewashBricks);
		addBlock(world, basePos, 3, 22, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 22, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 22, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 22, 6, whitewashBricks);
		addBlock(world, basePos, 4, 22, 1, whitewashBricks);
		addBlock(world, basePos, 4, 22, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 22, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 22, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 22, 6, whitewashBricks);
		addBlock(world, basePos, 5, 22, 1, whitewashBricks);
		addBlock(world, basePos, 5, 22, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 22, 6, whitewashBricks);
		addBlock(world, basePos, 6, 22, 1, whitewashBricks);
		addBlock(world, basePos, 6, 22, 2, whitewashBricks);
		addBlock(world, basePos, 6, 22, 3, whitewashBricks);
		addBlock(world, basePos, 6, 22, 4, whitewashBricks);
		addBlock(world, basePos, 6, 22, 5, whitewashBricks);
		addBlock(world, basePos, 6, 22, 6, whitewashBricks);
		addBlock(world, basePos, 3, 23, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 23, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 23, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 23, 4, creeponiaBricks);
		addBlock(world, basePos, 0, 24, 0, whitewashBricks);
		addBlock(world, basePos, 0, 24, 1, whitewashBricks);
		addBlock(world, basePos, 0, 24, 2, whitewashBricks);
		addBlock(world, basePos, 0, 24, 3, whitewashBricks);
		addBlock(world, basePos, 0, 24, 4, whitewashBricks);
		addBlock(world, basePos, 0, 24, 5, whitewashBricks);
		addBlock(world, basePos, 0, 24, 6, whitewashBricks);
		addBlock(world, basePos, 0, 24, 7, whitewashBricks);
		addBlock(world, basePos, 1, 24, 0, whitewashBricks);
		addBlock(world, basePos, 1, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 1, 24, 7, whitewashBricks);
		addBlock(world, basePos, 2, 24, 0, whitewashBricks);
		addBlock(world, basePos, 2, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 2, 24, 7, whitewashBricks);
		addBlock(world, basePos, 3, 24, 0, whitewashBricks);
		addBlock(world, basePos, 3, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 3, 24, 7, whitewashBricks);
		addBlock(world, basePos, 4, 24, 0, whitewashBricks);
		addBlock(world, basePos, 4, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 4, 24, 7, whitewashBricks);
		addBlock(world, basePos, 5, 24, 0, whitewashBricks);
		addBlock(world, basePos, 5, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 5, 24, 7, whitewashBricks);
		addBlock(world, basePos, 6, 24, 0, whitewashBricks);
		addBlock(world, basePos, 6, 24, 1, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 2, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 3, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 4, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 5, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 6, creeponiaBricks);
		addBlock(world, basePos, 6, 24, 7, whitewashBricks);
		addBlock(world, basePos, 7, 24, 0, whitewashBricks);
		addBlock(world, basePos, 7, 24, 1, whitewashBricks);
		addBlock(world, basePos, 7, 24, 2, whitewashBricks);
		addBlock(world, basePos, 7, 24, 3, whitewashBricks);
		addBlock(world, basePos, 7, 24, 4, whitewashBricks);
		addBlock(world, basePos, 7, 24, 5, whitewashBricks);
		addBlock(world, basePos, 7, 24, 6, whitewashBricks);
		addBlock(world, basePos, 7, 24, 7, whitewashBricks);
		addBlock(world, basePos, 0, 25, 0, creeponiaBricks);
		addBlock(world, basePos, 0, 25, 7, creeponiaBricks);
		addBlock(world, basePos, 7, 25, 0, creeponiaBricks);
		addBlock(world, basePos, 7, 25, 7, creeponiaBricks);
		addBlock(world, basePos, 0, 26, 0, creeponiaBricks);
		addBlock(world, basePos, 0, 26, 7, creeponiaBricks);
		addBlock(world, basePos, 7, 26, 0, creeponiaBricks);
		addBlock(world, basePos, 7, 26, 7, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 1, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 2, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 3, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 4, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 5, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 6, creeponiaBricks);
		addBlock(world, basePos, 0, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 1, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 1, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 2, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 2, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 3, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 3, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 4, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 4, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 5, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 5, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 6, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 6, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 0, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 1, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 2, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 3, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 4, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 5, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 6, creeponiaBricks);
		addBlock(world, basePos, 7, 27, 7, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 2, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 3, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 4, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 5, creeponiaBricks);
		addBlock(world, basePos, 1, 28, 6, creeponiaBricks);
		addBlock(world, basePos, 2, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 2, 28, 6, creeponiaBricks);
		addBlock(world, basePos, 3, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 3, 28, 6, creeponiaBricks);
		addBlock(world, basePos, 4, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 4, 28, 6, creeponiaBricks);
		addBlock(world, basePos, 5, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 5, 28, 6, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 1, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 2, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 3, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 4, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 5, creeponiaBricks);
		addBlock(world, basePos, 6, 28, 6, creeponiaBricks);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityExplosivesExpert explosivesExpert = new EntityExplosivesExpert(world);

		explosivesExpert.setLocationAndAngles(basePos.getX() + 3, basePos.getY() + 25, basePos.getZ() + 3, rand.nextFloat() * 360, 0);
		world.spawnEntity(explosivesExpert);
	}
}
