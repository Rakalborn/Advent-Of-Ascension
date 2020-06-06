package net.tslat.aoa3.structure.greckon;

import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

import static net.minecraft.block.BlockLog.LOG_AXIS;

public class HauntedTree4 extends AoAStructure { //StructureSize: 15x25x15
	private static final IBlockState hauntedLeaves = BlockRegister.HAUNTED_LEAVES.getDefaultState();
	private static final IBlockState hauntedLog = BlockRegister.HAUNTED_LOG.getDefaultState();
	private static final IBlockState hauntedLogBark = BlockRegister.HAUNTED_LOG.getDefaultState().withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
	private static final IBlockState purplingWood = BlockRegister.HAUNTED_PURPLING_LOG.getDefaultState();
	private static final IBlockState purplingWoodBark = BlockRegister.HAUNTED_PURPLING_LOG.getDefaultState().withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);

	public HauntedTree4() {
		super("HauntedTree4");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 5, 7, hauntedLeaves);
		addBlock(world, basePos, 1, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 1, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 1, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 2, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 2, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 2, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 3, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 3, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 3, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 4, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 4, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 4, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 5, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 5, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 1, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 2, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 3, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 4, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 5, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 6, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 9, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 10, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 11, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 12, hauntedLeaves);
		addBlock(world, basePos, 6, 5, 13, hauntedLeaves);
		addBlock(world, basePos, 7, 5, 0, hauntedLeaves);
		addBlock(world, basePos, 7, 5, 14, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 1, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 2, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 3, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 8, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 9, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 10, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 11, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 12, hauntedLeaves);
		addBlock(world, basePos, 8, 5, 13, hauntedLeaves);
		addBlock(world, basePos, 9, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 9, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 9, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 10, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 10, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 10, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 11, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 11, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 11, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 12, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 12, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 12, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 13, 5, 6, hauntedLeaves);
		addBlock(world, basePos, 13, 5, 7, hauntedLogBark);
		addBlock(world, basePos, 13, 5, 8, hauntedLeaves);
		addBlock(world, basePos, 14, 5, 7, hauntedLeaves);
		addBlock(world, basePos, 1, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 2, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 3, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 6, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 1, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 2, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 6, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 7, hauntedLog);
		addBlock(world, basePos, 7, 6, 8, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 9, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 10, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 11, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 12, hauntedLeaves);
		addBlock(world, basePos, 7, 6, 13, hauntedLeaves);
		addBlock(world, basePos, 8, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 9, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 10, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 11, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 12, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 13, 6, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 7, 7, hauntedLog);
		addBlock(world, basePos, 7, 8, 7, hauntedLog);
		addBlock(world, basePos, 7, 9, 7, hauntedLog);
		addBlock(world, basePos, 1, 10, 7, hauntedLeaves);
		addBlock(world, basePos, 2, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 2, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 2, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 3, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 3, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 3, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 4, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 4, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 4, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 5, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 5, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 2, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 3, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 4, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 5, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 6, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 9, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 10, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 11, hauntedLeaves);
		addBlock(world, basePos, 6, 10, 12, hauntedLeaves);
		addBlock(world, basePos, 7, 10, 1, hauntedLeaves);
		addBlock(world, basePos, 7, 10, 2, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 3, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 4, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 5, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 6, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 7, hauntedLog);
		addBlock(world, basePos, 7, 10, 8, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 9, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 10, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 11, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 12, hauntedLogBark);
		addBlock(world, basePos, 7, 10, 13, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 2, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 3, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 8, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 9, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 10, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 11, hauntedLeaves);
		addBlock(world, basePos, 8, 10, 12, hauntedLeaves);
		addBlock(world, basePos, 9, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 9, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 9, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 10, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 10, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 10, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 11, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 11, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 11, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 12, 10, 6, hauntedLeaves);
		addBlock(world, basePos, 12, 10, 7, hauntedLogBark);
		addBlock(world, basePos, 12, 10, 8, hauntedLeaves);
		addBlock(world, basePos, 13, 10, 7, hauntedLeaves);
		addBlock(world, basePos, 2, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 3, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 6, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 2, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 6, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 7, hauntedLog);
		addBlock(world, basePos, 7, 11, 8, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 9, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 10, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 11, hauntedLeaves);
		addBlock(world, basePos, 7, 11, 12, hauntedLeaves);
		addBlock(world, basePos, 8, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 9, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 10, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 11, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 12, 11, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 12, 7, hauntedLog);
		addBlock(world, basePos, 7, 13, 7, hauntedLog);
		addBlock(world, basePos, 7, 14, 7, hauntedLog);
		addBlock(world, basePos, 2, 15, 7, hauntedLeaves);
		addBlock(world, basePos, 3, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 3, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 3, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 4, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 4, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 4, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 5, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 5, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 3, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 4, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 5, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 6, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 9, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 10, hauntedLeaves);
		addBlock(world, basePos, 6, 15, 11, hauntedLeaves);
		addBlock(world, basePos, 7, 15, 2, hauntedLeaves);
		addBlock(world, basePos, 7, 15, 3, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 4, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 5, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 6, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 7, hauntedLog);
		addBlock(world, basePos, 7, 15, 8, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 9, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 10, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 11, hauntedLogBark);
		addBlock(world, basePos, 7, 15, 12, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 3, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 8, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 9, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 10, hauntedLeaves);
		addBlock(world, basePos, 8, 15, 11, hauntedLeaves);
		addBlock(world, basePos, 9, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 9, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 9, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 10, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 10, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 10, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 11, 15, 6, hauntedLeaves);
		addBlock(world, basePos, 11, 15, 7, hauntedLogBark);
		addBlock(world, basePos, 11, 15, 8, hauntedLeaves);
		addBlock(world, basePos, 12, 15, 7, hauntedLeaves);
		addBlock(world, basePos, 3, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 6, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 6, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 7, hauntedLog);
		addBlock(world, basePos, 7, 16, 8, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 9, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 10, hauntedLeaves);
		addBlock(world, basePos, 7, 16, 11, hauntedLeaves);
		addBlock(world, basePos, 8, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 9, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 10, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 11, 16, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 17, 7, hauntedLog);
		addBlock(world, basePos, 7, 18, 7, hauntedLog);
		addBlock(world, basePos, 3, 19, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 4, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 4, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 5, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 5, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 4, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 5, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 6, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 9, hauntedLeaves);
		addBlock(world, basePos, 6, 19, 10, hauntedLeaves);
		addBlock(world, basePos, 7, 19, 3, hauntedLeaves);
		addBlock(world, basePos, 7, 19, 4, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 5, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 6, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 7, hauntedLog);
		addBlock(world, basePos, 7, 19, 8, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 9, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 10, hauntedLogBark);
		addBlock(world, basePos, 7, 19, 11, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 4, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 8, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 9, hauntedLeaves);
		addBlock(world, basePos, 8, 19, 10, hauntedLeaves);
		addBlock(world, basePos, 9, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 9, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 9, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 10, 19, 6, hauntedLeaves);
		addBlock(world, basePos, 10, 19, 7, hauntedLogBark);
		addBlock(world, basePos, 10, 19, 8, hauntedLeaves);
		addBlock(world, basePos, 11, 19, 7, hauntedLeaves);
		addBlock(world, basePos, 4, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 6, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 6, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 7, hauntedLog);
		addBlock(world, basePos, 7, 20, 8, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 9, hauntedLeaves);
		addBlock(world, basePos, 7, 20, 10, hauntedLeaves);
		addBlock(world, basePos, 8, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 9, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 10, 20, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 21, 7, hauntedLog);
		addBlock(world, basePos, 7, 22, 7, hauntedLog);
		addBlock(world, basePos, 4, 23, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 23, 6, hauntedLeaves);
		addBlock(world, basePos, 5, 23, 7, hauntedLogBark);
		addBlock(world, basePos, 5, 23, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 23, 5, hauntedLeaves);
		addBlock(world, basePos, 6, 23, 6, hauntedLeaves);
		addBlock(world, basePos, 6, 23, 7, hauntedLogBark);
		addBlock(world, basePos, 6, 23, 8, hauntedLeaves);
		addBlock(world, basePos, 6, 23, 9, hauntedLeaves);
		addBlock(world, basePos, 7, 23, 4, hauntedLeaves);
		addBlock(world, basePos, 7, 23, 5, hauntedLogBark);
		addBlock(world, basePos, 7, 23, 6, hauntedLogBark);
		addBlock(world, basePos, 7, 23, 7, hauntedLog);
		addBlock(world, basePos, 7, 23, 8, hauntedLogBark);
		addBlock(world, basePos, 7, 23, 9, hauntedLogBark);
		addBlock(world, basePos, 7, 23, 10, hauntedLeaves);
		addBlock(world, basePos, 8, 23, 5, hauntedLeaves);
		addBlock(world, basePos, 8, 23, 6, hauntedLeaves);
		addBlock(world, basePos, 8, 23, 7, hauntedLogBark);
		addBlock(world, basePos, 8, 23, 8, hauntedLeaves);
		addBlock(world, basePos, 8, 23, 9, hauntedLeaves);
		addBlock(world, basePos, 9, 23, 6, hauntedLeaves);
		addBlock(world, basePos, 9, 23, 7, hauntedLogBark);
		addBlock(world, basePos, 9, 23, 8, hauntedLeaves);
		addBlock(world, basePos, 10, 23, 7, hauntedLeaves);
		addBlock(world, basePos, 5, 24, 7, hauntedLeaves);
		addBlock(world, basePos, 6, 24, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 24, 5, hauntedLeaves);
		addBlock(world, basePos, 7, 24, 6, hauntedLeaves);
		addBlock(world, basePos, 7, 24, 7, hauntedLeaves);
		addBlock(world, basePos, 7, 24, 8, hauntedLeaves);
		addBlock(world, basePos, 7, 24, 9, hauntedLeaves);
		addBlock(world, basePos, 8, 24, 7, hauntedLeaves);
		addBlock(world, basePos, 9, 24, 7, hauntedLeaves);

		if (rand.nextBoolean()) {
			addBlock(world, basePos, 7, 0, 7, hauntedLog);
			addBlock(world, basePos, 7, 1, 7, hauntedLog);
			addBlock(world, basePos, 7, 2, 7, hauntedLog);
			addBlock(world, basePos, 7, 3, 7, hauntedLog);
			addBlock(world, basePos, 7, 4, 7, hauntedLog);
			addBlock(world, basePos, 7, 5, 1, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 2, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 3, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 4, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 5, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 6, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 7, hauntedLog);
			addBlock(world, basePos, 7, 5, 8, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 9, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 10, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 11, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 12, hauntedLogBark);
			addBlock(world, basePos, 7, 5, 13, hauntedLogBark);
		}
		else {
			addBlock(world, basePos, 7, 0, 7, purplingWood);
			addBlock(world, basePos, 7, 1, 7, purplingWood);
			addBlock(world, basePos, 7, 2, 7, purplingWood);
			addBlock(world, basePos, 7, 3, 7, purplingWood);
			addBlock(world, basePos, 7, 4, 7, purplingWood);
			addBlock(world, basePos, 7, 5, 1, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 2, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 3, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 4, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 5, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 6, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 7, purplingWood);
			addBlock(world, basePos, 7, 5, 8, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 9, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 10, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 11, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 12, purplingWoodBark);
			addBlock(world, basePos, 7, 5, 13, purplingWoodBark);
		}
	}
}
