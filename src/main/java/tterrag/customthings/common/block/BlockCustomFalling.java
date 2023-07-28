package tterrag.customthings.common.block;

import net.minecraft.block.BlockFalling;
import net.minecraft.creativetab.CreativeTabs;

import lombok.experimental.Delegate;
import tterrag.customthings.common.config.json.BlockType.BlockData;

public class BlockCustomFalling extends BlockFalling implements IBlockCustom {

    private final BlockProxy<BlockCustomFalling> proxy;

    @Delegate
    private BlockProxy<BlockCustomFalling> getProxy() {
        return proxy == null ? BlockProxy.<BlockCustomFalling>dummy() : proxy;
    }

    public BlockCustomFalling(BlockData data) {
        super(data.getType().material);
        proxy = new BlockProxy<BlockCustomFalling>(this, data, 16);
        setStepSound(data.getType().sound);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
