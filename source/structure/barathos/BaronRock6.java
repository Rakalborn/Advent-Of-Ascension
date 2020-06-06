package net.tslat.aoa3.structure.barathos;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class BaronRock6 extends AoAStructure { //StructureSize: 15x7x9
	private static final IBlockState baronStone = BlockRegister.BARON_STONE.getDefaultState();
	private static final IBlockState baronGround = BlockRegister.BARON_GROUND.getDefaultState();

	public BaronRock6() {
		super("BaronRock6");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 3, baronGround);
		addBlock(world, basePos, 1, 0, 2, baronGround);
		addBlock(world, basePos, 1, 0, 3, baronStone);
		addBlock(world, basePos, 1, 0, 4, baronGround);
		addBlock(world, basePos, 2, 0, 1, baronGround);
		addBlock(world, basePos, 2, 0, 2, baronStone);
		addBlock(world, basePos, 2, 0, 3, baronStone);
		addBlock(world, basePos, 2, 0, 4, baronStone);
		addBlock(world, basePos, 2, 0, 5, baronGround);
		addBlock(world, basePos, 3, 0, 0, baronGround);
		addBlock(world, basePos, 3, 0, 1, baronStone);
		addBlock(world, basePos, 3, 0, 2, baronStone);
		addBlock(world, basePos, 3, 0, 3, baronStone);
		addBlock(world, basePos, 3, 0, 4, baronStone);
		addBlock(world, basePos, 3, 0, 5, baronStone);
		addBlock(world, basePos, 3, 0, 6, baronGround);
		addBlock(world, basePos, 4, 0, 0, baronGround);
		addBlock(world, basePos, 4, 0, 1, baronStone);
		addBlock(world, basePos, 4, 0, 2, baronStone);
		addBlock(world, basePos, 4, 0, 3, baronStone);
		addBlock(world, basePos, 4, 0, 4, baronStone);
		addBlock(world, basePos, 4, 0, 5, baronStone);
		addBlock(world, basePos, 4, 0, 6, baronGround);
		addBlock(world, basePos, 5, 0, 0, baronGround);
		addBlock(world, basePos, 5, 0, 1, baronStone);
		addBlock(world, basePos, 5, 0, 2, baronStone);
		addBlock(world, basePos, 5, 0, 3, baronStone);
		addBlock(world, basePos, 5, 0, 4, baronStone);
		addBlock(world, basePos, 5, 0, 5, baronStone);
		addBlock(world, basePos, 5, 0, 6, baronGround);
		addBlock(world, basePos, 5, 0, 7, baronGround);
		addBlock(world, basePos, 6, 0, 0, baronGround);
		addBlock(world, basePos, 6, 0, 1, baronStone);
		addBlock(world, basePos, 6, 0, 2, baronStone);
		addBlock(world, basePos, 6, 0, 3, baronStone);
		addBlock(world, basePos, 6, 0, 4, baronStone);
		addBlock(world, basePos, 6, 0, 5, baronStone);
		addBlock(world, basePos, 6, 0, 6, baronGround);
		addBlock(world, basePos, 6, 0, 7, baronGround);
		addBlock(world, basePos, 6, 0, 8, baronGround);
		addBlock(world, basePos, 7, 0, 1, baronStone);
		addBlock(world, basePos, 7, 0, 2, baronStone);
		addBlock(world, basePos, 7, 0, 3, baronStone);
		addBlock(world, basePos, 7, 0, 4, baronStone);
		addBlock(world, basePos, 7, 0, 5, baronStone);
		addBlock(world, basePos, 7, 0, 6, baronGround);
		addBlock(world, basePos, 7, 0, 7, baronGround);
		addBlock(world, basePos, 7, 0, 8, baronGround);
		addBlock(world, basePos, 8, 0, 1, baronStone);
		addBlock(world, basePos, 8, 0, 2, baronStone);
		addBlock(world, basePos, 8, 0, 3, baronStone);
		addBlock(world, basePos, 8, 0, 4, baronStone);
		addBlock(world, basePos, 8, 0, 5, baronStone);
		addBlock(world, basePos, 8, 0, 6, baronGround);
		addBlock(world, basePos, 8, 0, 7, baronGround);
		addBlock(world, basePos, 8, 0, 8, baronGround);
		addBlock(world, basePos, 9, 0, 1, baronStone);
		addBlock(world, basePos, 9, 0, 2, baronStone);
		addBlock(world, basePos, 9, 0, 3, baronStone);
		addBlock(world, basePos, 9, 0, 4, baronStone);
		addBlock(world, basePos, 9, 0, 5, baronStone);
		addBlock(world, basePos, 9, 0, 6, baronGround);
		addBlock(world, basePos, 9, 0, 7, baronGround);
		addBlock(world, basePos, 10, 0, 1, baronStone);
		addBlock(world, basePos, 10, 0, 2, baronStone);
		addBlock(world, basePos, 10, 0, 3, baronStone);
		addBlock(world, basePos, 10, 0, 4, baronStone);
		addBlock(world, basePos, 10, 0, 5, baronStone);
		addBlock(world, basePos, 10, 0, 6, baronGround);
		addBlock(world, basePos, 10, 0, 7, baronGround);
		addBlock(world, basePos, 11, 0, 1, baronStone);
		addBlock(world, basePos, 11, 0, 2, baronStone);
		addBlock(world, basePos, 11, 0, 3, baronStone);
		addBlock(world, basePos, 11, 0, 4, baronStone);
		addBlock(world, basePos, 11, 0, 5, baronStone);
		addBlock(world, basePos, 11, 0, 6, baronGround);
		addBlock(world, basePos, 12, 0, 1, baronGround);
		addBlock(world, basePos, 12, 0, 2, baronStone);
		addBlock(world, basePos, 12, 0, 3, baronStone);
		addBlock(world, basePos, 12, 0, 4, baronStone);
		addBlock(world, basePos, 12, 0, 5, baronGround);
		addBlock(world, basePos, 13, 0, 1, baronGround);
		addBlock(world, basePos, 13, 0, 2, baronGround);
		addBlock(world, basePos, 13, 0, 3, baronStone);
		addBlock(world, basePos, 13, 0, 4, baronGround);
		addBlock(world, basePos, 14, 0, 2, baronGround);
		addBlock(world, basePos, 14, 0, 3, baronGround);
		addBlock(world, basePos, 1, 1, 2, baronGround);
		addBlock(world, basePos, 1, 1, 3, baronStone);
		addBlock(world, basePos, 1, 1, 4, baronGround);
		addBlock(world, basePos, 2, 1, 1, baronGround);
		addBlock(world, basePos, 2, 1, 2, baronStone);
		addBlock(world, basePos, 2, 1, 3, baronStone);
		addBlock(world, basePos, 2, 1, 4, baronStone);
		addBlock(world, basePos, 3, 1, 1, baronStone);
		addBlock(world, basePos, 3, 1, 2, baronStone);
		addBlock(world, basePos, 3, 1, 3, baronStone);
		addBlock(world, basePos, 3, 1, 4, baronStone);
		addBlock(world, basePos, 3, 1, 5, baronStone);
		addBlock(world, basePos, 4, 1, 1, baronStone);
		addBlock(world, basePos, 4, 1, 2, baronStone);
		addBlock(world, basePos, 4, 1, 3, baronStone);
		addBlock(world, basePos, 4, 1, 4, baronStone);
		addBlock(world, basePos, 4, 1, 5, baronStone);
		addBlock(world, basePos, 5, 1, 1, baronStone);
		addBlock(world, basePos, 5, 1, 2, baronStone);
		addBlock(world, basePos, 5, 1, 3, baronStone);
		addBlock(world, basePos, 5, 1, 4, baronStone);
		addBlock(world, basePos, 5, 1, 5, baronStone);
		addBlock(world, basePos, 5, 1, 6, baronGround);
		addBlock(world, basePos, 6, 1, 1, baronStone);
		addBlock(world, basePos, 6, 1, 2, baronStone);
		addBlock(world, basePos, 6, 1, 3, baronStone);
		addBlock(world, basePos, 6, 1, 4, baronStone);
		addBlock(world, basePos, 6, 1, 5, baronStone);
		addBlock(world, basePos, 6, 1, 6, baronGround);
		addBlock(world, basePos, 6, 1, 7, baronGround);
		addBlock(world, basePos, 7, 1, 1, baronStone);
		addBlock(world, basePos, 7, 1, 2, baronStone);
		addBlock(world, basePos, 7, 1, 3, baronStone);
		addBlock(world, basePos, 7, 1, 4, baronStone);
		addBlock(world, basePos, 7, 1, 5, baronStone);
		addBlock(world, basePos, 7, 1, 6, baronGround);
		addBlock(world, basePos, 7, 1, 7, baronGround);
		addBlock(world, basePos, 8, 1, 1, baronStone);
		addBlock(world, basePos, 8, 1, 2, baronStone);
		addBlock(world, basePos, 8, 1, 3, baronStone);
		addBlock(world, basePos, 8, 1, 4, baronStone);
		addBlock(world, basePos, 8, 1, 5, baronStone);
		addBlock(world, basePos, 8, 1, 6, baronGround);
		addBlock(world, basePos, 8, 1, 7, baronGround);
		addBlock(world, basePos, 9, 1, 1, baronStone);
		addBlock(world, basePos, 9, 1, 2, baronStone);
		addBlock(world, basePos, 9, 1, 3, baronStone);
		addBlock(world, basePos, 9, 1, 4, baronStone);
		addBlock(world, basePos, 9, 1, 5, baronStone);
		addBlock(world, basePos, 9, 1, 6, baronGround);
		addBlock(world, basePos, 10, 1, 1, baronStone);
		addBlock(world, basePos, 10, 1, 2, baronStone);
		addBlock(world, basePos, 10, 1, 3, baronStone);
		addBlock(world, basePos, 10, 1, 4, baronStone);
		addBlock(world, basePos, 10, 1, 5, baronStone);
		addBlock(world, basePos, 10, 1, 6, baronGround);
		addBlock(world, basePos, 11, 1, 1, baronStone);
		addBlock(world, basePos, 11, 1, 2, baronStone);
		addBlock(world, basePos, 11, 1, 3, baronStone);
		addBlock(world, basePos, 11, 1, 4, baronStone);
		addBlock(world, basePos, 11, 1, 5, baronStone);
		addBlock(world, basePos, 12, 1, 1, baronGround);
		addBlock(world, basePos, 12, 1, 2, baronStone);
		addBlock(world, basePos, 12, 1, 3, baronStone);
		addBlock(world, basePos, 12, 1, 4, baronStone);
		addBlock(world, basePos, 13, 1, 2, baronGround);
		addBlock(world, basePos, 13, 1, 3, baronStone);
		addBlock(world, basePos, 1, 2, 3, baronGround);
		addBlock(world, basePos, 2, 2, 2, baronStone);
		addBlock(world, basePos, 2, 2, 3, baronStone);
		addBlock(world, basePos, 2, 2, 4, baronStone);
		addBlock(world, basePos, 3, 2, 1, baronStone);
		addBlock(world, basePos, 3, 2, 2, baronStone);
		addBlock(world, basePos, 3, 2, 3, baronStone);
		addBlock(world, basePos, 3, 2, 4, baronStone);
		addBlock(world, basePos, 3, 2, 5, baronStone);
		addBlock(world, basePos, 4, 2, 1, baronStone);
		addBlock(world, basePos, 4, 2, 2, baronStone);
		addBlock(world, basePos, 4, 2, 3, baronStone);
		addBlock(world, basePos, 4, 2, 4, baronStone);
		addBlock(world, basePos, 4, 2, 5, baronStone);
		addBlock(world, basePos, 5, 2, 1, baronStone);
		addBlock(world, basePos, 5, 2, 2, baronStone);
		addBlock(world, basePos, 5, 2, 3, baronStone);
		addBlock(world, basePos, 5, 2, 4, baronStone);
		addBlock(world, basePos, 5, 2, 5, baronStone);
		addBlock(world, basePos, 6, 2, 1, baronStone);
		addBlock(world, basePos, 6, 2, 2, baronStone);
		addBlock(world, basePos, 6, 2, 3, baronStone);
		addBlock(world, basePos, 6, 2, 4, baronStone);
		addBlock(world, basePos, 6, 2, 5, baronStone);
		addBlock(world, basePos, 6, 2, 6, baronGround);
		addBlock(world, basePos, 7, 2, 1, baronStone);
		addBlock(world, basePos, 7, 2, 2, baronStone);
		addBlock(world, basePos, 7, 2, 3, baronStone);
		addBlock(world, basePos, 7, 2, 4, baronStone);
		addBlock(world, basePos, 7, 2, 5, baronStone);
		addBlock(world, basePos, 7, 2, 6, baronGround);
		addBlock(world, basePos, 8, 2, 1, baronStone);
		addBlock(world, basePos, 8, 2, 2, baronStone);
		addBlock(world, basePos, 8, 2, 3, baronStone);
		addBlock(world, basePos, 8, 2, 4, baronStone);
		addBlock(world, basePos, 8, 2, 5, baronStone);
		addBlock(world, basePos, 8, 2, 6, baronGround);
		addBlock(world, basePos, 9, 2, 1, baronStone);
		addBlock(world, basePos, 9, 2, 2, baronStone);
		addBlock(world, basePos, 9, 2, 3, baronStone);
		addBlock(world, basePos, 9, 2, 4, baronStone);
		addBlock(world, basePos, 9, 2, 5, baronStone);
		addBlock(world, basePos, 9, 2, 6, baronGround);
		addBlock(world, basePos, 10, 2, 1, baronStone);
		addBlock(world, basePos, 10, 2, 2, baronStone);
		addBlock(world, basePos, 10, 2, 3, baronStone);
		addBlock(world, basePos, 10, 2, 4, baronStone);
		addBlock(world, basePos, 10, 2, 5, baronStone);
		addBlock(world, basePos, 11, 2, 1, baronStone);
		addBlock(world, basePos, 11, 2, 2, baronStone);
		addBlock(world, basePos, 11, 2, 3, baronStone);
		addBlock(world, basePos, 11, 2, 4, baronStone);
		addBlock(world, basePos, 11, 2, 5, baronStone);
		addBlock(world, basePos, 12, 2, 2, baronStone);
		addBlock(world, basePos, 12, 2, 3, baronStone);
		addBlock(world, basePos, 12, 2, 4, baronStone);
		addBlock(world, basePos, 2, 3, 2, baronStone);
		addBlock(world, basePos, 2, 3, 3, baronStone);
		addBlock(world, basePos, 2, 3, 4, baronStone);
		addBlock(world, basePos, 3, 3, 1, baronStone);
		addBlock(world, basePos, 3, 3, 2, baronStone);
		addBlock(world, basePos, 3, 3, 3, baronStone);
		addBlock(world, basePos, 3, 3, 4, baronStone);
		addBlock(world, basePos, 3, 3, 5, baronStone);
		addBlock(world, basePos, 4, 3, 1, baronStone);
		addBlock(world, basePos, 4, 3, 2, baronStone);
		addBlock(world, basePos, 4, 3, 3, baronStone);
		addBlock(world, basePos, 4, 3, 4, baronStone);
		addBlock(world, basePos, 4, 3, 5, baronStone);
		addBlock(world, basePos, 5, 3, 1, baronStone);
		addBlock(world, basePos, 5, 3, 2, baronStone);
		addBlock(world, basePos, 5, 3, 3, baronStone);
		addBlock(world, basePos, 5, 3, 4, baronStone);
		addBlock(world, basePos, 5, 3, 5, baronStone);
		addBlock(world, basePos, 6, 3, 1, baronStone);
		addBlock(world, basePos, 6, 3, 2, baronStone);
		addBlock(world, basePos, 6, 3, 3, baronStone);
		addBlock(world, basePos, 6, 3, 4, baronStone);
		addBlock(world, basePos, 6, 3, 5, baronStone);
		addBlock(world, basePos, 7, 3, 1, baronStone);
		addBlock(world, basePos, 7, 3, 2, baronStone);
		addBlock(world, basePos, 7, 3, 3, baronStone);
		addBlock(world, basePos, 7, 3, 4, baronStone);
		addBlock(world, basePos, 7, 3, 5, baronStone);
		addBlock(world, basePos, 8, 3, 1, baronStone);
		addBlock(world, basePos, 8, 3, 2, baronStone);
		addBlock(world, basePos, 8, 3, 3, baronStone);
		addBlock(world, basePos, 8, 3, 4, baronStone);
		addBlock(world, basePos, 8, 3, 5, baronStone);
		addBlock(world, basePos, 9, 3, 1, baronStone);
		addBlock(world, basePos, 9, 3, 2, baronStone);
		addBlock(world, basePos, 9, 3, 3, baronStone);
		addBlock(world, basePos, 9, 3, 4, baronStone);
		addBlock(world, basePos, 9, 3, 5, baronStone);
		addBlock(world, basePos, 10, 3, 1, baronStone);
		addBlock(world, basePos, 10, 3, 2, baronStone);
		addBlock(world, basePos, 10, 3, 3, baronStone);
		addBlock(world, basePos, 10, 3, 4, baronStone);
		addBlock(world, basePos, 10, 3, 5, baronStone);
		addBlock(world, basePos, 11, 3, 1, baronStone);
		addBlock(world, basePos, 11, 3, 2, baronStone);
		addBlock(world, basePos, 11, 3, 3, baronStone);
		addBlock(world, basePos, 11, 3, 4, baronStone);
		addBlock(world, basePos, 11, 3, 5, baronStone);
		addBlock(world, basePos, 12, 3, 2, baronStone);
		addBlock(world, basePos, 12, 3, 3, baronStone);
		addBlock(world, basePos, 12, 3, 4, baronStone);
		addBlock(world, basePos, 3, 4, 1, baronStone);
		addBlock(world, basePos, 3, 4, 2, baronStone);
		addBlock(world, basePos, 3, 4, 3, baronStone);
		addBlock(world, basePos, 3, 4, 4, baronStone);
		addBlock(world, basePos, 3, 4, 5, baronStone);
		addBlock(world, basePos, 4, 4, 1, baronStone);
		addBlock(world, basePos, 4, 4, 2, baronStone);
		addBlock(world, basePos, 4, 4, 3, baronStone);
		addBlock(world, basePos, 4, 4, 4, baronStone);
		addBlock(world, basePos, 4, 4, 5, baronStone);
		addBlock(world, basePos, 5, 4, 1, baronStone);
		addBlock(world, basePos, 5, 4, 2, baronStone);
		addBlock(world, basePos, 5, 4, 3, baronStone);
		addBlock(world, basePos, 5, 4, 4, baronStone);
		addBlock(world, basePos, 5, 4, 5, baronStone);
		addBlock(world, basePos, 6, 4, 1, baronStone);
		addBlock(world, basePos, 6, 4, 2, baronStone);
		addBlock(world, basePos, 6, 4, 3, baronStone);
		addBlock(world, basePos, 6, 4, 4, baronStone);
		addBlock(world, basePos, 6, 4, 5, baronStone);
		addBlock(world, basePos, 7, 4, 1, baronStone);
		addBlock(world, basePos, 7, 4, 2, baronStone);
		addBlock(world, basePos, 7, 4, 3, baronStone);
		addBlock(world, basePos, 7, 4, 4, baronStone);
		addBlock(world, basePos, 7, 4, 5, baronStone);
		addBlock(world, basePos, 8, 4, 1, baronStone);
		addBlock(world, basePos, 8, 4, 2, baronStone);
		addBlock(world, basePos, 8, 4, 3, baronStone);
		addBlock(world, basePos, 8, 4, 4, baronStone);
		addBlock(world, basePos, 8, 4, 5, baronStone);
		addBlock(world, basePos, 9, 4, 1, baronStone);
		addBlock(world, basePos, 9, 4, 2, baronStone);
		addBlock(world, basePos, 9, 4, 3, baronStone);
		addBlock(world, basePos, 9, 4, 4, baronStone);
		addBlock(world, basePos, 9, 4, 5, baronStone);
		addBlock(world, basePos, 10, 4, 1, baronStone);
		addBlock(world, basePos, 10, 4, 2, baronStone);
		addBlock(world, basePos, 10, 4, 3, baronStone);
		addBlock(world, basePos, 10, 4, 4, baronStone);
		addBlock(world, basePos, 10, 4, 5, baronStone);
		addBlock(world, basePos, 11, 4, 1, baronStone);
		addBlock(world, basePos, 11, 4, 2, baronStone);
		addBlock(world, basePos, 11, 4, 3, baronStone);
		addBlock(world, basePos, 11, 4, 4, baronStone);
		addBlock(world, basePos, 11, 4, 5, baronStone);
		addBlock(world, basePos, 3, 5, 1, baronStone);
		addBlock(world, basePos, 3, 5, 2, baronStone);
		addBlock(world, basePos, 3, 5, 3, baronStone);
		addBlock(world, basePos, 3, 5, 4, baronStone);
		addBlock(world, basePos, 3, 5, 5, baronStone);
		addBlock(world, basePos, 4, 5, 1, baronStone);
		addBlock(world, basePos, 4, 5, 2, baronStone);
		addBlock(world, basePos, 4, 5, 3, baronStone);
		addBlock(world, basePos, 4, 5, 4, baronStone);
		addBlock(world, basePos, 4, 5, 5, baronStone);
		addBlock(world, basePos, 5, 5, 1, baronStone);
		addBlock(world, basePos, 5, 5, 2, baronStone);
		addBlock(world, basePos, 5, 5, 3, baronStone);
		addBlock(world, basePos, 5, 5, 4, baronStone);
		addBlock(world, basePos, 5, 5, 5, baronStone);
		addBlock(world, basePos, 6, 5, 1, baronStone);
		addBlock(world, basePos, 6, 5, 2, baronStone);
		addBlock(world, basePos, 6, 5, 3, baronStone);
		addBlock(world, basePos, 6, 5, 4, baronStone);
		addBlock(world, basePos, 6, 5, 5, baronStone);
		addBlock(world, basePos, 7, 5, 1, baronStone);
		addBlock(world, basePos, 7, 5, 2, baronStone);
		addBlock(world, basePos, 7, 5, 3, baronStone);
		addBlock(world, basePos, 7, 5, 4, baronStone);
		addBlock(world, basePos, 7, 5, 5, baronStone);
		addBlock(world, basePos, 8, 5, 1, baronStone);
		addBlock(world, basePos, 8, 5, 2, baronStone);
		addBlock(world, basePos, 8, 5, 3, baronStone);
		addBlock(world, basePos, 8, 5, 4, baronStone);
		addBlock(world, basePos, 8, 5, 5, baronStone);
		addBlock(world, basePos, 9, 5, 1, baronStone);
		addBlock(world, basePos, 9, 5, 2, baronStone);
		addBlock(world, basePos, 9, 5, 3, baronStone);
		addBlock(world, basePos, 9, 5, 4, baronStone);
		addBlock(world, basePos, 9, 5, 5, baronStone);
		addBlock(world, basePos, 10, 5, 1, baronStone);
		addBlock(world, basePos, 10, 5, 2, baronStone);
		addBlock(world, basePos, 10, 5, 3, baronStone);
		addBlock(world, basePos, 10, 5, 4, baronStone);
		addBlock(world, basePos, 10, 5, 5, baronStone);
		addBlock(world, basePos, 11, 5, 1, baronStone);
		addBlock(world, basePos, 11, 5, 2, baronStone);
		addBlock(world, basePos, 11, 5, 3, baronStone);
		addBlock(world, basePos, 11, 5, 4, baronStone);
		addBlock(world, basePos, 11, 5, 5, baronStone);
		addBlock(world, basePos, 3, 6, 1, baronStone);
		addBlock(world, basePos, 3, 6, 2, baronStone);
		addBlock(world, basePos, 3, 6, 3, baronStone);
		addBlock(world, basePos, 3, 6, 4, baronStone);
		addBlock(world, basePos, 3, 6, 5, baronStone);
		addBlock(world, basePos, 11, 6, 1, baronStone);
		addBlock(world, basePos, 11, 6, 2, baronStone);
		addBlock(world, basePos, 11, 6, 3, baronStone);
		addBlock(world, basePos, 11, 6, 4, baronStone);
		addBlock(world, basePos, 11, 6, 5, baronStone);
	}
}
