package net.tslat.aoa3.structure.dustopia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ArkzyneOutpost extends AoAStructure { //StructureSize: 15x13x15
	private static final IBlockState darkwashBricks = BlockRegister.DARKWASH_BRICKS.getDefaultState();
	private static final IBlockState ironBars = Blocks.IRON_BARS.getDefaultState();
	private static final IBlockState arkzyneSpawner = BlockRegister.ARKZYNE_SPAWNER.getDefaultState();

	public ArkzyneOutpost() {
		super("ArkzyneOutpost");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 6, 0, 6, darkwashBricks);
		addBlock(world, basePos, 6, 0, 7, darkwashBricks);
		addBlock(world, basePos, 6, 0, 8, darkwashBricks);
		addBlock(world, basePos, 7, 0, 6, darkwashBricks);
		addBlock(world, basePos, 7, 0, 7, darkwashBricks);
		addBlock(world, basePos, 7, 0, 8, darkwashBricks);
		addBlock(world, basePos, 8, 0, 6, darkwashBricks);
		addBlock(world, basePos, 8, 0, 7, darkwashBricks);
		addBlock(world, basePos, 8, 0, 8, darkwashBricks);
		addBlock(world, basePos, 6, 1, 7, ironBars);
		addBlock(world, basePos, 7, 1, 6, ironBars);
		addBlock(world, basePos, 7, 1, 7, darkwashBricks);
		addBlock(world, basePos, 7, 1, 8, ironBars);
		addBlock(world, basePos, 8, 1, 7, ironBars);
		addBlock(world, basePos, 6, 2, 7, ironBars);
		addBlock(world, basePos, 7, 2, 6, ironBars);
		addBlock(world, basePos, 7, 2, 7, darkwashBricks);
		addBlock(world, basePos, 7, 2, 8, ironBars);
		addBlock(world, basePos, 8, 2, 7, ironBars);
		addBlock(world, basePos, 6, 3, 7, ironBars);
		addBlock(world, basePos, 7, 3, 6, ironBars);
		addBlock(world, basePos, 7, 3, 7, darkwashBricks);
		addBlock(world, basePos, 7, 3, 8, ironBars);
		addBlock(world, basePos, 8, 3, 7, ironBars);
		addBlock(world, basePos, 6, 4, 6, darkwashBricks);
		addBlock(world, basePos, 6, 4, 7, darkwashBricks);
		addBlock(world, basePos, 6, 4, 8, darkwashBricks);
		addBlock(world, basePos, 7, 4, 6, darkwashBricks);
		addBlock(world, basePos, 7, 4, 7, darkwashBricks);
		addBlock(world, basePos, 7, 4, 8, darkwashBricks);
		addBlock(world, basePos, 8, 4, 6, darkwashBricks);
		addBlock(world, basePos, 8, 4, 7, darkwashBricks);
		addBlock(world, basePos, 8, 4, 8, darkwashBricks);
		addBlock(world, basePos, 6, 5, 7, ironBars);
		addBlock(world, basePos, 7, 5, 6, ironBars);
		addBlock(world, basePos, 7, 5, 7, darkwashBricks);
		addBlock(world, basePos, 7, 5, 8, ironBars);
		addBlock(world, basePos, 8, 5, 7, ironBars);
		addBlock(world, basePos, 6, 6, 7, ironBars);
		addBlock(world, basePos, 7, 6, 6, ironBars);
		addBlock(world, basePos, 7, 6, 7, darkwashBricks);
		addBlock(world, basePos, 7, 6, 8, ironBars);
		addBlock(world, basePos, 8, 6, 7, ironBars);
		addBlock(world, basePos, 6, 7, 7, ironBars);
		addBlock(world, basePos, 7, 7, 6, ironBars);
		addBlock(world, basePos, 7, 7, 7, darkwashBricks);
		addBlock(world, basePos, 7, 7, 8, ironBars);
		addBlock(world, basePos, 8, 7, 7, ironBars);
		addBlock(world, basePos, 0, 8, 0, darkwashBricks);
		addBlock(world, basePos, 0, 8, 1, darkwashBricks);
		addBlock(world, basePos, 0, 8, 2, darkwashBricks);
		addBlock(world, basePos, 0, 8, 3, darkwashBricks);
		addBlock(world, basePos, 0, 8, 4, darkwashBricks);
		addBlock(world, basePos, 0, 8, 5, darkwashBricks);
		addBlock(world, basePos, 0, 8, 6, darkwashBricks);
		addBlock(world, basePos, 0, 8, 7, darkwashBricks);
		addBlock(world, basePos, 0, 8, 8, darkwashBricks);
		addBlock(world, basePos, 0, 8, 9, darkwashBricks);
		addBlock(world, basePos, 0, 8, 10, darkwashBricks);
		addBlock(world, basePos, 0, 8, 11, darkwashBricks);
		addBlock(world, basePos, 0, 8, 12, darkwashBricks);
		addBlock(world, basePos, 0, 8, 13, darkwashBricks);
		addBlock(world, basePos, 0, 8, 14, darkwashBricks);
		addBlock(world, basePos, 1, 8, 0, darkwashBricks);
		addBlock(world, basePos, 1, 8, 1, ironBars);
		addBlock(world, basePos, 1, 8, 2, ironBars);
		addBlock(world, basePos, 1, 8, 3, ironBars);
		addBlock(world, basePos, 1, 8, 4, ironBars);
		addBlock(world, basePos, 1, 8, 5, ironBars);
		addBlock(world, basePos, 1, 8, 6, ironBars);
		addBlock(world, basePos, 1, 8, 7, ironBars);
		addBlock(world, basePos, 1, 8, 8, ironBars);
		addBlock(world, basePos, 1, 8, 9, ironBars);
		addBlock(world, basePos, 1, 8, 10, ironBars);
		addBlock(world, basePos, 1, 8, 11, ironBars);
		addBlock(world, basePos, 1, 8, 12, ironBars);
		addBlock(world, basePos, 1, 8, 13, ironBars);
		addBlock(world, basePos, 1, 8, 14, darkwashBricks);
		addBlock(world, basePos, 2, 8, 0, darkwashBricks);
		addBlock(world, basePos, 2, 8, 1, ironBars);
		addBlock(world, basePos, 2, 8, 2, darkwashBricks);
		addBlock(world, basePos, 2, 8, 3, darkwashBricks);
		addBlock(world, basePos, 2, 8, 4, darkwashBricks);
		addBlock(world, basePos, 2, 8, 5, darkwashBricks);
		addBlock(world, basePos, 2, 8, 6, darkwashBricks);
		addBlock(world, basePos, 2, 8, 7, darkwashBricks);
		addBlock(world, basePos, 2, 8, 8, darkwashBricks);
		addBlock(world, basePos, 2, 8, 9, darkwashBricks);
		addBlock(world, basePos, 2, 8, 10, darkwashBricks);
		addBlock(world, basePos, 2, 8, 11, darkwashBricks);
		addBlock(world, basePos, 2, 8, 12, darkwashBricks);
		addBlock(world, basePos, 2, 8, 13, ironBars);
		addBlock(world, basePos, 2, 8, 14, darkwashBricks);
		addBlock(world, basePos, 3, 8, 0, darkwashBricks);
		addBlock(world, basePos, 3, 8, 1, ironBars);
		addBlock(world, basePos, 3, 8, 2, darkwashBricks);
		addBlock(world, basePos, 3, 8, 3, ironBars);
		addBlock(world, basePos, 3, 8, 4, ironBars);
		addBlock(world, basePos, 3, 8, 5, ironBars);
		addBlock(world, basePos, 3, 8, 6, ironBars);
		addBlock(world, basePos, 3, 8, 7, ironBars);
		addBlock(world, basePos, 3, 8, 8, ironBars);
		addBlock(world, basePos, 3, 8, 9, ironBars);
		addBlock(world, basePos, 3, 8, 10, ironBars);
		addBlock(world, basePos, 3, 8, 11, ironBars);
		addBlock(world, basePos, 3, 8, 12, darkwashBricks);
		addBlock(world, basePos, 3, 8, 13, ironBars);
		addBlock(world, basePos, 3, 8, 14, darkwashBricks);
		addBlock(world, basePos, 4, 8, 0, darkwashBricks);
		addBlock(world, basePos, 4, 8, 1, ironBars);
		addBlock(world, basePos, 4, 8, 2, darkwashBricks);
		addBlock(world, basePos, 4, 8, 3, ironBars);
		addBlock(world, basePos, 4, 8, 4, darkwashBricks);
		addBlock(world, basePos, 4, 8, 5, darkwashBricks);
		addBlock(world, basePos, 4, 8, 6, darkwashBricks);
		addBlock(world, basePos, 4, 8, 7, darkwashBricks);
		addBlock(world, basePos, 4, 8, 8, darkwashBricks);
		addBlock(world, basePos, 4, 8, 9, darkwashBricks);
		addBlock(world, basePos, 4, 8, 10, darkwashBricks);
		addBlock(world, basePos, 4, 8, 11, ironBars);
		addBlock(world, basePos, 4, 8, 12, darkwashBricks);
		addBlock(world, basePos, 4, 8, 13, ironBars);
		addBlock(world, basePos, 4, 8, 14, darkwashBricks);
		addBlock(world, basePos, 5, 8, 0, darkwashBricks);
		addBlock(world, basePos, 5, 8, 1, ironBars);
		addBlock(world, basePos, 5, 8, 2, darkwashBricks);
		addBlock(world, basePos, 5, 8, 3, ironBars);
		addBlock(world, basePos, 5, 8, 4, darkwashBricks);
		addBlock(world, basePos, 5, 8, 5, ironBars);
		addBlock(world, basePos, 5, 8, 6, ironBars);
		addBlock(world, basePos, 5, 8, 7, ironBars);
		addBlock(world, basePos, 5, 8, 8, ironBars);
		addBlock(world, basePos, 5, 8, 9, ironBars);
		addBlock(world, basePos, 5, 8, 10, darkwashBricks);
		addBlock(world, basePos, 5, 8, 11, ironBars);
		addBlock(world, basePos, 5, 8, 12, darkwashBricks);
		addBlock(world, basePos, 5, 8, 13, ironBars);
		addBlock(world, basePos, 5, 8, 14, darkwashBricks);
		addBlock(world, basePos, 6, 8, 0, darkwashBricks);
		addBlock(world, basePos, 6, 8, 1, ironBars);
		addBlock(world, basePos, 6, 8, 2, darkwashBricks);
		addBlock(world, basePos, 6, 8, 3, ironBars);
		addBlock(world, basePos, 6, 8, 4, darkwashBricks);
		addBlock(world, basePos, 6, 8, 5, ironBars);
		addBlock(world, basePos, 6, 8, 6, darkwashBricks);
		addBlock(world, basePos, 6, 8, 7, darkwashBricks);
		addBlock(world, basePos, 6, 8, 8, darkwashBricks);
		addBlock(world, basePos, 6, 8, 9, ironBars);
		addBlock(world, basePos, 6, 8, 10, darkwashBricks);
		addBlock(world, basePos, 6, 8, 11, ironBars);
		addBlock(world, basePos, 6, 8, 12, darkwashBricks);
		addBlock(world, basePos, 6, 8, 13, ironBars);
		addBlock(world, basePos, 6, 8, 14, darkwashBricks);
		addBlock(world, basePos, 7, 8, 0, darkwashBricks);
		addBlock(world, basePos, 7, 8, 1, ironBars);
		addBlock(world, basePos, 7, 8, 2, darkwashBricks);
		addBlock(world, basePos, 7, 8, 3, ironBars);
		addBlock(world, basePos, 7, 8, 4, darkwashBricks);
		addBlock(world, basePos, 7, 8, 5, ironBars);
		addBlock(world, basePos, 7, 8, 6, darkwashBricks);
		addBlock(world, basePos, 7, 8, 7, darkwashBricks);
		addBlock(world, basePos, 7, 8, 8, darkwashBricks);
		addBlock(world, basePos, 7, 8, 9, ironBars);
		addBlock(world, basePos, 7, 8, 10, darkwashBricks);
		addBlock(world, basePos, 7, 8, 11, ironBars);
		addBlock(world, basePos, 7, 8, 12, darkwashBricks);
		addBlock(world, basePos, 7, 8, 13, ironBars);
		addBlock(world, basePos, 7, 8, 14, darkwashBricks);
		addBlock(world, basePos, 8, 8, 0, darkwashBricks);
		addBlock(world, basePos, 8, 8, 1, ironBars);
		addBlock(world, basePos, 8, 8, 2, darkwashBricks);
		addBlock(world, basePos, 8, 8, 3, ironBars);
		addBlock(world, basePos, 8, 8, 4, darkwashBricks);
		addBlock(world, basePos, 8, 8, 5, ironBars);
		addBlock(world, basePos, 8, 8, 6, darkwashBricks);
		addBlock(world, basePos, 8, 8, 7, darkwashBricks);
		addBlock(world, basePos, 8, 8, 8, darkwashBricks);
		addBlock(world, basePos, 8, 8, 9, ironBars);
		addBlock(world, basePos, 8, 8, 10, darkwashBricks);
		addBlock(world, basePos, 8, 8, 11, ironBars);
		addBlock(world, basePos, 8, 8, 12, darkwashBricks);
		addBlock(world, basePos, 8, 8, 13, ironBars);
		addBlock(world, basePos, 8, 8, 14, darkwashBricks);
		addBlock(world, basePos, 9, 8, 0, darkwashBricks);
		addBlock(world, basePos, 9, 8, 1, ironBars);
		addBlock(world, basePos, 9, 8, 2, darkwashBricks);
		addBlock(world, basePos, 9, 8, 3, ironBars);
		addBlock(world, basePos, 9, 8, 4, darkwashBricks);
		addBlock(world, basePos, 9, 8, 5, ironBars);
		addBlock(world, basePos, 9, 8, 6, ironBars);
		addBlock(world, basePos, 9, 8, 7, ironBars);
		addBlock(world, basePos, 9, 8, 8, ironBars);
		addBlock(world, basePos, 9, 8, 9, ironBars);
		addBlock(world, basePos, 9, 8, 10, darkwashBricks);
		addBlock(world, basePos, 9, 8, 11, ironBars);
		addBlock(world, basePos, 9, 8, 12, darkwashBricks);
		addBlock(world, basePos, 9, 8, 13, ironBars);
		addBlock(world, basePos, 9, 8, 14, darkwashBricks);
		addBlock(world, basePos, 10, 8, 0, darkwashBricks);
		addBlock(world, basePos, 10, 8, 1, ironBars);
		addBlock(world, basePos, 10, 8, 2, darkwashBricks);
		addBlock(world, basePos, 10, 8, 3, ironBars);
		addBlock(world, basePos, 10, 8, 4, darkwashBricks);
		addBlock(world, basePos, 10, 8, 5, darkwashBricks);
		addBlock(world, basePos, 10, 8, 6, darkwashBricks);
		addBlock(world, basePos, 10, 8, 7, darkwashBricks);
		addBlock(world, basePos, 10, 8, 8, darkwashBricks);
		addBlock(world, basePos, 10, 8, 9, darkwashBricks);
		addBlock(world, basePos, 10, 8, 10, darkwashBricks);
		addBlock(world, basePos, 10, 8, 11, ironBars);
		addBlock(world, basePos, 10, 8, 12, darkwashBricks);
		addBlock(world, basePos, 10, 8, 13, ironBars);
		addBlock(world, basePos, 10, 8, 14, darkwashBricks);
		addBlock(world, basePos, 11, 8, 0, darkwashBricks);
		addBlock(world, basePos, 11, 8, 1, ironBars);
		addBlock(world, basePos, 11, 8, 2, darkwashBricks);
		addBlock(world, basePos, 11, 8, 3, ironBars);
		addBlock(world, basePos, 11, 8, 4, ironBars);
		addBlock(world, basePos, 11, 8, 5, ironBars);
		addBlock(world, basePos, 11, 8, 6, ironBars);
		addBlock(world, basePos, 11, 8, 7, ironBars);
		addBlock(world, basePos, 11, 8, 8, ironBars);
		addBlock(world, basePos, 11, 8, 9, ironBars);
		addBlock(world, basePos, 11, 8, 10, ironBars);
		addBlock(world, basePos, 11, 8, 11, ironBars);
		addBlock(world, basePos, 11, 8, 12, darkwashBricks);
		addBlock(world, basePos, 11, 8, 13, ironBars);
		addBlock(world, basePos, 11, 8, 14, darkwashBricks);
		addBlock(world, basePos, 12, 8, 0, darkwashBricks);
		addBlock(world, basePos, 12, 8, 1, ironBars);
		addBlock(world, basePos, 12, 8, 2, darkwashBricks);
		addBlock(world, basePos, 12, 8, 3, darkwashBricks);
		addBlock(world, basePos, 12, 8, 4, darkwashBricks);
		addBlock(world, basePos, 12, 8, 5, darkwashBricks);
		addBlock(world, basePos, 12, 8, 6, darkwashBricks);
		addBlock(world, basePos, 12, 8, 7, darkwashBricks);
		addBlock(world, basePos, 12, 8, 8, darkwashBricks);
		addBlock(world, basePos, 12, 8, 9, darkwashBricks);
		addBlock(world, basePos, 12, 8, 10, darkwashBricks);
		addBlock(world, basePos, 12, 8, 11, darkwashBricks);
		addBlock(world, basePos, 12, 8, 12, darkwashBricks);
		addBlock(world, basePos, 12, 8, 13, ironBars);
		addBlock(world, basePos, 12, 8, 14, darkwashBricks);
		addBlock(world, basePos, 13, 8, 0, darkwashBricks);
		addBlock(world, basePos, 13, 8, 1, ironBars);
		addBlock(world, basePos, 13, 8, 2, ironBars);
		addBlock(world, basePos, 13, 8, 3, ironBars);
		addBlock(world, basePos, 13, 8, 4, ironBars);
		addBlock(world, basePos, 13, 8, 5, ironBars);
		addBlock(world, basePos, 13, 8, 6, ironBars);
		addBlock(world, basePos, 13, 8, 7, ironBars);
		addBlock(world, basePos, 13, 8, 8, ironBars);
		addBlock(world, basePos, 13, 8, 9, ironBars);
		addBlock(world, basePos, 13, 8, 10, ironBars);
		addBlock(world, basePos, 13, 8, 11, ironBars);
		addBlock(world, basePos, 13, 8, 12, ironBars);
		addBlock(world, basePos, 13, 8, 13, ironBars);
		addBlock(world, basePos, 13, 8, 14, darkwashBricks);
		addBlock(world, basePos, 14, 8, 0, darkwashBricks);
		addBlock(world, basePos, 14, 8, 1, darkwashBricks);
		addBlock(world, basePos, 14, 8, 2, darkwashBricks);
		addBlock(world, basePos, 14, 8, 3, darkwashBricks);
		addBlock(world, basePos, 14, 8, 4, darkwashBricks);
		addBlock(world, basePos, 14, 8, 5, darkwashBricks);
		addBlock(world, basePos, 14, 8, 6, darkwashBricks);
		addBlock(world, basePos, 14, 8, 7, darkwashBricks);
		addBlock(world, basePos, 14, 8, 8, darkwashBricks);
		addBlock(world, basePos, 14, 8, 9, darkwashBricks);
		addBlock(world, basePos, 14, 8, 10, darkwashBricks);
		addBlock(world, basePos, 14, 8, 11, darkwashBricks);
		addBlock(world, basePos, 14, 8, 12, darkwashBricks);
		addBlock(world, basePos, 14, 8, 13, darkwashBricks);
		addBlock(world, basePos, 14, 8, 14, darkwashBricks);
		addBlock(world, basePos, 0, 9, 0, darkwashBricks);
		addBlock(world, basePos, 0, 9, 1, darkwashBricks);
		addBlock(world, basePos, 0, 9, 2, darkwashBricks);
		addBlock(world, basePos, 0, 9, 3, darkwashBricks);
		addBlock(world, basePos, 0, 9, 4, darkwashBricks);
		addBlock(world, basePos, 0, 9, 5, darkwashBricks);
		addBlock(world, basePos, 0, 9, 6, darkwashBricks);
		addBlock(world, basePos, 0, 9, 7, darkwashBricks);
		addBlock(world, basePos, 0, 9, 8, darkwashBricks);
		addBlock(world, basePos, 0, 9, 9, darkwashBricks);
		addBlock(world, basePos, 0, 9, 10, darkwashBricks);
		addBlock(world, basePos, 0, 9, 11, darkwashBricks);
		addBlock(world, basePos, 0, 9, 12, darkwashBricks);
		addBlock(world, basePos, 0, 9, 13, darkwashBricks);
		addBlock(world, basePos, 0, 9, 14, darkwashBricks);
		addBlock(world, basePos, 1, 9, 0, darkwashBricks);
		addBlock(world, basePos, 1, 9, 14, darkwashBricks);
		addBlock(world, basePos, 2, 9, 0, darkwashBricks);
		addBlock(world, basePos, 2, 9, 14, darkwashBricks);
		addBlock(world, basePos, 3, 9, 0, darkwashBricks);
		addBlock(world, basePos, 3, 9, 14, darkwashBricks);
		addBlock(world, basePos, 4, 9, 0, darkwashBricks);
		addBlock(world, basePos, 4, 9, 14, darkwashBricks);
		addBlock(world, basePos, 5, 9, 0, darkwashBricks);
		addBlock(world, basePos, 5, 9, 14, darkwashBricks);
		addBlock(world, basePos, 6, 9, 0, darkwashBricks);
		addBlock(world, basePos, 6, 9, 14, darkwashBricks);
		addBlock(world, basePos, 7, 9, 0, darkwashBricks);
		addBlock(world, basePos, 7, 9, 7, arkzyneSpawner);
		addBlock(world, basePos, 7, 9, 14, darkwashBricks);
		addBlock(world, basePos, 8, 9, 0, darkwashBricks);
		addBlock(world, basePos, 8, 9, 14, darkwashBricks);
		addBlock(world, basePos, 9, 9, 0, darkwashBricks);
		addBlock(world, basePos, 9, 9, 14, darkwashBricks);
		addBlock(world, basePos, 10, 9, 0, darkwashBricks);
		addBlock(world, basePos, 10, 9, 14, darkwashBricks);
		addBlock(world, basePos, 11, 9, 0, darkwashBricks);
		addBlock(world, basePos, 11, 9, 14, darkwashBricks);
		addBlock(world, basePos, 12, 9, 0, darkwashBricks);
		addBlock(world, basePos, 12, 9, 14, darkwashBricks);
		addBlock(world, basePos, 13, 9, 0, darkwashBricks);
		addBlock(world, basePos, 13, 9, 14, darkwashBricks);
		addBlock(world, basePos, 14, 9, 0, darkwashBricks);
		addBlock(world, basePos, 14, 9, 1, darkwashBricks);
		addBlock(world, basePos, 14, 9, 2, darkwashBricks);
		addBlock(world, basePos, 14, 9, 3, darkwashBricks);
		addBlock(world, basePos, 14, 9, 4, darkwashBricks);
		addBlock(world, basePos, 14, 9, 5, darkwashBricks);
		addBlock(world, basePos, 14, 9, 6, darkwashBricks);
		addBlock(world, basePos, 14, 9, 7, darkwashBricks);
		addBlock(world, basePos, 14, 9, 8, darkwashBricks);
		addBlock(world, basePos, 14, 9, 9, darkwashBricks);
		addBlock(world, basePos, 14, 9, 10, darkwashBricks);
		addBlock(world, basePos, 14, 9, 11, darkwashBricks);
		addBlock(world, basePos, 14, 9, 12, darkwashBricks);
		addBlock(world, basePos, 14, 9, 13, darkwashBricks);
		addBlock(world, basePos, 14, 9, 14, darkwashBricks);
		addBlock(world, basePos, 0, 10, 0, darkwashBricks);
		addBlock(world, basePos, 0, 10, 1, darkwashBricks);
		addBlock(world, basePos, 0, 10, 2, darkwashBricks);
		addBlock(world, basePos, 0, 10, 4, darkwashBricks);
		addBlock(world, basePos, 0, 10, 6, darkwashBricks);
		addBlock(world, basePos, 0, 10, 8, darkwashBricks);
		addBlock(world, basePos, 0, 10, 10, darkwashBricks);
		addBlock(world, basePos, 0, 10, 12, darkwashBricks);
		addBlock(world, basePos, 0, 10, 13, darkwashBricks);
		addBlock(world, basePos, 0, 10, 14, darkwashBricks);
		addBlock(world, basePos, 1, 10, 0, darkwashBricks);
		addBlock(world, basePos, 1, 10, 14, darkwashBricks);
		addBlock(world, basePos, 2, 10, 0, darkwashBricks);
		addBlock(world, basePos, 2, 10, 14, darkwashBricks);
		addBlock(world, basePos, 4, 10, 0, darkwashBricks);
		addBlock(world, basePos, 4, 10, 14, darkwashBricks);
		addBlock(world, basePos, 6, 10, 0, darkwashBricks);
		addBlock(world, basePos, 6, 10, 14, darkwashBricks);
		addBlock(world, basePos, 8, 10, 0, darkwashBricks);
		addBlock(world, basePos, 8, 10, 14, darkwashBricks);
		addBlock(world, basePos, 10, 10, 0, darkwashBricks);
		addBlock(world, basePos, 10, 10, 14, darkwashBricks);
		addBlock(world, basePos, 12, 10, 0, darkwashBricks);
		addBlock(world, basePos, 12, 10, 14, darkwashBricks);
		addBlock(world, basePos, 13, 10, 0, darkwashBricks);
		addBlock(world, basePos, 13, 10, 14, darkwashBricks);
		addBlock(world, basePos, 14, 10, 0, darkwashBricks);
		addBlock(world, basePos, 14, 10, 1, darkwashBricks);
		addBlock(world, basePos, 14, 10, 2, darkwashBricks);
		addBlock(world, basePos, 14, 10, 4, darkwashBricks);
		addBlock(world, basePos, 14, 10, 6, darkwashBricks);
		addBlock(world, basePos, 14, 10, 8, darkwashBricks);
		addBlock(world, basePos, 14, 10, 10, darkwashBricks);
		addBlock(world, basePos, 14, 10, 12, darkwashBricks);
		addBlock(world, basePos, 14, 10, 13, darkwashBricks);
		addBlock(world, basePos, 14, 10, 14, darkwashBricks);
		addBlock(world, basePos, 0, 11, 0, darkwashBricks);
		addBlock(world, basePos, 0, 11, 1, darkwashBricks);
		addBlock(world, basePos, 0, 11, 13, darkwashBricks);
		addBlock(world, basePos, 0, 11, 14, darkwashBricks);
		addBlock(world, basePos, 1, 11, 0, darkwashBricks);
		addBlock(world, basePos, 1, 11, 14, darkwashBricks);
		addBlock(world, basePos, 13, 11, 0, darkwashBricks);
		addBlock(world, basePos, 13, 11, 14, darkwashBricks);
		addBlock(world, basePos, 14, 11, 0, darkwashBricks);
		addBlock(world, basePos, 14, 11, 1, darkwashBricks);
		addBlock(world, basePos, 14, 11, 13, darkwashBricks);
		addBlock(world, basePos, 14, 11, 14, darkwashBricks);
		addBlock(world, basePos, 0, 12, 0, darkwashBricks);
		addBlock(world, basePos, 0, 12, 14, darkwashBricks);
		addBlock(world, basePos, 14, 12, 0, darkwashBricks);
		addBlock(world, basePos, 14, 12, 14, darkwashBricks);
	}
}
