package net.cinchtail.cinchsbetterdeepslate.block;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SculkInlaidDeepslateBlock extends DropExperienceBlock {
    public SculkInlaidDeepslateBlock(BlockBehaviour.Properties properties) {
        super(properties, ConstantInt.of(1));
    }
}