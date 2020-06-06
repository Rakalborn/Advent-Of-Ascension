package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class GingerbirdAviary extends AoAStructure { //StructureSize: 10x12x10
	private static final IBlockState whiteCandy = BlockRegister.WHITE_CANDY.getDefaultState();
	private static final IBlockState gingerbread = BlockRegister.GINGERBREAD.getDefaultState();
	private static final IBlockState gingerbirdSpawner = BlockRegister.GINGERBIRD_SPAWNER.getDefaultState();

	public GingerbirdAviary() {
		super("GingerbirdAviary");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, gingerbread);
		addBlock(world, basePos, 4, 0, 5, gingerbread);
		addBlock(world, basePos, 5, 0, 4, gingerbread);
		addBlock(world, basePos, 5, 0, 5, gingerbread);
		addBlock(world, basePos, 4, 1, 4, gingerbread);
		addBlock(world, basePos, 4, 1, 5, gingerbread);
		addBlock(world, basePos, 5, 1, 4, gingerbread);
		addBlock(world, basePos, 5, 1, 5, gingerbread);
		addBlock(world, basePos, 4, 2, 4, gingerbread);
		addBlock(world, basePos, 4, 2, 5, gingerbread);
		addBlock(world, basePos, 5, 2, 4, gingerbread);
		addBlock(world, basePos, 5, 2, 5, gingerbread);
		addBlock(world, basePos, 4, 3, 4, gingerbread);
		addBlock(world, basePos, 4, 3, 5, gingerbread);
		addBlock(world, basePos, 5, 3, 4, gingerbread);
		addBlock(world, basePos, 5, 3, 5, gingerbread);
		addBlock(world, basePos, 4, 4, 4, gingerbread);
		addBlock(world, basePos, 4, 4, 5, gingerbread);
		addBlock(world, basePos, 5, 4, 4, gingerbread);
		addBlock(world, basePos, 5, 4, 5, gingerbread);
		addBlock(world, basePos, 4, 5, 4, gingerbread);
		addBlock(world, basePos, 4, 5, 5, gingerbread);
		addBlock(world, basePos, 5, 5, 4, gingerbread);
		addBlock(world, basePos, 5, 5, 5, gingerbread);
		addBlock(world, basePos, 3, 6, 3, whiteCandy);
		addBlock(world, basePos, 3, 6, 4, whiteCandy);
		addBlock(world, basePos, 3, 6, 5, whiteCandy);
		addBlock(world, basePos, 3, 6, 6, whiteCandy);
		addBlock(world, basePos, 4, 6, 3, whiteCandy);
		addBlock(world, basePos, 4, 6, 4, gingerbread);
		addBlock(world, basePos, 4, 6, 5, gingerbread);
		addBlock(world, basePos, 4, 6, 6, whiteCandy);
		addBlock(world, basePos, 5, 6, 3, whiteCandy);
		addBlock(world, basePos, 5, 6, 4, gingerbread);
		addBlock(world, basePos, 5, 6, 5, gingerbread);
		addBlock(world, basePos, 5, 6, 6, whiteCandy);
		addBlock(world, basePos, 6, 6, 3, whiteCandy);
		addBlock(world, basePos, 6, 6, 4, whiteCandy);
		addBlock(world, basePos, 6, 6, 5, whiteCandy);
		addBlock(world, basePos, 6, 6, 6, whiteCandy);
		addBlock(world, basePos, 2, 7, 2, whiteCandy);
		addBlock(world, basePos, 2, 7, 4, whiteCandy);
		addBlock(world, basePos, 2, 7, 5, whiteCandy);
		addBlock(world, basePos, 2, 7, 7, whiteCandy);
		addBlock(world, basePos, 3, 7, 3, gingerbread);
		addBlock(world, basePos, 3, 7, 4, gingerbread);
		addBlock(world, basePos, 3, 7, 5, gingerbread);
		addBlock(world, basePos, 3, 7, 6, gingerbread);
		addBlock(world, basePos, 4, 7, 2, whiteCandy);
		addBlock(world, basePos, 4, 7, 3, gingerbread);
		addBlock(world, basePos, 4, 7, 4, gingerbread);
		addBlock(world, basePos, 4, 7, 5, gingerbread);
		addBlock(world, basePos, 4, 7, 6, gingerbread);
		addBlock(world, basePos, 4, 7, 7, whiteCandy);
		addBlock(world, basePos, 5, 7, 2, whiteCandy);
		addBlock(world, basePos, 5, 7, 3, gingerbread);
		addBlock(world, basePos, 5, 7, 4, gingerbread);
		addBlock(world, basePos, 5, 7, 5, gingerbread);
		addBlock(world, basePos, 5, 7, 6, gingerbread);
		addBlock(world, basePos, 5, 7, 7, whiteCandy);
		addBlock(world, basePos, 6, 7, 3, gingerbread);
		addBlock(world, basePos, 6, 7, 4, gingerbread);
		addBlock(world, basePos, 6, 7, 5, gingerbread);
		addBlock(world, basePos, 6, 7, 6, gingerbread);
		addBlock(world, basePos, 7, 7, 2, whiteCandy);
		addBlock(world, basePos, 7, 7, 4, whiteCandy);
		addBlock(world, basePos, 7, 7, 5, whiteCandy);
		addBlock(world, basePos, 7, 7, 7, whiteCandy);
		addBlock(world, basePos, 1, 8, 1, whiteCandy);
		addBlock(world, basePos, 1, 8, 4, whiteCandy);
		addBlock(world, basePos, 1, 8, 5, whiteCandy);
		addBlock(world, basePos, 1, 8, 8, whiteCandy);
		addBlock(world, basePos, 2, 8, 2, gingerbread);
		addBlock(world, basePos, 2, 8, 3, gingerbread);
		addBlock(world, basePos, 2, 8, 4, gingerbread);
		addBlock(world, basePos, 2, 8, 5, gingerbread);
		addBlock(world, basePos, 2, 8, 6, gingerbread);
		addBlock(world, basePos, 2, 8, 7, gingerbread);
		addBlock(world, basePos, 3, 8, 2, gingerbread);
		addBlock(world, basePos, 3, 8, 7, gingerbread);
		addBlock(world, basePos, 4, 8, 1, whiteCandy);
		addBlock(world, basePos, 4, 8, 2, gingerbread);
		addBlock(world, basePos, 4, 8, 4, gingerbirdSpawner);
		addBlock(world, basePos, 4, 8, 5, gingerbirdSpawner);
		addBlock(world, basePos, 4, 8, 7, gingerbread);
		addBlock(world, basePos, 4, 8, 8, whiteCandy);
		addBlock(world, basePos, 5, 8, 1, whiteCandy);
		addBlock(world, basePos, 5, 8, 2, gingerbread);
		addBlock(world, basePos, 5, 8, 4, gingerbirdSpawner);
		addBlock(world, basePos, 5, 8, 5, gingerbirdSpawner);
		addBlock(world, basePos, 5, 8, 7, gingerbread);
		addBlock(world, basePos, 5, 8, 8, whiteCandy);
		addBlock(world, basePos, 6, 8, 2, gingerbread);
		addBlock(world, basePos, 6, 8, 7, gingerbread);
		addBlock(world, basePos, 7, 8, 2, gingerbread);
		addBlock(world, basePos, 7, 8, 3, gingerbread);
		addBlock(world, basePos, 7, 8, 4, gingerbread);
		addBlock(world, basePos, 7, 8, 5, gingerbread);
		addBlock(world, basePos, 7, 8, 6, gingerbread);
		addBlock(world, basePos, 7, 8, 7, gingerbread);
		addBlock(world, basePos, 8, 8, 1, whiteCandy);
		addBlock(world, basePos, 8, 8, 4, whiteCandy);
		addBlock(world, basePos, 8, 8, 5, whiteCandy);
		addBlock(world, basePos, 8, 8, 8, whiteCandy);
		addBlock(world, basePos, 0, 9, 4, whiteCandy);
		addBlock(world, basePos, 0, 9, 5, whiteCandy);
		addBlock(world, basePos, 1, 9, 1, gingerbread);
		addBlock(world, basePos, 1, 9, 2, gingerbread);
		addBlock(world, basePos, 1, 9, 3, gingerbread);
		addBlock(world, basePos, 1, 9, 4, gingerbread);
		addBlock(world, basePos, 1, 9, 5, gingerbread);
		addBlock(world, basePos, 1, 9, 6, gingerbread);
		addBlock(world, basePos, 1, 9, 7, gingerbread);
		addBlock(world, basePos, 1, 9, 8, gingerbread);
		addBlock(world, basePos, 2, 9, 1, gingerbread);
		addBlock(world, basePos, 2, 9, 8, gingerbread);
		addBlock(world, basePos, 3, 9, 1, gingerbread);
		addBlock(world, basePos, 3, 9, 8, gingerbread);
		addBlock(world, basePos, 4, 9, 0, whiteCandy);
		addBlock(world, basePos, 4, 9, 1, gingerbread);
		addBlock(world, basePos, 4, 9, 8, gingerbread);
		addBlock(world, basePos, 4, 9, 9, whiteCandy);
		addBlock(world, basePos, 5, 9, 0, whiteCandy);
		addBlock(world, basePos, 5, 9, 1, gingerbread);
		addBlock(world, basePos, 5, 9, 8, gingerbread);
		addBlock(world, basePos, 5, 9, 9, whiteCandy);
		addBlock(world, basePos, 6, 9, 1, gingerbread);
		addBlock(world, basePos, 6, 9, 8, gingerbread);
		addBlock(world, basePos, 7, 9, 1, gingerbread);
		addBlock(world, basePos, 7, 9, 8, gingerbread);
		addBlock(world, basePos, 8, 9, 1, gingerbread);
		addBlock(world, basePos, 8, 9, 2, gingerbread);
		addBlock(world, basePos, 8, 9, 3, gingerbread);
		addBlock(world, basePos, 8, 9, 4, gingerbread);
		addBlock(world, basePos, 8, 9, 5, gingerbread);
		addBlock(world, basePos, 8, 9, 6, gingerbread);
		addBlock(world, basePos, 8, 9, 7, gingerbread);
		addBlock(world, basePos, 8, 9, 8, gingerbread);
		addBlock(world, basePos, 9, 9, 4, whiteCandy);
		addBlock(world, basePos, 9, 9, 5, whiteCandy);
		addBlock(world, basePos, 0, 10, 0, gingerbread);
		addBlock(world, basePos, 0, 10, 1, gingerbread);
		addBlock(world, basePos, 0, 10, 2, gingerbread);
		addBlock(world, basePos, 0, 10, 3, gingerbread);
		addBlock(world, basePos, 0, 10, 4, gingerbread);
		addBlock(world, basePos, 0, 10, 5, gingerbread);
		addBlock(world, basePos, 0, 10, 6, gingerbread);
		addBlock(world, basePos, 0, 10, 7, gingerbread);
		addBlock(world, basePos, 0, 10, 8, gingerbread);
		addBlock(world, basePos, 0, 10, 9, gingerbread);
		addBlock(world, basePos, 1, 10, 0, gingerbread);
		addBlock(world, basePos, 1, 10, 9, gingerbread);
		addBlock(world, basePos, 2, 10, 0, gingerbread);
		addBlock(world, basePos, 2, 10, 9, gingerbread);
		addBlock(world, basePos, 3, 10, 0, gingerbread);
		addBlock(world, basePos, 3, 10, 9, gingerbread);
		addBlock(world, basePos, 4, 10, 0, gingerbread);
		addBlock(world, basePos, 4, 10, 9, gingerbread);
		addBlock(world, basePos, 5, 10, 0, gingerbread);
		addBlock(world, basePos, 5, 10, 9, gingerbread);
		addBlock(world, basePos, 6, 10, 0, gingerbread);
		addBlock(world, basePos, 6, 10, 9, gingerbread);
		addBlock(world, basePos, 7, 10, 0, gingerbread);
		addBlock(world, basePos, 7, 10, 9, gingerbread);
		addBlock(world, basePos, 8, 10, 0, gingerbread);
		addBlock(world, basePos, 8, 10, 9, gingerbread);
		addBlock(world, basePos, 9, 10, 0, gingerbread);
		addBlock(world, basePos, 9, 10, 1, gingerbread);
		addBlock(world, basePos, 9, 10, 2, gingerbread);
		addBlock(world, basePos, 9, 10, 3, gingerbread);
		addBlock(world, basePos, 9, 10, 4, gingerbread);
		addBlock(world, basePos, 9, 10, 5, gingerbread);
		addBlock(world, basePos, 9, 10, 6, gingerbread);
		addBlock(world, basePos, 9, 10, 7, gingerbread);
		addBlock(world, basePos, 9, 10, 8, gingerbread);
		addBlock(world, basePos, 9, 10, 9, gingerbread);
	}
}
