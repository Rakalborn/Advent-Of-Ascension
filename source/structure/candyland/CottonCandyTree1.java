package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CottonCandyTree1 extends AoAStructure { //StructureSize: 5x17x5
	private static final IBlockState pinkCottonCandy = BlockRegister.PINK_COTTON_CANDY.getDefaultState();
	private static final IBlockState plasticPole = BlockRegister.PLASTIC.getDefaultState();

	public CottonCandyTree1() {
		super("CottonCandyTree1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, plasticPole);
		addBlock(world, basePos, 2, 1, 2, plasticPole);
		addBlock(world, basePos, 2, 2, 2, plasticPole);
		addBlock(world, basePos, 2, 3, 2, plasticPole);
		addBlock(world, basePos, 2, 4, 2, plasticPole);
		addBlock(world, basePos, 2, 5, 2, plasticPole);
		addBlock(world, basePos, 2, 6, 2, plasticPole);
		addBlock(world, basePos, 2, 7, 2, plasticPole);
		addBlock(world, basePos, 1, 8, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 8, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 8, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 8, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 0, 9, 0, pinkCottonCandy);
		addBlock(world, basePos, 0, 9, 1, pinkCottonCandy);
		addBlock(world, basePos, 0, 9, 2, pinkCottonCandy);
		addBlock(world, basePos, 0, 9, 3, pinkCottonCandy);
		addBlock(world, basePos, 0, 9, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 9, 0, pinkCottonCandy);
		addBlock(world, basePos, 1, 9, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 9, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 9, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 9, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 9, 0, pinkCottonCandy);
		addBlock(world, basePos, 2, 9, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 9, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 9, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 9, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 9, 0, pinkCottonCandy);
		addBlock(world, basePos, 3, 9, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 9, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 9, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 9, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 0, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 1, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 4, pinkCottonCandy);
		addBlock(world, basePos, 0, 10, 0, pinkCottonCandy);
		addBlock(world, basePos, 0, 10, 1, pinkCottonCandy);
		addBlock(world, basePos, 0, 10, 2, pinkCottonCandy);
		addBlock(world, basePos, 0, 10, 3, pinkCottonCandy);
		addBlock(world, basePos, 0, 10, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 10, 0, pinkCottonCandy);
		addBlock(world, basePos, 1, 10, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 10, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 10, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 10, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 10, 0, pinkCottonCandy);
		addBlock(world, basePos, 2, 10, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 10, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 10, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 10, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 10, 0, pinkCottonCandy);
		addBlock(world, basePos, 3, 10, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 10, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 10, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 10, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 10, 0, pinkCottonCandy);
		addBlock(world, basePos, 4, 10, 1, pinkCottonCandy);
		addBlock(world, basePos, 4, 10, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 10, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 10, 4, pinkCottonCandy);
		addBlock(world, basePos, 0, 11, 0, pinkCottonCandy);
		addBlock(world, basePos, 0, 11, 1, pinkCottonCandy);
		addBlock(world, basePos, 0, 11, 2, pinkCottonCandy);
		addBlock(world, basePos, 0, 11, 3, pinkCottonCandy);
		addBlock(world, basePos, 0, 11, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 11, 0, pinkCottonCandy);
		addBlock(world, basePos, 1, 11, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 11, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 11, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 11, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 11, 0, pinkCottonCandy);
		addBlock(world, basePos, 2, 11, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 11, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 11, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 11, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 11, 0, pinkCottonCandy);
		addBlock(world, basePos, 3, 11, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 11, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 11, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 11, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 11, 0, pinkCottonCandy);
		addBlock(world, basePos, 4, 11, 1, pinkCottonCandy);
		addBlock(world, basePos, 4, 11, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 11, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 11, 4, pinkCottonCandy);
		addBlock(world, basePos, 0, 12, 0, pinkCottonCandy);
		addBlock(world, basePos, 0, 12, 1, pinkCottonCandy);
		addBlock(world, basePos, 0, 12, 2, pinkCottonCandy);
		addBlock(world, basePos, 0, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 0, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 12, 0, pinkCottonCandy);
		addBlock(world, basePos, 1, 12, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 12, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 12, 0, pinkCottonCandy);
		addBlock(world, basePos, 2, 12, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 12, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 0, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 0, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 1, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 13, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 14, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 15, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 16, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 3, pinkCottonCandy);
	}
}
